package net.mattias.pedestal;

import net.fabricmc.api.ClientModInitializer;
import net.mattias.pedestal.blocks.entity.ModBlockEntities;
import net.mattias.pedestal.blocks.entity.custom.StoneBricksPedestalBlockEntity;
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
        BlockEntityRendererFactories.register(ModBlockEntities.CHERRY_LOG_PEDESTAL_BE, CherryLogPedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.JUNGLE_LOG_PEDESTAL_BE, JungleLogPedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.MANGROVE_LOG_PEDESTAL_BE, MangroveLogPedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.ACACIA_LOG_PEDESTAL_BE, AcaciaLogPedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.OAK_PLANKS_PEDESTAL_BE, OakPlanksPedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.BIRCH_PLANKS_PEDESTAL_BE, BirchPlanksPedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.SPRUCE_PLANKS_PEDESTAL_BE, SprucePlanksPedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.DARK_OAK_PLANKS_PEDESTAL_BE, DarkOakPlanksPedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.CHERRY_PLANKS_PEDESTAL_BE, CherryPlanksPedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.JUNGLE_PLANKS_PEDESTAL_BE, JunglePlanksPedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.MANGROVE_PLANKS_PEDESTAL_BE, MangrovePlanksPedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.ACACIA_PLANKS_PEDESTAL_BE, AcaciaPlanksPedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.BAMBOO_PLANKS_PEDESTAL_BE, BambooPlanksPedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.POLISHED_DEEPSLATE_PEDESTAL_BE, PolishedDeepslatePedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.CRYING_OBSIDIAN_PEDESTAL_BE, CryingObsidianPedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.OBSIDIAN_PEDESTAL_BE, ObsidianPedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.POLISHED_ANDESITE_PEDESTAL_BE, PolishedAndesitePedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.POLISHED_DIORITE_PEDESTAL_BE, PolishedDioritePedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.POLISHED_GRANITE_PEDESTAL_BE, PolishedGranitePedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.ANDESITE_PEDESTAL_BE, AndesitePedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.DIORITE_PEDESTAL_BE, DioritePedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.GRANITE_PEDESTAL_BE, GranitePedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.POLISHED_TUFF_PEDESTAL_BE, PolishedTuffPedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.SMOOTH_STONE_PEDESTAL_BE, SmoothStonePedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.STONE_BRICKS_PEDESTAL_BE, StoneBricksPedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.STONE_PEDESTAL_BE, StonePedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.COBBLESTONE_PEDESTAL_BE, CobblestonePedestalBlockEntityRenderer::new);

        BlockEntityRendererFactories.register(ModBlockEntities.BRICKS_PEDESTAL_BE, BricksPedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.MOSSY_STONE_BRICKS_PEDESTAL_BE, MossyStoneBricksPedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.MOSSY_COBBLESTONE_PEDESTAL_BE, MossyCobblestonePedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.QUARTZ_PILLAR_PEDESTAL_BE, QuartzPillarPedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.QUARTZ_PEDESTAL_BE, QuartzPedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.RED_SANDSTONE_PEDESTAL_BE, RedSandstonePedestalBlockEntityRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.SANDSTONE_PEDESTAL_BE, SandstonePedestalBlockEntityRenderer::new);


        HandledScreens.register(ModScreenHandlers.PEDESTAL_SCREEN_HANDLER, PedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.OAK_LOG_PEDESTAL_SCREEN_HANDLER, OakLogPedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.BIRCH_LOG_PEDESTAL_SCREEN_HANDLER, BirchLogPedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.SPRUCE_LOG_PEDESTAL_SCREEN_HANDLER, SpruceLogPedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.DARK_OAK_LOG_PEDESTAL_SCREEN_HANDLER, DarkOakLogPedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.CHERRY_LOG_PEDESTAL_SCREEN_HANDLER, CherryLogPedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.JUNGLE_LOG_PEDESTAL_SCREEN_HANDLER, JungleLogPedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.MANGROVE_LOG_PEDESTAL_SCREEN_HANDLER, MangroveLogPedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.ACACIA_LOG_PEDESTAL_SCREEN_HANDLER, AcaciaLogPedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.OAK_PLANKS_PEDESTAL_SCREEN_HANDLER, OakPlanksPedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.BIRCH_PLANKS_PEDESTAL_SCREEN_HANDLER, BirchPlanksPedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.SPRUCE_PLANKS_PEDESTAL_SCREEN_HANDLER, SprucePlanksPedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.DARK_OAK_PLANKS_PEDESTAL_SCREEN_HANDLER, DarkOakPlanksPedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.CHERRY_PLANKS_PEDESTAL_SCREEN_HANDLER, CherryPlanksPedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.JUNGLE_PLANKS_PEDESTAL_SCREEN_HANDLER, JunglePlanksPedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.MANGROVE_PLANKS_PEDESTAL_SCREEN_HANDLER, MangrovePlanksPedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.ACACIA_PLANKS_PEDESTAL_SCREEN_HANDLER, AcaciaPlanksPedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.BAMBOO_PLANKS_PEDESTAL_SCREEN_HANDLER, BambooPlanksPedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.POLISHED_DEEPSLATE_PEDESTAL_SCREEN_HANDLER, PolishedDeepslatePedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.CRYING_OBSIDIAN_PEDESTAL_SCREEN_HANDLER, CryingObsidianPedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.OBSIDIAN_PEDESTAL_SCREEN_HANDLER, ObsidianPedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.BRICKS_PEDESTAL_SCREEN_HANDLER, BricksPedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.MOSSY_STONE_BRICKS_PEDESTAL_SCREEN_HANDLER, MossyStoneBricksPedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.MOSSY_COBBLESTONE_PEDESTAL_SCREEN_HANDLER, MossyCobblestonePedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.RED_SANDSTONE_PEDESTAL_SCREEN_HANDLER, RedSandstonePedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.SANDSTONE_PEDESTAL_SCREEN_HANDLER, SandstonePedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.QUARTZ_PILLAR_PEDESTAL_SCREEN_HANDLER, QuartzPillarPedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.QUARTZ_PEDESTAL_SCREEN_HANDLER, QuartzPedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.POLISHED_DIORITE_PEDESTAL_SCREEN_HANDLER, PolishedDioritePedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.POLISHED_ANDESITE_PEDESTAL_SCREEN_HANDLER, PolishedAndesitePedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.POLISHED_GRANITE_PEDESTAL_SCREEN_HANDLER, PolishedGranitePedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.ANDESITE_PEDESTAL_SCREEN_HANDLER, AndesitePedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.GRANITE_PEDESTAL_SCREEN_HANDLER, GranitePedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.DIORITE_PEDESTAL_SCREEN_HANDLER, DioritePedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.POLISHED_TUFF_PEDESTAL_SCREEN_HANDLER, PolishedTuffPedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.STONE_PEDESTAL_SCREEN_HANDLER, StonePedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.STONE_BRICKS_PEDESTAL_SCREEN_HANDLER, StoneBricksPedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.SMOOTH_STONE_PEDESTAL_SCREEN_HANDLER, SmoothStonePedestalScreen::new);
        HandledScreens.register(ModScreenHandlers.COBBLESTONE_PEDESTAL_SCREEN_HANDLER, CobblestonePedestalScreen::new);

    }
}
