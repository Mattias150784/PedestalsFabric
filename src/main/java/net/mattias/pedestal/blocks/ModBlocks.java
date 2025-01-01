package net.mattias.pedestal.blocks;

import net.mattias.pedestal.Pedestals;
import net.mattias.pedestal.blocks.custom.*;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block PEDESTAL = registerBlock("pedestal",
            new PedestalBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS).nonOpaque()));

    public static final Block OAK_LOG_PEDESTAL = registerBlock("oak_log_pedestal",
            new OakLogPedestalBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque()));

    public static final Block BIRCH_LOG_PEDESTAL = registerBlock("birch_log_pedestal",
            new BirchLogPedestalBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS).nonOpaque()));

    public static final Block DARK_OAK_LOG_PEDESTAL = registerBlock("dark_oak_log_pedestal",
            new DarkOakLogPedestalBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS).nonOpaque()));

    public static final Block SPRUCE_LOG_PEDESTAL = registerBlock("spruce_log_pedestal",
            new SpruceLogPedestalBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS).nonOpaque()));

    public static final Block ACACIA_LOG_PEDESTAL = registerBlock("acacia_log_pedestal",
            new AcaciaLogPedestalBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS).nonOpaque()));

    public static final Block MANGROVE_LOG_PEDESTAL = registerBlock("mangrove_log_pedestal",
            new MangroveLogPedestalBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS).nonOpaque()));

    public static final Block CHERRY_LOG_PEDESTAL = registerBlock("cherry_log_pedestal",
            new CherryLogPedestalBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS).nonOpaque()));

    public static final Block JUNGLE_LOG_PEDESTAL = registerBlock("jungle_log_pedestal",
            new JungleLogPedestalBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS).nonOpaque()));

    public static final Block OAK_PLANKS_PEDESTAL = registerBlock("oak_planks_pedestal",
            new OakPlanksPedestalBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque()));

    public static final Block BIRCH_PLANKS_PEDESTAL = registerBlock("birch_planks_pedestal",
            new BirchPlanksPedestalBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS).nonOpaque()));

    public static final Block DARK_OAK_PLANKS_PEDESTAL = registerBlock("dark_oak_planks_pedestal",
            new DarkOakPlanksPedestalBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS).nonOpaque()));

    public static final Block SPRUCE_PLANKS_PEDESTAL = registerBlock("spruce_planks_pedestal",
            new SprucePlanksPedestalBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS).nonOpaque()));

    public static final Block ACACIA_PLANKS_PEDESTAL = registerBlock("acacia_planks_pedestal",
            new AcaciaPlanksPedestalBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS).nonOpaque()));

    public static final Block MANGROVE_PLANKS_PEDESTAL = registerBlock("mangrove_planks_pedestal",
            new MangrovePlanksPedestalBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS).nonOpaque()));

    public static final Block CHERRY_PLANKS_PEDESTAL = registerBlock("cherry_planks_pedestal",
            new CherryPlanksPedestalBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS).nonOpaque()));

    public static final Block JUNGLE_PLANKS_PEDESTAL = registerBlock("jungle_planks_pedestal",
            new JunglePlanksPedestalBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS).nonOpaque()));

    public static final Block BAMBOO_PLANKS_PEDESTAL = registerBlock("bamboo_planks_pedestal",
            new BambooPlanksPedestalBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS).nonOpaque()));

    public static final Block POLISHED_DEEPSLATE_PEDESTAL = registerBlock("polished_deepslate_pedestal",
            new PolishedDeepslatePedestalBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE).nonOpaque()));

    public static final Block OBSIDIAN_PEDESTAL = registerBlock("obsidian_pedestal",
            new ObsidianPedestalBlock(AbstractBlock.Settings.copy(Blocks.OBSIDIAN).nonOpaque()));

    public static final Block CRYING_OBSIDIAN_PEDESTAL = registerBlock("crying_obsidian_pedestal",
            new CryingObsidianPedestalBlock(AbstractBlock.Settings.copy(Blocks.CRYING_OBSIDIAN).nonOpaque()));

    public static final Block COBBLESTONE_PEDESTAL = registerBlock("cobblestone_pedestal",
            new CobblestonePedestalBlock(AbstractBlock.Settings.copy(Blocks.COBBLESTONE).nonOpaque()));

    public static final Block STONE_PEDESTAL = registerBlock("stone_pedestal",
            new StonePedestalBlock(AbstractBlock.Settings.copy(Blocks.STONE).nonOpaque()));

    public static final Block SMOOTH_STONE_PEDESTAL = registerBlock("smooth_stone_pedestal",
            new SmoothStonePedestalBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE).nonOpaque()));

    public static final Block STONE_BRICKS_PEDESTAL = registerBlock("stone_bricks_pedestal",
            new StoneBricksPedestalBlock(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).nonOpaque()));

    public static final Block POLISHED_ANDESITE_PEDESTAL = registerBlock("polished_andesite_pedestal",
            new PolishedAndesitePedestalBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE).nonOpaque()));

    public static final Block POLISHED_DIORITE_PEDESTAL = registerBlock("polished_diorite_pedestal",
            new PolishedDioritePedestalBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE).nonOpaque()));

    public static final Block POLISHED_GRANITE_PEDESTAL = registerBlock("polished_granite_pedestal",
            new PolishedGranitePedestalBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE).nonOpaque()));

    public static final Block POLISHED_TUFF_PEDESTAL = registerBlock("polished_tuff_pedestal",
            new PolishedTuffPedestalBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_TUFF).nonOpaque()));

    public static final Block ANDESITE_PEDESTAL = registerBlock("andesite_pedestal",
            new AndesitePedestalBlock(AbstractBlock.Settings.copy(Blocks.ANDESITE).nonOpaque()));

    public static final Block DIORITE_PEDESTAL = registerBlock("diorite_pedestal",
            new DioritePedestalBlock(AbstractBlock.Settings.copy(Blocks.DIORITE).nonOpaque()));

    public static final Block GRANITE_PEDESTAL = registerBlock("granite_pedestal",
            new GranitePedestalBlock(AbstractBlock.Settings.copy(Blocks.GRANITE).nonOpaque()));

    public static final Block BRICKS_PEDESTAL = registerBlock("bricks_pedestal",
            new BricksPedestalBlock(AbstractBlock.Settings.copy(Blocks.BRICKS).nonOpaque()));

    public static final Block QUARTZ_PEDESTAL = registerBlock("quartz_pedestal",
            new QuartzPedestalBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK).nonOpaque()));

    public static final Block QUARTZ_PILLAR_PEDESTAL = registerBlock("quartz_pillar_pedestal",
            new QuartzPillarPedestalBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_PILLAR).nonOpaque()));

    public static final Block MOSSY_COBBLESTONE_PEDESTAL = registerBlock("mossy_cobblestone_pedestal",
            new MossyCobblestonePedestalBlock(AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE).nonOpaque()));

    public static final Block MOSSY_STONE_BRICKS_PEDESTAL = registerBlock("mossy_stone_bricks_pedestal",
            new MossyStoneBricksPedestalBlock(AbstractBlock.Settings.copy(Blocks.MOSSY_STONE_BRICKS).nonOpaque()));

    public static final Block RED_SANDSTONE_PEDESTAL = registerBlock("red_sandstone_pedestal",
            new RedSandstonePedestalBlock(AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE).nonOpaque()));

    public static final Block SANDSTONE_PEDESTAL = registerBlock("sandstone_pedestal",
            new SandstonePedestalBlock(AbstractBlock.Settings.copy(Blocks.SANDSTONE).nonOpaque()));

    public static final Block BLACK_CONCRETE_PEDESTAL = registerBlock("black_concrete_pedestal",
            new BlackConcretePedestalBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE).nonOpaque()));

    public static final Block BLUE_CONCRETE_PEDESTAL = registerBlock("blue_concrete_pedestal",
            new BlueConcretePedestalBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE).nonOpaque()));

    public static final Block BROWN_CONCRETE_PEDESTAL = registerBlock("brown_concrete_pedestal",
            new BrownConcretePedestalBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE).nonOpaque()));

    public static final Block CYAN_CONCRETE_PEDESTAL = registerBlock("cyan_concrete_pedestal",
            new CyanConcretePedestalBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE).nonOpaque()));

    public static final Block LIME_CONCRETE_PEDESTAL = registerBlock("lime_concrete_pedestal",
            new LimeConcretePedestalBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE).nonOpaque()));

    public static final Block LIGHT_GRAY_CONCRETE_PEDESTAL = registerBlock("light_gray_concrete_pedestal",
            new LightGrayConcretePedestalBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE).nonOpaque()));

    public static final Block LIGHT_BLUE_CONCRETE_PEDESTAL = registerBlock("light_blue_concrete_pedestal",
            new LightBlueConcretePedestalBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE).nonOpaque()));

    public static final Block GRAY_CONCRETE_PEDESTAL = registerBlock("gray_concrete_pedestal",
            new GrayConcretePedestalBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE).nonOpaque()));

    public static final Block GREEN_CONCRETE_PEDESTAL = registerBlock("green_concrete_pedestal",
            new GreenConcretePedestalBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE).nonOpaque()));

    public static final Block MAGENTA_CONCRETE_PEDESTAL = registerBlock("magenta_concrete_pedestal",
            new MagentaConcretePedestalBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE).nonOpaque()));

    public static final Block ORANGE_CONCRETE_PEDESTAL = registerBlock("orange_concrete_pedestal",
            new OrangeConcretePedestalBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE).nonOpaque()));

    public static final Block PINK_CONCRETE_PEDESTAL = registerBlock("pink_concrete_pedestal",
            new PinkConcretePedestalBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE).nonOpaque()));

    public static final Block PURPLE_CONCRETE_PEDESTAL = registerBlock("purple_concrete_pedestal",
            new PurpleConcretePedestalBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE).nonOpaque()));

    public static final Block RED_CONCRETE_PEDESTAL = registerBlock("red_concrete_pedestal",
            new RedConcretePedestalBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE).nonOpaque()));

    public static final Block WHITE_CONCRETE_PEDESTAL = registerBlock("white_concrete_pedestal",
            new WhiteConcretePedestalBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE).nonOpaque()));

    public static final Block YELLOW_CONCRETE_PEDESTAL = registerBlock("yellow_concrete_pedestal",
            new YellowConcretePedestalBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE).nonOpaque()));
    
    
    
    
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Pedestals.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Pedestals.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Pedestals.LOGGER.info("Registering Mod Blocks for " + Pedestals.MOD_ID);
    }
}