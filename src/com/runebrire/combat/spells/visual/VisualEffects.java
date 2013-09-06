package com.runebrire.combat.spells.visual;

import org.bukkit.entity.Player;

import com.runebrire.core.libraries.ParticleEffect;

public class VisualEffects {
	public void setOnFire(Player target){
		ParticleEffect.LAVA.play(target.getLocation(), 0f, 0f, 0f, 3f, 5);
	}
	
	public void slow(Player target){
		ParticleEffect.CLOUD.play(target.getLocation(), 0f, 0f, 0f, 3f, 5);
	}
	
	public void poison(Player target){
		ParticleEffect.BUBBLE.play(target.getLocation(), 0f, 0f, 0f, 3f, 5);
	}
}
