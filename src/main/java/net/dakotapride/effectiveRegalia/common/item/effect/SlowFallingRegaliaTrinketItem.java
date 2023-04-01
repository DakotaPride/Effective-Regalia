package net.dakotapride.effectiveRegalia.common.item.effect;

import dev.emi.trinkets.api.SlotReference;
import net.dakotapride.effectiveRegalia.common.item.base.BaseRegaliaTrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;

public class SlowFallingRegaliaTrinketItem extends BaseRegaliaTrinketItem {
    public SlowFallingRegaliaTrinketItem(Settings settings) {
        super(settings);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 40, 0));
    }

    public static class GoldenSlowFallingRegalia extends BaseRegaliaTrinketItem {
        public GoldenSlowFallingRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 40, 1));
        }
    }

    public static class PlatedSlowFallingRegalia extends BaseRegaliaTrinketItem {
        public PlatedSlowFallingRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 40, 2));
        }
    }
}
