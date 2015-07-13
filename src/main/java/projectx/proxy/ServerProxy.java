package projectx.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ServerProxy extends CommonProxy{
    @Override
    public void registerTileEntities() {

    }

    @Override
    public void preInit() {

    }

    @Override
    public void init() {

    }

    @Override
    public EntityPlayer getClientPlayer() {
        return null;
    }

    @Override
    public World getClientWorld() {
        return null;
    }
}
