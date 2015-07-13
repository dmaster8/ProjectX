package projectx.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import projectx.client.render.RenderProjectX;

public class ClientProxy extends CommonProxy{
	public static final RenderProjectX renderGlowing = new RenderProjectX();

	@Override
	public void registerTileEntities() {}

	@Override
	public void preInit(){
		RenderingRegistry.registerBlockHandler(renderGlowing.getRenderId(), renderGlowing);
	}

	@Override
	public void init(){

	}

	@Override
	public EntityPlayer getClientPlayer() {
		return Minecraft.getMinecraft().thePlayer;
	}

	@Override
	public World getClientWorld() {
		return Minecraft.getMinecraft().theWorld;
	}
}
