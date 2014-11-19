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
	public static Food beefPattie;
	public static Food hamburger;
	public static Food cheese;

	public static void preInit() {
		// Create Items
		toast = new Food(3, 0.3f).setUnlocalizedName("foodToast").setTextureName("foodToast");
		tomato = new Food(1, 0.1f).setUnlocalizedName("fruitTomato").setTextureName("fruitTomato");
		beefPattie = new Food(3, 0.6f).setUnlocalizedName("foodBeefPattie").setTextureName("foodBeefPattie");
		hamburger = new Food(5, 0.7f).setUnlocalizedName("foodHamburger").setTextureName("foodHamburger");
		cheese = new Food(2, 0.3f).setUnlocalizedName("foodCheese").setTextureName("foodCheese");

		// Register items
		GameRegistry.registerItem(toast, "foodToast");
		GameRegistry.registerItem(tomato, "fruitTomato");
		GameRegistry.registerItem(beefPattie, "foodBeefPattie");
		GameRegistry.registerItem(hamburger, "foodHamburger");
		GameRegistry.registerItem(cheese, "foodCheese");
	}

	public static void load() {

	}

	public static void postInit() {

	}
}
