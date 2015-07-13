package projectx.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public abstract class CommonProxy {
	public abstract void registerTileEntities();

	public abstract void preInit();

	public abstract void init();

	public abstract EntityPlayer getClientPlayer();

	public abstract World getClientWorld();
}
