package net.cerulan.quieterlightning.gui;

import java.util.Set;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;

public class QLGuiFactory implements IModGuiFactory {

	@Override
	public void initialize(Minecraft minecraftInstance) {
		// supposedly unused?
	}

	@Override
	public Class<? extends GuiScreen> mainConfigGuiClass() {
		return QLConfigGui.class;
	}

	@Override
	public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("deprecation") // seriously? i don't even have a choice in implementing this method #interfaces
	@Override
	public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element) {
		// TODO Auto-generated method stub
		return null;
	}

}
