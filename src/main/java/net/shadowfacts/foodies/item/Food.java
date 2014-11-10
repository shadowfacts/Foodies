package net.shadowfacts.foodies.item;

import net.minecraft.item.ItemFood;
import net.shadowfacts.foodies.Foodies;

/**
 * Base class for food items.
 * @author shadowfacts
 */
public class Food extends ItemFood {

	public Food(int healAmount, float saturation, boolean wolfFood) {
		super(healAmount, saturation, wolfFood);
		this.setCreativeTab(Foodies.creativeTab);
	}

	@Override
	public Food setTextureName(String name) {
		super.setTextureName(Foodies.modId + name);

		return this;
	}

}
