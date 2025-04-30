package net.mattias.pedestal;

import net.fabricmc.api.ClientModInitializer;
import net.mattias.pedestal.blocks.entity.ModBlockEntities;
import net.mattias.pedestal.blocks.entity.renderer.*;
import net.mattias.pedestal.screen.custom.*;
import net.mattias.pedestal.util.PedestalVariant;
import net.mattias.pedestal.util.PedestalVariants;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class PedestalModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockEntityRendererFactories.register(ModBlockEntities.PEDESTAL_BE, PedestalBlockEntityRenderer::new);

        for (PedestalVariant pedestalVariant : PedestalVariants.VARIANTS) {
            HandledScreens.register(PedestalVariants.SCREEN_HANDLER_MAP.get(pedestalVariant), PedestalScreen::new);
        }
    }
}
