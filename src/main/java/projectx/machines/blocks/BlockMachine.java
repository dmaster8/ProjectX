package projectx.machines.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import projectx.ProjectX;
import projectx.ProjectXTabs;

public class BlockMachine extends Block {

	public int currentPass;
	public String glowTexturePath;
	public IIcon glowTexture;

	public String name;
	public int color;

	public BlockMachine(String name, int color) {
		super(Material.rock);
		setCreativeTab(ProjectXTabs.tabProjectXMachines);
		this.glowTexturePath = "paradigmLg";
		setBlockName(name);
		setHardness(2.0F);
		setResistance(10.0F);
		this.color = color;
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
		blockIcon = icon.registerIcon(ProjectX.MODID + ":" + "machines/" + getUnlocalizedName());
		glowTexture = icon.registerIcon(ProjectX.MODID + ":" + glowTexturePath);
	}
	
	public int getColor(){
		return color;
	}

	public IIcon getGlowTexture() {
		return this.glowTexture;
	}

}
