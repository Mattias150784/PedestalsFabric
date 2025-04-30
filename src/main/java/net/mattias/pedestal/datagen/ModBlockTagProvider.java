package net.mattias.pedestal.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.mattias.pedestal.util.PedestalVariant;
import net.mattias.pedestal.util.PedestalVariants;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        for(PedestalVariant pedestalVariant : PedestalVariants.VARIANTS) {
            switch (pedestalVariant.registryName()) {
                case "crying_obsidian_pedestal":
                case "obsidian_pedestal":
                    getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL).add(PedestalVariants.BLOCK_MAP.get(pedestalVariant));
                case "polished_deepslate_pedestal":
                case "pedestal":
                case "polished_andesite_pedestal":
                case "polished_diorite_pedestal":
                case "polished_granite_pedestal":
                case "polished_tuff_pedestal":
                case "andesite_pedestal":
                case "diorite_pedestal":
                case "granite_pedestal":
                case "smooth_stone_pedestal":
                case "stone_bricks_pedestal":
                case "stone_pedestal":
                case "cobblestone_pedestal":
                case "quartz_pedestal":
                case "quartz_pillar_pedestal":
                case "red_sandstone_pedestal":
                case "sandstone_pedestal":
                case "bricks_pedestal":
                case "mossy_cobblestone_pedestal":
                case "mossy_stone_bricks_pedestal":
                case "black_concrete_pedestal":
                case "blue_concrete_pedestal":
                case "brown_concrete_pedestal":
                case "cyan_concrete_pedestal":
                case "gray_concrete_pedestal":
                case "green_concrete_pedestal":
                case "light_blue_concrete_pedestal":
                case "light_gray_concrete_pedestal":
                case "lime_concrete_pedestal":
                case "magenta_concrete_pedestal":
                case "orange_concrete_pedestal":
                case "purple_concrete_pedestal":
                case "red_concrete_pedestal":
                case "white_concrete_pedestal":
                case "yellow_concrete_pedestal":
                case "pink_concrete_pedestal":
                case "blackstone_pedestal":
                case "nether_bricks_pedestal":
                case "red_nether_bricks_pedestal":
                case "netherrack_pedestal":
                case "purpur_pillar_pedestal":
                case "purpur_block_pedestal":
                case "end_stone_bricks_pedestal":
                case "end_stone_pedestal":
                    getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(PedestalVariants.BLOCK_MAP.get(pedestalVariant));
                    break;
                case "soul_sand_pedestal":
                case "soul_soil_pedestal":
                    getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE).add(PedestalVariants.BLOCK_MAP.get(pedestalVariant));
                    break;
                case "oak_log_pedestal":
                case "birch_log_pedestal":
                case "dark_oak_log_pedestal":
                case "spruce_log_pedestal":
                case "cherry_log_pedestal":
                case "acacia_log_pedestal":
                case "jungle_log_pedestal":
                case "mangrove_log_pedestal":
                case "oak_planks_pedestal":
                case "birch_planks_pedestal":
                case "dark_oak_planks_pedestal":
                case "spruce_planks_pedestal":
                case "cherry_planks_pedestal":
                case "acacia_planks_pedestal":
                case "jungle_planks_pedestal":
                case "mangrove_planks_pedestal":
                case "bamboo_planks_pedestal":
                    getOrCreateTagBuilder(BlockTags.AXE_MINEABLE).add(PedestalVariants.BLOCK_MAP.get(pedestalVariant));
                    break;
            }
        }

// getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
 //               .add(ModBlocks.POLISHED_DEEPSLATE_PEDESTAL);

  //      getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
   //             .add(ModBlocks.PEDESTAL);
    }
}