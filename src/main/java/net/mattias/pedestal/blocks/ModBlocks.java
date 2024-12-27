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