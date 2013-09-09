package com.runebrire.combat.spells.active;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

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
	
	public void setOnFire(Player target, int duration){
		target.setFireTicks(duration);
	}
	
	public void addPotionEffect(Player target, int duration, PotionEffectType effect, int strength){
		target.addPotionEffect(new PotionEffect(effect, duration, strength));
	}
	
	public void teleport(Player target){
		//edit
	}
	
	public void freeze(Player target){
		target.setWalkSpeed(0);
	}
	
	public void heal(Player target, double healed){
		if(target.getMaxHealth() >= (target.getHealth() + healed)){
			target.setHealth(target.getHealth() + healed);
		}else if (target.getMaxHealth() < (target.getHealth() + healed)){
			target.setHealth(target.getMaxHealth());
		}
	}

	public void decreaseEnergy(Player target, int amount){
		//edit
	}
	
	public void increaseEnergy(Player target, int amount){
		//edit
	}
	
	public void plusMaxHealth(Player target, int amount){
		//edit
	}
	
	public void minusMaxHealth(Player target, int amount){
		//edit
	}
	
	public void damageReduction(Player target, int precent, double damageTaken){
		//edit
	}
	
	public void disableCasting(Player target, int duration, int tier){
		//edit
	}
	
	public void increaseAttribute(Player target, int duration, int amount, String attribute){
		//edit
	}
	
	public void decreaseAttribute(Player target, int duration, int amount, String attribute){
		//edit
	}
	
	public void fasterCooldowns(Player target, int duration, int percent){
		//edit
	}
	
	public void slowerCooldowns(Player target, int duration, int percent){
		//edit
	}
	
	
	
	
	
	
	
	
	
}
	
		
