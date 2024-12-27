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

    public static final BlockEntityType<CherryLogPedestalBlockEntity> CHERRY_LOG_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "cherry_log_pedestal_be"),
                    BlockEntityType.Builder.create(CherryLogPedestalBlockEntity::new, ModBlocks.CHERRY_LOG_PEDESTAL).build(null));

    public static final BlockEntityType<MangroveLogPedestalBlockEntity> MANGROVE_LOG_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "mangrove_log_pedestal_be"),
                    BlockEntityType.Builder.create(MangroveLogPedestalBlockEntity::new, ModBlocks.MANGROVE_LOG_PEDESTAL).build(null));

    public static final BlockEntityType<JungleLogPedestalBlockEntity> JUNGLE_LOG_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "jungle_log_pedestal_be"),
                    BlockEntityType.Builder.create(JungleLogPedestalBlockEntity::new, ModBlocks.JUNGLE_LOG_PEDESTAL).build(null));

    public static final BlockEntityType<AcaciaLogPedestalBlockEntity> ACACIA_LOG_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "acacia_log_pedestal_be"),
                    BlockEntityType.Builder.create(AcaciaLogPedestalBlockEntity::new, ModBlocks.ACACIA_LOG_PEDESTAL).build(null));

    public static final BlockEntityType<OakPlanksPedestalBlockEntity> OAK_PLANKS_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "oak_planks_pedestal_be"),
                    BlockEntityType.Builder.create(OakPlanksPedestalBlockEntity::new, ModBlocks.OAK_PLANKS_PEDESTAL).build(null));

    public static final BlockEntityType<BirchPlanksPedestalBlockEntity> BIRCH_PLANKS_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "birch_planks_pedestal_be"),
                    BlockEntityType.Builder.create(BirchPlanksPedestalBlockEntity::new, ModBlocks.BIRCH_PLANKS_PEDESTAL).build(null));

    public static final BlockEntityType<DarkOakPlanksPedestalBlockEntity> DARK_OAK_PLANKS_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "dark_oak_planks_pedestal_be"),
                    BlockEntityType.Builder.create(DarkOakPlanksPedestalBlockEntity::new, ModBlocks.DARK_OAK_PLANKS_PEDESTAL).build(null));

    public static final BlockEntityType<SprucePlanksPedestalBlockEntity> SPRUCE_PLANKS_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "spruce_planks_pedestal_be"),
                    BlockEntityType.Builder.create(SprucePlanksPedestalBlockEntity::new, ModBlocks.SPRUCE_PLANKS_PEDESTAL).build(null));

    public static final BlockEntityType<CherryPlanksPedestalBlockEntity> CHERRY_PLANKS_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "cherry_planks_pedestal_be"),
                    BlockEntityType.Builder.create(CherryPlanksPedestalBlockEntity::new, ModBlocks.CHERRY_PLANKS_PEDESTAL).build(null));

    public static final BlockEntityType<MangrovePlanksPedestalBlockEntity> MANGROVE_PLANKS_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "mangrove_planks_pedestal_be"),
                    BlockEntityType.Builder.create(MangrovePlanksPedestalBlockEntity::new, ModBlocks.MANGROVE_PLANKS_PEDESTAL).build(null));

    public static final BlockEntityType<JunglePlanksPedestalBlockEntity> JUNGLE_PLANKS_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "jungle_planks_pedestal_be"),
                    BlockEntityType.Builder.create(JunglePlanksPedestalBlockEntity::new, ModBlocks.JUNGLE_PLANKS_PEDESTAL).build(null));

    public static final BlockEntityType<AcaciaPlanksPedestalBlockEntity> ACACIA_PLANKS_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "acacia_planks_pedestal_be"),
                    BlockEntityType.Builder.create(AcaciaPlanksPedestalBlockEntity::new, ModBlocks.ACACIA_PLANKS_PEDESTAL).build(null));

    public static final BlockEntityType<BambooPlanksPedestalBlockEntity> BAMBOO_PLANKS_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "bamboo_planks_pedestal_be"),
                    BlockEntityType.Builder.create(BambooPlanksPedestalBlockEntity::new, ModBlocks.BAMBOO_PLANKS_PEDESTAL).build(null));

    public static final BlockEntityType<ObsidianPedestalBlockEntity> OBSIDIAN_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "obsidian_pedestal_be"),
                    BlockEntityType.Builder.create(ObsidianPedestalBlockEntity::new, ModBlocks.OBSIDIAN_PEDESTAL).build(null));

    public static final BlockEntityType<CryingObsidianPedestalBlockEntity> CRYING_OBSIDIAN_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "crying_obsidian_pedestal_be"),
                    BlockEntityType.Builder.create(CryingObsidianPedestalBlockEntity::new, ModBlocks.CRYING_OBSIDIAN_PEDESTAL).build(null));

    public static final BlockEntityType<PolishedDeepslatePedestalBlockEntity> POLISHED_DEEPSLATE_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "polished_deepslate_pedestal_be"),
                    BlockEntityType.Builder.create(PolishedDeepslatePedestalBlockEntity::new, ModBlocks.POLISHED_DEEPSLATE_PEDESTAL).build(null));

    public static void registerBlockEntities() {
        Pedestals.LOGGER.info("Registering Block Entities for " + Pedestals.MOD_ID);
    }
}