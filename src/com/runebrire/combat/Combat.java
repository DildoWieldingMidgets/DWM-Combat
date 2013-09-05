package com.runebrire.combat;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Combat extends JavaPlugin implements Listener {
		
		private static com.runebrire.core.Core core = null;
		
		private Combat plugin = this;
		
		public void onEnable(){
			
			
			core = (com.runebrire.core.Core) getServer().getPluginManager().getPlugin("Ttor-Core");
			core.registerSubPlugin("Ttor-Combat", plugin);
			
			getServer().getPluginManager().registerEvents(this,this);
			
		}
		
		public void onDisable(){
			
		}
		
		
	
	
}
