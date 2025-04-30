package net.mattias.pedestal.util;

import net.mattias.pedestal.screen.custom.PedestalScreenHandler;
import net.minecraft.block.Block;
import net.minecraft.screen.ScreenHandlerType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PedestalVariants {

	public static final List<PedestalVariant> VARIANTS = new ArrayList<>();

	public static final HashMap<PedestalVariant, Block> BLOCK_MAP = new HashMap<>();
	public static final HashMap<PedestalVariant, ScreenHandlerType<PedestalScreenHandler>> SCREEN_HANDLER_MAP = new HashMap<>();

	public static void register(PedestalVariant variant) {
		VARIANTS.add(variant);
		VARIANTS.indexOf(variant);
	}
}
