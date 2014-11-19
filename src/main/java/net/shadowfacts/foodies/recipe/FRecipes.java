package net.shadowfacts.foodies.recipe;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.shadowfacts.foodies.item.FItems;

/**
 * A helper class for registering recipes.
 * @author shadowfacts
 */
public class FRecipes {
	public static void preInit() {
		// Shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(FItems.hamburger), new ItemStack(FItems.toast), new ItemStack(FItems.beefPattie), new ItemStack(FItems.toast));
		GameRegistry.addShapelessRecipe(new ItemStack(FItems.cheeseburger), new ItemStack(FItems.hamburger), new ItemStack(FItems.cheese));

		// Shaped




		registerSmelting();
	}

	private static void registerSmelting() {
		// Smelting
		GameRegistry.addSmelting(Items.bread, new ItemStack(FItems.toast), 0.2f);
		GameRegistry.addSmelting(Items.cooked_beef, new ItemStack(FItems.beefPattie), 0.3f);
	}

	public static void load() {

	}

	public static void postInit() {

	}
}
