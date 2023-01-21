package net.dakotapride.effectiveRegalia.common.item;

import net.dakotapride.effectiveRegalia.common.item.base.RegaliaItem;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class StrengthRegaliaItem extends RegaliaItem {
    public StrengthRegaliaItem(Settings settings) {
        super(settings);
    }

    @Override
    public StatusEffectInstance getRegaliaEffect() {
        effect = StatusEffects.STRENGTH;
        return new StatusEffectInstance(effect, 200, 0);
    }

    public static class GoldenStrengthRegalia extends StrengthRegaliaItem {
        public GoldenStrengthRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public StatusEffectInstance getRegaliaEffect() {
            effect = StatusEffects.STRENGTH;
            return new StatusEffectInstance(effect, 200, 1);
        }

    }

    public static class NetheritePlatedStrengthRegalia extends StrengthRegaliaItem {
        public NetheritePlatedStrengthRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public StatusEffectInstance getRegaliaEffect() {
            effect = StatusEffects.STRENGTH;
            return new StatusEffectInstance(effect, 200, 2);
        }

    }
}
