package projectx.machines.blocks;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import projectx.ProjectX;
import projectx.machines.tile.TileEntityValve;

public class BlockValve extends BlockMachine implements ITileEntityProvider {
    public BlockValve() {
        super("valve", 6719955);
    }

    @Override
    public IIcon getIcon(int side, int meta){
        return this.blockIcon;
    }

    @Override
    public void registerBlockIcons(IIconRegister icon){
        super.registerBlockIcons(icon);
        this.blockIcon = icon.registerIcon(ProjectX.MODID + ":machines/valve");
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileEntityValve();
    }
}
