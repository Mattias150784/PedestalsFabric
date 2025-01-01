package net.mattias.pedestal.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.mattias.pedestal.Pedestals;
import net.mattias.pedestal.blocks.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        pedestalRecipe(exporter, ModBlocks.PEDESTAL, Blocks.CHISELED_STONE_BRICKS);
        pedestalRecipe(exporter, ModBlocks.OAK_LOG_PEDESTAL, Blocks.OAK_LOG);
        pedestalRecipe(exporter, ModBlocks.BIRCH_LOG_PEDESTAL, Blocks.BIRCH_LOG);
        pedestalRecipe(exporter, ModBlocks.DARK_OAK_LOG_PEDESTAL, Blocks.DARK_OAK_LOG);
        pedestalRecipe(exporter, ModBlocks.SPRUCE_LOG_PEDESTAL, Blocks.SPRUCE_LOG);
        pedestalRecipe(exporter, ModBlocks.ACACIA_LOG_PEDESTAL, Blocks.ACACIA_LOG);
        pedestalRecipe(exporter, ModBlocks.JUNGLE_LOG_PEDESTAL, Blocks.JUNGLE_LOG);
        pedestalRecipe(exporter, ModBlocks.CHERRY_LOG_PEDESTAL, Blocks.CHERRY_LOG);
        pedestalRecipe(exporter, ModBlocks.MANGROVE_LOG_PEDESTAL, Blocks.MANGROVE_LOG);
        pedestalRecipe(exporter, ModBlocks.POLISHED_DEEPSLATE_PEDESTAL, Blocks.POLISHED_DEEPSLATE);
        pedestalRecipe(exporter, ModBlocks.CRYING_OBSIDIAN_PEDESTAL, Blocks.CRYING_OBSIDIAN);
        pedestalRecipe(exporter, ModBlocks.OBSIDIAN_PEDESTAL, Blocks.OBSIDIAN);
        pedestalRecipe(exporter, ModBlocks.QUARTZ_PEDESTAL, Blocks.ACACIA_LOG);
        pedestalRecipe(exporter, ModBlocks.QUARTZ_PILLAR_PEDESTAL, Blocks.JUNGLE_LOG);
        pedestalRecipe(exporter, ModBlocks.RED_SANDSTONE_PEDESTAL, Blocks.CHERRY_LOG);
        pedestalRecipe(exporter, ModBlocks.SANDSTONE_PEDESTAL, Blocks.MANGROVE_LOG);
        pedestalRecipe(exporter, ModBlocks.MOSSY_STONE_BRICKS_PEDESTAL, Blocks.POLISHED_DEEPSLATE);
        pedestalRecipe(exporter, ModBlocks.MOSSY_COBBLESTONE_PEDESTAL, Blocks.CRYING_OBSIDIAN);
        pedestalRecipe(exporter, ModBlocks.BRICKS_PEDESTAL, Blocks.OBSIDIAN);
        pedestalRecipe(exporter, ModBlocks.POLISHED_ANDESITE_PEDESTAL, Blocks.POLISHED_ANDESITE);
        pedestalRecipe(exporter, ModBlocks.POLISHED_DIORITE_PEDESTAL, Blocks.POLISHED_DIORITE);
        pedestalRecipe(exporter, ModBlocks.POLISHED_GRANITE_PEDESTAL, Blocks.POLISHED_GRANITE);
        pedestalRecipe(exporter, ModBlocks.POLISHED_TUFF_PEDESTAL, Blocks.POLISHED_TUFF);
        pedestalRecipe(exporter, ModBlocks.ANDESITE_PEDESTAL, Blocks.ANDESITE);
        pedestalRecipe(exporter, ModBlocks.DIORITE_PEDESTAL, Blocks.DIORITE);
        pedestalRecipe(exporter, ModBlocks.GRANITE_PEDESTAL, Blocks.GRANITE);
        pedestalRecipe(exporter, ModBlocks.STONE_PEDESTAL, Blocks.STONE);
        pedestalRecipe(exporter, ModBlocks.STONE_BRICKS_PEDESTAL, Blocks.STONE_BRICKS);
        pedestalRecipe(exporter, ModBlocks.SMOOTH_STONE_PEDESTAL, Blocks.SMOOTH_STONE);
        pedestalRecipe(exporter, ModBlocks.COBBLESTONE_PEDESTAL, Blocks.COBBLESTONE);
        pedestalRecipe(exporter, ModBlocks.BLUE_CONCRETE_PEDESTAL, Blocks.BLUE_CONCRETE);
        pedestalRecipe(exporter, ModBlocks.BLACK_CONCRETE_PEDESTAL, Blocks.BLACK_CONCRETE);
        pedestalRecipe(exporter, ModBlocks.BROWN_CONCRETE_PEDESTAL, Blocks.BROWN_CONCRETE);
        pedestalRecipe(exporter, ModBlocks.CYAN_CONCRETE_PEDESTAL, Blocks.CYAN_CONCRETE);
        pedestalRecipe(exporter, ModBlocks.GRAY_CONCRETE_PEDESTAL, Blocks.GRAY_CONCRETE);
        pedestalRecipe(exporter, ModBlocks.GREEN_CONCRETE_PEDESTAL, Blocks.GREEN_CONCRETE);
        pedestalRecipe(exporter, ModBlocks.LIGHT_BLUE_CONCRETE_PEDESTAL, Blocks.LIGHT_BLUE_CONCRETE);
        pedestalRecipe(exporter, ModBlocks.LIGHT_GRAY_CONCRETE_PEDESTAL, Blocks.LIGHT_GRAY_CONCRETE);
        pedestalRecipe(exporter, ModBlocks.LIME_CONCRETE_PEDESTAL, Blocks.LIME_CONCRETE);
        pedestalRecipe(exporter, ModBlocks.MAGENTA_CONCRETE_PEDESTAL, Blocks.MAGENTA_CONCRETE);
        pedestalRecipe(exporter, ModBlocks.PINK_CONCRETE_PEDESTAL, Blocks.PINK_CONCRETE);
        pedestalRecipe(exporter, ModBlocks.ORANGE_CONCRETE_PEDESTAL, Blocks.ORANGE_CONCRETE);
        pedestalRecipe(exporter, ModBlocks.PURPLE_CONCRETE_PEDESTAL, Blocks.PURPLE_CONCRETE);
        pedestalRecipe(exporter, ModBlocks.RED_CONCRETE_PEDESTAL, Blocks.RED_CONCRETE);
        pedestalRecipe(exporter, ModBlocks.YELLOW_CONCRETE_PEDESTAL, Blocks.YELLOW_CONCRETE);
        pedestalRecipe(exporter, ModBlocks.WHITE_CONCRETE_PEDESTAL, Blocks.WHITE_CONCRETE);

        planksPedestalRecipe(exporter, ModBlocks.OAK_PLANKS_PEDESTAL, Blocks.OAK_PLANKS);
        planksPedestalRecipe(exporter, ModBlocks.BIRCH_PLANKS_PEDESTAL, Blocks.BIRCH_PLANKS);
        planksPedestalRecipe(exporter, ModBlocks.DARK_OAK_PLANKS_PEDESTAL, Blocks.DARK_OAK_PLANKS);
        planksPedestalRecipe(exporter, ModBlocks.SPRUCE_PLANKS_PEDESTAL, Blocks.SPRUCE_PLANKS);
        planksPedestalRecipe(exporter, ModBlocks.ACACIA_PLANKS_PEDESTAL, Blocks.ACACIA_PLANKS);
        planksPedestalRecipe(exporter, ModBlocks.JUNGLE_PLANKS_PEDESTAL, Blocks.JUNGLE_PLANKS);
        planksPedestalRecipe(exporter, ModBlocks.CHERRY_PLANKS_PEDESTAL, Blocks.CHERRY_PLANKS);
        planksPedestalRecipe(exporter, ModBlocks.MANGROVE_PLANKS_PEDESTAL, Blocks.MANGROVE_PLANKS);
        planksPedestalRecipe(exporter, ModBlocks.BAMBOO_PLANKS_PEDESTAL, Items.BAMBOO);


    }

    private void pedestalRecipe(RecipeExporter exporter, ItemConvertible pedestalBlock, ItemConvertible material) {
        String pedestalName = pedestalBlock.asItem().getTranslationKey().replace("block.minecraft.", "");
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, pedestalBlock)
                .pattern("   ")
                .pattern(" P ")
                .pattern(" P ")
                .input('P', material)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter, Identifier.of(Pedestals.MOD_ID, pedestalName + "_pedestal"));
    }


    private void planksPedestalRecipe(RecipeExporter exporter, ItemConvertible pedestalBlock, ItemConvertible material) {
        String pedestalName = pedestalBlock.asItem().getTranslationKey().replace("block.minecraft.", "");
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, pedestalBlock)
                .pattern(" P ")
                .pattern(" P ")
                .pattern(" P ")
                .input('P', material)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter, Identifier.of(Pedestals.MOD_ID, pedestalName + "_planks_pedestal"));
    }
}

