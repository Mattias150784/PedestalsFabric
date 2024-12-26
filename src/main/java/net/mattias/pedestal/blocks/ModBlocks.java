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
            new PedestalBlock(AbstractBlock.Settings.create().strength(4f).requiresTool().nonOpaque()));

    public static final Block OAK_LOG_PEDESTAL = registerBlock("oak_log_pedestal",
            new OakLogPedestalBlock(AbstractBlock.Settings.create().strength(4f).requiresTool().nonOpaque()));

    public static final Block BIRCH_LOG_PEDESTAL = registerBlock("birch_log_pedestal",
            new BirchLogPedestalBlock(AbstractBlock.Settings.create().strength(4f).requiresTool().nonOpaque()));

    public static final Block DARK_OAK_LOG_PEDESTAL = registerBlock("dark_oak_log_pedestal",
            new DarkOakLogPedestalBlock(AbstractBlock.Settings.create().strength(4f).requiresTool().nonOpaque()));

    public static final Block SPRUCE_LOG_PEDESTAL = registerBlock("spruce_log_pedestal",
            new SpruceLogPedestalBlock(AbstractBlock.Settings.create().strength(4f).requiresTool().nonOpaque()));

    public static final Block ACACIA_LOG_PEDESTAL = registerBlock("acacia_log_pedestal",
            new AcaciaLogPedestalBlock(AbstractBlock.Settings.create().strength(4f).requiresTool().nonOpaque()));

    public static final Block MANGROVE_LOG_PEDESTAL = registerBlock("mangrove_log_pedestal",
            new MangroveLogPedestalBlock(AbstractBlock.Settings.create().strength(4f).requiresTool().nonOpaque()));

    public static final Block CHERRY_LOG_PEDESTAL = registerBlock("cherry_log_pedestal",
            new CherryLogPedestalBlock(AbstractBlock.Settings.create().strength(4f).requiresTool().nonOpaque()));

    public static final Block JUNGLE_LOG_PEDESTAL = registerBlock("jungle_log_pedestal",
            new JungleLogPedestalBlock(AbstractBlock.Settings.create().strength(4f).requiresTool().nonOpaque()));
    

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