package com.runebrire.combat.spells;

public class Effect {
	private EffectCause cause;
	private EffectType type;
	
	public Effect(EffectCause cause, EffectType type){
		this.cause = cause;
		this.type = type;
	}
	
	public EffectType getEffectType(){
		return type;
	}
	
	public EffectCause getEffectCause(){
		return cause;
	}
	
	public void effectStart(){
		
	}
	
	public void effectStop(){
		
	}
}
