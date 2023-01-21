package net.dakotapride.effectiveRegalia.common.item;

import net.dakotapride.effectiveRegalia.common.item.base.RegaliaItem;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class NightVisionRegaliaItem extends RegaliaItem {
    public NightVisionRegaliaItem(Settings settings) {
        super(settings);
    }

    @Override
    public StatusEffectInstance getRegaliaEffect() {
        effect = StatusEffects.NIGHT_VISION;
        return new StatusEffectInstance(effect, 200, 0);
    }

    public static class GoldenNightVisionRegalia extends NightVisionRegaliaItem {
        public GoldenNightVisionRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public StatusEffectInstance getRegaliaEffect() {
            effect = StatusEffects.NIGHT_VISION;
            return new StatusEffectInstance(effect, 200, 1);
        }

    }

    public static class NetheritePlatedNightVisionRegalia extends NightVisionRegaliaItem {
        public NetheritePlatedNightVisionRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public StatusEffectInstance getRegaliaEffect() {
            effect = StatusEffects.NIGHT_VISION;
            return new StatusEffectInstance(effect, 200, 2);
        }

    }
}
