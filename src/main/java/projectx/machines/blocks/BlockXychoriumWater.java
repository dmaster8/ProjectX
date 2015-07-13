package projectx.machines.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import projectx.ProjectX;
import projectx.ProjectXTabs;

public class BlockXychoriumWater extends BlockMachine {

	public int currentPass;
	public String glowTexturePath;
	public IIcon glowTexture;

	public BlockXychoriumWater() {
		super("xywater", 1973019);
		setCreativeTab(ProjectXTabs.tabProjectXMachines);
		this.glowTexturePath = "paradigmLg";
		setBlockName("xywater");
		setHardness(2.0F);
		setResistance(10.0F);
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public int getRenderType() {
		return ProjectX.renderID;
	}

	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
		watery(world, x, y, z);
	}

	private void watery(World world, int x, int y, int z) {

		if (world.getBlock(x, y, z - 1).getMaterial() == Material.lava) {
			int meta = world.getBlockMetadata(x, y, z - 1);
			if (meta == 0) {
				world.setBlock(x, y, z - 1, Blocks.obsidian);
			} else if (meta <= 4) {
				world.setBlock(x, y, z - 1, Blocks.cobblestone);
			}
		}

		if (world.getBlock(x, y, z + 1).getMaterial() == Material.lava) {
			int meta = world.getBlockMetadata(x, y, z + 1);
			if (meta == 0) {
				world.setBlock(x, y, z + 1, Blocks.obsidian);
			} else if (meta <= 4) {
				world.setBlock(x, y, z + 1, Blocks.cobblestone);
			}
		}

		if (world.getBlock(x - 1, y, z).getMaterial() == Material.lava) {
			int meta = world.getBlockMetadata(x - 1, y, z);
			if (meta == 0) {
				world.setBlock(x - 1, y, z, Blocks.obsidian);
			} else if (meta <= 4) {
				world.setBlock(x - 1, y, z, Blocks.cobblestone);
			}
		}

		if (world.getBlock(x + 1, y, z).getMaterial() == Material.lava) {
			int meta = world.getBlockMetadata(x + 1, y, z);
			if (meta == 0) {
				world.setBlock(x + 1, y, z, Blocks.obsidian);
			} else if (meta <= 4) {
				world.setBlock(x + 1, y, z, Blocks.cobblestone);
			}
		}

		if (world.getBlock(x, y + 1, z).getMaterial() == Material.lava) {
			int meta = world.getBlockMetadata(x, y + 1, z);
			if (meta == 0) {
				world.setBlock(x, y + 1, z, Blocks.obsidian);
			} else if (meta <= 4) {
				world.setBlock(x, y + 1, z, Blocks.cobblestone);
			}
		}
		if (world.getBlock(x, y - 1, z).getMaterial() == Material.lava) {
			int meta = world.getBlockMetadata(x, y - 1, z);
			if (meta == 0) {
				world.setBlock(x, y - 1, z, Blocks.obsidian);
			} else if (meta <= 4) {
				world.setBlock(x, y - 1, z, Blocks.cobblestone);
			}
		}
	}
	@Override
	public void onBlockAdded(World world, int x, int y, int z) {
		for (ForgeDirection dir : ForgeDirection.VALID_DIRECTIONS) {
			watery(world, x, y, z);
		}
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
		return blockIcon;
	}

	@Override
	public void registerBlockIcons(IIconRegister icon) {
		blockIcon = icon.registerIcon(ProjectX.MODID + ":" + "machines/xyWater");
		glowTexture = icon.registerIcon(ProjectX.MODID + ":" + glowTexturePath);
	}

	public IIcon getGlowTexture() {
		return this.glowTexture;
	}

	public IIcon getIcon(boolean color) {
		return color ? glowTexture : blockIcon;
	}
}
