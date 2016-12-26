package net.cerulan.quieterlightning.gui;

import net.cerulan.quieterlightning.QuieterLightning;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;

public class QLConfigGui extends GuiConfig {

	public QLConfigGui(GuiScreen parentScreen) {
		super(
				parentScreen,
				new ConfigElement(QuieterLightning.config.getCategory("general")).getChildElements(),
				QuieterLightning.MODID,
				false,
				false,
				"Quieter Lightning Config"
			);
	}

}
