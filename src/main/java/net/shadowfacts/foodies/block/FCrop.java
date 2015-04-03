package net.shadowfacts.foodies.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import net.shadowfacts.foodies.item.FItems;

import java.util.Random;

/**
 * Class for creating crops (block form)
 * @author shadowfacts
 */
public class FCrop extends Block {

	public FCrop() {
		super(Material.plants);
		setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.5f, 1.0f);
		setTickRandomly(true);
	}

	@Override
	public FCrop setBlockName(String name) {
		super.setBlockName(name);
		return this;
	}

	@Override
	public FCrop setBlockTextureName(String name) {
		super.setBlockName(name);
		return this;
	}

	public AxisAlignedBB getCollisionBoudningBoxFromPool(World world, int x, int y, int z) {
		return null;
	}

	@Override
	public int getRenderType() {
		return 6;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public void updateTick(World world, int x, int y, int z, Random random) {
		if (world.getBlockMetadata(x, y, z) == 1) {
			return;
		}
		if (random.nextInt(isFertile(world, x, y - 1, z) ? 12 : 25) != 0) {
			return;
		}

		world.setBlockMetadataWithNotify(x, y, z, 1, 2);
	}

	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
		if (!canBlockStay(world, x, y, z)) {
			dropBlockAsItem(world, x, y, z, world.getBlockMetadata(x, y, z), 0);
			world.setBlockMetadataWithNotify(x, y, z, 0, 2);
		}
	}

	@Override
	public boolean canBlockStay(World world, int x, int y, int z) {
		Block soil = world.getBlock(x, y - 1, z);
		return (world.getFullBlockLightValue(x, y, z) >= 8 || world.canBlockSeeTheSky(x, y, z)) && (soil != null && soil.canSustainPlant(world, x, y - 1, z, ForgeDirection.UP, FItems.tomatoSeeds));
	}

	@Override
	public Item getItemDropped(int metadata, Random random, int par3) {
		switch (metadata) {
			case 0:
				return FItems.tomatoSeeds;
			case 1:
				return FItems.tomato;
			default:
				return null;
		}
	}

	@Override
	public Item getItem(World world, int x, int y, int z) {
		return FItems.tomatoSeeds;
	}

}
