package net.dakotapride.effectiveRegalia.common.register;

import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public interface Constants {
    String modId = "effectiveregalia";
    TagKey<Item> regaliaItemsTag = TagKey.of(Registry.ITEM_KEY, new Identifier(modId, "regalia/iron"));
    TagKey<Item> goldenRegaliaItemsTag = TagKey.of(Registry.ITEM_KEY, new Identifier(modId, "regalia/gold"));
    TagKey<Item> netheritePlatedRegaliaItemsTag = TagKey.of(Registry.ITEM_KEY, new Identifier(modId, "regalia/plated"));
}
