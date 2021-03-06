package com.runebrire.combat.cmbt_player;

import java.util.HashMap;

import org.bukkit.entity.Player;

import com.runebrire.combat.Combat;

public class CmbtPlayer {
	private Combat plugin;
	
	
	private int energyPFS;
	private String playerName;
	private Player player;
	private int playerXP;
	private int playerLevel;
	private String race;
	private int health;
	private int max_health;
	private int energy;
	private int max_energy;
	private boolean casting;
	private int cooldownSpeed;
	private int meleeDamage;
	private int armorPercent;
	private int magicDamage;
	private int projectileDamage;
	
	
	private HashMap<String, Integer> attributes = new HashMap<String, Integer>();
	
	public CmbtPlayer(String playerName){
		
		cooldownSpeed = 100;
		meleeDamage = 100;
		armorPercent = 100;
		magicDamage = 100;
		projectileDamage = 100;
		
		energyPFS = 1;
		playerLevel = 0;
		playerXP = 0;
		race = null;
		health = 100;
		max_health = 100;
		energy = 70;
		max_energy = 70;
		casting = true;

		attributes.put("destruction", 0);
		attributes.put("summoning", 0);
		attributes.put("restoration", 0);
		attributes.put("illusion", 0);
		attributes.put("shadowmoor", 0);
		attributes.put("sword", 0);
		attributes.put("axe", 0);
		attributes.put("heavy_armor", 0);
		attributes.put("bow", 0);
		attributes.put("trapping", 0);
		attributes.put("light_armor", 0);
		attributes.put("athleticism", 0);
		attributes.put("sneaking", 0);
		attributes.put("charisma", 0);
		attributes.put("mining", 0);
		attributes.put("woodcutting", 0);
		attributes.put("farming", 0);
		attributes.put("fishing", 0);
		
		this.playerName = playerName;
	}
	
	public int getEnergyRegen()
	{
		return this.energyPFS;
	}
	
	
	public void setEnergyRegen(int regen)
	{
		this.energyPFS = regen;
	}
	
	
	public int getCooldownSpeed()
	{
		return this.cooldownSpeed;
	}
	
	
	public void setCooldownSpeed(int percent)
	{
		this.cooldownSpeed = percent;
	}
	
	
	public int getMeleeDamage()
	{
		return this.meleeDamage;
	}
	
	
	public void setMeleeDamage(int percent)
	{
		this.meleeDamage = percent;
	}
	
	
	public int getArmorPercent()
	{
		return this.armorPercent;
	}
	
	
	public void setArmorPercent(int percent)
	{
		this.armorPercent = percent;
	}
	
	
	public int getMagicDamage()
	{
		return this.magicDamage;
	}
	
	
	public void setMagicDamage(int percent)
	{
		this.magicDamage = percent;
	}
	
	
	public int getProjectileDamage()
	{
	return this.projectileDamage;	
	}
	
	
	public void setProjectileDamage(int percent)
	{
		this.projectileDamage = percent;
	}
	
	
	public boolean getCasting()
	{
		return this.casting;
	}
	
	
	public void setCasting(boolean value)
	{
		this.casting = value;
	}
	
	
	public Player getPlayer()
	{
		return this.player;
	}
	
	
	public String getPlayerName()
	{
		return this.playerName;
	}
	
	
	public int getPlayerXP()
	{
		return this.playerXP;
	}
	
	
	public void setPlayerXP(int xp)
	{
		this.playerXP = xp;
	}
	
	
	public void addPlayerXP(int xp)
	{
		this.playerXP = this.playerXP + xp;
	}
	
	
	public int getPlayerLevel()
	{
		return this.playerLevel;
	}
	
	
	public void setPlayerLevel(int level)
	{
		this.playerLevel = level;
	}
	
	
	public void addPlayerLevel(int level)
	{
		this.playerLevel = this.playerLevel + level;
	}
	
	
	public String getRace()
	{
		return this.race;
	}
	
	
	public void setRace(String race)
	{
		this.race = race;
	}
	
	
	public int getHealth()
	{
		return this.health;
	}
	
	
	public void setHealth(int health)
	{
		this.health = health;
	}
	
	
	public void addHealth(int health)
	{
		this.health = this.health + health;
	}
	
	
	public int getMaxHealth()
	{
		return this.max_health;
	}
	
	
	public void setMaxHealth(int health)
	{
		this.max_health = health;
	}
	
	
	public void addMaxHealth(int health)
	{
		this.max_health = this.max_health + health;
	}
	
	
	public int getEnergy()
	{
		return this.energy;
	}
	
	
	public void setEnergy(int energy)
	{
		this.energy = energy;
	}
	
	
	public void addEnergy(int energy)
	{
		this.energy = this.energy + energy;
	}
	
	
	public int getMaxEnergy()
	{
		return this.max_energy;
	}
	
	
	public void setMaxEnergy(int energy)
	{
		this.energy = energy;
	}
	
	
	public void addMaxEnergy(int energy)
	{
		this.energy = this.energy + energy;
	}
	
	
	public Integer getAttrLevel(String attribute)
	{
		return this.attributes.get(attribute);
	}
	
	
	public void setAttrLevel(String attribute, Integer level)
	{
		if(this.attributes.containsKey(attribute))
		{
			this.attributes.remove(attribute);
			this.attributes.put(attribute, level);
		}
	}
	
	
	public void addAttrLevel(String attribute, Integer level)
	{
		if(this.attributes.containsKey(attribute))
		{
			Integer temp = 0;
			temp = this.attributes.get(attribute);
			this.attributes.remove(attribute);
			this.attributes.put(attribute, temp + level);
		}
	}
	
	
	
}
