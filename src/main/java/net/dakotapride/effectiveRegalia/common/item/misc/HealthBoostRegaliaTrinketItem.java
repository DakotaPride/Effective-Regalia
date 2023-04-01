package net.dakotapride.effectiveRegalia.common.item.misc;

import com.google.common.collect.Multimap;
import dev.emi.trinkets.api.SlotReference;
import net.dakotapride.effectiveRegalia.common.item.base.BaseRegaliaTrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;

import java.util.UUID;

public class HealthBoostRegaliaTrinketItem extends BaseRegaliaTrinketItem {
    public HealthBoostRegaliaTrinketItem(Settings settings) {
        super(settings);
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        Multimap<EntityAttribute, EntityAttributeModifier> modifiers = super.getModifiers(stack, slot, entity, uuid);

        EntityAttributeModifier healthModifier = new EntityAttributeModifier(uuid, "effectiveregalia:health",
                0.3, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);


        modifiers.put(EntityAttributes.GENERIC_MAX_HEALTH, healthModifier);

        return modifiers;
    }
}
