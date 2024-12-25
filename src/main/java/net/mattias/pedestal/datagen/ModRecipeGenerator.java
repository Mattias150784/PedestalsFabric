package net.mattias.pedestal.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.mattias.pedestal.Pedestals;
import net.mattias.pedestal.blocks.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
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
        // planksPedestalRecipe(exporter, ModBlocks.OAK_PLANKS_PEDESTAL, Blocks.OAK_PLANKS);
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
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, pedestalBlock)
                .pattern(" P ")
                .pattern(" P ")
                .pattern(" P ")
                .input('P', material)
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter, Identifier.of(Pedestals.MOD_ID, "planks_pedestal"));
    }
}
