package net.mattias.pedestal;

import net.fabricmc.api.ClientModInitializer;
import net.mattias.pedestal.blocks.entity.ModBlockEntities;
import net.mattias.pedestal.blocks.entity.renderer.*;
import net.mattias.pedestal.screen.ModScreenHandlers;
import net.mattias.pedestal.screen.custom.*;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class PedestalModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {


        BlockEntityRendererFactories.register(ModBlockEntities.PEDESTAL_BE, PedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.OAK_LOG_PEDESTAL_BE, OakLogPedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.BIRCH_LOG_PEDESTAL_BE, BirchLogPedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.SPRUCE_LOG_PEDESTAL_BE, SpruceLogPedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.DARK_OAK_LOG_PEDESTAL_BE, DarkOakLogPedestalBlockEntityRenderer::new);


        HandledScreens.register(ModScreenHandlers.PEDESTAL_SCREEN_HANDLER, PedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.OAK_LOG_PEDESTAL_SCREEN_HANDLER, OakLogPedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.BIRCH_LOG_PEDESTAL_SCREEN_HANDLER, BirchLogPedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.SPRUCE_LOG_PEDESTAL_SCREEN_HANDLER, SpruceLogPedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.DARK_OAK_LOG_PEDESTAL_SCREEN_HANDLER, DarkOakLogPedestalScreen::new);
    }
}
