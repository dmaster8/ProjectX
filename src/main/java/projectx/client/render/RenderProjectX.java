package projectx.client.render;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.item.ItemDye;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

import org.lwjgl.opengl.GL11;

import projectx.ProjectX;
import projectx.client.RenderUtils;
import projectx.machines.blocks.BlockEngineering;
import projectx.machines.blocks.BlockMachine;
import projectx.world.blocks.BlockProjectX;
import projectx.world.blocks.BlockProjectXOre;

public class RenderProjectX implements ISimpleBlockRenderingHandler {

	public static int[] colors = new int[ItemDye.field_150922_c.length];

	float bottom = -0.001F, top = 1.0F - bottom;

	public RenderProjectX() {
		ProjectX.renderID = RenderingRegistry.getNextAvailableRenderId();

		for (int l = 0; l < ItemDye.field_150922_c.length; l++) {
			colors[l] = ItemDye.field_150922_c[l];
		}
	}

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelId, RenderBlocks renderer) {
		if (block instanceof BlockProjectXOre || block instanceof BlockEngineering) {
			renderOreInventory(block, metadata, modelId, renderer);
		} else {
			renderStandardInventoryBlock(block, metadata, modelId, renderer);
		}
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
		if (block instanceof BlockProjectXOre || block instanceof BlockEngineering) {
			return renderWorldOre(world, x, y, z, block, modelId, renderer);
		} else {
			return renderStandardWorldBlock(world, x, y, z, block, modelId, renderer);
		}
	}

	public void renderSidedTexture(IBlockAccess world, Block block, int x, int y, int z, RenderBlocks renderer, IIcon icon) {
		renderer.setRenderAllFaces(true);
		Tessellator tess = Tessellator.instance;
		tess.setBrightness(block.getMixedBrightnessForBlock(world, x, y, z));
		if (icon == null) {
			renderer.renderFaceYPos(block, x, y, z, block.getIcon(0, 0));
			renderer.renderFaceYNeg(block, x, y, z, block.getIcon(1, 0));
			renderer.renderFaceZNeg(block, x, y, z, block.getIcon(2, 0));
			renderer.renderFaceZPos(block, x, y, z, block.getIcon(3, 0));
			renderer.renderFaceXNeg(block, x, y, z, block.getIcon(4, 0));
			renderer.renderFaceXPos(block, x, y, z, block.getIcon(5, 0));
		} else {
			renderer.renderFaceYPos(block, x, y, z, icon);
			renderer.renderFaceYNeg(block, x, y, z, icon);
			renderer.renderFaceZNeg(block, x, y, z, icon);
			renderer.renderFaceZPos(block, x, y, z, icon);
			renderer.renderFaceXNeg(block, x, y, z, icon);
			renderer.renderFaceXPos(block, x, y, z, icon);
		}

	}

	@Override
	public boolean shouldRender3DInInventory(int modelId) {
		return true;
	}

	@Override
	public int getRenderId() {
		return ProjectX.renderID;
	}

	protected void renderOreInventory(Block block, int metadata, int modelId, RenderBlocks renderer) {
		GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
		switch (metadata) {
		case 0:
			RenderUtils.setGLColorFromInt(colors[0]);
			break;
		case 1:
			RenderUtils.setGLColorFromInt(colors[4]);
			break;
		case 2:
			RenderUtils.setGLColorFromInt(colors[2]);
			break;
		case 3:
			RenderUtils.setGLColorFromInt(colors[1]);
			break;
		case 4:
			RenderUtils.setGLColorFromInt(colors[15]);
			break;
		default:
			break;
		}

		GL11.glDisable(GL11.GL_LIGHTING);
		if(block instanceof BlockEngineering){
			RenderUtils.drawBlock(block, ((BlockEngineering) block).getGlowTexture(), renderer);
		} else {
			RenderUtils.drawBlock(block, ((BlockProjectXOre) block).getGlowTexture(), renderer);
		}

		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glColor3f(1, 1, 1);
		RenderUtils.drawBlock(block, metadata, renderer);
		GL11.glTranslatef(0.5F, 0.5F, 0.5F);
	}

	protected void renderStandardInventoryBlock(Block block, int metadata, int modelId, RenderBlocks renderer) {
		GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
		RenderUtils.setGLColorFromInt(colors[metadata]);
		GL11.glDisable(GL11.GL_LIGHTING);
		if (block instanceof BlockProjectXOre) {

		} else if (block instanceof BlockProjectX) {
			RenderUtils.drawBlock(block, ((BlockProjectX) block).getGlowTexture(), renderer);
		} else if (block instanceof BlockMachine) {
			RenderUtils.setGLColorFromInt(((BlockMachine) block).getColor());
			RenderUtils.drawBlock(block, ((BlockMachine) block).getGlowTexture(), renderer);
			GL11.glColor3f(1, 1, 1);
			RenderUtils.drawBlock(block, metadata, renderer);
		}
		GL11.glColor3f(1, 1, 1);
		RenderUtils.drawBlock(block, metadata, renderer);
		GL11.glTranslatef(0.5F, 0.5F, 0.5F);
		GL11.glEnable(GL11.GL_LIGHTING);
	}

	protected boolean renderWorldOre(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
		int metadata = world.getBlockMetadata(x, y, z);
		int color = -1;
		switch (metadata) {
		case 0:
			color = 0;
			break;
		case 1:
			color = 4;
			break;
		case 2:
			color = 2;
			break;
		case 3:
			color = 1;
			break;
		case 4:
			color = 15;
			break;
		default:
			break;
		}
		Tessellator tess = Tessellator.instance;
		tess.setColorOpaque_I(color);
		float red = (color >> 16 & 255) / 255.0F;
		float green = (color >> 8 & 255) / 255.0F;
		float blue = (color & 255) / 255.0F;
		tess.setColorOpaque_I(colors[color]);
		if(block instanceof BlockEngineering){
			renderer.setOverrideBlockTexture(((BlockEngineering) block).getIcon(true, world.getBlockMetadata(x, y, z)));
		} else {
			renderer.setOverrideBlockTexture(((BlockProjectXOre) block).getIcon(true, world.getBlockMetadata(x, y, z)));
		}
		renderer.setRenderBounds(0 + 0.001, 0 + 0.001, 0 + 0.001, 1 - 0.001, 1 - 0.001, 1 - 0.001);
		tess.setBrightness(0xF000F0);
		if(block instanceof BlockEngineering){
			RenderUtils.renderAllFaces(renderer, block, x, y, z, ((BlockEngineering) block).getIcon(true, world.getBlockMetadata(x, y, z)));
		} else {
			RenderUtils.renderAllFaces(renderer, block, x, y, z, ((BlockProjectXOre) block).getIcon(true, world.getBlockMetadata(x, y, z)));
		}
		renderer.setRenderBounds(0, 0, 0, 1, 1, 1);
		renderer.clearOverrideBlockTexture();
		if(block instanceof BlockEngineering){
			renderer.setOverrideBlockTexture(((BlockEngineering) block).getIcon(false, world.getBlockMetadata(x, y, z)));
		} else {
			renderer.setOverrideBlockTexture(((BlockProjectXOre) block).getIcon(false, world.getBlockMetadata(x, y, z)));
		}
		tess.setBrightness(block.getMixedBrightnessForBlock(world, x, y, z));
		renderer.renderStandardBlock(block, x, y, z);
		renderer.clearOverrideBlockTexture();
		return true;
	}

	protected boolean renderStandardWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {

		int color = colors[world.getBlockMetadata(x, y, z)];
		Tessellator tess = Tessellator.instance;
		tess.setColorOpaque_I(color);
		float red = (color >> 16 & 255) / 255.0F;
		float green = (color >> 8 & 255) / 255.0F;
		float blue = (color & 255) / 255.0F;
		if (block instanceof BlockProjectX) {
			tess.setColorOpaque_I(color);
			renderer.setOverrideBlockTexture(((BlockProjectX) block).getIcon(true));
			renderer.setRenderBounds(0 + 0.001, 0 + 0.001, 0 + 0.001, 1 - 0.001, 1 - 0.001, 1 - 0.001);
			tess.setBrightness(0xF000F0);
			RenderUtils.renderAllFaces(renderer, block, x, y, z, ((BlockProjectX) block).getIcon(true, world.getBlockMetadata(x, y, z)));
			renderer.setRenderBounds(0, 0, 0, 1, 1, 1);
			renderer.clearOverrideBlockTexture();
			renderer.setOverrideBlockTexture(((BlockProjectX) block).getIcon(false));
			tess.setBrightness(block.getMixedBrightnessForBlock(world, x, y, z));
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
			return true;
		} else if (block instanceof BlockMachine) {
			color = ((BlockMachine) block).getColor();
			red = (color >> 16 & 255) / 255.0F;
			green = (color >> 8 & 255) / 255.0F;
			blue = (color & 255) / 255.0F;
			tess.setColorOpaque_I(color);
			renderer.setOverrideBlockTexture(((BlockMachine) block).getGlowTexture());
			renderer.setRenderBounds(0 + 0.001, 0 + 0.001, 0 + 0.001, 1 - 0.001, 1 - 0.001, 1 - 0.001);
			tess.setBrightness(0xF000F0);
			RenderUtils.renderAllFaces(renderer, block, x, y, z, ((BlockMachine) block).getGlowTexture());
			renderer.setRenderBounds(0, 0, 0, 1, 1, 1);
			renderer.clearOverrideBlockTexture();
			tess.setBrightness(block.getMixedBrightnessForBlock(world, x, y, z));
			renderer.renderStandardBlock(block, x, y, z);
			renderer.clearOverrideBlockTexture();
			return true;
		}
		renderer.renderStandardBlock(block, x, y, z);
		return true;
	}
}
