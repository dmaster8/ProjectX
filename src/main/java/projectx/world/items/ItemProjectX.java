package projectx.world.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import projectx.ProjectX;
import projectx.ProjectXTabs;

import java.util.List;

public class ItemProjectX extends Item{
	public IIcon[] icons = new IIcon[5];
	private String name;

	public ItemProjectX(String name){
		super();
		this.name = name;
		setHasSubtypes(true);
		setCreativeTab(ProjectXTabs.tabProjectXWorld);
		setMaxDamage(0);
	}

	@Override
	public void registerIcons(IIconRegister icon){
		icons[0] = icon.registerIcon(ProjectX.MODID + ":" + this.name + "Black");
		icons[1] = icon.registerIcon(ProjectX.MODID + ":" + this.name + "Blue");
		icons[2] = icon.registerIcon(ProjectX.MODID + ":" + this.name + "Green");
		icons[3] = icon.registerIcon(ProjectX.MODID + ":" + this.name + "Red");
		icons[4] = icon.registerIcon(ProjectX.MODID + ":" + this.name + "White");
	}

	@Override
	public IIcon getIconFromDamage(int meta){
		if(meta > 4){
			meta = 0;
		}

		return this.icons[meta];
	}

	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list){
		for(int i = 0; i < 5; i++){
			list.add(new ItemStack(item, 1, i));
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack){
		switch(stack.getItemDamage()){
		case 0:
			return this.getUnlocalizedName() + "Black";
		case 1:
			return this.getUnlocalizedName() + "Blue";
		case 2:
			return this.getUnlocalizedName() + "Green";
		case 3:
			return this.getUnlocalizedName() + "Red";
		case 4:
			return this.getUnlocalizedName() + "White";
		default:
			return this.getUnlocalizedName();
		}
	}
}
