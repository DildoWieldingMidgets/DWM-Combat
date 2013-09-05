package com.runebrire.combat.cmbt_player;

import org.bukkit.entity.Player;

import com.runebrire.combat.Combat;

public class CmbtPlayer {
	private Combat plugin;
	private String playerName;
	private int playerXP;
	private int playerLevel;
	//party
	//faction
	//String race
	//skillsystem
	//maxHealth
	//maxEnergy
	
	public CmbtPlayer(String playerName){
		this.playerName = playerName;
	}
	
	public int getNeededXP(){
		return (100*playerLevel)-playerXP;
	}
}
