package net.cerulan.quieterlightning;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@Override
	public void init() {
		MinecraftForge.EVENT_BUS.register(new EventHandler());
	}

}
