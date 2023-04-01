package net.dakotapride.effectiveRegalia.common.item.immune;

import dev.emi.trinkets.api.SlotReference;
import net.dakotapride.effectiveRegalia.common.item.base.BaseRegaliaTrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;

public class BlindnessImmunityRegaliaTrinketItem extends BaseRegaliaTrinketItem {
    public BlindnessImmunityRegaliaTrinketItem(Settings settings) {
        super(settings);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.removeStatusEffect(StatusEffects.BLINDNESS);
    }

    public static class GoldenBlindnessImmunityRegalia extends BaseRegaliaTrinketItem {
        public GoldenBlindnessImmunityRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
            entity.removeStatusEffect(StatusEffects.BLINDNESS);
        }
    }

    public static class PlatedBlindnessImmunityRegalia extends BaseRegaliaTrinketItem {
        public PlatedBlindnessImmunityRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
            entity.removeStatusEffect(StatusEffects.BLINDNESS);
        }
    }
}
