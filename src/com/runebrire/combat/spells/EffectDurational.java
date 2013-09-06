package com.runebrire.combat.spells;

public class EffectDurational extends Effect{
	private int duration;

	public EffectDurational(int duration, EffectCause cause, EffectType type) {
		super(cause, type);
		this.duration = duration;
	}
	
	public void effectStart(){
		
	}
	
	public void effectStop(){
		
	}
}