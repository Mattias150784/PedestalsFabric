package net.mattias.pedestal;

import net.fabricmc.api.ModInitializer;

import net.mattias.pedestal.blocks.ModBlocks;
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
		ModItemGroups.registerItemGroups();

		ModBlocks.registerModBlocks();

		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();



	}
}