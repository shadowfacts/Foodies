package net.shadowfacts.foodies.item;

import net.minecraft.item.ItemFood;
import net.shadowfacts.foodies.Foodies;

/**
 * Base class for food items.
 * @author shadowfacts
 */
public class Food extends ItemFood {

	public Food(int healAmount, float saturation) {
		super(healAmount, saturation, false);
		this.setCreativeTab(Foodies.creativeTab);
	}

	@Override
	public Food setUnlocalizedName(String name) {
		super.setUnlocalizedName(name);

		return this;
	}

	@Override
	public Food setTextureName(String name) {
		super.setTextureName(Foodies.modId + name);

		return this;
	}

}
