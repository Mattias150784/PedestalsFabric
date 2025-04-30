package net.mattias.pedestal.blocks;

import net.mattias.pedestal.Pedestals;
import net.mattias.pedestal.blocks.custom.*;
import net.mattias.pedestal.util.PedestalVariant;
import net.mattias.pedestal.util.PedestalVariants;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Pedestals.MOD_ID, name), block);
    }

    private static Block registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(Pedestals.MOD_ID, name),
                new BlockItem(block, new Item.Settings())).getBlock();
    }

    public static void registerModBlocks() {
        Pedestals.LOGGER.info("Registering Mod Blocks for " + Pedestals.MOD_ID);

        for (PedestalVariant pedestalVariant : PedestalVariants.VARIANTS) {
            Block block = registerBlock(pedestalVariant.registryName(), new PedestalBlock(AbstractBlock.Settings.copy(pedestalVariant.baseBlock().get()).nonOpaque()));
            PedestalVariants.BLOCK_MAP.put(pedestalVariant, block);
        }
    }
}