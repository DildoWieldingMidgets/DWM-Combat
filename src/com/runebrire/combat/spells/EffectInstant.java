package com.runebrire.combat.spells;

public class EffectInstant extends EffectDurational{

	public EffectInstant(EffectCause cause, EffectType type) {
		super(1, cause, type);
	}
}
