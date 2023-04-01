package net.dakotapride.effectiveRegalia.common.item.immune;

import dev.emi.trinkets.api.SlotReference;
import net.dakotapride.effectiveRegalia.common.item.base.BaseRegaliaTrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;

public class FireImmunityRegaliaTrinketItem extends BaseRegaliaTrinketItem {
    public FireImmunityRegaliaTrinketItem(Settings settings) {
        super(settings);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.setFireTicks(0);
    }

    public static class GoldenFireImmunityRegalia extends BaseRegaliaTrinketItem {
        public GoldenFireImmunityRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
            entity.setFireTicks(0);
        }
    }

    public static class PlatedFireImmunityRegalia extends BaseRegaliaTrinketItem {
        public PlatedFireImmunityRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
            entity.setFireTicks(0);
        }
    }
}
