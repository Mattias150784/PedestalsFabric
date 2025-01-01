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
                        ModBlocks.OBSIDIAN_PEDESTAL,
                        ModBlocks.POLISHED_ANDESITE_PEDESTAL,
                        ModBlocks.POLISHED_DIORITE_PEDESTAL,
                        ModBlocks.POLISHED_GRANITE_PEDESTAL,
                        ModBlocks.POLISHED_TUFF_PEDESTAL,
                        ModBlocks.ANDESITE_PEDESTAL,
                        ModBlocks.DIORITE_PEDESTAL,
                        ModBlocks.GRANITE_PEDESTAL,
                        ModBlocks.SMOOTH_STONE_PEDESTAL,
                        ModBlocks.STONE_BRICKS_PEDESTAL,
                        ModBlocks.STONE_PEDESTAL,
                        ModBlocks.COBBLESTONE_PEDESTAL,
                        ModBlocks.QUARTZ_PEDESTAL,
                        ModBlocks.QUARTZ_PILLAR_PEDESTAL,
                        ModBlocks.RED_SANDSTONE_PEDESTAL,
                        ModBlocks.SANDSTONE_PEDESTAL,
                        ModBlocks.BRICKS_PEDESTAL,
                        ModBlocks.MOSSY_COBBLESTONE_PEDESTAL,
                        ModBlocks.MOSSY_STONE_BRICKS_PEDESTAL,
                        ModBlocks.BLACK_CONCRETE_PEDESTAL,
                        ModBlocks.BLUE_CONCRETE_PEDESTAL,
                        ModBlocks.BROWN_CONCRETE_PEDESTAL,
                        ModBlocks.CYAN_CONCRETE_PEDESTAL,
                        ModBlocks.GRAY_CONCRETE_PEDESTAL,
                        ModBlocks.GREEN_CONCRETE_PEDESTAL,
                        ModBlocks.LIGHT_BLUE_CONCRETE_PEDESTAL,
                        ModBlocks.LIGHT_GRAY_CONCRETE_PEDESTAL,
                        ModBlocks.LIME_CONCRETE_PEDESTAL,
                        ModBlocks.MAGENTA_CONCRETE_PEDESTAL,
                        ModBlocks.ORANGE_CONCRETE_PEDESTAL,
                        ModBlocks.PURPLE_CONCRETE_PEDESTAL,
                        ModBlocks.RED_CONCRETE_PEDESTAL,
                        ModBlocks.WHITE_CONCRETE_PEDESTAL,
                        ModBlocks.YELLOW_CONCRETE_PEDESTAL,
                        ModBlocks.PINK_CONCRETE_PEDESTAL,
                        ModBlocks.BLACKSTONE_PEDESTAL,
                        ModBlocks.NETHER_BRICKS_PEDESTAL,
                        ModBlocks.RED_NETHER_BRICKS_PEDESTAL,
                        ModBlocks.NETHERRACK_PEDESTAL
                      );


        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
            .add(ModBlocks.SOUL_SAND_PEDESTAL,
                 ModBlocks.SOUL_SOIL_PEDESTAL

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

// getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
 //               .add(ModBlocks.POLISHED_DEEPSLATE_PEDESTAL);


       getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.OBSIDIAN_PEDESTAL,
                        ModBlocks.CRYING_OBSIDIAN_PEDESTAL);

  //      getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
   //             .add(ModBlocks.PEDESTAL);




    }
}