package projectx.machines.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import projectx.ProjectX;
import projectx.ProjectXTabs;

public class BlockXychoriumFire extends BlockMachine {

	public int currentPass;
	public String glowTexturePath;
	public IIcon glowTexture;

	public IIcon side;
	public IIcon top;

	public BlockXychoriumFire() {
		super("xyfire", 11743532);
		setCreativeTab(ProjectXTabs.tabProjectXMachines);
		this.glowTexturePath = "paradigmLg";
		setBlockName("xyfire");
		setHardness(2.0F);
		setResistance(10.0F);
	}

	@Override
	public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {

		return false;

	}
	
	@Override
	public boolean isFireSource(World world, int x, int y, int z, ForgeDirection side) {
		return true;
	}

	@Override
	public boolean isNormalCube() {
		return true;
	}

	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
		if (world.isBlockIndirectlyGettingPowered(x, y, z) && world.getBlock(x, y + 1, z).isReplaceable(world, x, y, z)) {
			world.setBlock(x, y + 1, z, Blocks.fire);
		}
	}

	@Override
	public boolean isNormalCube(IBlockAccess world, int x, int y, int z) {
		return true;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public int getRenderType() {
		return ProjectX.renderID;
	}

	@Override
	public int getRenderBlockPass() {
		return 1;
	}

	@Override
	public boolean canRenderInPass(int pass) {
		currentPass = pass;
		return pass == 1 || pass == 0;
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
	public void registerBlockIcons(IIconRegister icon) {
		top = icon.registerIcon(ProjectX.MODID + ":" + "machines/xyFireTop");
		side = icon.registerIcon(ProjectX.MODID + ":" + "machines/xyFireSide");
		blockIcon = icon.registerIcon(ProjectX.MODID + ":" + "machines/xyDirtTop");
		glowTexture = icon.registerIcon(ProjectX.MODID + ":" + glowTexturePath);
	}

	public IIcon getGlowTexture() {
		return this.glowTexture;
	}

	public IIcon getGlowIcon() {
		return glowTexture;
	}
}
