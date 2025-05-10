package net.mattias.pedestal.blocks.custom;

import net.mattias.pedestal.util.PedestalVariant;
import net.mattias.pedestal.util.PedestalVariants;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.util.List;

public class CreateVariants {

	public static void define() {
		VARIANTS.forEach(PedestalVariants::register);
	}

	public static List<PedestalVariant> VARIANTS = List.of(
			new PedestalVariant("andesite_casing_pedestal", "andesite_casing", () -> Registries.BLOCK.get(Identifier.of("create", "andesite_casing"))),
			new PedestalVariant("brass_casing_pedestal", "brass_casing", () -> Registries.BLOCK.get(Identifier.of("create","brass_casing"))),
			new PedestalVariant("copper_casing_pedestal", "copper_casing", () -> Registries.BLOCK.get(Identifier.of("create","copper_casing"))),
			new PedestalVariant("train_casing_pedestal", "railway_casing", () -> Registries.BLOCK.get(Identifier.of("create","railway_casing"))),
			new PedestalVariant("zinc_block_pedestal", "zinc_block", () -> Registries.BLOCK.get(Identifier.of("create","zinc_block"))),
			new PedestalVariant("andesite_alloy_block_pedestal", "andesite_block", () -> Registries.BLOCK.get(Identifier.of("create","andesite_alloy_block"))),
			new PedestalVariant("industrial_iron_block_pedestal", "industrial_iron_block", () -> Registries.BLOCK.get(Identifier.of("create","industrial_iron_block"))),
			//new PedestalVariant("weathered_iron_block_pedestal", "weathered_iron_block", () -> Registries.BLOCK.get(Identifier.of("create","weathered_iron_block"))),
			new PedestalVariant("brass_block_pedestal", "brass_block", () -> Registries.BLOCK.get(Identifier.of("create","brass_block"))),
			//new PedestalVariant("cardboard_block_pedestal", "cardboard_block", () -> Registries.BLOCK.get(Identifier.of("create","cardboard_block"))),
			//new PedestalVariant("bound_cardboard_block_pedestal", "bound_cardboard_block", () -> Registries.BLOCK.get(Identifier.of("create","bound_cardboard_block"))),
			new PedestalVariant("rose_quartz_block_pedestal", "palettes/rose_quartz_side", () -> Registries.BLOCK.get(Identifier.of("create","rose_quartz_block"))),
			new PedestalVariant("rose_quartz_tiles_pedestal", "palettes/rose_quartz_tiles", () -> Registries.BLOCK.get(Identifier.of("create","rose_quartz_tiles"))),
			new PedestalVariant("small_rose_quartz_tiles_pedestal", "palettes/small_rose_quartz_tiles", () -> Registries.BLOCK.get(Identifier.of("create","small_rose_quartz_tiles"))),
			new PedestalVariant("copper_shingles_pedestal", "copper/copper_shingles", () -> Registries.BLOCK.get(Identifier.of("create","copper_shingles"))),
			new PedestalVariant("exposed_copper_shingles_pedestal", "copper/exposed_copper_shingles", () -> Registries.BLOCK.get(Identifier.of("create","exposed_copper_shingles"))),
			new PedestalVariant("weathered_copper_shingles_pedestal", "copper/weathered_copper_shingles", () -> Registries.BLOCK.get(Identifier.of("create","weathered_copper_shingles"))),
			new PedestalVariant("oxidized_copper_shingles_pedestal", "copper/oxidized_copper_shingles", () -> Registries.BLOCK.get(Identifier.of("create","oxidized_copper_shingles"))),
			new PedestalVariant("copper_tiles_pedestal", "copper/copper_tiles", () -> Registries.BLOCK.get(Identifier.of("create","copper_tiles"))),
			new PedestalVariant("oxidized_copper_tiles_pedestal", "copper/oxidized_copper_tiles", () -> Registries.BLOCK.get(Identifier.of("create","oxidized_copper_tiles"))),
			new PedestalVariant("tiled_glass_pedestal", "palettes/tiled_glass", () -> Registries.BLOCK.get(Identifier.of("create","tiled_glass"))),
			new PedestalVariant("framed_glass_pedestal", "palettes/framed_glass", () -> Registries.BLOCK.get(Identifier.of("create","framed_glass"))),
			new PedestalVariant("horizontal_framed_glass_pedestal", "palettes/horizontal_framed_glass", () -> Registries.BLOCK.get(Identifier.of("create","horizontal_framed_glass"))),
			new PedestalVariant("vertical_framed_glass_pedestal", "palettes/vertical_framed_glass", () -> Registries.BLOCK.get(Identifier.of("create","vertical_framed_glass")))
	);
}
