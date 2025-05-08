package net.mattias.pedestal.blocks.custom;

import net.mattias.pedestal.util.PedestalVariant;
import net.mattias.pedestal.util.PedestalVariants;
import net.minecraft.block.Blocks;

import java.util.List;

public class BasePedestalVariants {

	public static void define() {
		VARIANTS.forEach(PedestalVariants::register);
	}

	public static List<PedestalVariant> VARIANTS = List.of(
		// original
		new PedestalVariant("pedestal", "chiseled_stone_bricks", () -> Blocks.CHISELED_STONE_BRICKS),

		// wood
		new PedestalVariant("oak_log_pedestal", "oak_log", () -> Blocks.OAK_PLANKS),
		new PedestalVariant("birch_log_pedestal", "birch_log", () -> Blocks.BIRCH_PLANKS),
		new PedestalVariant("acacia_log_pedestal", "acacia_log", () -> Blocks.ACACIA_PLANKS),
		new PedestalVariant("cherry_log_pedestal", "cherry_log", () -> Blocks.CHERRY_PLANKS),
		new PedestalVariant("dark_oak_log_pedestal", "dark_oak_log", () -> Blocks.DARK_OAK_PLANKS),
		new PedestalVariant("jungle_log_pedestal", "jungle_log", () -> Blocks.JUNGLE_PLANKS),
		new PedestalVariant("mangrove_log_pedestal", "mangrove_log", () -> Blocks.MANGROVE_PLANKS),
		new PedestalVariant("spruce_log_pedestal", "spruce_log", () -> Blocks.SPRUCE_PLANKS),
		new PedestalVariant("acacia_planks_pedestal", "acacia_planks", () -> Blocks.ACACIA_PLANKS),
		new PedestalVariant("birch_planks_pedestal", "birch_planks", () -> Blocks.BIRCH_PLANKS),
		new PedestalVariant("bamboo_planks_pedestal", "bamboo_planks", () -> Blocks.BAMBOO_PLANKS),
		new PedestalVariant("cherry_planks_pedestal", "cherry_planks", () -> Blocks.CHERRY_PLANKS),
		new PedestalVariant("dark_oak_planks_pedestal", "dark_oak_planks", () -> Blocks.DARK_OAK_PLANKS),
		new PedestalVariant("jungle_planks_pedestal", "jungle_planks", () -> Blocks.JUNGLE_PLANKS),
		new PedestalVariant("oak_planks_pedestal", "oak_planks", () -> Blocks.OAK_PLANKS),
		new PedestalVariant("mangrove_planks_pedestal", "mangrove_planks", () -> Blocks.MANGROVE_PLANKS),
		new PedestalVariant("spruce_planks_pedestal", "spruce_planks", () -> Blocks.SPRUCE_PLANKS),

		// stone
		new PedestalVariant("stone_pedestal", "stone", () -> Blocks.STONE),
		new PedestalVariant("cobblestone_pedestal", "cobblestone", () -> Blocks.COBBLESTONE),
		new PedestalVariant("stone_bricks_pedestal", "stone_bricks", () -> Blocks.STONE_BRICKS),
		new PedestalVariant("smooth_stone_pedestal", "smooth_stone", () -> Blocks.SMOOTH_STONE),
		new PedestalVariant("polished_granite_pedestal", "polished_granite", () -> Blocks.POLISHED_GRANITE),
		new PedestalVariant("polished_diorite_pedestal", "polished_diorite", () -> Blocks.POLISHED_DIORITE),
		new PedestalVariant("polished_andesite_pedestal", "polished_andesite", () -> Blocks.POLISHED_ANDESITE),
		new PedestalVariant("granite_pedestal", "granite", () -> Blocks.GRANITE),
		new PedestalVariant("diorite_pedestal", "diorite", () -> Blocks.DIORITE),
		new PedestalVariant("andesite_pedestal", "andesite", () -> Blocks.ANDESITE),
		new PedestalVariant("polished_deepslate_pedestal", "polished_deepslate", () -> Blocks.POLISHED_DEEPSLATE),
		new PedestalVariant("bricks_pedestal", "bricks", () -> Blocks.BRICKS),
		new PedestalVariant("mossy_cobblestone_pedestal", "mossy_cobblestone", () -> Blocks.MOSSY_COBBLESTONE),
		new PedestalVariant("mossy_stone_bricks_pedestal", "mossy_stone_bricks", () -> Blocks.MOSSY_STONE_BRICKS),
		new PedestalVariant("quartz_pedestal", "quartz_block_side", () -> Blocks.QUARTZ_BLOCK),
		new PedestalVariant("quartz_pillar_pedestal", "quartz_pillar", () -> Blocks.QUARTZ_PILLAR),
		new PedestalVariant("red_sandstone_pedestal", "red_sandstone", () -> Blocks.RED_SANDSTONE),
		new PedestalVariant("sandstone_pedestal", "sandstone", () -> Blocks.SANDSTONE),

		// concrete
		new PedestalVariant("black_concrete_pedestal", "black_concrete", () -> Blocks.BLACK_CONCRETE),
		new PedestalVariant("blue_concrete_pedestal", "blue_concrete", () -> Blocks.BLUE_CONCRETE),
		new PedestalVariant("brown_concrete_pedestal", "brown_concrete", () -> Blocks.BROWN_CONCRETE),
		new PedestalVariant("green_concrete_pedestal", "green_concrete", () -> Blocks.GREEN_CONCRETE),
		new PedestalVariant("gray_concrete_pedestal", "gray_concrete", () -> Blocks.GRAY_CONCRETE),
		new PedestalVariant("orange_concrete_pedestal", "orange_concrete", () -> Blocks.ORANGE_CONCRETE),
		new PedestalVariant("purple_concrete_pedestal", "purple_concrete", () -> Blocks.PURPLE_CONCRETE),
		new PedestalVariant("light_gray_concrete_pedestal", "light_gray_concrete", () -> Blocks.LIGHT_GRAY_CONCRETE),
		new PedestalVariant("light_blue_concrete_pedestal", "light_blue_concrete", () -> Blocks.LIGHT_BLUE_CONCRETE),
		new PedestalVariant("pink_concrete_pedestal", "pink_concrete", () -> Blocks.PINK_CONCRETE),
		new PedestalVariant("red_concrete_pedestal", "red_concrete", () -> Blocks.RED_CONCRETE),
		new PedestalVariant("white_concrete_pedestal", "white_concrete", () -> Blocks.WHITE_CONCRETE),
		new PedestalVariant("yellow_concrete_pedestal", "yellow_concrete", () -> Blocks.YELLOW_CONCRETE),
		new PedestalVariant("magenta_concrete_pedestal", "magenta_concrete", () -> Blocks.MAGENTA_CONCRETE),
		new PedestalVariant("cyan_concrete_pedestal", "cyan_concrete", () -> Blocks.CYAN_CONCRETE),
		new PedestalVariant("lime_concrete_pedestal", "lime_concrete", () -> Blocks.LIME_CONCRETE),

		// wool
		new PedestalVariant("black_wool_pedestal", "black_wool", () -> Blocks.BLACK_WOOL),
		new PedestalVariant("blue_wool_pedestal", "blue_wool", () -> Blocks.BLUE_WOOL),
		new PedestalVariant("brown_wool_pedestal", "brown_wool", () -> Blocks.BROWN_WOOL),
		new PedestalVariant("green_wool_pedestal", "green_wool", () -> Blocks.GREEN_WOOL),
		new PedestalVariant("gray_wool_pedestal", "gray_wool", () -> Blocks.GRAY_WOOL),
		new PedestalVariant("orange_wool_pedestal", "orange_wool", () -> Blocks.ORANGE_WOOL),
		new PedestalVariant("purple_wool_pedestal", "purple_wool", () -> Blocks.PURPLE_WOOL),
		new PedestalVariant("light_gray_wool_pedestal", "light_gray_wool", () -> Blocks.LIGHT_GRAY_WOOL),
		new PedestalVariant("light_blue_wool_pedestal", "light_blue_wool", () -> Blocks.LIGHT_BLUE_WOOL),
		new PedestalVariant("pink_wool_pedestal", "pink_wool", () -> Blocks.PINK_WOOL),
		new PedestalVariant("red_wool_pedestal", "red_wool", () -> Blocks.RED_WOOL),
		new PedestalVariant("white_wool_pedestal", "white_wool", () -> Blocks.WHITE_WOOL),
		new PedestalVariant("yellow_wool_pedestal", "yellow_wool", () -> Blocks.YELLOW_WOOL),
		new PedestalVariant("magenta_wool_pedestal", "magenta_wool", () -> Blocks.MAGENTA_WOOL),
		new PedestalVariant("cyan_wool_pedestal", "cyan_wool", () -> Blocks.CYAN_WOOL),
		new PedestalVariant("lime_wool_pedestal", "lime_wool", () -> Blocks.LIME_WOOL),
		new PedestalVariant("terracotta_pedestal", "terracotta", () -> Blocks.TERRACOTTA),

		// terracotta
		new PedestalVariant("black_terracotta_pedestal", "black_terracotta", () -> Blocks.BLACK_TERRACOTTA),
		new PedestalVariant("blue_terracotta_pedestal", "blue_terracotta", () -> Blocks.BLUE_TERRACOTTA),
		new PedestalVariant("brown_terracotta_pedestal", "brown_terracotta", () -> Blocks.BROWN_TERRACOTTA),
		new PedestalVariant("green_terracotta_pedestal", "green_terracotta", () -> Blocks.GREEN_TERRACOTTA),
		new PedestalVariant("gray_terracotta_pedestal", "gray_terracotta", () -> Blocks.GRAY_TERRACOTTA),
		new PedestalVariant("orange_terracotta_pedestal", "orange_terracotta", () -> Blocks.ORANGE_TERRACOTTA),
		new PedestalVariant("purple_terracotta_pedestal", "purple_terracotta", () -> Blocks.PURPLE_TERRACOTTA),
		new PedestalVariant("light_gray_terracotta_pedestal", "light_gray_terracotta", () -> Blocks.LIGHT_GRAY_TERRACOTTA),
		new PedestalVariant("light_blue_terracotta_pedestal", "light_blue_terracotta", () -> Blocks.LIGHT_BLUE_TERRACOTTA),
		new PedestalVariant("pink_terracotta_pedestal", "pink_terracotta", () -> Blocks.PINK_TERRACOTTA),
		new PedestalVariant("red_terracotta_pedestal", "red_terracotta", () -> Blocks.RED_TERRACOTTA),
		new PedestalVariant("white_terracotta_pedestal", "white_terracotta", () -> Blocks.WHITE_TERRACOTTA),
		new PedestalVariant("yellow_terracotta_pedestal", "yellow_terracotta", () -> Blocks.YELLOW_TERRACOTTA),
		new PedestalVariant("magenta_terracotta_pedestal", "magenta_terracotta", () -> Blocks.MAGENTA_TERRACOTTA),
		new PedestalVariant("cyan_terracotta_pedestal", "cyan_terracotta", () -> Blocks.CYAN_TERRACOTTA),
		new PedestalVariant("lime_terracotta_pedestal", "lime_terracotta", () -> Blocks.LIME_TERRACOTTA),

		// terracotta glazed
		new PedestalVariant("black_terracotta_glazed_pedestal", "black_glazed_terracotta", () -> Blocks.BLACK_GLAZED_TERRACOTTA),
		new PedestalVariant("blue_terracotta_glazed_pedestal", "blue_glazed_terracotta", () -> Blocks.BLUE_GLAZED_TERRACOTTA),
		new PedestalVariant("brown_terracotta_glazed_pedestal", "brown_glazed_terracotta", () -> Blocks.BROWN_GLAZED_TERRACOTTA),
		new PedestalVariant("green_terracotta_glazed_pedestal", "green_glazed_terracotta", () -> Blocks.GREEN_GLAZED_TERRACOTTA),
		new PedestalVariant("gray_terracotta_glazed_pedestal", "gray_glazed_terracotta", () -> Blocks.GRAY_GLAZED_TERRACOTTA),
		new PedestalVariant("orange_terracotta_glazed_pedestal", "orange_glazed_terracotta", () -> Blocks.ORANGE_GLAZED_TERRACOTTA),
		new PedestalVariant("purple_terracotta_glazed_pedestal", "purple_glazed_terracotta", () -> Blocks.PURPLE_GLAZED_TERRACOTTA),
		new PedestalVariant("light_gray_terracotta_glazed_pedestal", "light_gray_glazed_terracotta", () -> Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA),
		new PedestalVariant("light_blue_terracotta_glazed_pedestal", "light_blue_glazed_terracotta", () -> Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA),
		new PedestalVariant("pink_terracotta_glazed_pedestal", "pink_glazed_terracotta", () -> Blocks.PINK_GLAZED_TERRACOTTA),
		new PedestalVariant("red_terracotta_glazed_pedestal", "red_glazed_terracotta", () -> Blocks.RED_GLAZED_TERRACOTTA),
		new PedestalVariant("white_terracotta_glazed_pedestal", "white_glazed_terracotta", () -> Blocks.WHITE_GLAZED_TERRACOTTA),
		new PedestalVariant("yellow_terracotta_glazed_pedestal", "yellow_glazed_terracotta", () -> Blocks.YELLOW_GLAZED_TERRACOTTA),
		new PedestalVariant("magenta_terracotta_glazed_pedestal", "magenta_glazed_terracotta", () -> Blocks.MAGENTA_GLAZED_TERRACOTTA),
		new PedestalVariant("cyan_terracotta_glazed_pedestal", "cyan_glazed_terracotta", () -> Blocks.CYAN_GLAZED_TERRACOTTA),
		new PedestalVariant("lime_terracotta_glazed_pedestal", "lime_glazed_terracotta", () -> Blocks.LIME_GLAZED_TERRACOTTA),

		// misc.
		new PedestalVariant("blackstone_pedestal", "blackstone", () -> Blocks.BLACKSTONE),
		new PedestalVariant("crying_obsidian_pedestal", "crying_obsidian", () -> Blocks.CRYING_OBSIDIAN),
		new PedestalVariant("obsidian_pedestal", "obsidian", () -> Blocks.OBSIDIAN),
		new PedestalVariant("red_nether_bricks_pedestal", "red_nether_bricks", () -> Blocks.RED_NETHER_BRICKS),
		new PedestalVariant("nether_bricks_pedestal", "nether_bricks", () -> Blocks.NETHER_BRICKS),
		new PedestalVariant("netherrack_pedestal", "netherrack", () -> Blocks.NETHERRACK),
		new PedestalVariant("soul_sand_pedestal", "soul_sand", () -> Blocks.SOUL_SAND),
		new PedestalVariant("soul_soil_pedestal", "soul_soil", () -> Blocks.SOUL_SOIL),
		new PedestalVariant("end_stone_bricks_pedestal", "end_stone_bricks", () -> Blocks.END_STONE_BRICKS),
		new PedestalVariant("end_stone_pedestal", "end_stone", () -> Blocks.END_STONE),
		new PedestalVariant("purpur_block_pedestal", "purpur_block", () -> Blocks.PURPUR_BLOCK)
	);
}