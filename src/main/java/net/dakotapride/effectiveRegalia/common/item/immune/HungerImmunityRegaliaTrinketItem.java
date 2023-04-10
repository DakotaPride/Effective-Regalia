package net.dakotapride.effectiveRegalia.common.item.immune;

import dev.emi.trinkets.api.SlotReference;
import net.dakotapride.effectiveRegalia.common.item.base.BaseRegaliaTrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;

public class HungerImmunityRegaliaTrinketItem extends BaseRegaliaTrinketItem {
    public HungerImmunityRegaliaTrinketItem(Settings settings) {
        super(settings);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.removeStatusEffect(StatusEffects.HUNGER);
    }

    public static class GoldenHungerImmunityRegalia extends BaseRegaliaTrinketItem {
        public GoldenHungerImmunityRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
            entity.removeStatusEffect(StatusEffects.HUNGER);
        }
    }

    public static class PlatedHungerImmunityRegalia extends BaseRegaliaTrinketItem {
        public PlatedHungerImmunityRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
            entity.removeStatusEffect(StatusEffects.HUNGER);
        }
    }
}
