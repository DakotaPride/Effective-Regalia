package net.dakotapride.effectiveRegalia.common.item.base;

import net.dakotapride.effectiveRegalia.common.register.Constants;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public interface IRegaliaItem extends Constants {

    default MutableText switchEffects(ItemStack stack) {
        if (isStrength(stack)) {
            return text(StatusEffects.STRENGTH.getTranslationKey());
        } else if (isNightVision(stack)) {
            return text(StatusEffects.NIGHT_VISION.getTranslationKey());
        } else if (isRegeneration(stack)) {
            return text(StatusEffects.REGENERATION.getTranslationKey());
        } else if (isSaturation(stack)) {
            return text(StatusEffects.SATURATION.getTranslationKey());
        } else if (isJumpBoost(stack)) {
            return text(StatusEffects.JUMP_BOOST.getTranslationKey());
        } else if (isSlowFalling(stack)) {
            return text(StatusEffects.SLOW_FALLING.getTranslationKey());
        } else if (isBlindnessImmune(stack)) {
            return immuneText(StatusEffects.BLINDNESS.getTranslationKey());
        } else if (isHungerImmune(stack)) {
            return immuneText(StatusEffects.HUNGER.getTranslationKey());
        } else if (isWitherImmune(stack)) {
            return immuneText(StatusEffects.WITHER.getTranslationKey());
        } else if (isPoisonImmune(stack)) {
            return immuneText(StatusEffects.POISON.getTranslationKey());
        } else if (isMiningFatigueImmune(stack)) {
            return immuneText(StatusEffects.MINING_FATIGUE.getTranslationKey());
        } else if (isWeaknessImmune(stack)) {
            return immuneText(StatusEffects.WEAKNESS.getTranslationKey());
        } else if (isFireImmune(stack)) {
            return immuneText("flames");
        } else if (isHealth(stack)) {
            return text(StatusEffects.HEALTH_BOOST.getTranslationKey());
        } else {
            return Text.translatable("text.effectiveregalia.regalia.none");
        }
    }

    default MutableText text(String effect) {
        String defaultText = "text.effectiveregalia.regalia";

        return Text.translatable(defaultText + "." + effect);
    }

    default MutableText immuneText(String effect) {
        String defaultText = "text.effectiveregalia.regalia.immunity";

        return Text.translatable(defaultText + "." + effect);
    }

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

    default boolean isAnImmunity(ItemStack stack) {
        return isBlindnessImmune(stack) || isFireImmune(stack) || isHungerImmune(stack) || isMiningFatigueImmune(stack)
                || isPoisonImmune(stack) || isWeaknessImmune(stack) || isWitherImmune(stack);
    }
    // Misc
    default boolean isHealth(ItemStack stack) {
        return stack.isIn(healthRegaliaTag);
    }

    // TagKeys
    TagKey<Item> strengthRegaliaTag = TagKey.of(Registries.ITEM.getKey(), new Identifier(modId, "regalia/effect/strength"));
    TagKey<Item> nightVisionRegaliaTag = TagKey.of(Registries.ITEM.getKey(), new Identifier(modId, "regalia/effect/night_vision"));
    TagKey<Item> regenerationRegaliaTag = TagKey.of(Registries.ITEM.getKey(), new Identifier(modId, "regalia/effect/regeneration"));
    TagKey<Item> saturationRegaliaTag = TagKey.of(Registries.ITEM.getKey(), new Identifier(modId, "regalia/effect/saturation"));
    TagKey<Item> jumpBoostRegaliaTag = TagKey.of(Registries.ITEM.getKey(), new Identifier(modId, "regalia/effect/jump_boost"));
    TagKey<Item> slowFallingRegaliaTag = TagKey.of(Registries.ITEM.getKey(), new Identifier(modId, "regalia/effect/slow_falling"));

    TagKey<Item> blindnessImmunityRegaliaTag = TagKey.of(Registries.ITEM.getKey(), new Identifier(modId, "regalia/immune/blindness"));
    TagKey<Item> fireImmunityRegaliaTag = TagKey.of(Registries.ITEM.getKey(), new Identifier(modId, "regalia/immune/fire"));
    TagKey<Item> hungerImmunityRegaliaTag = TagKey.of(Registries.ITEM.getKey(), new Identifier(modId, "regalia/immune/hunger"));
    TagKey<Item> miningFatigueImmunityRegaliaTag = TagKey.of(Registries.ITEM.getKey(), new Identifier(modId, "regalia/immune/mining_fatigue"));
    TagKey<Item> poisonImmunityRegaliaTag = TagKey.of(Registries.ITEM.getKey(), new Identifier(modId, "regalia/immune/poison"));
    TagKey<Item> weaknessImmunityRegaliaTag = TagKey.of(Registries.ITEM.getKey(), new Identifier(modId, "regalia/immune/weakness"));
    TagKey<Item> witherImmunityRegaliaTag = TagKey.of(Registries.ITEM.getKey(), new Identifier(modId, "regalia/immune/wither"));

    TagKey<Item> healthRegaliaTag = TagKey.of(Registries.ITEM.getKey(), new Identifier(modId, "regalia/effect/health"));

}
