package com.runebrire.combat;

import com.runebrire.combat.cmbt_player.CmbtPlayer;

public class Spell {
	private String name;
	private int id;
	private int power;
	private int duration;
	private int mana;
	private int damage;
	private int xp;
	private int delay;
	
	public Spell(String name, int id){
		
	}
	
	public void use(CmbtPlayer player){
		
	}
	
	public void use(int x, int y, int z){
		
	}
	
	public void setPower(int power){
		this.power = power;
	}
	
	public void setDuration(int duration){
		this.duration = duration;
	}
	
	public void setMana(int mana){
		this.mana = mana;
	}
	
	public void setDamage(int damage){
		this.damage = damage;
	}
	
	public void setXP(int xp){
		this.xp = xp;
	}
	
	public void setDelay(int delay){
		this.delay = delay;
	}
}
