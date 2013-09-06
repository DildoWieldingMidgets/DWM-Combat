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
	
	public void slow(Player target, int duration){
		target.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, duration, 3));
	}
	
	public void poison(Player target, int duration){
		target.addPotionEffect(new PotionEffect(PotionEffectType.POISON, duration, 3));
	}
	
	public void speed(Player target, int duration){
		target.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, duration, 3));
	}
	
	public void nightVision(Player target, int duration){
		target.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, duration, 3));
	}
	
	public void regeneration(Player target, int duration){
		target.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, duration, 3));
	}
	
	public void confusion(Player target, int duration){
		target.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, duration, 3));
	}
	
	public void hunger(Player target, int duration){
		target.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, duration, 3));
	}
	
	public void invisible(Player target, int duration){
		target.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, duration, 3));
	}
}
