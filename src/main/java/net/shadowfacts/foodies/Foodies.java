package net.shadowfacts.foodies;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.shadowfacts.foodies.block.FBlocks;
import net.shadowfacts.foodies.item.FItems;
import net.shadowfacts.foodies.proxy.CommonProxy;
import net.shadowfacts.foodies.recipe.FRecipes;
import org.apache.logging.log4j.Logger;


/**
 * Foodies main mod class
 * @author shadowfacts
 */

@Mod(modid = Foodies.modId, name = Foodies.displayName, version = Foodies.version)
public class Foodies  {
	// Modinfo
	public static final String modId = "foodies";
	public static final String displayName = "Foodies";
	public static final String version = "@VERSION@";
	public static final String commonProxyString = "net.shadowfacts.foodies.proxy.CommonProxy";
	public static final String clientProxyString = "net.shadowfacts.foodies.proxy.ClientProxy";

	// Mod instance
	@Instance(value=modId)
	public static Foodies instance;

	// Proxy
	@SidedProxy(clientSide = Foodies.clientProxyString, serverSide = Foodies.commonProxyString)
	public static CommonProxy proxy;

	// Logger
	public static Logger log;

	// Creative Tab
	public static CreativeTabs creativeTab = new CreativeTabs("FoodiesTab") {
		@Override
		public Item getTabIconItem() {
			return FItems.toast;
		}
	};

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		log = event.getModLog();

		FItems.preInit();
		FBlocks.preInit();
		FRecipes.preInit();
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		FItems.load();
		FBlocks.load();
		FRecipes.load();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		FItems.postInit();
		FItems.postInit();
		FItems.postInit();
	}
}
