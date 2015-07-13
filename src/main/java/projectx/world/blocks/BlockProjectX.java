package projectx.world.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import projectx.ProjectX;
import projectx.ProjectXTabs;

import java.util.List;

public class BlockProjectX extends Block {

	public int currentPass;
	public String glowTexturePath;
	public String overlay;
	public String nonFancyPath;
	public IIcon overlayIcon;
	public IIcon glowTexture, nonFancyGlowTexture;

	public BlockProjectX(Material material, String background, String overlay, String nonFancyPath) {
		super(material);
		setCreativeTab(ProjectXTabs.tabProjectXWorld);
        setHardness(1.5F);
        setResistance(15.0F);
        setStepSound(soundTypeStone);
		this.glowTexturePath = background;
		this.nonFancyPath = nonFancyPath;
		this.overlay = overlay;
	}

	public boolean isFancyEnabled(){
		return Minecraft.getMinecraft().isFancyGraphicsEnabled();
	}

	@Override
	public boolean renderAsNormalBlock() {
		return true;
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
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public boolean canRenderInPass(int pass) {
		currentPass = pass;
		return pass == 1 || pass == 0;
	}

	@Override
	public void registerBlockIcons(IIconRegister icon) {
		super.registerBlockIcons(icon);
		this.blockIcon = icon.registerIcon(ProjectX.MODID + ":" + glowTexturePath);
		glowTexture = icon.registerIcon(ProjectX.MODID + ":" + glowTexturePath);
		nonFancyGlowTexture = icon.registerIcon(ProjectX.MODID + ":" + nonFancyPath);

		if (overlay != null) {
			overlayIcon = icon.registerIcon(ProjectX.MODID + ":" + overlay);
		}
	}

	@Override
	public int damageDropped(int metadata) {
		return metadata;
	}

	public IIcon getGlowTexture() {
		return isFancyEnabled() ? this.glowTexture : this.nonFancyGlowTexture;
	}

	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, List list) {
		for (int c = 0; c < 16; ++c) {
			list.add(new ItemStack(item, 1, c));
		}
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		return overlayIcon;
	}

	public IIcon getIcon(boolean color) {
		return color ? getGlowTexture() : overlayIcon;
	}

	public IIcon getIcon(boolean color, int metadata) {
		return color ? getGlowTexture() : overlayIcon;
	}
}
