package projectx.machines.blocks;

import projectx.ProjectX;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockXyFluidVoid extends BlockMachine {

	public BlockXyFluidVoid() {
		super("xyFluidVoid", 2651799);
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		switch (side) {
		case 0:
			return blockIcon;
		case 1:
			return blockIcon;
		case 2:
			return this.blockIcon;
		case 3:
			return this.blockIcon;
		case 4:
			return this.blockIcon;
		case 5:
			return this.blockIcon;
		default:
			return this.glowTexture;
		}
	}

	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
		for (ForgeDirection dir : ForgeDirection.VALID_DIRECTIONS)
			voidFluid(world, x, y, z, dir);
	}
	
	@Override
	public void onBlockAdded(World world, int x, int y, int z) {
		for (ForgeDirection dir : ForgeDirection.VALID_DIRECTIONS)
			voidFluid(world, x, y, z, dir);
	}

	public void voidFluid(World world, int x, int y, int z, ForgeDirection dir) {
		if (world.getBlock(x + dir.offsetX, y + dir.offsetY, z + dir.offsetZ).getMaterial() instanceof MaterialLiquid) {
			world.setBlock(x + dir.offsetX, y + dir.offsetY, z + dir.offsetZ, Blocks.air);
		}
	}
	@Override
	public void registerBlockIcons(IIconRegister icon) {
		super.registerBlockIcons(icon);
		blockIcon = icon.registerIcon(ProjectX.MODID + ":" + "machines/" + "xyFluidVoid");
	}

}
