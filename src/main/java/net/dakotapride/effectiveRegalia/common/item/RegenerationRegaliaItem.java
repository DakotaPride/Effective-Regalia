package net.dakotapride.effectiveRegalia.common.item;

import net.dakotapride.effectiveRegalia.common.item.base.RegaliaItem;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class RegenerationRegaliaItem extends RegaliaItem {
    public RegenerationRegaliaItem(Settings settings) {
        super(settings);
    }

    @Override
    public StatusEffectInstance getRegaliaEffect() {
        effect = StatusEffects.REGENERATION;
        return new StatusEffectInstance(effect, 200, 0);
    }

    public static class GoldenRegenerationRegalia extends RegenerationRegaliaItem {
        public GoldenRegenerationRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public StatusEffectInstance getRegaliaEffect() {
            effect = StatusEffects.REGENERATION;
            return new StatusEffectInstance(effect, 200, 1);
        }

    }

    public static class NetheritePlatedRegenerationRegalia extends RegenerationRegaliaItem {
        public NetheritePlatedRegenerationRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public StatusEffectInstance getRegaliaEffect() {
            effect = StatusEffects.REGENERATION;
            return new StatusEffectInstance(effect, 200, 2);
        }

    }
}
