package projectx.world.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import projectx.ProjectXTabs;

public class BlockAluminum extends Block {
    public BlockAluminum() {
        super(Material.rock);
        setCreativeTab(ProjectXTabs.tabProjectXWorld);
        setHardness(1.5F);
        setResistance(10.0F);
    }
}
