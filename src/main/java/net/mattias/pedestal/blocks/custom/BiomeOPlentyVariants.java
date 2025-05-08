package net.mattias.pedestal.blocks.custom;

import net.mattias.pedestal.util.PedestalVariant;
import net.mattias.pedestal.util.PedestalVariants;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.util.List;

public class BiomeOPlentyVariants {

	public static void define() {
		VARIANTS.forEach(PedestalVariants::register);
	}

	public static List<PedestalVariant> VARIANTS = List.of(
			new PedestalVariant("fir_planks_pedestal", "fir_planks", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "fir_planks"))),
			new PedestalVariant("pine_planks_pedestal", "pine_planks", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "pine_planks"))),
			new PedestalVariant("maple_planks_pedestal", "maple_planks", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "maple_planks"))),
			new PedestalVariant("redwood_planks_pedestal", "redwood_planks", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "redwood_planks"))),
			new PedestalVariant("mahogany_planks_pedestal", "mahogany_planks", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "mahogany_planks"))),
			new PedestalVariant("jacaranda_planks_pedestal", "jacaranda_planks", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "jacaranda_planks"))),
			new PedestalVariant("palm_planks_pedestal", "palm_planks", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "palm_planks"))),
			new PedestalVariant("willow_planks_pedestal", "willow_planks", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "willow_planks"))),
			new PedestalVariant("dead_planks_pedestal", "dead_planks", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "dead_planks"))),
			new PedestalVariant("magic_planks_pedestal", "magic_planks", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "magic_planks"))),
			new PedestalVariant("umbran_planks_pedestal", "umbran_planks", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "umbran_planks"))),
			new PedestalVariant("hellbark_planks_pedestal", "hellbark_planks", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "hellbark_planks"))),
			new PedestalVariant("empyreal_planks_pedestal", "empyreal_planks", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "empyreal_planks"))),

			new PedestalVariant("fir_log_pedestal", "fir_log", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "fir_planks"))),
			new PedestalVariant("pine_log_pedestal", "pine_log", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "pine_planks"))),
			new PedestalVariant("maple_log_pedestal", "maple_log", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "maple_planks"))),
			new PedestalVariant("redwood_log_pedestal", "redwood_log", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "redwood_planks"))),
			new PedestalVariant("mahogany_log_pedestal", "mahogany_log", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "mahogany_planks"))),
			new PedestalVariant("jacaranda_log_pedestal", "jacaranda_log", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "jacaranda_planks"))),
			new PedestalVariant("palm_log_pedestal", "palm_log", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "palm_planks"))),
			new PedestalVariant("willow_log_pedestal", "willow_log", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "willow_planks"))),
			new PedestalVariant("dead_log_pedestal", "dead_log", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "dead_planks"))),
			new PedestalVariant("magic_log_pedestal", "magic_log", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "magic_planks"))),
			new PedestalVariant("umbran_log_pedestal", "umbran_log", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "umbran_planks"))),
			new PedestalVariant("hellbark_log_pedestal", "hellbark_log", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "hellbark_planks"))),
			new PedestalVariant("empyreal_log_pedestal", "empyreal_log", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "empyreal_planks"))),

			new PedestalVariant("brimstone_pedestal", "brimstone", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "brimstone"))),
			new PedestalVariant("brimstone_bricks_pedestal", "brimstone_bricks", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "brimstone_bricks"))),
			new PedestalVariant("chiseled_brimstone_bricks_pedestal", "chiseled_brimstone_bricks", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "chiseled_brimstone_bricks")))

	);
}