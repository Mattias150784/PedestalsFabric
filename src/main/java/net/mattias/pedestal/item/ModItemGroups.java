package net.mattias.pedestal.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.mattias.pedestal.Pedestals;
import net.mattias.pedestal.blocks.custom.BasePedestalVariants;
import net.mattias.pedestal.util.PedestalVariants;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ModItemGroups {
    public static final ItemGroup PEDESTALS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Pedestals.MOD_ID, "pedestals"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.pedestals_tab"))
                    .icon(() -> new ItemStack(PedestalVariants.BLOCK_MAP.get(BasePedestalVariants.VARIANTS.get(0)))).entries((displayContext, entries) -> {
                        List<Block> blocks = new ArrayList<>(PedestalVariants.BLOCK_MAP.values().stream().toList());

                        // TODO: Make this not so ugly
                        class CustomComparator implements Comparator<Block> {
                            @Override
                            public int compare(Block o1, Block o2) {
                                return o1.getName().toString().compareTo(o2.getName().toString());
                            }
                        }
                        blocks.sort(new CustomComparator());

                        blocks.forEach(entries::add);

                    }).build());

    public static void registerItemGroups() {
        Pedestals.LOGGER.info("Registering Item Groups for " + Pedestals.MOD_ID);
    }
}