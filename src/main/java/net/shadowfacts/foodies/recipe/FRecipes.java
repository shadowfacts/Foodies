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
		GameRegistry.addSmelting(Items.bread, new ItemStack(FItems.toast, 1), 0.2f);
	}

	public static void load() {

	}

	public static void postInit() {

	}
}
