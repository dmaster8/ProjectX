package projectx.world.blocks;

import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import projectx.world.init.ProjectXWorldItems;

public class BlockTomato extends BlockCrops{
    public BlockTomato(){

    }

    @Override
    public void registerBlockIcons(IIconRegister icon){
        //Will do this later
    }

    protected Item getItemForPlacing(){
        return ProjectXWorldItems.tomatoSeeds;
    }

    protected Item getItemDropped(){
        return ProjectXWorldItems.tomato;
    }

    @Override
    protected Item func_149866_i(){
        return getItemForPlacing();
    }

    @Override
    protected Item func_149865_P(){
        return getItemDropped();
    }
}
