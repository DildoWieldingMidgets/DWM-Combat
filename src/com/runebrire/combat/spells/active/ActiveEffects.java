package com.runebrire.combat.spells.active;

import org.bukkit.entity.Player;

public class ActiveEffects {
	
	public void damageTarget(Player target, double damage){
		target.damage(damage);
	}
	
	public void stealHealth(Player target, Player caster, double damage, double healed){
		target.damage(damage);
		if(caster.getMaxHealth() >= (caster.getHealth() + healed)){
			caster.setHealth(caster.getHealth() + healed);
		}else if (caster.getMaxHealth() < (caster.getHealth() + healed)){
			caster.setHealth(caster.getMaxHealth());
		}
	}
	
	public void setOnFire(Player target, int intensity){
		
	}
	
	public void drop(Player target, int dropHeight){
		
	}
	
	public void bury(Player target){
		
	}
	
	public void drown(Player target){
		
	}
	
	public void slow(Player target){
		
	}
	
	public void poison(Player target){
		
	}
}
