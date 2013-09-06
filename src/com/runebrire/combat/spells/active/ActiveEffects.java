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
	
	public void potionEffect(Player target, int duration, PotionEffectType effect, int strength){
		target.addPotionEffect(new PotionEffect(effect, duration, strength));
	}
	
	public void teleport(Player target){
		//edit
	}
	
<<<<<<< HEAD
	public void freeze(Player target){
		target.setWalkSpeed(0);
	}
	
	public void heal(Player target, double healed){
		if(target.getMaxHealth() >= (target.getHealth() + healed)){
			target.setHealth(target.getHealth() + healed);
		}else if (target.getMaxHealth() < (target.getHealth() + healed)){w
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
	
	





=======
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
	
	public void jump(Player target, int duration){
		target.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, duration, 3));
	}
	
	public void blind(Player target, int duration){
		target.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, duration, 3));
	}
	
	public void increaseDamage(Player target, int duration){
		target.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, duration, 3));
	}
	
	public void decreaseDamage(Player target, int duration){
		target.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, duration, 3));
	}
>>>>>>> a95cddfd09371a100a3de4c62c500e35ee0a84e0
}
	
		
