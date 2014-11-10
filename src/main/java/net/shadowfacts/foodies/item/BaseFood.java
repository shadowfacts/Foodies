package net.shadowfacts.foodies.item;

import net.minecraft.item.ItemFood;
import net.shadowfacts.foodies.Foodies;

/**
 * Base class for food items.
 * @author shadowfacts
 */
public class BaseFood extends ItemFood {

	public BaseFood(int healAmount, float saturation, boolean wolfFood) {
		super(healAmount, saturation, wolfFood);
		this.setCreativeTab(Foodies.creativeTab);
	}

	@Override
	public BaseFood setTextureName(String name) {
		super.setTextureName(Foodies.modId + name);

		return this;
	}

}
