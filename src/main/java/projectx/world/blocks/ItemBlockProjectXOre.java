package projectx.world.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class ItemBlockProjectXOre extends ItemBlockWithMetadata{
    private static final String[] names = {"black", "blue", "green", "red", "white"};

    public ItemBlockProjectXOre(Block block) {
        super(block, block);
        setHasSubtypes(true);
        setHarvestLevel("pickaxe", 0);
    }
    

    @Override
    public int getMetadata(int damage){
        return damage;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack){
        return getUnlocalizedName() + "." + names[stack.getItemDamage()];
    }

    @SideOnly(Side.CLIENT)
    @Override
    public boolean requiresMultipleRenderPasses(){
        return true;
    }
}
