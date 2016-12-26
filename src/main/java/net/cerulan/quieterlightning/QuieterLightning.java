package net.cerulan.quieterlightning;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = QuieterLightning.MODID, version = QuieterLightning.VERSION, clientSideOnly = true, guiFactory = "net.cerulan.quieterlightning.gui.QLGuiFactory")
public class QuieterLightning
{
    public static final String MODID = "quieterlightning";
    public static final String VERSION = "1.0";
    
    @SidedProxy(serverSide="net.cerulan.quieterlightning.CommonProxy", clientSide="net.cerulan.quieterlightning.ClientProxy")
	public static CommonProxy sidedProxy;
    
    public static Configuration config;
    
    public static float volume;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	config = new Configuration(event.getSuggestedConfigurationFile());
    	syncConfig();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	MinecraftForge.EVENT_BUS.register(this);
    	sidedProxy.init();
    }
    
    private static void syncConfig() {
    	volume = config.getFloat("volume", "general", 6f, 0f, 10000f, "A value between 0 and 10000 that will replace the Minecraft volume level for a lightning bolt. The Minecraft default is 10000 (160000 block range). Mod Default=6 (96 block range). An increase of 1 for this value corresponds to an increase of 16 blocks of range.");
    	
    	if (config.hasChanged()) {
    		config.save();
    	}
    }
    
    @SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
    	syncConfig();
    }
    
    
}
