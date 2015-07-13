package projectx.world.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import projectx.ProjectXTabs;

public class ItemPopcorn extends ItemFood {

	public ItemPopcorn() {
		super(3, 0, false);
		setCreativeTab(ProjectXTabs.tabProjectXWorld);
		setAlwaysEdible();
	}
	

	public void onFoodEaten(ItemStack stack, World world, EntityPlayer player){
		super.onFoodEaten(stack, world, player);

		if(!world.isRemote){
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 200));
		}
	}
}
