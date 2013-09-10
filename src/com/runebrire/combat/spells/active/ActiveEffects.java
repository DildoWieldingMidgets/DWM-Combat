package com.runebrire.combat.spells.active;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.runebrire.combat.cmbt_player.CmbtPlayer;

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
	
	public void heal(CmbtPlayer target, int healed){
		if(target.getMaxHealth() >= (target.getHealth() + healed)){
			target.setHealth(target.getHealth() + healed);
		}else if (target.getMaxHealth() < (target.getHealth() + healed)){
			target.setHealth(target.getMaxHealth());
		}
	}

	public void decreaseEnergy(CmbtPlayer target, int amount){
		target.addEnergy(0 - amount);
	}
	
	public void increaseEnergy(CmbtPlayer target, int amount){
		target.addEnergy(amount);
	}
	
	public void disableCasting(CmbtPlayer target){
		target.setCasting(false);
	}
	
	//possible tiered? ^^^ vvv
	
	public void enableCasting(CmbtPlayer target){
		target.setCasting(true);
	}
	
	public void increaseAttribute(CmbtPlayer target, int amount, String attribute){
		target.addAttrLevel(attribute, amount);
	}
	
	public void decreaseAttribute(CmbtPlayer target, int amount, String attribute){
		target.addAttrLevel(attribute, 0 - amount);
	}
	
	public void fasterCooldowns(CmbtPlayer target, int percent){
		target.setCooldownSpeed(percent);
	}
	
	public void slowerCooldowns(CmbtPlayer target, int percent){
		target.setCooldownSpeed(0 - percent);
	}
	
	
	
	
	
	
	
	
	
}
	
		
