package projectx.client.fx;

import net.minecraft.client.particle.EntityFX;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import projectx.world.blocks.BlockXyTorch;

public class EntityTorchFX extends EntityFX{
    protected IIcon particleIcon;

    public EntityTorchFX(World world, double x, double y, double z, double velX, double velY, double velZ) {
        super(world, x, y, z, velX, velY, velZ);
        if(world.getBlock((int)x, (int)y, (int)z) instanceof BlockXyTorch){
            BlockXyTorch xyTorch = (BlockXyTorch) world.getBlock((int)x, (int)y, (int)z);
//            this.particleIcon = xyTorch.particle;
        }
    }
}
