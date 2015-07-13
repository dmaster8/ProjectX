package projectx.machines.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import projectx.ProjectXTabs;
import projectx.world.blocks.BlockProjectX;

import java.util.List;

public class BlockEngineering extends BlockProjectX{
    public BlockEngineering(Material material, String background, String overlay, String nonFancy) {
        super(material, background, overlay, nonFancy);
        setBlockName("engineering");
        setCreativeTab(ProjectXTabs.tabProjectXMachines);
    }

    @Override
    public void getSubBlocks(Item item, CreativeTabs tab, List list) {
        for (int c = 0; c < 5; ++c) {
            list.add(new ItemStack(item, 1, c));
        }
    }
}
