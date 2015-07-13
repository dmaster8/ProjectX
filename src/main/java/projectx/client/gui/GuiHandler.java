package projectx.client.gui;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import projectx.machines.inventory.ContainerFabricator;
import projectx.machines.tile.TileEntityFabricator;

public class GuiHandler implements IGuiHandler{
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tile = world.getTileEntity(x, y, z);
        if(tile instanceof TileEntityFabricator){
            return new ContainerFabricator(player.inventory, (TileEntityFabricator) tile);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tile = world.getTileEntity(x, y, z);
        if(tile instanceof TileEntityFabricator){
            return new GuiFabricator(player.inventory, (TileEntityFabricator) tile);
        }
        return null;
    }
}
