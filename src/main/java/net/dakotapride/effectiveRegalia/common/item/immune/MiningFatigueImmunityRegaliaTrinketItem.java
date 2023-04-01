package net.dakotapride.effectiveRegalia.common.item.immune;

import dev.emi.trinkets.api.SlotReference;
import net.dakotapride.effectiveRegalia.common.item.base.BaseRegaliaTrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;

public class MiningFatigueImmunityRegaliaTrinketItem extends BaseRegaliaTrinketItem {
    public MiningFatigueImmunityRegaliaTrinketItem(Settings settings) {
        super(settings);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.removeStatusEffect(StatusEffects.MINING_FATIGUE);
    }

    public static class GoldenMiningFatigueImmunityRegalia extends BaseRegaliaTrinketItem {
        public GoldenMiningFatigueImmunityRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
            entity.removeStatusEffect(StatusEffects.MINING_FATIGUE);
        }
    }

    public static class PlatedMiningFatigueImmunityRegalia extends BaseRegaliaTrinketItem {
        public PlatedMiningFatigueImmunityRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
            entity.removeStatusEffect(StatusEffects.MINING_FATIGUE);
        }
    }
}
