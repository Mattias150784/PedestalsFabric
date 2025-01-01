package net.mattias.pedestal.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.mattias.pedestal.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.PEDESTAL);
        addDrop(ModBlocks.OAK_LOG_PEDESTAL);
        addDrop(ModBlocks.BIRCH_LOG_PEDESTAL);
        addDrop(ModBlocks.DARK_OAK_LOG_PEDESTAL);
        addDrop(ModBlocks.SPRUCE_LOG_PEDESTAL);
        addDrop(ModBlocks.ACACIA_LOG_PEDESTAL);
        addDrop(ModBlocks.JUNGLE_LOG_PEDESTAL);
        addDrop(ModBlocks.CHERRY_LOG_PEDESTAL);
        addDrop(ModBlocks.MANGROVE_LOG_PEDESTAL);
        addDrop(ModBlocks.OAK_PLANKS_PEDESTAL);
        addDrop(ModBlocks.BIRCH_PLANKS_PEDESTAL);
        addDrop(ModBlocks.DARK_OAK_PLANKS_PEDESTAL);
        addDrop(ModBlocks.SPRUCE_PLANKS_PEDESTAL);
        addDrop(ModBlocks.ACACIA_PLANKS_PEDESTAL);
        addDrop(ModBlocks.JUNGLE_PLANKS_PEDESTAL);
        addDrop(ModBlocks.CHERRY_PLANKS_PEDESTAL);
        addDrop(ModBlocks.MANGROVE_PLANKS_PEDESTAL);
        addDrop(ModBlocks.BAMBOO_PLANKS_PEDESTAL);
        addDrop(ModBlocks.POLISHED_DEEPSLATE_PEDESTAL);
        addDrop(ModBlocks.CRYING_OBSIDIAN_PEDESTAL);
        addDrop(ModBlocks.OBSIDIAN_PEDESTAL);
        addDrop(ModBlocks.POLISHED_GRANITE_PEDESTAL);
        addDrop(ModBlocks.POLISHED_DIORITE_PEDESTAL);
        addDrop(ModBlocks.POLISHED_ANDESITE_PEDESTAL);
        addDrop(ModBlocks.POLISHED_TUFF_PEDESTAL);
        addDrop(ModBlocks.GRANITE_PEDESTAL);
        addDrop(ModBlocks.DIORITE_PEDESTAL);
        addDrop(ModBlocks.ANDESITE_PEDESTAL);
        addDrop(ModBlocks.STONE_BRICKS_PEDESTAL);
        addDrop(ModBlocks.STONE_PEDESTAL);
        addDrop(ModBlocks.SMOOTH_STONE_PEDESTAL);
        addDrop(ModBlocks.COBBLESTONE_PEDESTAL);
        addDrop(ModBlocks.QUARTZ_PEDESTAL);
        addDrop(ModBlocks.QUARTZ_PILLAR_PEDESTAL);
        addDrop(ModBlocks.RED_SANDSTONE_PEDESTAL);
        addDrop(ModBlocks.SANDSTONE_PEDESTAL);
        addDrop(ModBlocks.MOSSY_COBBLESTONE_PEDESTAL);
        addDrop(ModBlocks.MOSSY_STONE_BRICKS_PEDESTAL);
        addDrop(ModBlocks.BRICKS_PEDESTAL);
        addDrop(ModBlocks.BLACK_CONCRETE_PEDESTAL);
        addDrop(ModBlocks.BLUE_CONCRETE_PEDESTAL);
        addDrop(ModBlocks.BROWN_CONCRETE_PEDESTAL);
        addDrop(ModBlocks.CYAN_CONCRETE_PEDESTAL);
        addDrop(ModBlocks.GRAY_CONCRETE_PEDESTAL);
        addDrop(ModBlocks.GREEN_CONCRETE_PEDESTAL);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_PEDESTAL);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_PEDESTAL);
        addDrop(ModBlocks.LIME_CONCRETE_PEDESTAL);
        addDrop(ModBlocks.MAGENTA_CONCRETE_PEDESTAL);
        addDrop(ModBlocks.ORANGE_CONCRETE_PEDESTAL);
        addDrop(ModBlocks.PINK_CONCRETE_PEDESTAL);
        addDrop(ModBlocks.PURPLE_CONCRETE_PEDESTAL);
        addDrop(ModBlocks.RED_SANDSTONE_PEDESTAL);
        addDrop(ModBlocks.WHITE_CONCRETE_PEDESTAL);
        addDrop(ModBlocks.YELLOW_CONCRETE_PEDESTAL);
        addDrop(ModBlocks.BLACKSTONE_PEDESTAL);
        addDrop(ModBlocks.SOUL_SAND_PEDESTAL);
        addDrop(ModBlocks.SOUL_SOIL_PEDESTAL);
        addDrop(ModBlocks.NETHERRACK_PEDESTAL);
        addDrop(ModBlocks.RED_NETHER_BRICKS_PEDESTAL);
        addDrop(ModBlocks.NETHER_BRICKS_PEDESTAL);
    }


}