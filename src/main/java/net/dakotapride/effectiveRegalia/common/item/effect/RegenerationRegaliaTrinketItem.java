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

public class RegenerationRegaliaTrinketItem extends BaseRegaliaTrinketItem {
    public RegenerationRegaliaTrinketItem(Settings settings) {
        super(settings);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 40, 0));
    }

    public static class GoldenRegenerationRegalia extends BaseRegaliaTrinketItem {
        public GoldenRegenerationRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 40, 1));
        }
    }

    public static class PlatedRegenerationRegalia extends BaseRegaliaTrinketItem {
        public PlatedRegenerationRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 40, 2));
        }
    }
}
