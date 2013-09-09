package com.runebrire.combat;

import java.util.HashMap;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import com.runebrire.combat.cmbt_player.CmbtPlayer;

public class Combat extends JavaPlugin implements Listener {
		
		private static com.runebrire.core.Core core;
		
		private Combat plugin = this;
		
		private final HashMap<String, CmbtPlayer> players = new HashMap<String, CmbtPlayer>();
		
		public void onEnable(){
			core = (com.runebrire.core.Core) getServer().getPluginManager().getPlugin("Ttor-Core");
			core.registerSubPlugin("Ttor-Combat", plugin);
			
			getServer().getPluginManager().registerEvents(this,this);
			
			
		}
		
		public void onDisable(){
			
		}
		
		@EventHandler
		public void onPlayerJoin(PlayerJoinEvent event){
			if(!players.containsKey(event.getPlayer().getName())){
				players.put(event.getPlayer().getName(), new CmbtPlayer(event.getPlayer().getName()));
			}
		}
		
		
		public boolean onCommand(CommandSender sender, Command cmd,String commandLabel, String[] args){
			Player player = (Player) sender;
			if(cmd.getName().equalsIgnoreCase("testie")){
				
				CmbtPlayer cmbt = players.get(player.getName());
				
				
				
				getServer().broadcastMessage(cmbt.getPlayerName());
				
			}			
			return true;
		}
}
