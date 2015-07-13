package projectx.world.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockTorch;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import projectx.ProjectX;
import projectx.ProjectXTabs;
import projectx.client.fx.EntityTorchFX;

import java.util.Random;

import static net.minecraftforge.common.util.ForgeDirection.*;

public class BlockXyTorch extends BlockTorch {
	public static IIcon particle;

	public BlockXyTorch() {
		setLightLevel(1.0F);
		setCreativeTab(ProjectXTabs.tabProjectXWorld);
	}

	@Override
	public void registerBlockIcons(IIconRegister icon) {
		super.registerBlockIcons(icon);
		this.blockIcon = icon.registerIcon(textureName);
		particle = icon.registerIcon(ProjectX.MODID + ":misc/particle.png");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void randomDisplayTick(World world, int x, int y, int z, Random random) {
		super.randomDisplayTick(world, x, y, z, random);
		int metadata = world.getBlockMetadata(x, y, z);
		double d0 = (double) ((float) x + 0.5F);
		double d1 = (double) ((float) y + 0.7F);
		double d2 = (double) ((float) z + 0.5F);
		double d3 = 0.2199999988079071D;
		double d4 = 0.27000001072883606D;

		switch (metadata) {
		case 1:
			Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTorchFX(world, d0 - d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D));
			break;
		case 2:
			Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTorchFX(world, d0 + d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D));
			break;
		case 3:
			Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTorchFX(world, d0, d1 + d3, d2 - d4, 0.0D, 0.0D, 0.0D));
			break;
		case 4:
			Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTorchFX(world, d0, d1 + d3, d2 + d4, 0.0D, 0.0D, 0.0D));
			break;
		default:
			Minecraft.getMinecraft().effectRenderer.addEffect(new EntityTorchFX(world, d0, d1, d2, 0.0D, 0.0D, 0.0D));
			break;
		}
	}
}
