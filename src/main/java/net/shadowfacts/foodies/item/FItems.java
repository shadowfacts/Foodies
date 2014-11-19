package net.shadowfacts.foodies.item;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Helper class for registering items.
 * @author shadowfacts
 */
public class FItems {
	// Foods
	public static Food toast;
	public static Food tomato;

	public static void preInit() {
		// Create Items
		toast = new Food(7, 0.7f).setUnlocalizedName("foodToast").setTextureName("foodToast");
		tomato = new Food(1, 0.1f).setUnlocalizedName("fruitTomato").setTextureName("fruitTomato")

		// Register items
		GameRegistry.registerItem(toast, "foodToast");
		GameRegistry.registerItem(tomato, "fruitTomato");
	}

	public static void load() {

	}

	public static void postInit() {

	}
}
