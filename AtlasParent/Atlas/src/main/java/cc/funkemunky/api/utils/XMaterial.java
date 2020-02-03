/** The MIT License (MIT)
*
* Copyright (c) 2018 Hex_27
*
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"),
* to deal in the Software without restriction, including without limitation
* the rights to use, copy, modify, merge, publish, distribute, sublicense,
* and/or sell copies of the Software, and to permit persons to whom the
* Software is furnished to do so, subject to the following conditions:
*
* The above copyright notice and this permission notice shall be included
* in all copies or substantial portions of the Software.
*
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
* EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
* OF * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
* IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
* DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
* ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
* DEALINGS IN THE SOFTWARE.
**/

package cc.funkemunky.api.utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Map;

public enum XMaterial {
    ACACIA_BOAT(0, "BOAT_ACACIA", "BOAT"),
    ACACIA_BUTTON(0, "WOOD_BUTTON"),
    ACACIA_DOOR(0, "ACACIA_DOOR","ACACIA_DOOR_ITEM"),
    ACACIA_FENCE(0, "ACACIA_FENCE"),
    ACACIA_FENCE_GATE(0, "ACACIA_FENCE_GATE"),
    ACACIA_LEAVES(0, "LEAVES_2"),
    ACACIA_LOG(0, "LOG_2"),
    ACACIA_PLANKS(4, "WOOD"),
    ACACIA_PRESSURE_PLATE(0, "WOOD_PLATE"),
    ACACIA_SAPLING(4, "SAPLING"),
    ACACIA_SLAB(4,"WOODEN_SLAB", "WOOD_STEP", "WOOD_DOUBLE_STEP"),
    ACACIA_STAIRS(4, "ACACIA_STAIRS"),
    ACACIA_TRAPDOOR(0, "TRAP_DOOR"),
    ACACIA_WOOD(0, "LOG_2"),
    ACTIVATOR_RAIL(0, "ACTIVATOR_RAIL"),
    AIR(0, "AIR"),
    ALLIUM(2, "RED_ROSE"),
    ANDESITE(5, "STONE"),
    ANVIL(0, "ANVIL"),
    APPLE(0, "APPLE"),
    ARMOR_STAND(0, "ARMOR_STAND"),
    ARROW(0, "ARROW"),
    ATTACHED_MELON_STEM(7, "MELON_STEM"),
    ATTACHED_PUMPKIN_STEM(7, "PUMPKIN_STEM"),
    AZURE_BLUET(3, "RED_ROSE"),
    BAKED_POTATO(0, "BAKED_POTATO"),
    BARRIER(0, "BARRIER"),
    BAT_SPAWN_EGG(0, "MONSTER_EGG"),
    BEACON(0, "BEACON"),
    BEDROCK(0, "BEDROCK"),
    BEEF(0, "RAW_BEEF"),
    BEETROOT(0, "BEETROOT"),
    BEETROOTS(0, "BEETROOT", "BEETROOT_BLOCK"),
    BEETROOT_SEEDS(0, "BEETROOT_SEEDS"),
    BEETROOT_SOUP(0, "BEETROOT_SOUP"),
    BIRCH_BOAT(0, "BOAT_BIRCH", "BOAT"),
    BIRCH_BUTTON(0, "WOOD_BUTTON"),
    BIRCH_DOOR(0, "BIRCH_DOOR", "BIRCH_DOOR_ITEM"),
    BIRCH_FENCE(0, "BIRCH_FENCE"),
    BIRCH_FENCE_GATE(0, "BIRCH_FENCE_GATE"),
    BIRCH_LEAVES(2, "LEAVES"),
    BIRCH_LOG(2, "LOG"),
    BIRCH_PLANKS(2, "WOOD"),
    BIRCH_PRESSURE_PLATE(0, "WOOD_PLATE"),
    BIRCH_SAPLING(2, "SAPLING"),
    BIRCH_SLAB(2,"WOODEN_SLAB", "WOOD_STEP", "WOOD_DOUBLE_STEP"),
    BIRCH_STAIRS(0, "BIRCH_WOOD_STAIRS"),
    BIRCH_TRAPDOOR(0, "TRAP_DOOR"),
    BIRCH_WOOD(2, "LOG"),
    BLACK_BANNER(0, "BANNER", "STANDING_BANNER"),
    BLACK_BED(15, "BED_BLOCK", "BED"),
    BLACK_CARPET(15, "CARPET"),
    BLACK_CONCRETE(15, "CONCRETE"),
    BLACK_CONCRETE_POWDER(15, "CONCRETE_POWDER"),
    BLACK_GLAZED_TERRACOTTA(0, "BLACK_GLAZED_TERRACOTTA"),
    BLACK_SHULKER_BOX(0, "BLACK_SHULKER_BOX"),
    BLACK_STAINED_GLASS(15, "STAINED_GLASS"),
    BLACK_STAINED_GLASS_PANE(15, "STAINED_GLASS_PANE"),
    BLACK_TERRACOTTA(15, "STAINED_CLAY"),
    BLACK_WALL_BANNER(0, "WALL_BANNER"),
    BLACK_WOOL(15, "WOOL"),
    BLAZE_POWDER(0, "BLAZE_POWDER"),
    BLAZE_ROD(0, "BLAZE_ROD"),
    BLAZE_SPAWN_EGG(0, "MONSTER_EGG"),
    BLUE_BANNER(11, "BANNER", "STANDING_BANNER"),
    BLUE_BED(4, "BED_BLOCK", "BED"),
    BLUE_CARPET(11, "CARPET"),
    BLUE_CONCRETE(11, "CONCRETE"),
    BLUE_CONCRETE_POWDER(11, "CONCRETE_POWDER"),
    BLUE_GLAZED_TERRACOTTA(0, "BLUE_GLAZED_TERRACOTTA"),
    BLUE_ICE(0, "PACKED_ICE"),
    BLUE_ORCHID(1, "RED_ROSE"),
    BLUE_SHULKER_BOX(0, "BLUE_SHULKER_BOX"),
    BLUE_STAINED_GLASS(11, "STAINED_GLASS"),
    BLUE_STAINED_GLASS_PANE(11, "STAINED_GLASS_PANE"),
    BLUE_TERRACOTTA(11, "STAINED_CLAY"),
    BLUE_WALL_BANNER(11, "WALL_BANNER"),
    BLUE_WOOL(11, "WOOL"),
    BONE(0, "BONE"),
    BONE_BLOCK(0, "BONE_BLOCK"),
    BONE_MEAL(15, "INK_SACK"),
    BOOK(0, "BOOK"),
    BOOKSHELF(0, "BOOKSHELF"),
    BOW(0, "BOW"),
    BOWL(0, "BOWL"),
    BRAIN_CORAL(0, "STONE"),
    BRAIN_CORAL_BLOCK(0, "STONE"),
    BRAIN_CORAL_FAN(0, "STONE"),
    BREAD(0, "BREAD"),
    BREWING_STAND(0, "BREWING_STAND", "BREWING_STAND_ITEM"),
    BRICK(0, "CLAY_BRICK"),
    BRICKS(0, "BRICK"),
    BRICK_SLAB(4, "STEP"),
    BRICK_STAIRS(0, "BRICK_STAIRS"),
    BROWN_BANNER(3, "BANNER", "STANDING_BANNER"),
    BROWN_BED(12, "BED_BLOCK", "BED"),
    BROWN_CARPET(12, "CARPET"),
    BROWN_CONCRETE(12, "CONCRETE"),
    BROWN_CONCRETE_POWDER(12, "CONCRETE_POWDER"),
    BROWN_GLAZED_TERRACOTTA(0, "BROWN_GLAZED_TERRACOTTA"),
    BROWN_MUSHROOM(0, "BROWN_MUSHROOM"),
    BROWN_MUSHROOM_BLOCK(0, "BROWN_MUSHROOM", "HUGE_MUSHROOM_1"),
    BROWN_SHULKER_BOX(0, "BROWN_SHULKER_BOX"),
    BROWN_STAINED_GLASS(12, "STAINED_GLASS"),
    BROWN_STAINED_GLASS_PANE(12, "STAINED_GLASS_PANE"),
    BROWN_TERRACOTTA(12, "STAINED_CLAY"),
    BROWN_WALL_BANNER(3, "WALL_BANNER"),
    BROWN_WOOL(12, "WOOL"),
    BUBBLE_COLUMN(0, "STONE"),
    BUBBLE_CORAL(0, "STONE"),
    BUBBLE_CORAL_BLOCK(0, "STONE"),
    BUBBLE_CORAL_FAN(0, "STONE"),
    BUCKET(0, "BUCKET"),
    CACTUS(0, "CACTUS"),
    CACTUS_GREEN(2, "INK_SACK"),
    CAKE(0, "CAKE", "CAKE_BLOCK"),
    CARROT(0, "CARROT_ITEM"),
    CARROTS(0, "CARROT"),
    CARROT_ON_A_STICK(0, "CARROT_STICK"),
    CARVED_PUMPKIN(0, "PUMPKIN"),
    CAULDRON(0, "CAULDRON", "CAULDRON_ITEM"),
    CAVE_AIR(0, "AIR"),
    CAVE_SPIDER_SPAWN_EGG(0, "MONSTER_EGG"),
    CHAINMAIL_BOOTS(0, "CHAINMAIL_BOOTS"),
    CHAINMAIL_CHESTPLATE(0, "CHAINMAIL_CHESTPLATE"),
    CHAINMAIL_HELMET(0, "CHAINMAIL_HELMET"),
    CHAINMAIL_LEGGINGS(0, "CHAINMAIL_LEGGINGS"),
    CHAIN_COMMAND_BLOCK(0, "COMMAND_CHAIN"),
    CHARCOAL(1, "COAL"),
    CHEST(0, "CHEST", "LOCKED_CHEST"),
    CHEST_MINECART(0, "STORAGE_MINECART"),
    CHICKEN(0, "RAW_CHICKEN"),
    CHICKEN_SPAWN_EGG(0, "MONSTER_EGG"),
    CHIPPED_ANVIL(1, "ANVIL"),
    CHISELED_QUARTZ_BLOCK(1, "QUARTZ_BLOCK"),
    CHISELED_RED_SANDSTONE(1, "RED_SANDSTONE"),
    CHISELED_SANDSTONE(1, "SANDSTONE"),
    CHISELED_STONE_BRICKS(3, "SMOOTH_BRICK"),
    CHORUS_FLOWER(0, "CHORUS_FLOWER"),
    CHORUS_FRUIT(0, "CHORUS_FRUIT"),
    CHORUS_PLANT(0, "CHORUS_PLANT"),
    CLAY(0, "CLAY"),
    CLAY_BALL(0, "CLAY_BALL"),
    CLOCK(0, "WATCH"),
    COAL(0, "COAL"),
    COAL_BLOCK(0, "COAL_BLOCK"),
    COAL_ORE(0, "COAL_ORE"),
    COARSE_DIRT(1, "DIRT"),
    COBBLESTONE(0, "COBBLESTONE"),
    COBBLESTONE_SLAB(3, "STEP"),
    COBBLESTONE_STAIRS(0, "COBBLESTONE_STAIRS"),
    COBBLESTONE_WALL(0, "COBBLE_WALL"),
    COBWEB(0, "WEB"),
    COCOA(0, "COCOA"),
    COCOA_BEANS(3, "INK_SACK"),
    COD(0, "RAW_FISH"),
    COD_BUCKET(0, "BUCKET"),
    COD_SPAWN_EGG(0, "MONSTER_EGG"),
    COMMAND_BLOCK(0, "COMMAND"),
    COMMAND_BLOCK_MINECART(0, "COMMAND_MINECART"),
    COMPARATOR(0, "REDSTONE_COMPARATOR", "REDSTONE_COMPARATOR_ON", "REDSTONE_COMPARATOR_OFF"),
    COMPASS(0, "COMPASS"),
    CONDUIT(0, "STONE"),
    COOKED_BEEF(0, "COOKED_BEEF"),
    COOKED_CHICKEN(0, "COOKED_CHICKEN"),
    COOKED_COD(0, "COOKED_FISH"),
    COOKED_MUTTON(0, "COOKED_MUTTON"),
    COOKED_PORKCHOP(0, "GRILLED_PORK"),
    COOKED_RABBIT(0, "COOKED_RABBIT"),
    COOKED_SALMON(1, "COOKED_FISH"),
    COOKIE(0, "COOKIE"),
    COW_SPAWN_EGG(0, "MONSTER_EGG"),
    CRACKED_STONE_BRICKS(2, "SMOOTH_BRICK"),
    CRAFTING_TABLE(0, "WORKBENCH"),
    CREEPER_HEAD(0, "SKULL","SKULL_ITEM"),
    CREEPER_SPAWN_EGG(0, "MONSTER_EGG"),
    CREEPER_WALL_HEAD(0, "SKULL","SKULL_ITEM"),
    CUT_RED_SANDSTONE(0, "STONE"),
    CUT_SANDSTONE(0, "STONE"),
    CYAN_BANNER(6, "BANNER", "STANDING_BANNER"),
    CYAN_BED(9, "BED_BLOCK", "BED"),
    CYAN_CARPET(9, "CARPET"),
    CYAN_CONCRETE(9, "CONCRETE"),
    CYAN_CONCRETE_POWDER(9, "CONCRETE_POWDER"),
    CYAN_DYE(6, "INK_SACK"),
    CYAN_GLAZED_TERRACOTTA(0, "CYAN_GLAZED_TERRACOTTA"),
    CYAN_SHULKER_BOX(0, "CYAN_SHULKER_BOX"),
    CYAN_STAINED_GLASS(9, "STAINED_GLASS"),
    CYAN_STAINED_GLASS_PANE(9, "STAINED_GLASS_PANE"),
    CYAN_TERRACOTTA(9, "STAINED_CLAY"),
    CYAN_WALL_BANNER(0, "WALL_BANNER"),
    CYAN_WOOL(9, "WOOL"),
    DAMAGED_ANVIL(2, "ANVIL"),
    DANDELION(0, "YELLOW_FLOWER"),
    DANDELION_YELLOW(11, "INK_SACK"),
    DARK_OAK_BOAT(0, "BOAT_DARK_OAK", "BOAT"),
    DARK_OAK_BUTTON(0, "WOOD_BUTTON"),
    DARK_OAK_DOOR(0, "DARK_OAK_DOOR", "DARK_OAK_DOOR_ITEM"),
    DARK_OAK_FENCE(0, "DARK_OAK_FENCE"),
    DARK_OAK_FENCE_GATE(0, "DARK_OAK_FENCE_GATE"),
    DARK_OAK_LEAVES(1, "LEAVES_2"),
    DARK_OAK_LOG(1, "LOG_2"),
    DARK_OAK_PLANKS(5, "WOOD"),
    DARK_OAK_PRESSURE_PLATE(0, "WOOD_PLATE"),
    DARK_OAK_SAPLING(5, "SAPLING"),
    DARK_OAK_SLAB(0,"WOODEN_SLAB", "WOOD_STEP", "WOOD_DOUBLE_STEP"),
    DARK_OAK_STAIRS(0, "DARK_OAK_STAIRS"),
    DARK_OAK_TRAPDOOR(0, "TRAP_DOOR"),
    DARK_OAK_WOOD(1, "LOG_2"),
    DARK_PRISMARINE(2, "PRISMARINE"),
    DARK_PRISMARINE_SLAB(0, "STONE"),
    DARK_PRISMARINE_STAIRS(0, "STONE"),
    DAYLIGHT_DETECTOR(0, "DAYLIGHT_DETECTOR", "DAYLIGHT_DETECTOR_INVERTED"),
    DAYLIGHT_DETECTOR_INVERTED(0, "DAYLIGHT_DETECTOR_INVERTED"),
    DEAD_BRAIN_CORAL_BLOCK(0, "STONE"),
    DEAD_BUBBLE_CORAL_BLOCK(0, "STONE"),
    DEAD_BUSH(0, "DEAD_BUSH"),
    DEAD_FIRE_CORAL_BLOCK(0, "STONE"),
    DEAD_HORN_CORAL_BLOCK(0, "STONE"),
    DEAD_TUBE_CORAL_BLOCK(0, "STONE"),
    DEBUG_STICK(0, "STICK"),
    DETECTOR_RAIL(0, "DETECTOR_RAIL"),
    DIAMOND(0, "DIAMOND"),
    DIAMOND_AXE(0, "DIAMOND_AXE"),
    DIAMOND_BLOCK(0, "DIAMOND_BLOCK"),
    DIAMOND_BOOTS(0, "DIAMOND_BOOTS"),
    DIAMOND_CHESTPLATE(0, "DIAMOND_CHESTPLATE"),
    DIAMOND_HELMET(0, "DIAMOND_HELMET"),
    DIAMOND_HOE(0, "DIAMOND_HOE"),
    DIAMOND_HORSE_ARMOR(0, "DIAMOND_BARDING"),
    DIAMOND_LEGGINGS(0, "DIAMOND_LEGGINGS"),
    DIAMOND_ORE(0, "DIAMOND_ORE"),
    DIAMOND_PICKAXE(0, "DIAMOND_PICKAXE"),
    DIAMOND_SHOVEL(0, "DIAMOND_SPADE"),
    DIAMOND_SWORD(0, "DIAMOND_SWORD"),
    DIORITE(3, "STONE"),
    DIRT(0, "DIRT"),
    DISPENSER(0, "DISPENSER"),
    DOLPHIN_SPAWN_EGG(0, "MONSTER_EGG"),
    DONKEY_SPAWN_EGG(0, "MONSTER_EGG"),
    DRAGON_BREATH(0, "DRAGONS_BREATH"),
    DRAGON_EGG(0, "DRAGON_EGG"),
    DRAGON_HEAD(5, "SKULL","SKULL_ITEM"),
    DRAGON_WALL_HEAD(0, "SKULL","SKULL_ITEM"),
    DRIED_KELP(0, "STONE"),
    DRIED_KELP_BLOCK(0, "STONE"),
    DROPPER(0, "DROPPER"),
    DROWNED_SPAWN_EGG(0, "MONSTER_EGG"),
    EGG(0, "EGG"),
    ELDER_GUARDIAN_SPAWN_EGG(0, "MONSTER_EGG"),
    ELYTRA(0, "ELYTRA"),
    EMERALD(0, "EMERALD"),
    EMERALD_BLOCK(0, "EMERALD_BLOCK"),
    EMERALD_ORE(0, "EMERALD_ORE"),
    ENCHANTED_BOOK(0, "ENCHANTED_BOOK"),
    ENCHANTED_GOLDEN_APPLE(1, "GOLDEN_APPLE"),
    ENCHANTING_TABLE(0, "ENCHANTMENT_TABLE"),
    ENDERMAN_SPAWN_EGG(0, "MONSTER_EGG"),
    ENDERMITE_SPAWN_EGG(0, "MONSTER_EGG"),
    ENDER_CHEST(0, "ENDER_CHEST"),
    ENDER_EYE(0, "EYE_OF_ENDER"),
    ENDER_PEARL(0, "ENDER_PEARL"),
    END_CRYSTAL(0, "END_CRYSTAL"),
    END_GATEWAY(0, "END_GATEWAY"),
    END_PORTAL(0, "ENDER_PORTAL"),
    END_PORTAL_FRAME(0, "ENDER_PORTAL_FRAME"),
    END_ROD(0, "END_ROD"),
    END_STONE(0, "ENDER_STONE"),
    END_STONE_BRICKS(0, "END_BRICKS"),
    EVOKER_SPAWN_EGG(0, "MONSTER_EGG"),
    EXPERIENCE_BOTTLE(0, "EXP_BOTTLE"),
    FARMLAND(0, "SOIL"),
    FEATHER(0, "FEATHER"),
    FERMENTED_SPIDER_EYE(0, "FERMENTED_SPIDER_EYE"),
    FERN(2, "LONG_GRASS"),
    FILLED_MAP(0, "MAP"),
    FIRE(0, "FIRE"),
    FIREWORK_ROCKET(0, "FIREWORK"),
    FIREWORK_STAR(0, "FIREWORK_CHARGE"),
    FIRE_CHARGE(0, "FIREBALL"),
    FIRE_CORAL(0, "STONE"),
    FIRE_CORAL_BLOCK(0, "STONE"),
    FIRE_CORAL_FAN(0, "STONE"),
    FISHING_ROD(0, "FISHING_ROD"),
    FLINT(0, "FLINT"),
    FLINT_AND_STEEL(0, "FLINT_AND_STEEL"),
    FLOWER_POT(0, "FLOWER_POT","FLOWER_POT_ITEM"),
    FROSTED_ICE(0, "FROSTED_ICE"),
    FURNACE(0, "FURNACE", "BURNING_FURNACE"),
    FURNACE_MINECART(0, "POWERED_MINECART"),
    GHAST_SPAWN_EGG(0, "MONSTER_EGG"),
    GHAST_TEAR(0, "GHAST_TEAR"),
    GLASS(0, "GLASS"),
    GLASS_BOTTLE(0, "GLASS_BOTTLE"),
    GLASS_PANE(0, "THIN_GLASS"),
    GLISTERING_MELON_SLICE(0, "SPECKLED_MELON"),
    GLOWSTONE(0, "GLOWSTONE"),
    GLOWSTONE_DUST(0, "GLOWSTONE_DUST"),
    GOLDEN_APPLE(0, "GOLDEN_APPLE"),
    GOLDEN_AXE(0, "GOLD_AXE"),
    GOLDEN_BOOTS(0, "GOLD_BOOTS"),
    GOLDEN_CARROT(0, "GOLDEN_CARROT"),
    GOLDEN_CHESTPLATE(0, "GOLD_CHESTPLATE"),
    GOLDEN_HELMET(0, "GOLD_HELMET"),
    GOLDEN_HOE(0, "GOLD_HOE"),
    GOLDEN_HORSE_ARMOR(0, "GOLD_BARDING"),
    GOLDEN_LEGGINGS(0, "GOLD_LEGGINGS"),
    GOLDEN_PICKAXE(0, "GOLD_PICKAXE"),
    GOLDEN_SHOVEL(0, "GOLD_SPADE"),
    GOLDEN_SWORD(0, "GOLD_SWORD"),
    GOLD_BLOCK(0, "GOLD_BLOCK"),
    GOLD_INGOT(0, "GOLD_INGOT"),
    GOLD_NUGGET(0, "GOLD_NUGGET"),
    GOLD_ORE(0, "GOLD_ORE"),
    GRANITE(1, "STONE"),
    LONG_GRASS(0, "LONG_GRASS", "GRASS"),
    GRASS_BLOCK(0, "GRASS"),
    GRASS_PATH(0, "GRASS_PATH"),
    GRAVEL(0, "GRAVEL"),
    GRAY_BANNER(8, "BANNER", "STANDING_BANNER"),
    GRAY_BED(7, "BED_BLOCK", "BED"),
    GRAY_CARPET(7, "CARPET"),
    GRAY_CONCRETE(7, "CONCRETE"),
    GRAY_CONCRETE_POWDER(7, "CONCRETE_POWDER"),
    GRAY_DYE(8, "INK_SACK"),
    GRAY_GLAZED_TERRACOTTA(0, "GRAY_GLAZED_TERRACOTTA"),
    GRAY_SHULKER_BOX(0, "GRAY_SHULKER_BOX"),
    GRAY_STAINED_GLASS(7, "STAINED_GLASS"),
    GRAY_STAINED_GLASS_PANE(7, "STAINED_GLASS_PANE"),
    GRAY_TERRACOTTA(7, "STAINED_CLAY"),
    GRAY_WALL_BANNER(0, "WALL_BANNER"),
    GRAY_WOOL(7, "WOOL"),
    GREEN_BANNER(2, "BANNER", "STANDING_BANNER"),
    GREEN_BED(13, "BED_BLOCK", "BED"),
    GREEN_CARPET(13, "CARPET"),
    GREEN_CONCRETE(13, "CONCRETE"),
    GREEN_CONCRETE_POWDER(13, "CONCRETE_POWDER"),
    GREEN_GLAZED_TERRACOTTA(0, "GREEN_GLAZED_TERRACOTTA"),
    GREEN_SHULKER_BOX(0, "GREEN_SHULKER_BOX"),
    GREEN_STAINED_GLASS(13, "STAINED_GLASS"),
    GREEN_STAINED_GLASS_PANE(13, "STAINED_GLASS_PANE"),
    GREEN_TERRACOTTA(13, "STAINED_CLAY"),
    GREEN_WALL_BANNER(0, "WALL_BANNER"),
    GREEN_WOOL(13, "WOOL"),
    GUARDIAN_SPAWN_EGG(0, "MONSTER_EGG"),
    GUNPOWDER(0, "SULPHUR"),
    HAY_BLOCK(0, "HAY_BLOCK"),
    HEART_OF_THE_SEA(0, "STONE"),
    HEAVY_WEIGHTED_PRESSURE_PLATE(0, "IRON_PLATE"),
    HOPPER(0, "HOPPER"),
    HOPPER_MINECART(0, "HOPPER_MINECART"),
    HORN_CORAL(0, "STONE"),
    HORN_CORAL_BLOCK(0, "STONE"),
    HORN_CORAL_FAN(0, "STONE"),
    HORSE_SPAWN_EGG(0, "MONSTER_EGG"),
    HUSK_SPAWN_EGG(0, "MONSTER_EGG"),
    ICE(0, "ICE"),
    INFESTED_CHISELED_STONE_BRICKS(5, "MONSTER_EGGS"),
    INFESTED_COBBLESTONE(1, "MONSTER_EGGS"),
    INFESTED_CRACKED_STONE_BRICKS(4, "MONSTER_EGGS"),
    INFESTED_MOSSY_STONE_BRICKS(3, "MONSTER_EGGS"),
    INFESTED_STONE(0, "MONSTER_EGGS"),
    INFESTED_STONE_BRICKS(2, "MONSTER_EGGS"),
    INK_SAC(0, "INK_SACK"),
    IRON_AXE(0, "IRON_AXE"),
    IRON_BARS(0, "IRON_FENCE"),
    IRON_BLOCK(0, "IRON_BLOCK"),
    IRON_BOOTS(0, "IRON_BOOTS"),
    IRON_CHESTPLATE(0, "IRON_CHESTPLATE"),
    IRON_DOOR(0, "IRON_DOOR", "IRON_DOOR_BLOCK"),
    IRON_HELMET(0, "IRON_HELMET"),
    IRON_HOE(0, "IRON_HOE"),
    IRON_HORSE_ARMOR(0, "IRON_BARDING"),
    IRON_INGOT(0, "IRON_INGOT"),
    IRON_LEGGINGS(0, "IRON_LEGGINGS"),
    IRON_NUGGET(0, "IRON_NUGGET"),
    IRON_ORE(0, "IRON_ORE"),
    IRON_PICKAXE(0, "IRON_PICKAXE"),
    IRON_SHOVEL(0, "IRON_SPADE"),
    IRON_SWORD(0, "IRON_SWORD"),
    IRON_TRAPDOOR(0, "IRON_TRAPDOOR"),
    ITEM_FRAME(0, "ITEM_FRAME"),
    JACK_O_LANTERN(0, "JACK_O_LANTERN"),
    JUKEBOX(0, "JUKEBOX"),
    JUNGLE_BOAT(0, "BOAT_JUNGLE", "BOAT"),
    JUNGLE_BUTTON(0, "WOOD_BUTTON"),
    JUNGLE_DOOR(0, "JUNGLE_DOOR", "JUNGLE_DOOR_ITEM"),
    JUNGLE_FENCE(0, "JUNGLE_FENCE"),
    JUNGLE_FENCE_GATE(0, "JUNGLE_FENCE_GATE"),
    JUNGLE_LEAVES(3, "LEAVES"),
    JUNGLE_LOG(3, "LOG"),
    JUNGLE_PLANKS(3, "WOOD"),
    JUNGLE_PRESSURE_PLATE(0, "WOOD_PLATE"),
    JUNGLE_SAPLING(3, "SAPLING"),
    JUNGLE_SLAB(3,"WOODEN_SLAB", "WOOD_STEP", "WOOD_DOUBLE_STEP"),
    JUNGLE_STAIRS(0, "JUNGLE_WOOD_STAIRS"),
    JUNGLE_TRAPDOOR(0, "TRAP_DOOR"),
    JUNGLE_WOOD(3, "LOG"),
    KELP(0, "STONE"),
    KELP_PLANT(0, "STONE"),
    KNOWLEDGE_BOOK(0, "KNOWLEDGE_BOOK"),
    LADDER(0, "LADDER"),
    LAPIS_BLOCK(0, "LAPIS_BLOCK"),
    LAPIS_LAZULI(4, "INK_SACK"),
    LAPIS_ORE(0, "LAPIS_ORE"),
    LARGE_FERN(3, "DOUBLE_PLANT"),
    LAVA(0, "LAVA", "STATIONARY_LAVA"),
    LAVA_BUCKET(0, "LAVA_BUCKET"),
    LEAD(0, "LEASH"),
    LEATHER(0, "LEATHER"),
    LEATHER_BOOTS(0, "LEATHER_BOOTS"),
    LEATHER_CHESTPLATE(0, "LEATHER_CHESTPLATE"),
    LEATHER_HELMET(0, "LEATHER_HELMET"),
    LEATHER_LEGGINGS(0, "LEATHER_LEGGINGS"),
    LEVER(0, "LEVER"),
    LIGHT_BLUE_BANNER(12, "BANNER", "STANDING_BANNER"),
    LIGHT_BLUE_BED(3, "BED_BLOCK", "BED"),
    LIGHT_BLUE_CARPET(3, "CARPET"),
    LIGHT_BLUE_CONCRETE(3, "CONCRETE"),
    LIGHT_BLUE_CONCRETE_POWDER(3, "CONCRETE_POWDER"),
    LIGHT_BLUE_DYE(12, "INK_SACK"),
    LIGHT_BLUE_GLAZED_TERRACOTTA(0, "LIGHT_BLUE_GLAZED_TERRACOTTA"),
    LIGHT_BLUE_SHULKER_BOX(0, "LIGHT_BLUE_SHULKER_BOX"),
    LIGHT_BLUE_STAINED_GLASS(3, "STAINED_GLASS"),
    LIGHT_BLUE_STAINED_GLASS_PANE(3, "STAINED_GLASS_PANE"),
    LIGHT_BLUE_TERRACOTTA(3, "STAINED_CLAY"),
    LIGHT_BLUE_WALL_BANNER(0, "BANNER", "STANDING_BANNER"),
    LIGHT_BLUE_WOOL(3, "WOOL"),
    LIGHT_GRAY_BANNER(7, "BANNER", "STANDING_BANNER"),
    LIGHT_GRAY_BED(8, "BED_BLOCK", "BED"),
    LIGHT_GRAY_CARPET(8, "CARPET"),
    LIGHT_GRAY_CONCRETE(8, "CONCRETE"),
    LIGHT_GRAY_CONCRETE_POWDER(8, "CONCRETE_POWDER"),
    LIGHT_GRAY_DYE(7, "INK_SACK"),
    LIGHT_GRAY_GLAZED_TERRACOTTA(0, "SILVER_GLAZED_TERRACOTTA"),
    LIGHT_GRAY_SHULKER_BOX(0, "SILVER_SHULKER_BOX"),
    LIGHT_GRAY_STAINED_GLASS(8, "STAINED_GLASS"),
    LIGHT_GRAY_STAINED_GLASS_PANE(8, "STAINED_GLASS_PANE"),
    LIGHT_GRAY_TERRACOTTA(8, "STAINED_CLAY"),
    LIGHT_GRAY_WALL_BANNER(0, "WALL_BANNER"),
    LIGHT_GRAY_WOOL(8, "WOOL"),
    LIGHT_WEIGHTED_PRESSURE_PLATE(0, "GOLD_PLATE"),
    LILAC(1, "DOUBLE_PLANT"),
    LILY_PAD(0, "WATER_LILY"),
    LIME_BANNER(10, "BANNER", "STANDING_BANNER"),
    LIME_BED(5, "BED_BLOCK", "BED"),
    LIME_CARPET(5, "CARPET"),
    LIME_CONCRETE(5, "CONCRETE"),
    LIME_CONCRETE_POWDER(5, "CONCRETE_POWDER"),
    LIME_DYE(10, "INK_SACK"),
    LIME_GLAZED_TERRACOTTA(0, "LIME_GLAZED_TERRACOTTA"),
    LIME_SHULKER_BOX(0, "LIME_SHULKER_BOX"),
    LIME_STAINED_GLASS(5, "STAINED_GLASS"),
    LIME_STAINED_GLASS_PANE(5, "STAINED_GLASS_PANE"),
    LIME_TERRACOTTA(5, "STAINED_CLAY"),
    LIME_WALL_BANNER(0, "WALL_BANNER"),
    LIME_WOOL(5, "WOOL"),
    LINGERING_POTION(0, "LINGERING_POTION"),
    LLAMA_SPAWN_EGG(0, "MONSTER_EGG"),
    MAGENTA_BANNER(13, "BANNER", "STANDING_BANNER"),
    MAGENTA_BED(2, "BED_BLOCK", "BED"),
    MAGENTA_CARPET(2, "CARPET"),
    MAGENTA_CONCRETE(2, "CONCRETE"),
    MAGENTA_CONCRETE_POWDER(2, "CONCRETE_POWDER"),
    MAGENTA_DYE(13, "INK_SACK"),
    MAGENTA_GLAZED_TERRACOTTA(0, "MAGENTA_GLAZED_TERRACOTTA"),
    MAGENTA_SHULKER_BOX(0, "MAGENTA_SHULKER_BOX"),
    MAGENTA_STAINED_GLASS(2, "STAINED_GLASS"),
    MAGENTA_STAINED_GLASS_PANE(2, "STAINED_GLASS_PANE"),
    MAGENTA_TERRACOTTA(2, "STAINED_CLAY"),
    MAGENTA_WALL_BANNER(0, "WALL_BANNER"),
    MAGENTA_WOOL(2, "WOOL"),
    MAGMA_BLOCK(0, "MAGMA"),
    MAGMA_CREAM(0, "MAGMA_CREAM"),
    MAGMA_CUBE_SPAWN_EGG(0, "MONSTER_EGG"),
    MAP(0, "EMPTY_MAP", "MAP"),
    MELON(0, "MELON_BLOCK"),
    MELON_SEEDS(0, "MELON_SEEDS"),
    MELON_SLICE(0, "MELON"),
    MELON_STEM(0, "MELON_STEM"),
    MILK_BUCKET(0, "MILK_BUCKET"),
    MINECART(0, "MINECART"),
    MOOSHROOM_SPAWN_EGG(0, "MONSTER_EGG"),
    MOSSY_COBBLESTONE(0, "MOSSY_COBBLESTONE"),
    MOSSY_COBBLESTONE_WALL(1, "COBBLE_WALL"),
    MOSSY_STONE_BRICKS(1, "SMOOTH_BRICK"),
    MOVING_PISTON(0, "PISTON_MOVING_PIECE"),
    MULE_SPAWN_EGG(0, "MONSTER_EGG"),
    MUSHROOM_STEM(0, "BROWN_MUSHROOM"),
    MUSHROOM_STEW(0, "MUSHROOM_SOUP"),
    MUSIC_DISC_11(0, "GOLD_RECORD"),
    MUSIC_DISC_13(0, "GREEN_RECORD"),
    MUSIC_DISC_BLOCKS(0, "RECORD_3"),
    MUSIC_DISC_CAT(0, "RECORD_4"),
    MUSIC_DISC_CHIRP(0, "RECORD_5"),
    MUSIC_DISC_FAR(0, "RECORD_6"),
    MUSIC_DISC_MALL(0, "RECORD_7"),
    MUSIC_DISC_MELLOHI(0, "RECORD_8"),
    MUSIC_DISC_STAL(0, "RECORD_9"),
    MUSIC_DISC_STRAD(0, "RECORD_10"),
    MUSIC_DISC_WAIT(0, "RECORD_11"),
    MUSIC_DISC_WARD(0, "RECORD_12"),
    MUTTON(0, "MUTTON"),
    MYCELIUM(0, "MYCEL"),
    NAME_TAG(0, "NAME_TAG"),
    NAUTILUS_SHELL(0, "STONE"),
    NETHERRACK(0, "NETHERRACK"),
    NETHER_BRICK(0, "NETHER_BRICK"),
    NETHER_BRICKS(0, "NETHER_BRICK"),
    NETHER_BRICK_FENCE(0, "NETHER_FENCE"),
    NETHER_BRICK_SLAB(6, "STEP"),
    NETHER_BRICK_STAIRS(0, "NETHER_BRICK_STAIRS"),
    NETHER_PORTAL(0, "PORTAL"),
    NETHER_QUARTZ_ORE(0, "QUARTZ_ORE"),
    NETHER_STAR(0, "NETHER_STAR"),
    NETHER_WART(0, "NETHER_STALK"),
    NETHER_WART_BLOCK(0, "NETHER_WART_BLOCK", "NETHER_WARTS"),
    NOTE_BLOCK(0, "NOTE_BLOCK"),
    OAK_BOAT(0, "BOAT", "BOAT"),
    OAK_BUTTON(0, "WOOD_BUTTON"),
    OAK_DOOR(0, "WOODEN_DOOR", "WOOD_DOOR"),
    OAK_FENCE(0, "FENCE"),
    OAK_FENCE_GATE(0, "FENCE_GATE"),
    OAK_LEAVES(0, "LEAVES"),
    OAK_LOG(0, "LOG"),
    OAK_PLANKS(0, "WOOD"),
    OAK_PRESSURE_PLATE(0, "WOOD_PLATE"),
    OAK_SAPLING(0, "SAPLING"),
    OAK_SLAB(0,"WOODEN_SLAB", "WOOD_STEP", "WOOD_DOUBLE_STEP"),
    OAK_STAIRS(0, "WOOD_STAIRS"),
    OAK_TRAPDOOR(0, "TRAP_DOOR"),
    OAK_WOOD(0, "LOG"),
    OBSERVER(0, "OBSERVER"),
    OBSIDIAN(0, "OBSIDIAN"),
    OCELOT_SPAWN_EGG(0, "RECORD_12"),
    ORANGE_BANNER(14, "BANNER", "STANDING_BANNER"),
    ORANGE_BED(1, "BED_BLOCK", "BED"),
    ORANGE_CARPET(1, "CARPET"),
    ORANGE_CONCRETE(1, "CONCRETE"),
    ORANGE_CONCRETE_POWDER(1, "CONCRETE_POWDER"),
    ORANGE_DYE(14, "INK_SACK"),
    ORANGE_GLAZED_TERRACOTTA(0, "ORANGE_GLAZED_TERRACOTTA"),
    ORANGE_SHULKER_BOX(0, "ORANGE_SHULKER_BOX"),
    ORANGE_STAINED_GLASS(1, "STAINED_GLASS"),
    ORANGE_STAINED_GLASS_PANE(1, "STAINED_GLASS_PANE"),
    ORANGE_TERRACOTTA(1, "STAINED_CLAY"),
    ORANGE_TULIP(5, "RED_ROSE"),
    ORANGE_WALL_BANNER(0, "WALL_BANNER"),
    ORANGE_WOOL(1, "WOOL"),
    OXEYE_DAISY(8, "RED_ROSE"),
    PACKED_ICE(0, "PACKED_ICE"),
    PAINTING(0, "PAINTING"),
    PAPER(0, "PAPER"),
    PARROT_SPAWN_EGG(0, "MONSTER_EGG"),
    PEONY(5, "DOUBLE_PLANT"),
    PETRIFIED_OAK_SLAB(0, "STONE"),
    PHANTOM_MEMBRANE(0, "STONE"),
    PHANTOM_SPAWN_EGG(0, "MONSTER_EGG"),
    PIG_SPAWN_EGG(0, "MONSTER_EGG"),
    PINK_BANNER(9, "BANNER", "STANDING_BANNER"),
    PINK_BED(6, "BED_BLOCK", "BED"),
    PINK_CARPET(6, "CARPET"),
    PINK_CONCRETE(6, "CONCRETE"),
    PINK_CONCRETE_POWDER(6, "CONCRETE_POWDER"),
    PINK_DYE(9, "INK_SACK"),
    PINK_GLAZED_TERRACOTTA(0, "PINK_GLAZED_TERRACOTTA"),
    PINK_SHULKER_BOX(0, "PINK_SHULKER_BOX"),
    PINK_STAINED_GLASS(6, "STAINED_GLASS"),
    PINK_STAINED_GLASS_PANE(6, "STAINED_GLASS_PANE"),
    PINK_TERRACOTTA(6, "STAINED_CLAY"),
    PINK_TULIP(7, "RED_ROSE"),
    PINK_WALL_BANNER(0, "WALL_BANNER"),
    PINK_WOOL(6, "WOOL"),
    PISTON(0, "PISTON_BASE"),
    PISTON_HEAD(0, "PISTON_EXTENSION"),
    PLAYER_HEAD(0, "SKULL","SKULL_ITEM"),
    PLAYER_WALL_HEAD(0, "SKULL","SKULL_ITEM"),
    PODZOL(2, "DIRT"),
    POISONOUS_POTATO(0, "POISONOUS_POTATO"),
    POLAR_BEAR_SPAWN_EGG(0, "MONSTER_EGG"),
    POLISHED_ANDESITE(6, "STONE"),
    POLISHED_DIORITE(4, "STONE"),
    POLISHED_GRANITE(2, "STONE"),
    POPPED_CHORUS_FRUIT(0, "CHORUS_FRUIT_POPPED"),
    POPPY(0, "RED_ROSE"),
    PORKCHOP(0, "PORK"),
    POTATO(0, "POTATO_ITEM"),
    POTATOES(0, "POTATO"),
    POTION(0, "POTION"),
    POTTED_ACACIA_SAPLING(0, "FLOWER_POT"),
    POTTED_ALLIUM(0, "FLOWER_POT"),
    POTTED_AZURE_BLUET(0, "FLOWER_POT"),
    POTTED_BIRCH_SAPLING(0, "FLOWER_POT"),
    POTTED_BLUE_ORCHID(0, "FLOWER_POT"),
    POTTED_BROWN_MUSHROOM(0, "FLOWER_POT"),
    POTTED_CACTUS(0, "FLOWER_POT"),
    POTTED_DANDELION(0, "FLOWER_POT"),
    POTTED_DARK_OAK_SAPLING(0, "FLOWER_POT"),
    POTTED_DEAD_BUSH(0, "FLOWER_POT"),
    POTTED_FERN(0, "FLOWER_POT"),
    POTTED_JUNGLE_SAPLING(0, "FLOWER_POT"),
    POTTED_OAK_SAPLING(0, "FLOWER_POT"),
    POTTED_ORANGE_TULIP(0, "FLOWER_POT"),
    POTTED_OXEYE_DAISY(0, "FLOWER_POT"),
    POTTED_PINK_TULIP(0, "FLOWER_POT"),
    POTTED_POPPY(0, "FLOWER_POT"),
    POTTED_RED_MUSHROOM(0, "FLOWER_POT"),
    POTTED_RED_TULIP(0, "FLOWER_POT"),
    POTTED_SPRUCE_SAPLING(0, "FLOWER_POT"),
    POTTED_WHITE_TULIP(0, "FLOWER_POT"),
    POWERED_RAIL(0, "POWERED_RAIL"),
    PRISMARINE(0, "PRISMARINE"),
    PRISMARINE_BRICKS(1, "PRISMARINE"),
    PRISMARINE_BRICK_SLAB(0, "STONE"),
    PRISMARINE_BRICK_STAIRS(0, "STONE"),
    PRISMARINE_CRYSTALS(0, "PRISMARINE_CRYSTALS"),
    PRISMARINE_SHARD(0, "PRISMARINE_SHARD"),
    PRISMARINE_SLAB(0, "STONE"),
    PRISMARINE_STAIRS(0, "STONE"),
    PUFFERFISH(3, "RAW_FISH"),
    PUFFERFISH_BUCKET(0, "STONE"),
    PUFFERFISH_SPAWN_EGG(0, "MONSTER_EGG"),
    PUMPKIN(0, "PUMPKIN"),
    PUMPKIN_PIE(0, "PUMPKIN_PIE"),
    PUMPKIN_SEEDS(0, "PUMPKIN_SEEDS"),
    PUMPKIN_STEM(0, "PUMPKIN_STEM"),
    PURPLE_BANNER(5, "BANNER", "STANDING_BANNER"),
    PURPLE_BED(10, "BED_BLOCK", "BED"),
    PURPLE_CARPET(10, "CARPET"),
    PURPLE_CONCRETE(10, "CONCRETE"),
    PURPLE_CONCRETE_POWDER(10, "CONCRETE_POWDER"),
    PURPLE_DYE(5, "INK_SACK"),
    PURPLE_GLAZED_TERRACOTTA(0, "PURPLE_GLAZED_TERRACOTTA"),
    PURPLE_SHULKER_BOX(0, "PURPLE_SHULKER_BOX"),
    PURPLE_STAINED_GLASS(10, "STAINED_GLASS"),
    PURPLE_STAINED_GLASS_PANE(10, "STAINED_GLASS_PANE"),
    PURPLE_TERRACOTTA(10, "STAINED_CLAY"),
    PURPLE_WALL_BANNER(0, "WALL_BANNER"),
    PURPLE_WOOL(10, "WOOL"),
    PURPUR_BLOCK(0, "PURPUR_BLOCK"),
    PURPUR_PILLAR(0, "PURPUR_PILLAR"),
    PURPUR_SLAB(0, "PURPUR_SLAB", "PURPUR_DOUBLE_SLAB"),
    PURPUR_STAIRS(0, "PURPUR_STAIRS"),
    QUARTZ(0, "QUARTZ"),
    QUARTZ_BLOCK(0, "QUARTZ_BLOCK"),
    QUARTZ_PILLAR(2, "QUARTZ_BLOCK"),
    QUARTZ_SLAB(7, "STEP"),
    QUARTZ_STAIRS(0, "QUARTZ_STAIRS"),
    RABBIT(0, "RABBIT"),
    RABBIT_FOOT(0, "RABBIT_FOOT"),
    RABBIT_HIDE(0, "RABBIT_HIDE"),
    RABBIT_SPAWN_EGG(0, "MONSTER_EGG"),
    RABBIT_STEW(0, "RABBIT_STEW"),
    RAIL(0, "RAILS"),
    REDSTONE(0, "REDSTONE"),
    REDSTONE_BLOCK(0, "REDSTONE_BLOCK"),
    REDSTONE_LAMP(0, "REDSTONE_LAMP_ON", "REDSTONE_LAMP_OFF"),
    REDSTONE_ORE(0, "REDSTONE_ORE", "GLOWING_REDSTONE_ORE"),
    REDSTONE_TORCH(0, "REDSTONE_TORCH_ON", "REDSTONE_TORCH_OFF"),
    REDSTONE_WALL_TORCH(1, "REDSTONE_TORCH_ON", "REDSTONE_TORCH_OFF"),
    REDSTONE_WIRE(0, "REDSTONE_WIRE"),
    RED_BANNER(1, "BANNER", "STANDING_BANNER"),
    RED_BED(14, "BED_BLOCK", "BED"),
    RED_CARPET(14, "CARPET"),
    RED_CONCRETE(14, "CONCRETE"),
    RED_CONCRETE_POWDER(14, "CONCRETE_POWDER"),
    RED_GLAZED_TERRACOTTA(0, "RED_GLAZED_TERRACOTTA"),
    RED_MUSHROOM(0, "RED_MUSHROOM"),
    RED_MUSHROOM_BLOCK(0, "RED_MUSHROOM", "HUGE_MUSHROOM_2"),
    RED_NETHER_BRICKS(0, "RED_NETHER_BRICK"),
    RED_SAND(1, "SAND"),
    RED_SANDSTONE(0, "RED_SANDSTONE"),
    RED_SANDSTONE_SLAB(0, "STONE_SLAB2", "DOUBLE_STONE_SLAB2"),
    RED_SANDSTONE_STAIRS(0, "RED_SANDSTONE_STAIRS"),
    RED_SHULKER_BOX(0, "RED_SHULKER_BOX"),
    RED_STAINED_GLASS(14, "STAINED_GLASS"),
    RED_STAINED_GLASS_PANE(14, "STAINED_GLASS_PANE"),
    RED_TERRACOTTA(14, "STAINED_CLAY"),
    RED_TULIP(4, "RED_ROSE"),
    RED_WALL_BANNER(0, "WALL_BANNER"),
    RED_WOOL(14, "WOOL"),
    REPEATER(0, "DIODE", "DIODE_BLOCK_ON", "DIODE_BLOCK_OFF"),
    REPEATING_COMMAND_BLOCK(0, "COMMAND_REPEATING"),
    ROSE_BUSH(4, "DOUBLE_PLANT"),
    ROSE_RED(1, "INK_SACK"),
    ROTTEN_FLESH(0, "ROTTEN_FLESH"),
    SADDLE(0, "SADDLE"),
    SALMON(1, "RAW_FISH"),
    SALMON_BUCKET(0, "BUCKET"),
    SALMON_SPAWN_EGG(0, "MONSTER_EGG"),
    SAND(0, "SAND"),
    SANDSTONE(0, "SANDSTONE"),
    SANDSTONE_SLAB(1, "STONE_SLAB", "STEP", "DOUBLE_STEP"),
    SANDSTONE_STAIRS(0, "SANDSTONE_STAIRS"),
    SCUTE(0, "STONE"),
    SEAGRASS(0, "STONE"),
    SEA_LANTERN(0, "SEA_LANTERN"),
    SEA_PICKLE(0, "STONE"),
    SHEARS(0, "SHEARS"),
    SHEEP_SPAWN_EGG(0, "MONSTER_EGG"),
    SHIELD(0, "SHIELD"),
    SHULKER_BOX(0, "PURPLE_SHULKER_BOX"),
    SHULKER_SHELL(0, "SHULKER_SHELL"),
    SHULKER_SPAWN_EGG(0, "MONSTER_EGG"),
    SIGN(0, "SIGN"),
    SILVERFISH_SPAWN_EGG(0, "MONSTER_EGG"),
    SKELETON_HORSE_SPAWN_EGG(0, "MONSTER_EGG"),
    SKULL(0, "SKELETON_SKULL", "SKULL_ITEM"),
    SKULL_ITEM(0, "SKELETON_SKULL", "SKULL"),
    SKELETON_SKULL(0, "SKULL","SKULL_ITEM"),
    SKELETON_SPAWN_EGG(0, "MONSTER_EGG"),
    SKELETON_WALL_SKULL(0, "SKULL","SKULL_ITEM"),
    SLIME_BALL(0, "SLIME_BALL", "AIR"),
    SLIME_BLOCK(0, "SLIME_BLOCK", "STONE"),
    SLIME_SPAWN_EGG(0, "MONSTER_EGG"),
    SMOOTH_QUARTZ(0, "STONE"),
    SMOOTH_RED_SANDSTONE(2, "RED_SANDSTONE"),
    SMOOTH_SANDSTONE(2, "SANDSTONE"),
    SMOOTH_STONE(0, "STEP"),
    SNOW(0, "SNOW"),
    SNOWBALL(0, "SNOW_BALL"),
    SNOW_BLOCK(0, "SNOW_BLOCK"),
    SOUL_SAND(0, "SOUL_SAND"),
    SPAWNER(0, "MOB_SPAWNER"),
    SPECTRAL_ARROW(0, "SPECTRAL_ARROW"),
    SPIDER_EYE(0, "SPIDER_EYE"),
    SPIDER_SPAWN_EGG(0, "MONSTER_EGG"),
    SPLASH_POTION(0, "SPLASH_POTION"),
    SPONGE(0, "SPONGE"),
    SPRUCE_BOAT(0, "BOAT_SPRUCE", "BOAT"),
    SPRUCE_BUTTON(0, "WOOD_BUTTON"),
    SPRUCE_DOOR(0, "SPRUCE_DOOR", "SPRUCE_DOOR_ITEM"),
    SPRUCE_FENCE(0, "SPRUCE_FENCE"),
    SPRUCE_FENCE_GATE(0, "SPRUCE_FENCE_GATE"),
    SPRUCE_LEAVES(1, "LEAVES"),
    SPRUCE_LOG(1, "LOG"),
    SPRUCE_PLANKS(1, "WOOD"),
    SPRUCE_PRESSURE_PLATE(0, "WOOD_PLATE"),
    SPRUCE_SAPLING(1, "SAPLING"),
    SPRUCE_SLAB(1,"WOODEN_SLAB", "WOOD_STEP", "WOOD_DOUBLE_STEP"),
    SPRUCE_STAIRS(0, "SPRUCE_WOOD_STAIRS"),
    SPRUCE_TRAPDOOR(0, "TRAP_DOOR"),
    SPRUCE_WOOD(1, "LOG"),
    SQUID_SPAWN_EGG(0, "MONSTER_EGG"),
    STICK(0, "STICK"),
    STICKY_PISTON(0, "PISTON_STICKY_BASE"),
    STONE(0, "STONE"),
    STONE_AXE(0, "STONE_AXE"),
    STONE_BRICKS(0, "SMOOTH_BRICK"),
    STONE_BRICK_SLAB(5, "STONE_SLAB", "STEP", "DOUBLE_STEP"),
    STONE_BRICK_STAIRS(0, "SMOOTH_STAIRS"),
    STONE_BUTTON(0, "STONE_BUTTON"),
    STONE_HOE(0, "STONE_HOE"),
    STONE_PICKAXE(0, "STONE_PICKAXE"),
    STONE_PRESSURE_PLATE(0, "STONE_PLATE"),
    STONE_SHOVEL(0, "STONE_SPADE"),
    STONE_SLAB(0, "STONE_SLAB", "STEP", "DOUBLE_STEP"),
    STONE_SWORD(0, "STONE_SWORD"),
    STRAY_SPAWN_EGG(0, "MONSTER_EGG"),
    STRING(0, "STRING"),
    STRIPPED_ACACIA_LOG(0, "STONE"),
    STRIPPED_ACACIA_WOOD(0, "STONE"),
    STRIPPED_BIRCH_LOG(0, "STONE"),
    STRIPPED_BIRCH_WOOD(0, "STONE"),
    STRIPPED_DARK_OAK_LOG(0, "STONE"),
    STRIPPED_DARK_OAK_WOOD(0, "STONE"),
    STRIPPED_JUNGLE_LOG(0, "STONE"),
    STRIPPED_JUNGLE_WOOD(0, "STONE"),
    STRIPPED_OAK_LOG(0, "STONE"),
    STRIPPED_OAK_WOOD(0, "STONE"),
    STRIPPED_SPRUCE_LOG(0, "STONE"),
    STRIPPED_SPRUCE_WOOD(0, "STONE"),
    STRUCTURE_BLOCK(0, "STRUCTURE_BLOCK"),
    STRUCTURE_VOID(0, "STRUCTURE_VOID"),
    SUGAR(0, "SUGAR"),
    SUGAR_CANE(0, "SUGAR_CANE", "SUGAR_CANE_BLOCK"),
    SUNFLOWER(0, "DOUBLE_PLANT"),
    TALL_GRASS(2, "DOUBLE_PLANT"),
    TALL_SEAGRASS(0, "STONE"),
    TERRACOTTA(0, "HARD_CLAY"),
    TIPPED_ARROW(0, "TIPPED_ARROW"),
    TNT(0, "TNT"),
    TNT_MINECART(0, "EXPLOSIVE_MINECART"),
    TORCH(0, "TORCH"),
    TOTEM_OF_UNDYING(0, "TOTEM"),
    TRAPPED_CHEST(0, "TRAPPED_CHEST"),
    TRIDENT(0, "STONE"),
    TRIPWIRE(0, "TRIPWIRE"),
    TRIPWIRE_HOOK(0, "TRIPWIRE_HOOK"),
    TROPICAL_FISH(0, "RAW_FISH"),
    TROPICAL_FISH_BUCKET(0, "BUCKET"),
    TROPICAL_FISH_SPAWN_EGG(0, "MONSTER_EGG"),
    TUBE_CORAL(0, "STONE"),
    TUBE_CORAL_BLOCK(0, "STONE"),
    TUBE_CORAL_FAN(0, "STONE"),
    TURTLE_EGG(0, "MONSTER_EGG"),
    TURTLE_HELMET(0, "STONE"),
    TURTLE_SPAWN_EGG(0, "MONSTER_EGG"),
    VEX_SPAWN_EGG(0, "MONSTER_EGG"),
    VILLAGER_SPAWN_EGG(0, "MONSTER_EGG"),
    VINDICATOR_SPAWN_EGG(0, "MONSTER_EGG"),
    VINE(0, "VINE"),
    VOID_AIR(0, "AIR"),
    LEGACY_SIGN_POST(0, "SIGN_POST"),
    WALL_SIGN(0, "WALL_SIGN", "SIGN_POST"),
    WALL_TORCH(1, "TORCH"),
    WATER(0, "WATER", "STATIONARY_WATER"),
    WATER_BUCKET(0, "WATER_BUCKET"),
    WET_SPONGE(1, "SPONGE"),
    WHEAT(0, "WHEAT", "CROPS"),
    WHEAT_SEEDS(0, "WHEAT_SEEDS", "SEEDS"),
    WHITE_BANNER(15, "BANNER", "STANDING_BANNER"),
    WHITE_BED(0, "BED_BLOCK", "BED"),
    WHITE_CARPET(0, "CARPET"),
    WHITE_CONCRETE(0, "CONCRETE"),
    WHITE_CONCRETE_POWDER(0, "CONCRETE_POWDER"),
    WHITE_GLAZED_TERRACOTTA(0, "WHITE_GLAZED_TERRACOTTA"),
    WHITE_SHULKER_BOX(0, "WHITE_SHULKER_BOX"),
    WHITE_STAINED_GLASS(0, "STAINED_GLASS"),
    WHITE_STAINED_GLASS_PANE(0, "STAINED_GLASS_PANE"),
    WHITE_TERRACOTTA(0, "TERRACOTTA"),
    WHITE_TULIP(6, "RED_ROSE"),
    WHITE_WALL_BANNER(0, "WALL_BANNER"),
    WHITE_WOOL(0, "WOOL"),
    WITCH_SPAWN_EGG(0, "MONSTER_EGG"),
    WITHER_SKELETON_SKULL(0, "SKULL","SKULL_ITEM"),
    WITHER_SKELETON_SPAWN_EGG(0, "MONSTER_EGG"),
    WITHER_SKELETON_WALL_SKULL(0, "SKULL","SKULL_ITEM"),
    WOLF_SPAWN_EGG(0, "MONSTER_EGG"),
    WOODEN_AXE(0, "WOOD_AXE"),
    WOODEN_HOE(0, "WOOD_HOE"),
    WOODEN_PICKAXE(0, "WOOD_PICKAXE"),
    WOODEN_SHOVEL(0, "WOOD_SPADE"),
    WOODEN_SWORD(0, "WOOD_SWORD"),
    WRITABLE_BOOK(0, "BOOK_AND_QUILL"),
    WRITTEN_BOOK(0, "WRITTEN_BOOK"),
    YELLOW_BANNER(11, "BANNER", "STANDING_BANNER"),
    YELLOW_BED(4, "BED_BLOCK", "BED"),
    YELLOW_CARPET(4, "CARPET"),
    YELLOW_CONCRETE(4, "CONCRETE"),
    YELLOW_CONCRETE_POWDER(4, "CONCRETE_POWDER"),
    YELLOW_GLAZED_TERRACOTTA(0, "YELLOW_GLAZED_TERRACOTTA"),
    YELLOW_SHULKER_BOX(0, "YELLOW_SHULKER_BOX"),
    YELLOW_STAINED_GLASS(4, "STAINED_GLASS"),
    YELLOW_STAINED_GLASS_PANE(4, "STAINED_GLASS_PANE"),
    YELLOW_TERRACOTTA(4, "STAINED_CLAY"),
    YELLOW_WALL_BANNER(0, "WALL_BANNER"),
    YELLOW_WOOL(4, "WOOL"),
    ZOMBIE_HEAD(0, "SKULL","SKULL_ITEM"),
    ZOMBIE_HORSE_SPAWN_EGG(0, "MONSTER_EGG"),
    ZOMBIE_PIGMAN_SPAWN_EGG(0, "MONSTER_EGG"),
    ZOMBIE_SPAWN_EGG(0, "MONSTER_EGG"),
    ZOMBIE_VILLAGER_SPAWN_EGG(0, "MONSTER_EGG"),
    ZOMBIE_WALL_HEAD(0, "SKULL","SKULL_ITEM"),
    ;
    public final String[] names;
    public final int data;
   
