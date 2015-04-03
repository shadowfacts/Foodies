package net.shadowfacts.foodies.block;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Helper class for registering blocks.
 * @author shadowfacts
 */
public class FBlocks {

	public static FCrop tomatoCrop;

	public static void preInit() {
		// Create blocks
		tomatoCrop = new FCrop().setBlockName("cropTomato").setBlockTextureName("cropTomato");

		// Register blocks
		GameRegistry.registerBlock(tomatoCrop, "cropTomato");

	}

	public static void load() {

	}

	public static void postInit() {

	}
}
