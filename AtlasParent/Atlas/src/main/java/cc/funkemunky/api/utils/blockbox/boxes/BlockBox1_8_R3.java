package cc.funkemunky.api.utils.blockbox.boxes;

import cc.funkemunky.api.Atlas;
import cc.funkemunky.api.utils.*;
import cc.funkemunky.api.utils.MathHelper;
import cc.funkemunky.api.utils.blockbox.BlockBox;
import net.minecraft.server.v1_8_R3.*;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_8_R3.CraftWorld;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class BlockBox1_8_R3 implements BlockBox {
    @Override
    public List<BoundingBox> getCollidingBoxes(org.bukkit.World world, BoundingBox box) {
        Atlas.getInstance().getProfile().start("boxes");
        List<AxisAlignedBB> aabbs = new ArrayList<>();

        int minX = MathUtils.floor(box.minX);
        int maxX = MathUtils.floor(box.maxX + 1);
        int minY = MathUtils.floor(box.minY);
        int maxY = MathUtils.floor(box.maxY + 1);
        int minZ = MathUtils.floor(box.minZ);
        int maxZ = MathUtils.floor(box.maxZ + 1);


        for (int x = minX; x < maxX; x++) {
            for (int z = minZ; z < maxZ; z++) {
                for (int y = minY - 1; y < maxY; y++) {
                    Location loc = new Location(world, x, y, z);

                    org.bukkit.block.Block block = BlockUtils.getBlock(loc);
                    if (block != null && !block.getType().equals(Material.AIR)) {
                        if (BlockUtils.collisionBoundingBoxes.containsKey(block.getType())) {
                            aabbs.add((AxisAlignedBB) BlockUtils.collisionBoundingBoxes.get(block.getType()).add(block.getLocation().toVector()).toAxisAlignedBB());
                        } else {
                            BlockPosition pos = new BlockPosition(x, y, z);
                            World nmsWorld = ((CraftWorld) world).getHandle();
                            IBlockData nmsiBlockData = ((CraftWorld) world).getHandle().getType(pos);
                            Block nmsBlock = nmsiBlockData.getBlock();
                            List<AxisAlignedBB> preBoxes = new ArrayList<>();

                            nmsBlock.updateShape(nmsWorld, pos);
                            nmsBlock.a(nmsWorld, pos, nmsiBlockData, (AxisAlignedBB) box.toAxisAlignedBB(), preBoxes, null);

                            if (preBoxes.size() > 0) {
                                aabbs.addAll(preBoxes);
                            } else {
                                aabbs.add(new AxisAlignedBB(nmsBlock.B(), nmsBlock.D(), nmsBlock.F(), nmsBlock.C(), nmsBlock.E(), nmsBlock.G()).grow(block.getLocation().getX(), block.getLocation().getY(), block.getLocation().getZ()));
                            }
                        }
                        /*
                        else {
                            BoundingBox blockBox = new BoundingBox((float) nmsBlock.B(), (float) nmsBlock.D(), (float) nmsBlock.F(), (float) nmsBlock.C(), (float) nmsBlock.E(), (float) nmsBlock.G());
                        }*/

                    }
                }
            }
        }

        List<BoundingBox> collected = aabbs.parallelStream().filter(Objects::nonNull).map(aabb -> new BoundingBox((float)aabb.a,(float)aabb.b,(float)aabb.c,(float)aabb.d,(float)aabb.e,(float)aabb.f)).filter(bb -> bb.collides(box)).collect(Collectors.toList());
        Atlas.getInstance().getProfile().stop("boxes");
        return collected;
    }


    @Override
    public List<BoundingBox> getSpecificBox(Location loc) {
        return getCollidingBoxes(loc.getWorld(), new BoundingBox(loc.toVector(), loc.toVector()));
    }

    @Override
    public boolean isChunkLoaded(Location loc) {

        net.minecraft.server.v1_8_R3.World world = ((CraftWorld) loc.getWorld()).getHandle();

        return !world.isClientSide && world.isLoaded(new BlockPosition(loc.getBlockX(), 0, loc.getBlockZ()));
    }

    @Override
    public boolean isUsingItem(Player player) {
        net.minecraft.server.v1_8_R3.EntityHuman entity = ((org.bukkit.craftbukkit.v1_8_R3.entity.CraftHumanEntity) player).getHandle();
        return entity.bS() && entity.bZ() != null && entity.bZ().getItem().e(entity.bZ()) != net.minecraft.server.v1_8_R3.EnumAnimation.NONE;
    }

    @Override
    public boolean isRiptiding(LivingEntity entity) {
        return false;
    }

    @Override
    public float getMovementFactor(Player player) {
        return (float) ((CraftPlayer) player).getHandle().getAttributeInstance(GenericAttributes.MOVEMENT_SPEED).getValue();
    }

    @Override
    public int getTrackerId(Player player) {
        EntityPlayer entityPlayer = ((CraftPlayer) player).getHandle();
        EntityTrackerEntry entry = ((WorldServer) entityPlayer.getWorld()).tracker.trackedEntities.get(entityPlayer.getId());
        return entry.tracker.getId();
    }

    @Override
    public float getAiSpeed(Player player) {
        return ((CraftPlayer) player).getHandle().bI();
    }
}
