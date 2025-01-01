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

    public static final BlockEntityType<CobblestonePedestalBlockEntity> COBBLESTONE_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "cobblestone_pedestal_be"),
                    BlockEntityType.Builder.create(CobblestonePedestalBlockEntity::new, ModBlocks.COBBLESTONE_PEDESTAL).build(null));

    public static final BlockEntityType<StonePedestalBlockEntity> STONE_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "stone_pedestal_be"),
                    BlockEntityType.Builder.create(StonePedestalBlockEntity::new, ModBlocks.STONE_PEDESTAL).build(null));

    public static final BlockEntityType<StoneBricksPedestalBlockEntity> STONE_BRICKS_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "stone_bricks_pedestal_be"),
                    BlockEntityType.Builder.create(StoneBricksPedestalBlockEntity::new, ModBlocks.STONE_BRICKS_PEDESTAL).build(null));

    public static final BlockEntityType<SmoothStonePedestalBlockEntity> SMOOTH_STONE_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "smooth_stone_pedestal_be"),
                    BlockEntityType.Builder.create(SmoothStonePedestalBlockEntity::new, ModBlocks.SMOOTH_STONE_PEDESTAL).build(null));

    public static final BlockEntityType<PolishedAndesitePedestalBlockEntity> POLISHED_ANDESITE_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "polished_andesite_pedestal_be"),
                    BlockEntityType.Builder.create(PolishedAndesitePedestalBlockEntity::new, ModBlocks.POLISHED_ANDESITE_PEDESTAL).build(null));

    public static final BlockEntityType<PolishedDioritePedestalBlockEntity> POLISHED_DIORITE_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "polished_diorite_pedestal_be"),
                    BlockEntityType.Builder.create(PolishedDioritePedestalBlockEntity::new, ModBlocks.POLISHED_DIORITE_PEDESTAL).build(null));

    public static final BlockEntityType<PolishedGranitePedestalBlockEntity> POLISHED_GRANITE_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "polished_granite_pedestal_be"),
                    BlockEntityType.Builder.create(PolishedGranitePedestalBlockEntity::new, ModBlocks.POLISHED_GRANITE_PEDESTAL).build(null));

    public static final BlockEntityType<PolishedTuffPedestalBlockEntity> POLISHED_TUFF_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "polished_tuff_pedestal_be"),
                    BlockEntityType.Builder.create(PolishedTuffPedestalBlockEntity::new, ModBlocks.POLISHED_TUFF_PEDESTAL).build(null));

    public static final BlockEntityType<AndesitePedestalBlockEntity> ANDESITE_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "andesite_pedestal_be"),
                    BlockEntityType.Builder.create(AndesitePedestalBlockEntity::new, ModBlocks.ANDESITE_PEDESTAL).build(null));

    public static final BlockEntityType<DioritePedestalBlockEntity> DIORITE_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "diorite_pedestal_be"),
                    BlockEntityType.Builder.create(DioritePedestalBlockEntity::new, ModBlocks.DIORITE_PEDESTAL).build(null));

    public static final BlockEntityType<GranitePedestalBlockEntity> GRANITE_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "granite_pedestal_be"),
                    BlockEntityType.Builder.create(GranitePedestalBlockEntity::new, ModBlocks.GRANITE_PEDESTAL).build(null));

    public static final BlockEntityType<QuartzPillarPedestalBlockEntity> QUARTZ_PILLAR_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "quartz_pillar_pedestal_be"),
                    BlockEntityType.Builder.create(QuartzPillarPedestalBlockEntity::new, ModBlocks.QUARTZ_PILLAR_PEDESTAL).build(null));

    public static final BlockEntityType<BricksPedestalBlockEntity> BRICKS_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "bricks_pedestal_be"),
                    BlockEntityType.Builder.create(BricksPedestalBlockEntity::new, ModBlocks.BRICKS_PEDESTAL).build(null));

    public static final BlockEntityType<MossyCobblestonePedestalBlockEntity> MOSSY_COBBLESTONE_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "mossy_cobblestone_pedestal_be"),
                    BlockEntityType.Builder.create(MossyCobblestonePedestalBlockEntity::new, ModBlocks.MOSSY_COBBLESTONE_PEDESTAL).build(null));

    public static final BlockEntityType<QuartzPedestalBlockEntity> QUARTZ_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "quartz_pedestal_be"),
                    BlockEntityType.Builder.create(QuartzPedestalBlockEntity::new, ModBlocks.QUARTZ_PEDESTAL).build(null));

    public static final BlockEntityType<MossyStoneBricksPedestalBlockEntity> MOSSY_STONE_BRICKS_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "mossy_stone_bricks_pedestal_be"),
                    BlockEntityType.Builder.create(MossyStoneBricksPedestalBlockEntity::new, ModBlocks.MOSSY_STONE_BRICKS_PEDESTAL).build(null));

    public static final BlockEntityType<RedSandstonePedestalBlockEntity> RED_SANDSTONE_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "red_sandstone_pedestal_be"),
                    BlockEntityType.Builder.create(RedSandstonePedestalBlockEntity::new, ModBlocks.RED_SANDSTONE_PEDESTAL).build(null));

    public static final BlockEntityType<SandstonePedestalBlockEntity> SANDSTONE_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "sandstone_pedestal_be"),
                    BlockEntityType.Builder.create(SandstonePedestalBlockEntity::new, ModBlocks.SANDSTONE_PEDESTAL).build(null));

    public static final BlockEntityType<BlueConcretePedestalBlockEntity> BLUE_CONCRETE_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "blue_concrete_pedestal_be"),
                    BlockEntityType.Builder.create(BlueConcretePedestalBlockEntity::new, ModBlocks.BLUE_CONCRETE_PEDESTAL).build(null));

    public static final BlockEntityType<BrownConcretePedestalBlockEntity> BROWN_CONCRETE_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "brown_concrete_pedestal_be"),
                    BlockEntityType.Builder.create(BrownConcretePedestalBlockEntity::new, ModBlocks.BROWN_CONCRETE_PEDESTAL).build(null));

    public static final BlockEntityType<CyanConcretePedestalBlockEntity> CYAN_CONCRETE_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "cyan_concrete_pedestal_be"),
                    BlockEntityType.Builder.create(CyanConcretePedestalBlockEntity::new, ModBlocks.CYAN_CONCRETE_PEDESTAL).build(null));

    public static final BlockEntityType<LimeConcretePedestalBlockEntity> LIME_CONCRETE_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "lime_concrete_pedestal_be"),
                    BlockEntityType.Builder.create(LimeConcretePedestalBlockEntity::new, ModBlocks.LIME_CONCRETE_PEDESTAL).build(null));

    public static final BlockEntityType<GrayConcretePedestalBlockEntity> GRAY_CONCRETE_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "gray_concrete_pedestal_be"),
                    BlockEntityType.Builder.create(GrayConcretePedestalBlockEntity::new, ModBlocks.GRAY_CONCRETE_PEDESTAL).build(null));

    public static final BlockEntityType<LightGrayConcretePedestalBlockEntity> LIGHT_GRAY_CONCRETE_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "light_gray_concrete_pedestal_be"),
                    BlockEntityType.Builder.create(LightGrayConcretePedestalBlockEntity::new, ModBlocks.LIGHT_GRAY_CONCRETE_PEDESTAL).build(null));

    public static final BlockEntityType<LightBlueConcretePedestalBlockEntity> LIGHT_BLUE_CONCRETE_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "light_blue_concrete_pedestal_be"),
                    BlockEntityType.Builder.create(LightBlueConcretePedestalBlockEntity::new, ModBlocks.LIGHT_BLUE_CONCRETE_PEDESTAL).build(null));

    public static final BlockEntityType<GreenConcretePedestalBlockEntity> GREEN_CONCRETE_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "green_concrete_pedestal_be"),
                    BlockEntityType.Builder.create(GreenConcretePedestalBlockEntity::new, ModBlocks.GREEN_CONCRETE_PEDESTAL).build(null));

    public static final BlockEntityType<MagentaConcretePedestalBlockEntity> MAGENTA_CONCRETE_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "magenta_concrete_pedestal_be"),
                    BlockEntityType.Builder.create(MagentaConcretePedestalBlockEntity::new, ModBlocks.MAGENTA_CONCRETE_PEDESTAL).build(null));

    public static final BlockEntityType<OrangeConcretePedestalBlockEntity> ORANGE_CONCRETE_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "orange_concrete_pedestal_be"),
                    BlockEntityType.Builder.create(OrangeConcretePedestalBlockEntity::new, ModBlocks.ORANGE_CONCRETE_PEDESTAL).build(null));

    public static final BlockEntityType<PinkConcretePedestalBlockEntity> PINK_CONCRETE_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "pink_concrete_pedestal_be"),
                    BlockEntityType.Builder.create(PinkConcretePedestalBlockEntity::new, ModBlocks.PINK_CONCRETE_PEDESTAL).build(null));

    public static final BlockEntityType<PurpleConcretePedestalBlockEntity> PURPLE_CONCRETE_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "purple_concrete_pedestal_be"),
                    BlockEntityType.Builder.create(PurpleConcretePedestalBlockEntity::new, ModBlocks.PURPLE_CONCRETE_PEDESTAL).build(null));

    public static final BlockEntityType<RedConcretePedestalBlockEntity> RED_CONCRETE_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "red_concrete_pedestal_be"),
                    BlockEntityType.Builder.create(RedConcretePedestalBlockEntity::new, ModBlocks.RED_CONCRETE_PEDESTAL).build(null));

    public static final BlockEntityType<WhiteConcretePedestalBlockEntity> WHITE_CONCRETE_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "white_concrete_pedestal_be"),
                    BlockEntityType.Builder.create(WhiteConcretePedestalBlockEntity::new, ModBlocks.WHITE_CONCRETE_PEDESTAL).build(null));

    public static final BlockEntityType<YellowConcretePedestalBlockEntity> YELLOW_CONCRETE_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "yellow_concrete_pedestal_be"),
                    BlockEntityType.Builder.create(YellowConcretePedestalBlockEntity::new, ModBlocks.YELLOW_CONCRETE_PEDESTAL).build(null));

    public static final BlockEntityType<BlackConcretePedestalBlockEntity> BLACK_CONCRETE_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "black_concrete_pedestal_be"),
                    BlockEntityType.Builder.create(BlackConcretePedestalBlockEntity::new, ModBlocks.BLACK_CONCRETE_PEDESTAL).build(null));

    public static final BlockEntityType<BlackstonePedestalBlockEntity> BLACKSTONE_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "blackstone_pedestal_be"),
                    BlockEntityType.Builder.create(BlackstonePedestalBlockEntity::new, ModBlocks.BLACKSTONE_PEDESTAL).build(null));

    public static final BlockEntityType<NetherrackPedestalBlockEntity> NETHERRACK_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "netherrack_pedestal_be"),
                    BlockEntityType.Builder.create(NetherrackPedestalBlockEntity::new, ModBlocks.NETHERRACK_PEDESTAL).build(null));

    public static final BlockEntityType<SoulSandPedestalBlockEntity> SOUL_SAND_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "soul_sand_pedestal_be"),
                    BlockEntityType.Builder.create(SoulSandPedestalBlockEntity::new, ModBlocks.SOUL_SAND_PEDESTAL).build(null));

    public static final BlockEntityType<SoulSoilPedestalBlockEntity> SOUL_SOIL_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "soul_soil_pedestal_be"),
                    BlockEntityType.Builder.create(SoulSoilPedestalBlockEntity::new, ModBlocks.SOUL_SOIL_PEDESTAL).build(null));

    public static final BlockEntityType<NetherBricksPedestalBlockEntity> NETHER_BRICKS_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "nether_bricks_pedestal_be"),
                    BlockEntityType.Builder.create(NetherBricksPedestalBlockEntity::new, ModBlocks.NETHER_BRICKS_PEDESTAL).build(null));

    public static final BlockEntityType<RedNetherBricksPedestalBlockEntity> RED_NETHER_BRICKS_PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(Pedestals.MOD_ID, "red_nether_bricks_pedestal_be"),
                    BlockEntityType.Builder.create(RedNetherBricksPedestalBlockEntity::new, ModBlocks.RED_NETHER_BRICKS_PEDESTAL).build(null));
    
   
   
   
   
    public static void registerBlockEntities() {
        Pedestals.LOGGER.info("Registering Block Entities for " + Pedestals.MOD_ID);
    }
}