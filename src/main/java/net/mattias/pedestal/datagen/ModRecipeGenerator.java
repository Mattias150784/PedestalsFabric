package net.mattias.pedestal.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.mattias.pedestal.Pedestals;
import net.mattias.pedestal.util.PedestalVariant;
import net.mattias.pedestal.util.PedestalVariants;
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
        for(PedestalVariant pedestalVariant : PedestalVariants.VARIANTS) {
            if(pedestalVariant.registryName().contains("plank")) {
                planksPedestalRecipe(exporter, PedestalVariants.BLOCK_MAP.get(pedestalVariant), pedestalVariant.baseBlock().get());
            } else {
                pedestalRecipe(exporter, PedestalVariants.BLOCK_MAP.get(pedestalVariant), pedestalVariant.baseBlock().get());
            }
        }
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

