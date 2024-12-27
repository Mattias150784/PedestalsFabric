package net.mattias.pedestal.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.mattias.pedestal.Pedestals;
import net.mattias.pedestal.screen.custom. *;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public class ModScreenHandlers {
    public static final ScreenHandlerType<PedestalScreenHandler> PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Pedestals.MOD_ID, "pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(PedestalScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<OakLogPedestalScreenHandler> OAK_LOG_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Pedestals.MOD_ID, "oak_log_pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(OakLogPedestalScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<BirchLogPedestalScreenHandler> BIRCH_LOG_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Pedestals.MOD_ID, "birch_log_pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(BirchLogPedestalScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<SpruceLogPedestalScreenHandler> SPRUCE_LOG_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Pedestals.MOD_ID, "spruce_log_pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(SpruceLogPedestalScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<DarkOakLogPedestalScreenHandler> DARK_OAK_LOG_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Pedestals.MOD_ID, "dark_oak_log_pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(DarkOakLogPedestalScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<AcaciaLogPedestalScreenHandler> ACACIA_LOG_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Pedestals.MOD_ID, "acacia_log_pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(AcaciaLogPedestalScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<JungleLogPedestalScreenHandler> JUNGLE_LOG_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Pedestals.MOD_ID, "jungle_log_pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(JungleLogPedestalScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<MangroveLogPedestalScreenHandler> MANGROVE_LOG_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Pedestals.MOD_ID, "mangrove_log_pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(MangroveLogPedestalScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<CherryLogPedestalScreenHandler> CHERRY_LOG_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Pedestals.MOD_ID, "cherry_log_pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(CherryLogPedestalScreenHandler::new, BlockPos.PACKET_CODEC));
    
    public static final ScreenHandlerType<OakPlanksPedestalScreenHandler> OAK_PLANKS_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Pedestals.MOD_ID, "oak_planks_pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(OakPlanksPedestalScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<BirchPlanksPedestalScreenHandler> BIRCH_PLANKS_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Pedestals.MOD_ID, "birch_planks_pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(BirchPlanksPedestalScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<SprucePlanksPedestalScreenHandler> SPRUCE_PLANKS_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Pedestals.MOD_ID, "spruce_planks_pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(SprucePlanksPedestalScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<DarkOakPlanksPedestalScreenHandler> DARK_OAK_PLANKS_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Pedestals.MOD_ID, "dark_oak_planks_pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(DarkOakPlanksPedestalScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<AcaciaPlanksPedestalScreenHandler> ACACIA_PLANKS_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Pedestals.MOD_ID, "acacia_planks_pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(AcaciaPlanksPedestalScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<JunglePlanksPedestalScreenHandler> JUNGLE_PLANKS_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Pedestals.MOD_ID, "jungle_planks_pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(JunglePlanksPedestalScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<MangrovePlanksPedestalScreenHandler> MANGROVE_PLANKS_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Pedestals.MOD_ID, "mangrove_planks_pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(MangrovePlanksPedestalScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<CherryPlanksPedestalScreenHandler> CHERRY_PLANKS_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Pedestals.MOD_ID, "cherry_planks_pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(CherryPlanksPedestalScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<BambooPlanksPedestalScreenHandler> BAMBOO_PLANKS_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Pedestals.MOD_ID, "bamboo_planks_pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(BambooPlanksPedestalScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<PolishedDeepslatePedestalScreenHandler> POLISHED_DEEPSLATE_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Pedestals.MOD_ID, "polished_deepslate_pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(PolishedDeepslatePedestalScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<ObsidianPedestalScreenHandler> OBSIDIAN_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Pedestals.MOD_ID, "obsidian_pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(ObsidianPedestalScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<CryingObsidianPedestalScreenHandler> CRYING_OBSIDIAN_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Pedestals.MOD_ID, "crying_obsidian_pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(CryingObsidianPedestalScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<GranitePedestalScreenHandler> GRANITE_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Pedestals.MOD_ID, "granite_pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(GranitePedestalScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<DioritePedestalScreenHandler> DIORITE_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Pedestals.MOD_ID, "diorite_pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(DioritePedestalScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<AndesitePedestalScreenHandler> ANDESITE_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Pedestals.MOD_ID, "andesite_pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(AndesitePedestalScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<CobblestonePedestalScreenHandler> COBBLESTONE_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Pedestals.MOD_ID, "cobblestone_pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(CobblestonePedestalScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<StonePedestalScreenHandler> STONE_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Pedestals.MOD_ID, "stone_pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(StonePedestalScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<PolishedAndesitePedestalScreenHandler> POLISHED_ANDESITE_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Pedestals.MOD_ID, "polished_andesite_pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(PolishedAndesitePedestalScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<PolishedGranitePedestalScreenHandler> POLISHED_GRANITE_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Pedestals.MOD_ID, "polished_granite_pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(PolishedGranitePedestalScreenHandler::new, BlockPos.PACKET_CODEC));
    
    public static final ScreenHandlerType<PolishedDioritePedestalScreenHandler> POLISHED_DIORITE_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Pedestals.MOD_ID, "polished_diorite_pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(PolishedDioritePedestalScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<SmoothStonePedestalScreenHandler> SMOOTH_STONE_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Pedestals.MOD_ID, "smooth_stone_pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(SmoothStonePedestalScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<StoneBricksPedestalScreenHandler> STONE_BRICKS_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Pedestals.MOD_ID, "stone_bricks_pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(StoneBricksPedestalScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<PolishedTuffPedestalScreenHandler> POLISHED_TUFF_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(Pedestals.MOD_ID, "polished_tuff_pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(PolishedTuffPedestalScreenHandler::new, BlockPos.PACKET_CODEC));



    public static void registerScreenHandlers() {
        Pedestals.LOGGER.info("Registering Screen Handlers for " + Pedestals.MOD_ID);
    }
}