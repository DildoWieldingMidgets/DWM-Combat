package com.runebrire.combat.spells.active;


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

}
