package net.dakotapride.effectiveRegalia.common.item.effect;

import dev.emi.trinkets.api.SlotReference;
import net.dakotapride.effectiveRegalia.common.item.base.BaseRegaliaTrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;

public class JumpBoostRegaliaTrinketItem extends BaseRegaliaTrinketItem {
    public JumpBoostRegaliaTrinketItem(Settings settings) {
        super(settings);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 40, 0));
    }

    public static class GoldenJumpBoostRegalia extends BaseRegaliaTrinketItem {
        public GoldenJumpBoostRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 40, 1));
        }
    }

    public static class PlatedJumpBoostRegalia extends BaseRegaliaTrinketItem {
        public PlatedJumpBoostRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 40, 2));
        }
    }
}
