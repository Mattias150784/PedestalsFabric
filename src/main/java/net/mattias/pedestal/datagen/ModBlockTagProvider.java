package net.mattias.pedestal.datagen;

import com.mojang.datafixers.types.templates.Tag;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.mattias.pedestal.blocks.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import javax.swing.text.html.HTML;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.PEDESTAL,
                        ModBlocks.POLISHED_DEEPSLATE_PEDESTAL,
                        ModBlocks.CRYING_OBSIDIAN_PEDESTAL,
                        ModBlocks.OBSIDIAN_PEDESTAL
                      );

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.OAK_LOG_PEDESTAL,
                        ModBlocks.BIRCH_LOG_PEDESTAL,
                        ModBlocks.DARK_OAK_LOG_PEDESTAL,
                        ModBlocks.SPRUCE_LOG_PEDESTAL,
                        ModBlocks.CHERRY_LOG_PEDESTAL,
                        ModBlocks.ACACIA_LOG_PEDESTAL,
                        ModBlocks.JUNGLE_LOG_PEDESTAL,
                        ModBlocks.MANGROVE_LOG_PEDESTAL,
                        ModBlocks.OAK_PLANKS_PEDESTAL,
                        ModBlocks.BIRCH_PLANKS_PEDESTAL,
                        ModBlocks.DARK_OAK_PLANKS_PEDESTAL,
                        ModBlocks.SPRUCE_PLANKS_PEDESTAL,
                        ModBlocks.CHERRY_PLANKS_PEDESTAL,
                        ModBlocks.ACACIA_PLANKS_PEDESTAL,
                        ModBlocks.JUNGLE_PLANKS_PEDESTAL,
                        ModBlocks.MANGROVE_PLANKS_PEDESTAL,
                        ModBlocks.BAMBOO_PLANKS_PEDESTAL

                );

getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.POLISHED_DEEPSLATE_PEDESTAL);


       getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.OBSIDIAN_PEDESTAL,
                        ModBlocks.CRYING_OBSIDIAN_PEDESTAL);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.PEDESTAL);




    }
}