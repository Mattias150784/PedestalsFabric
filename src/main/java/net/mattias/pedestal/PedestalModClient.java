package net.mattias.pedestal;

import net.fabricmc.api.ClientModInitializer;
import net.mattias.pedestal.blocks.entity.ModBlockEntities;
import net.mattias.pedestal.blocks.entity.renderer.PedestalBlockEntityRenderer;
import net.mattias.pedestal.screen.ModScreenHandlers;
import net.mattias.pedestal.screen.custom.PedestalScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class PedestalModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {


        BlockEntityRendererFactories.register(ModBlockEntities.PEDESTAL_BE, PedestalBlockEntityRenderer::new);

        HandledScreens.register(ModScreenHandlers.PEDESTAL_SCREEN_HANDLER, PedestalScreen::new);
    }
}
