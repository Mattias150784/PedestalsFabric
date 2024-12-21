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


                    }).build());

    public static void registerItemGroups() {
        Pedestals.LOGGER.info("Registering Item Groups for " + Pedestals.MOD_ID);
    }
}