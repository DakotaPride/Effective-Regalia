package net.dakotapride.effectiveRegalia.common.item.base;

import net.dakotapride.effectiveRegalia.common.register.Constants;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public interface IRegaliaItem extends Constants {

    // isOfRegalia
    // Regular Effects
    default boolean isStrength(ItemStack stack) {
        return stack.isIn(strengthRegaliaTag);
    }

    default boolean isNightVision(ItemStack stack) {
        return stack.isIn(nightVisionRegaliaTag);
    }

    default boolean isRegeneration(ItemStack stack) {
        return stack.isIn(regenerationRegaliaTag);
    }

    default boolean isSaturation(ItemStack stack) {
        return stack.isIn(saturationRegaliaTag);
    }

    default boolean isJumpBoost(ItemStack stack) {
        return stack.isIn(jumpBoostRegaliaTag);
    }

    default boolean isSlowFalling(ItemStack stack) {
        return stack.isIn(slowFallingRegaliaTag);
    }
    // Immunities
    default boolean isBlindnessImmune(ItemStack stack) {
        return stack.isIn(blindnessImmunityRegaliaTag);
    }

    default boolean isFireImmune(ItemStack stack) {
        return stack.isIn(fireImmunityRegaliaTag);
    }

    default boolean isHungerImmune(ItemStack stack) {
        return stack.isIn(hungerImmunityRegaliaTag);
    }

    default boolean isMiningFatigueImmune(ItemStack stack) {
        return stack.isIn(miningFatigueImmunityRegaliaTag);
    }

    default boolean isPoisonImmune(ItemStack stack) {
        return stack.isIn(poisonImmunityRegaliaTag);
    }

    default boolean isWeaknessImmune(ItemStack stack) {
        return stack.isIn(weaknessImmunityRegaliaTag);
    }

    default boolean isWitherImmune(ItemStack stack) {
        return stack.isIn(witherImmunityRegaliaTag);
    }
    // Misc
    default boolean isHealth(ItemStack stack) {
        return stack.isIn(healthRegaliaTag);
    }

    // TagKeys
    TagKey<Item> strengthRegaliaTag = TagKey.of(Registry.ITEM_KEY, new Identifier(modId, "regalia/effect/strength"));
    TagKey<Item> nightVisionRegaliaTag = TagKey.of(Registry.ITEM_KEY, new Identifier(modId, "regalia/effect/night_vision"));
    TagKey<Item> regenerationRegaliaTag = TagKey.of(Registry.ITEM_KEY, new Identifier(modId, "regalia/effect/regeneration"));
    TagKey<Item> saturationRegaliaTag = TagKey.of(Registry.ITEM_KEY, new Identifier(modId, "regalia/effect/saturation"));
    TagKey<Item> jumpBoostRegaliaTag = TagKey.of(Registry.ITEM_KEY, new Identifier(modId, "regalia/effect/jump_boost"));
    TagKey<Item> slowFallingRegaliaTag = TagKey.of(Registry.ITEM_KEY, new Identifier(modId, "regalia/effect/slow_falling"));

    TagKey<Item> blindnessImmunityRegaliaTag = TagKey.of(Registry.ITEM_KEY, new Identifier(modId, "regalia/immune/blindness"));
    TagKey<Item> fireImmunityRegaliaTag = TagKey.of(Registry.ITEM_KEY, new Identifier(modId, "regalia/immune/fire"));
    TagKey<Item> hungerImmunityRegaliaTag = TagKey.of(Registry.ITEM_KEY, new Identifier(modId, "regalia/immune/hunger"));
    TagKey<Item> miningFatigueImmunityRegaliaTag = TagKey.of(Registry.ITEM_KEY, new Identifier(modId, "regalia/immune/mining_fatigue"));
    TagKey<Item> poisonImmunityRegaliaTag = TagKey.of(Registry.ITEM_KEY, new Identifier(modId, "regalia/immune/poison"));
    TagKey<Item> weaknessImmunityRegaliaTag = TagKey.of(Registry.ITEM_KEY, new Identifier(modId, "regalia/immune/weakness"));
    TagKey<Item> witherImmunityRegaliaTag = TagKey.of(Registry.ITEM_KEY, new Identifier(modId, "regalia/immune/wither"));

    TagKey<Item> healthRegaliaTag = TagKey.of(Registry.ITEM_KEY, new Identifier(modId, "regalia/effect/health"));

}
