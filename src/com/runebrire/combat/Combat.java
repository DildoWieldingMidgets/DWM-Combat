package com.runebrire.combat;

import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
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
		
		private HashMap<String, CmbtPlayer> players = new HashMap<String, CmbtPlayer>();
		
		
		
		//OnEnablesAndDisables
		public void onEnable(){
			core = (com.runebrire.core.Core) getServer().getPluginManager().getPlugin("Ttor-Core");
			core.registerSubPlugin("Ttor-Combat", plugin);
			getServer().getPluginManager().registerEvents(this,this);
			
			
			Timer timer = new Timer();
			timer.schedule(new TimerTask(){
				@Override
				public void run() {
					for(Player p : Bukkit.getServer().getOnlinePlayers() ){
						
						CmbtPlayer cmbt = players.get(p.getName());
							if(cmbt.getMaxEnergy() >= (cmbt.getEnergy() + cmbt.getEnergyRegen())){
								cmbt.setEnergy(cmbt.getEnergy() + cmbt.getEnergyRegen());
							}else if (cmbt.getMaxEnergy() < (cmbt.getEnergy() + cmbt.getEnergyRegen())){
								cmbt.setEnergy(cmbt.getMaxEnergy());
							}

							}
						}
				 },9000L,(100L * 5L));
			
			
		}
		
		public void onDisable(){
			
		}
		
		
		//Api
		
		public CmbtPlayer getCombatPlayer(String playerName){
			return this.players.get(playerName);
		}
		
		public void updateCombatPlayer(String playerName, CmbtPlayer player){
			players.remove(playerName);
			players.put(playerName, player);
		}
		//End of api
		
		
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
				
			}else if(cmd.getName().equalsIgnoreCase("mana")){
				CmbtPlayer cmbt = players.get(player.getName());
				getServer().broadcastMessage(cmbt.getEnergy() + " " + cmbt.getMaxEnergy() + " " + cmbt.getEnergyRegen());
				
			}else if(cmd.getName().equalsIgnoreCase("manaa")){
				CmbtPlayer cmbt = players.get(player.getName());
				cmbt.setEnergy(cmbt.getEnergy() - 30);
				getServer().broadcastMessage(cmbt.getEnergy() + " " + cmbt.getMaxEnergy() + " " + cmbt.getEnergyRegen());
				
			}
			return true;
		}
}
