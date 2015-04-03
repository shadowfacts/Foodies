package net.shadowfacts.foodies.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;

/**
 * Class for creating seeds.
 * @author shadowfacts
 */
public class FSeeds extends ItemSeeds {

	public FSeeds(Block plant, Block soil) {
		super(plant, soil);
	}

	@Override
	public FSeeds setUnlocalizedName(String name) {
		super.setUnlocalizedName(name);
		return this;
	}

	@Override
	public FSeeds setTextureName(String name) {
		super.setTextureName(name);
		return this;
	}

}
