package projectx.world.items.tools;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import projectx.ProjectX;
import projectx.ProjectXTabs;

public class ItemProjectXShovel extends ItemSpade{

	private int color;
	private IIcon head;
	private IIcon glow;

	public ItemProjectXShovel(int color) {
		super(ToolMaterial.IRON);
		setCreativeTab(ProjectXTabs.tabProjectXWorld);
		this.color = color;
	}

	@Override
	public boolean requiresMultipleRenderPasses() {
		return true;
	}

	@Override
	public IIcon getIconFromDamageForRenderPass(int damage, int pass) {
		if(pass==0){
			return head;
		}
		return glow;
	}

	@Override
	public void registerIcons(IIconRegister icon) {
		this.head = icon.registerIcon(ProjectX.MODID + ":tools/shovelStick");
		this.glow = icon.registerIcon(ProjectX.MODID + ":tools/shovelHeadAnimation");
	}

	@Override
	public int getColorFromItemStack(ItemStack stack, int pass) {
		if (pass == 1) {
			return this.color;
		}
		return 0xFFFFFF;
	}
}
