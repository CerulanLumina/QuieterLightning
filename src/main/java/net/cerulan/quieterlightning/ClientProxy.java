package net.cerulan.quieterlightning;

import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void init() {
		MinecraftForge.EVENT_BUS.register(new EventHandler());
	}

}
