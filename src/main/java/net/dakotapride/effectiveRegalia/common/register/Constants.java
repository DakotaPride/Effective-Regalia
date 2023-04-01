package net.dakotapride.effectiveRegalia.common.register;

import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public interface Constants {
    String modId = "effectiveregalia";


    TagKey<Item> regaliaItemsTag = TagKey.of(Registry.ITEM_KEY, new Identifier(modId, "regalia/base"));
    TagKey<Item> ironRegaliaItemsTag = TagKey.of(Registry.ITEM_KEY, new Identifier(modId, "regalia/iron"));
    TagKey<Item> goldenRegaliaItemsTag = TagKey.of(Registry.ITEM_KEY, new Identifier(modId, "regalia/gold"));
    TagKey<Item> netheritePlatedRegaliaItemsTag = TagKey.of(Registry.ITEM_KEY, new Identifier(modId, "regalia/plated"));

    TagKey<Item> isStrengthRegalia = TagKey.of(Registry.ITEM_KEY, new Identifier(modId, "regalia/effect/strength"));
    TagKey<Item> isNightVisionRegalia = TagKey.of(Registry.ITEM_KEY, new Identifier(modId, "regalia/effect/night_vision"));
    TagKey<Item> isRegenerationRegalia = TagKey.of(Registry.ITEM_KEY, new Identifier(modId, "regalia/effect/regeneration"));
    TagKey<Item> isSaturationRegalia = TagKey.of(Registry.ITEM_KEY, new Identifier(modId, "regalia/effect/saturation"));
    TagKey<Item> isJumpBoostRegalia = TagKey.of(Registry.ITEM_KEY, new Identifier(modId, "regalia/effect/jump_boost"));
    TagKey<Item> isSlowFallingRegalia = TagKey.of(Registry.ITEM_KEY, new Identifier(modId, "regalia/effect/slow_falling"));

}
