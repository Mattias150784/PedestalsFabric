package net.mattias.pedestal.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.mattias.pedestal.Pedestals;
import net.mattias.pedestal.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PEDESTALS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Pedestals.MOD_ID, "pedestals"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.pedestals_tab"))
                    .icon(() -> new ItemStack(ModBlocks.PEDESTAL)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PEDESTAL);
                        entries.add(ModBlocks.OAK_LOG_PEDESTAL);
                        entries.add(ModBlocks.BIRCH_LOG_PEDESTAL);
                        entries.add(ModBlocks.DARK_OAK_LOG_PEDESTAL);
                        entries.add(ModBlocks.SPRUCE_LOG_PEDESTAL);
                        entries.add(ModBlocks.ACACIA_LOG_PEDESTAL);
                        entries.add(ModBlocks.JUNGLE_LOG_PEDESTAL);
                        entries.add(ModBlocks.CHERRY_LOG_PEDESTAL);
                        entries.add(ModBlocks.MANGROVE_LOG_PEDESTAL);
                        entries.add(ModBlocks.OAK_PLANKS_PEDESTAL);
                        entries.add(ModBlocks.BIRCH_PLANKS_PEDESTAL);
                        entries.add(ModBlocks.DARK_OAK_PLANKS_PEDESTAL);
                        entries.add(ModBlocks.SPRUCE_PLANKS_PEDESTAL);
                        entries.add(ModBlocks.ACACIA_PLANKS_PEDESTAL);
                        entries.add(ModBlocks.JUNGLE_PLANKS_PEDESTAL);
                        entries.add(ModBlocks.CHERRY_PLANKS_PEDESTAL);
                        entries.add(ModBlocks.MANGROVE_PLANKS_PEDESTAL);
                        entries.add(ModBlocks.BAMBOO_PLANKS_PEDESTAL);
                        entries.add(ModBlocks.POLISHED_DEEPSLATE_PEDESTAL);
                        entries.add(ModBlocks.OBSIDIAN_PEDESTAL);
                        entries.add(ModBlocks.CRYING_OBSIDIAN_PEDESTAL);
                        entries.add(ModBlocks.POLISHED_ANDESITE_PEDESTAL);
                        entries.add(ModBlocks.POLISHED_GRANITE_PEDESTAL);
                        entries.add(ModBlocks.POLISHED_DIORITE_PEDESTAL);
                        entries.add(ModBlocks.ANDESITE_PEDESTAL);
                        entries.add(ModBlocks.GRANITE_PEDESTAL);
                        entries.add(ModBlocks.DIORITE_PEDESTAL);
                        entries.add(ModBlocks.STONE_PEDESTAL);
                        entries.add(ModBlocks.COBBLESTONE_PEDESTAL);
                        entries.add(ModBlocks.SMOOTH_STONE_PEDESTAL);
                        entries.add(ModBlocks.STONE_BRICKS_PEDESTAL);
                        entries.add(ModBlocks.POLISHED_TUFF_PEDESTAL);
                        entries.add(ModBlocks.QUARTZ_PEDESTAL);
                        entries.add(ModBlocks.QUARTZ_PILLAR_PEDESTAL);
                        entries.add(ModBlocks.MOSSY_COBBLESTONE_PEDESTAL);
                        entries.add(ModBlocks.MOSSY_STONE_BRICKS_PEDESTAL);
                        entries.add(ModBlocks.RED_SANDSTONE_PEDESTAL);
                        entries.add(ModBlocks.SANDSTONE_PEDESTAL);
                        entries.add(ModBlocks.BRICKS_PEDESTAL);
                        entries.add(ModBlocks.BLACK_CONCRETE_PEDESTAL);
                        entries.add(ModBlocks.BLUE_CONCRETE_PEDESTAL);
                        entries.add(ModBlocks.BROWN_CONCRETE_PEDESTAL);
                        entries.add(ModBlocks.CYAN_CONCRETE_PEDESTAL);
                        entries.add(ModBlocks.GRAY_CONCRETE_PEDESTAL);
                        entries.add(ModBlocks.GREEN_CONCRETE_PEDESTAL);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_PEDESTAL);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_PEDESTAL);
                        entries.add(ModBlocks.LIME_CONCRETE_PEDESTAL);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_PEDESTAL);
                        entries.add(ModBlocks.ORANGE_CONCRETE_PEDESTAL);
                        entries.add(ModBlocks.PINK_CONCRETE_PEDESTAL);
                        entries.add(ModBlocks.PURPLE_CONCRETE_PEDESTAL);
                        entries.add(ModBlocks.RED_CONCRETE_PEDESTAL);
                        entries.add(ModBlocks.WHITE_CONCRETE_PEDESTAL);
                        entries.add(ModBlocks.YELLOW_CONCRETE_PEDESTAL);
                        entries.add(ModBlocks.BLACKSTONE_PEDESTAL);
                        entries.add(ModBlocks.NETHERRACK_PEDESTAL);
                        entries.add(ModBlocks.RED_NETHER_BRICKS_PEDESTAL);
                        entries.add(ModBlocks.NETHER_BRICKS_PEDESTAL);
                        entries.add(ModBlocks.SOUL_SAND_PEDESTAL);
                        entries.add(ModBlocks.SOUL_SOIL_PEDESTAL);
                        entries.add(ModBlocks.END_STONE_BRICKS_PEDESTAL);
                        entries.add(ModBlocks.END_STONE_PEDESTAL);
                        entries.add(ModBlocks.PURPUR_PILLAR_PEDESTAL);
                        entries.add(ModBlocks.PURPUR_BLOCK_PEDESTAL);




                    }).build());

    public static void registerItemGroups() {
        Pedestals.LOGGER.info("Registering Item Groups for " + Pedestals.MOD_ID);
    }
}