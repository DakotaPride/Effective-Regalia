package net.dakotapride.effectiveRegalia.common.register;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public interface Constants {
    String modId = "effectiveregalia";


    TagKey<Item> regaliaItemsTag = TagKey.of(Registries.ITEM.getKey(), new Identifier(modId, "regalia/base"));
    TagKey<Item> ironRegaliaItemsTag = TagKey.of(Registries.ITEM.getKey(), new Identifier(modId, "regalia/iron"));
    TagKey<Item> goldenRegaliaItemsTag = TagKey.of(Registries.ITEM.getKey(), new Identifier(modId, "regalia/gold"));
    TagKey<Item> netheritePlatedRegaliaItemsTag = TagKey.of(Registries.ITEM.getKey(), new Identifier(modId, "regalia/plated"));

}
