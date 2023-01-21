package net.dakotapride.effectiveRegalia.common.item.base;

import net.dakotapride.effectiveRegalia.common.register.Constants;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;

public class RegaliaItem extends Item implements Constants {
    public static StatusEffect effect;

    public RegaliaItem(Settings settings) {
        super(settings);
    }

    public StatusEffectInstance getRegaliaEffect() {
        return new StatusEffectInstance(effect);
    }


}
