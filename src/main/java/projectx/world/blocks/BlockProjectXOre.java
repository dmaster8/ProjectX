package projectx.world.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import projectx.ProjectX;
import projectx.world.init.ProjectXWorldItems;

import java.util.ArrayList;
import java.util.List;

public class BlockProjectXOre extends BlockProjectX {
	public IIcon[] icon = new IIcon[5];

	public BlockProjectXOre(Material material, String background, String overlay, String nonFancy) {
		super(material, background, overlay, nonFancy);
		setHardness(2.0f);
		setHarvestLevel("pickaxe", 0);
		this.nonFancyPath = nonFancy;
	}

	@Override
	public int damageDropped(int meta) {
		return meta;
	}

	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, List list) {
		for (int c = 0; c < 5; c++) {
			list.add(new ItemStack(item, 1, c));
		}
	}

	@Override
	public void registerBlockIcons(IIconRegister icon) {
		super.registerBlockIcons(icon);

		this.blockIcon = icon.registerIcon(ProjectX.MODID + ":" + glowTexturePath);
		glowTexture = icon.registerIcon(ProjectX.MODID + ":" + glowTexturePath);
		nonFancyGlowTexture = icon.registerIcon(ProjectX.MODID + ":" + nonFancyPath);

		if (overlay != null) {
			for (int l = 0; l < this.icon.length; l++) {
				this.icon[l] = icon.registerIcon(ProjectX.MODID + ":" + glowTexturePath);
			}
		}

		this.icon[0] = icon.registerIcon(ProjectX.MODID + ":" + overlay + "Black");
		this.icon[1] = icon.registerIcon(ProjectX.MODID + ":" + overlay + "Blue");
		this.icon[2] = icon.registerIcon(ProjectX.MODID + ":" + overlay + "Green");
		this.icon[3] = icon.registerIcon(ProjectX.MODID + ":" + overlay + "Red");
		this.icon[4] = icon.registerIcon(ProjectX.MODID + ":" + overlay + "White");
	}

	@Override
	public IIcon getIcon(int side, int metadata) {
		return (metadata < icon.length) ? icon[metadata] : icon[0];
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> list = new ArrayList<ItemStack>();
		list.add(new ItemStack(ProjectXWorldItems.xychorium, 3, metadata));
		if (world.rand.nextBoolean()) {
			list.add(new ItemStack(ProjectXWorldItems.xychorium, 1, metadata));
		}
		return list;
	}

	@Override
	public IIcon getIcon(boolean color) {
		return color ? getGlowTexture() : icon[0];
	}

	@Override
	public IIcon getIcon(boolean color, int metadata) {
		return color ? getGlowTexture() : ((metadata < icon.length) ? icon[metadata] : icon[0]);
	}
}
