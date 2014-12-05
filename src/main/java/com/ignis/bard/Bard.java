package com.ignis.bard;

import com.ignis.bard.proxy.IProxy;
import com.ignis.bard.references.Refererence;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Refererence.MOD_ID, name=Refererence.MOD_NAME, version=Refererence.VERSION)
public class Bard {
	@Mod.Instance(Refererence.MOD_ID)
	public static Bard instance;
	
	//item declaration
	public static Item piano;
	
	@SidedProxy(clientSide = Refererence.CLIENT_PROXY_CLASS, serverSide = Refererence.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//define instruments
		piano = new Instrument(1, CreativeTabs.tabMisc, 1, "piano");
		
		//register items
		GameRegistry.registerItem(piano, "piano"); 
	}
	@EventHandler
	public void preInit(FMLInitializationEvent event) {
		
	}
	@EventHandler
	public void preInit(FMLPostInitializationEvent event) {
		
	}
}
