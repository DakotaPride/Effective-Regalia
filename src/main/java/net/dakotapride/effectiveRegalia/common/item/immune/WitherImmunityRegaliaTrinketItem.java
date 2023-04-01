package net.dakotapride.effectiveRegalia.common.item.immune;

import dev.emi.trinkets.api.SlotReference;
import net.dakotapride.effectiveRegalia.common.item.base.BaseRegaliaTrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;

public class WitherImmunityRegaliaTrinketItem extends BaseRegaliaTrinketItem {
    public WitherImmunityRegaliaTrinketItem(Settings settings) {
        super(settings);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.removeStatusEffect(StatusEffects.WITHER);
    }

    public static class GoldenWitherImmunityRegalia extends BaseRegaliaTrinketItem {
        public GoldenWitherImmunityRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
            entity.removeStatusEffect(StatusEffects.WITHER);
        }
    }

    public static class PlatedWitherImmunityRegalia extends BaseRegaliaTrinketItem {
        public PlatedWitherImmunityRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
            entity.removeStatusEffect(StatusEffects.WITHER);
        }
    }
}
