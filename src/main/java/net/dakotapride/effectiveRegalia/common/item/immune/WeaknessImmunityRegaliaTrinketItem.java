package net.dakotapride.effectiveRegalia.common.item.immune;

import dev.emi.trinkets.api.SlotReference;
import net.dakotapride.effectiveRegalia.common.item.base.BaseRegaliaTrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;

public class WeaknessImmunityRegaliaTrinketItem extends BaseRegaliaTrinketItem {
    public WeaknessImmunityRegaliaTrinketItem(Settings settings) {
        super(settings);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.removeStatusEffect(StatusEffects.WEAKNESS);
    }

    public static class GoldenWeaknessImmunityRegalia extends BaseRegaliaTrinketItem {
        public GoldenWeaknessImmunityRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
            entity.removeStatusEffect(StatusEffects.WEAKNESS);
        }
    }

    public static class PlatedWeaknessImmunityRegalia extends BaseRegaliaTrinketItem {
        public PlatedWeaknessImmunityRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
            entity.removeStatusEffect(StatusEffects.WEAKNESS);
        }
    }
}
