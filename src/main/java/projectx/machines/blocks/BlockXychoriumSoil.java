package projectx.machines.blocks;

import java.util.Random;

import projectx.ProjectX;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.IGrowable;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockXychoriumSoil extends BlockMachine {

	public IIcon top;
	public IIcon side;

	public BlockXychoriumSoil() {
		super("xySoil", 3887386);
		setTickRandomly(true);
	}

	@Override
	public int tickRate(World p_149738_1_) {
		return 20;
	}

	@Override
	public void registerBlockIcons(IIconRegister icon) {
		super.registerBlockIcons(icon);
		blockIcon = icon.registerIcon(ProjectX.MODID + ":" + "machines/" + getUnlocalizedName());
		top = icon.registerIcon(ProjectX.MODID + ":" + "machines/" + "xyDirtTop");
		side = icon.registerIcon(ProjectX.MODID + ":" + "machines/" + "xyDirtSide");
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		switch (side) {
		case 0:
			return top;
		case 1:
			return top;
		case 2:
			return this.side;
		case 3:
			return this.side;
		case 4:
			return this.side;
		case 5:
			return this.side;
		default:
			return this.glowTexture;
		}
	}

	@Override
	public boolean canSustainPlant(IBlockAccess world, int x, int y, int z, ForgeDirection direction, IPlantable plantable) {
		return true;
	}

	public int countBlocks(World world, int x, int y, int z) {
		int count = 0;
		for (int i = 0; i < 10; i++) {
			if (world.getBlock(x, y - i, z) == this) {
				count++;
			}
		}
		return count;
	}

	@Override
	public void updateTick(World world, int x, int y, int z, Random rand) {
		if (rand.nextInt(11 - countBlocks(world, x, y, z)) == 0)
			if (world.getBlock(x, y + 1, z) instanceof IGrowable) {
				((IGrowable) world.getBlock(x, y + 1, z)).func_149853_b(world, rand, x, y + 1, z);

			}
	}

	@Override
	public boolean isFertile(World world, int x, int y, int z) {
		return true;
	}
}
