package projectx.client.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import org.lwjgl.opengl.GL11;
import projectx.ProjectX;
import projectx.machines.inventory.ContainerFabricator;
import projectx.machines.tile.TileEntityFabricator;

public class GuiFabricator extends GuiContainer{
    public GuiFabricator(InventoryPlayer playerInventory, TileEntityFabricator fabricator) {
        super(new ContainerFabricator(playerInventory, fabricator));
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int x, int y) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.bindTexture(new ResourceLocation(ProjectX.MODID, "textures/gui/fabricator.png"));
        int x1 = (width - xSize) / 2;
        int y1 = (height - ySize) / 2;
        this.drawTexturedModalRect(x1, y1, 0, 0, xSize, ySize);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int x, int y){
        fontRendererObj.drawString(StatCollector.translateToLocal("container.inventory"), 8, ySize - 96 + 2, 4210752);
    }
}
