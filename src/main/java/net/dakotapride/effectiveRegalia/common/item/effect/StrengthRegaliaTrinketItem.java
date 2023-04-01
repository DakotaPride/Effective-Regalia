package net.dakotapride.effectiveRegalia.common.item.effect;

import com.google.common.collect.Multimap;
import dev.emi.trinkets.api.SlotReference;
import net.dakotapride.effectiveRegalia.common.item.base.BaseRegaliaTrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;

import java.util.UUID;

public class StrengthRegaliaTrinketItem extends BaseRegaliaTrinketItem {
    public StrengthRegaliaTrinketItem(Settings settings) {
        super(settings);
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        Multimap<EntityAttribute, EntityAttributeModifier> modifiers = super.getModifiers(stack, slot, entity, uuid);

        EntityAttributeModifier strengthModifier = new EntityAttributeModifier(uuid, "effectiveregalia:strength_i",
                0.3, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);


        modifiers.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, strengthModifier);

        return modifiers;
    }

    public static class GoldenStrengthRegalia extends BaseRegaliaTrinketItem {
        public GoldenStrengthRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
            Multimap<EntityAttribute, EntityAttributeModifier> modifiers = super.getModifiers(stack, slot, entity, uuid);

            EntityAttributeModifier strengthModifier = new EntityAttributeModifier(uuid, "effectiveregalia:strength_ii",
                    0.5, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);


            modifiers.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, strengthModifier);

            return modifiers;
        }
    }

    public static class PlatedStrengthRegalia extends BaseRegaliaTrinketItem {
        public PlatedStrengthRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
            Multimap<EntityAttribute, EntityAttributeModifier> modifiers = super.getModifiers(stack, slot, entity, uuid);

            EntityAttributeModifier strengthModifier = new EntityAttributeModifier(uuid, "effectiveregalia:strength_iii",
                    0.7, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);


            modifiers.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, strengthModifier);

            return modifiers;
        }
    }
}
