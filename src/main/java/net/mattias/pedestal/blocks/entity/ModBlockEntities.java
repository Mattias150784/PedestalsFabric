package net.mattias.pedestal.blocks.entity;

import net.mattias.pedestal.Pedestals;
import net.mattias.pedestal.blocks.ModBlocks;
import net.mattias.pedestal.blocks.entity.custom.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {

    public static final BlockEntityType<PedestalBlockEntity> PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "pedestal_be"),
                    BlockEntityType.Builder.create(PedestalBlockEntity::new, ModBlocks.PEDESTAL).build(null));

    public static final BlockEntityType<OakLogPedestalBlockEntity> OAK_LOG_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "oak_log_pedestal_be"),
                    BlockEntityType.Builder.create(OakLogPedestalBlockEntity::new, ModBlocks.OAK_LOG_PEDESTAL).build(null));

    public static final BlockEntityType<BirchLogPedestalBlockEntity> BIRCH_LOG_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "birch_log_pedestal_be"),
                    BlockEntityType.Builder.create(BirchLogPedestalBlockEntity::new, ModBlocks.BIRCH_LOG_PEDESTAL).build(null));

    public static final BlockEntityType<DarkOakLogPedestalBlockEntity> DARK_OAK_LOG_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "dark_oak_log_pedestal_be"),
                    BlockEntityType.Builder.create(DarkOakLogPedestalBlockEntity::new, ModBlocks.DARK_OAK_LOG_PEDESTAL).build(null));

    public static final BlockEntityType<SpruceLogPedestalBlockEntity> SPRUCE_LOG_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "spruce_log_pedestal_be"),
                    BlockEntityType.Builder.create(SpruceLogPedestalBlockEntity::new, ModBlocks.SPRUCE_LOG_PEDESTAL).build(null));


    public static void registerBlockEntities() {
        Pedestals.LOGGER.info("Registering Block Entities for " + Pedestals.MOD_ID);
    }
}