    XMaterial(int data, String... names){
        this.names = names;
        this.data = data;
    }
   
    public ItemStack parseItem(){
        Material mat = parseMaterial();
        if(isNewVersion()){
            return new ItemStack(mat);
        }
        return new ItemStack(mat,1,(byte) data);
    }
    public static boolean isNewVersion(){
        Material mat = Material.getMaterial("RED_WOOL");
        return mat != null;
    }
   
    private static Map<String, XMaterial> cachedSearch = new HashMap<>();
    private static Map<XMaterial, Material> cachedParse = new HashMap<>();

    public static XMaterial requestXMaterial(String name, byte data){
        if(cachedSearch.containsKey(name.toUpperCase()+","+data)){
            return cachedSearch.get(name.toUpperCase()+","+data);
        }
        for(XMaterial mat:XMaterial.values()){
            for(String test:mat.names){
                if(name.toUpperCase().equals(test) && ((byte)mat.data) == data){
                    cachedSearch.put(test+","+data,mat);
                    return mat;
                }
            }
        }
        return null;
    }
   
    public boolean isSameMaterial(ItemStack comp){
        if(isNewVersion()){
            return comp.getType() == this.parseMaterial();
        }
        if(comp.getType() == this.parseMaterial() &&
                (int) comp.getData().getData() == (int) this.data){
            return true;
        }
        XMaterial xmat = fromMaterial(comp.getType());
        if(isDamageable(xmat)){
            if(this.parseMaterial() == comp.getType()){
                return true;
            }
        }
        return false;
    }
   
