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





    public static void registerScreenHandlers() {
        Pedestals.LOGGER.info("Registering Screen Handlers for " + Pedestals.MOD_ID);
    }
}