package net.mattias.pedestal.blocks;

import net.mattias.pedestal.Pedestals;
import net.mattias.pedestal.blocks.custom.PedestalBlock;
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