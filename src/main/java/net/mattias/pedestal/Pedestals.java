package net.mattias.pedestal;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.loader.api.FabricLoader;
import net.mattias.pedestal.blocks.ModBlocks;
import net.mattias.pedestal.blocks.custom.BasePedestalVariants;
import net.mattias.pedestal.blocks.custom.BiomeOPlentyVariants;
import net.mattias.pedestal.blocks.custom.CobblemonVariants;
import net.mattias.pedestal.blocks.entity.ModBlockEntities;
import net.mattias.pedestal.item.ModItemGroups;
import net.mattias.pedestal.screen.ModScreenHandlers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pedestals implements ModInitializer {
	public static final String MOD_ID = "pedestals";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		BasePedestalVariants.define();
		if(FabricLoader.getInstance().isModLoaded("biomesoplenty")) BiomeOPlentyVariants.define();
		if(FabricLoader.getInstance().isModLoaded("cobblemon")) CobblemonVariants.define();

		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();

		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();
	}
}