    public XMaterial fromMaterial(Material mat){
        try{
            return XMaterial.valueOf(mat.toString());
        }catch(IllegalArgumentException e){
            for(XMaterial xmat:XMaterial.values()){
                for(String test:xmat.names){
                    if(test.equalsIgnoreCase(mat.toString())){
                        return xmat;
                    }
                }
            }
        }
        return null;
    }
   
    public static XMaterial fromString(String key){
        XMaterial xmat = null;
        try{
            xmat = XMaterial.valueOf(key);
            return xmat;
        }catch(IllegalArgumentException e){
            String[] split = key.split(":");
            if(split.length == 1){
                xmat = requestXMaterial(key,(byte) 0);
            }else{
                xmat = requestXMaterial(split[0],(byte) Integer.parseInt(split[1]));
            }
            return xmat;
        }
       
    }
   
    public boolean isDamageable(XMaterial type){
        if(type == null) return false;
        String[] split = type.toString().split("_");
        int length = split.length;
        switch(split[length-1]) {
            case "HELMET":
            case "CHESTPLATE":
            case "LEGGINGS":
            case "BOOTS":
            case "SWORD":
            case "AXE":
            case "PICKAXE":
            case "SHOVEL":
            case "HOE":
            case "ELYTRA":
            case "TURTLE_HELMET":
            case "TRIDENT":
            case "HORSE_ARMOR":
            case "SHEARS":
                return true;
            default:
                return false;
        }
    }
   
    public Material parseMaterial() {
        return cachedParse.computeIfAbsent(this, key -> {
            Material mat = MiscUtils.match(this.toString());
            if(mat == null) {
                for(int i = 0 ; i < names.length ; i++) {
                    if((mat = MiscUtils.match(names[i])) != null) break;
                }
            }

            if(mat != null) {
                cachedParse.put(key, mat);
            }
            return mat;
        });
    }
   
}