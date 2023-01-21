package net.dakotapride.effectiveRegalia.common.item;

import net.dakotapride.effectiveRegalia.common.item.base.RegaliaItem;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class JumpBoostRegaliaItem extends RegaliaItem {
    public JumpBoostRegaliaItem(Settings settings) {
        super(settings);
    }

    @Override
    public StatusEffectInstance getRegaliaEffect() {
        effect = StatusEffects.JUMP_BOOST;
        return new StatusEffectInstance(effect, 200, 0);
    }

    public static class GoldenJumpBoostRegalia extends JumpBoostRegaliaItem {
        public GoldenJumpBoostRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public StatusEffectInstance getRegaliaEffect() {
            effect = StatusEffects.JUMP_BOOST;
            return new StatusEffectInstance(effect, 200, 1);
        }

    }

    public static class NetheritePlatedJumpBoostRegalia extends JumpBoostRegaliaItem {
        public NetheritePlatedJumpBoostRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public StatusEffectInstance getRegaliaEffect() {
            effect = StatusEffects.JUMP_BOOST;
            return new StatusEffectInstance(effect, 200, 2);
        }

    }
}
