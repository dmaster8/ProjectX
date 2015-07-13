package projectx.world.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;

public class ItemBlockProjectX extends ItemBlockWithMetadata {

    public ItemBlockProjectX(Block block) {
        super(block, block);
        setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int damage){
        return damage;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack){
        return getUnlocalizedName() + "." + ItemDye.field_150923_a[stack.getItemDamage()];
    }

    @SideOnly(Side.CLIENT)
    @Override
    public boolean requiresMultipleRenderPasses(){
        return true;
    }

}
