package net.mattias.pedestal.util;

import net.minecraft.block.Block;

import java.util.function.Supplier;

public record PedestalVariant(String registryName, String textureName, Supplier<Block> baseBlock) {}
