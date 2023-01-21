package net.dakotapride.effectiveRegalia.common.item;

import net.dakotapride.effectiveRegalia.common.item.base.RegaliaItem;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class SaturationRegaliaItem extends RegaliaItem {
    public SaturationRegaliaItem(Settings settings) {
        super(settings);
    }

    @Override
    public StatusEffectInstance getRegaliaEffect() {
        effect = StatusEffects.SATURATION;
        return new StatusEffectInstance(effect, 200, 0);
    }

    public static class GoldenSaturationRegalia extends SaturationRegaliaItem {
        public GoldenSaturationRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public StatusEffectInstance getRegaliaEffect() {
            effect = StatusEffects.SATURATION;
            return new StatusEffectInstance(effect, 200, 1);
        }

    }

    public static class NetheritePlatedSaturationRegalia extends SaturationRegaliaItem {
        public NetheritePlatedSaturationRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public StatusEffectInstance getRegaliaEffect() {
            effect = StatusEffects.SATURATION;
            return new StatusEffectInstance(effect, 200, 2);
        }

    }
}
