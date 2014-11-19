package net.shadowfacts.foodies.item;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Helper class for registering items.
 * @author shadowfacts
 */
public class FItems {
	// Foods
	public static Food toast;

	public static void preInit() {
		// Create Items
		toast = new Food(7, 0.7f).setUnlocalizedName("foodToast").setTextureName("toast");

		// Register items
		GameRegistry.registerItem(toast, "foodToast");
	}

	public static void load() {

	}

	public static void postInit() {

	}
}
