package net.mattias.pedestal.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.mattias.pedestal.Pedestals;
import net.mattias.pedestal.util.PedestalVariant;
import net.mattias.pedestal.util.PedestalVariants;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

import java.util.Map;
import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {
	public ModModelProvider(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
		for (PedestalVariant pedestalVariant : PedestalVariants.VARIANTS) {
			blockStateModelGenerator.registerSimpleState(PedestalVariants.BLOCK_MAP.get(pedestalVariant));
		}
	}

	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {
		for (PedestalVariant pedestalVariant : PedestalVariants.VARIANTS) {
			itemModelGenerator.writer.accept(
					ModelIds.getItemModelId(PedestalVariants.BLOCK_MAP.get(pedestalVariant).asItem()),
					() -> new Model(Optional.of(Identifier.of(Pedestals.MOD_ID, "block/".concat(pedestalVariant.registryName()))), Optional.empty()).createJson(Identifier.of(Pedestals.MOD_ID, pedestalVariant.registryName()), Map.of())
			);
		}
	}
}
