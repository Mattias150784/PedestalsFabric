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
		new PedestalVariant("fir_log_pedestal", "fir_log", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "fir_log")))//,

// Adding these ones after
//      new PedestalVariant("pine_log_pedestal", "pine_log", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "pine_log"))),
//      new PedestalVariant("maple_log_pedestal", "maple_log", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "maple_log"))),
//      new PedestalVariant("redwood_log_pedestal", "redwood_log", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "redwood_log"))),
//      new PedestalVariant("mahogany_log_pedestal", "mahogany_log", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "mahogany_log"))),
//      new PedestalVariant("jacaranda_log_pedestal", "jacaranda_log", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "jacaranda_log"))),
//      new PedestalVariant("palm_log_pedestal", "palm_log", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "palm_log"))),
//      new PedestalVariant("willow_log_pedestal", "willow_log", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "willow_log"))),
//      new PedestalVariant("dead_log_pedestal", "dead_log", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "dead_log"))),
//      new PedestalVariant("magic_log_pedestal", "magic_log", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "magic_log"))),
//      new PedestalVariant("umbran_log_pedestal", "umbran_log", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "umbran_log"))),
//      new PedestalVariant("hellbark_log_pedestal", "hellbark_log", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "hellbark_log"))),
//      new PedestalVariant("empyreal_log_pedestal", "empyreal_log", () -> Registries.BLOCK.get(Identifier.of("biomesoplenty", "empyreal_log")))
	);
}