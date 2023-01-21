package net.dakotapride.effectiveRegalia.common.register;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public interface Constants {
    String modId = "effectiveregalia";
    TagKey<Item> regaliaItemsTag = TagKey.of(Registry.ITEM_KEY, new Identifier(modId, "regalia"));

    ItemStack strengthRegalia = ItemInit.REGALIA_STRENGTH.getDefaultStack();
    ItemStack nightVisionRegalia = ItemInit.REGALIA_NIGHT_VISION.getDefaultStack();
    ItemStack regenerationRegalia = ItemInit.REGALIA_REGENERATION.getDefaultStack();
    ItemStack healthBoostRegalia = ItemInit.REGALIA_HEALTH_BOOST.getDefaultStack();

    StatusEffect strength = StatusEffects.STRENGTH;
    StatusEffect nightVision = StatusEffects.NIGHT_VISION;
    StatusEffect regeneration = StatusEffects.REGENERATION;
    StatusEffect healthBoost = StatusEffects.HEALTH_BOOST;
}
