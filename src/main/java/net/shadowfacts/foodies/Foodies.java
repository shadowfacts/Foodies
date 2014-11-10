package net.shadowfacts.foodies;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import net.shadowfacts.foodies.item.FItems;
import net.shadowfacts.foodies.proxy.CommonProxy;


/**
 * Foodies main mod class
 * @author shadowfacts
 */

@Mod(modid = Foodies.modId, name = Foodies.displayName, version = Foodies.version)
public class Foodies  {
	// Modinfo
	public static final String modId = "foodies";
	public static final String displayName = "Foodies";
	public static final String version = "0.0.1";
	public static final String commonProxyString = "net.shadowfacts.foodies.proxy.CommonProxy";
	public static final String clientProxyString = "net.shadowfacts.foodies.proxy.ClientProxy";

	// Mod instance
	@Instance
	public static Foodies instance;

	// Proxy
	@SidedProxy(clientSide = Foodies.clientProxyString, serverSide = Foodies.commonProxyString)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		FItems.preInit();
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		FItems.load();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		FItems.postInit();
	}
}
