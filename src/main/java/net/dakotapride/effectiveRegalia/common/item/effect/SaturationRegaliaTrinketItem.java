package net.dakotapride.effectiveRegalia.common.item.effect;

import com.google.common.collect.Multimap;
import dev.emi.trinkets.api.SlotReference;
import net.dakotapride.effectiveRegalia.common.item.base.BaseRegaliaTrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;

import java.util.UUID;

public class SaturationRegaliaTrinketItem extends BaseRegaliaTrinketItem {
    public SaturationRegaliaTrinketItem(Settings settings) {
        super(settings);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 40, 0));
    }

    public static class GoldenSaturationRegalia extends BaseRegaliaTrinketItem {
        public GoldenSaturationRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 40, 1));
        }
    }

    public static class PlatedSaturationRegalia extends BaseRegaliaTrinketItem {
        public PlatedSaturationRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 40, 2));
        }
    }
}
