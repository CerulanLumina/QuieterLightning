package net.cerulan.quieterlightning;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = QuieterLightning.MODID, version = QuieterLightning.VERSION)
public class QuieterLightning
{
    public static final String MODID = "quieterlightning";
    public static final String VERSION = "1.0";
    
    @SidedProxy(serverSide="net.cerulan.quieterlightning.CommonProxy", clientSide="net.cerulan.quieterlightning.ClientProxy")
	public static CommonProxy sidedProxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	sidedProxy.init();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	sidedProxy.init();
    }
    
    
}
