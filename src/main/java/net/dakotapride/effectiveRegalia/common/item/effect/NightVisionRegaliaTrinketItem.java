package net.dakotapride.effectiveRegalia.common.item.effect;

import com.google.common.collect.Multimap;
import dev.emi.trinkets.api.SlotReference;
import net.dakotapride.effectiveRegalia.common.item.base.BaseRegaliaTrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;

import java.util.UUID;

public class NightVisionRegaliaTrinketItem extends BaseRegaliaTrinketItem {
    public NightVisionRegaliaTrinketItem(Settings settings) {
        super(settings);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 40, 0));
    }

    public static class GoldenNightVisionRegalia extends BaseRegaliaTrinketItem {
        public GoldenNightVisionRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 40, 1));
        }
    }

    public static class PlatedNightVisionRegalia extends BaseRegaliaTrinketItem {
        public PlatedNightVisionRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 40, 2));
        }
    }
}
