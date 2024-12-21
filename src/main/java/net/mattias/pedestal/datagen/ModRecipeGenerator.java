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

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PEDESTAL)
                .pattern("   ")
                .pattern(" P ")
                .pattern(" P ")
                .input('P', Blocks.CHISELED_STONE_BRICKS)
                .criterion(hasItem(Blocks.CHISELED_STONE_BRICKS), conditionsFromItem(Blocks.CHISELED_STONE_BRICKS))
                .criterion(hasItem(Blocks.CHISELED_STONE_BRICKS), conditionsFromItem(Blocks.CHISELED_STONE_BRICKS))
                .offerTo(exporter, Identifier.of(Pedestals.MOD_ID, "pedestal"));

    }
}