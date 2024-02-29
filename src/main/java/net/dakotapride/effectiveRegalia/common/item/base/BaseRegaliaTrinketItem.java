package net.dakotapride.effectiveRegalia.common.item.base;

import dev.emi.trinkets.api.TrinketItem;
import net.dakotapride.effectiveRegalia.common.register.Constants;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BaseRegaliaTrinketItem extends TrinketItem implements Constants, IRegaliaItem {
    public static String emptyTooltipText = "text.effectiveregalia.regalia.none";

    public BaseRegaliaTrinketItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (stack.isIn((regaliaItemsTag))) {
            tooltip.add(Text.translatable(emptyTooltipText).formatted(Formatting.GRAY, Formatting.ITALIC));
        } else {
            tooltip.add(switchEffects(stack).formatted(Formatting.BLUE));
            tooltip.add(Text.literal(""));
        }

        // if (stack.isIn(regaliaItemsTag)) {
        //            tooltip.add(Text.translatable(emptyTooltipText).formatted(Formatting.GRAY));
        //        } else {
        //            if (isStrength(stack)) {
        //                tooltipText = "text.effectiveregalia.regalia.strength";
        //                descriptor = "text.effectiveregalia.regalia.strength.description";
        //
        //                tooltip.add(Text.translatable(tooltipText).formatted(Formatting.BLUE));
        //                tooltip.add(Text.translatable(descriptor).formatted(Formatting.BLUE));
        //            } else if (isNightVision(stack)) {
        //                tooltipText = "text.effectiveregalia.regalia.night_vision";
        //                descriptor = "text.effectiveregalia.regalia.night_vision.description";
        //
        //                tooltip.add(Text.translatable(tooltipText).formatted(Formatting.BLUE));
        //                tooltip.add(Text.translatable(descriptor).formatted(Formatting.BLUE));
        //            } else if (isRegeneration(stack)) {
        //                tooltipText = "text.effectiveregalia.regalia.regeneration";
        //                descriptor = "text.effectiveregalia.regalia.regeneration.description";
        //
        //                tooltip.add(Text.translatable(tooltipText).formatted(Formatting.BLUE));
        //                tooltip.add(Text.translatable(descriptor).formatted(Formatting.BLUE));
        //            } else if (isSaturation(stack)) {
        //                tooltipText = "text.effectiveregalia.regalia.saturation";
        //                descriptor = "text.effectiveregalia.regalia.saturation.description";
        //
        //                tooltip.add(Text.translatable(tooltipText).formatted(Formatting.BLUE));
        //                tooltip.add(Text.translatable(descriptor).formatted(Formatting.BLUE));
        //            } else if (isJumpBoost(stack)) {
        //                tooltipText = "text.effectiveregalia.regalia.jump_boost";
        //                descriptor = "text.effectiveregalia.regalia.jump_boost.description";
        //
        //                tooltip.add(Text.translatable(tooltipText).formatted(Formatting.BLUE));
        //                tooltip.add(Text.translatable(descriptor).formatted(Formatting.BLUE));
        //            } else if (isSlowFalling(stack)) {
        //                tooltipText = "text.effectiveregalia.regalia.slow_falling";
        //                descriptor = "text.effectiveregalia.regalia.slow_falling.description";
        //
        //                tooltip.add(Text.translatable(tooltipText).formatted(Formatting.BLUE));
        //                tooltip.add(Text.translatable(descriptor).formatted(Formatting.BLUE));
        //            }
        //
        //            if (isBlindnessImmune(stack)) {
        //                tooltipText = "text.effectiveregalia.regalia.blindness";
        //                descriptor = "text.effectiveregalia.regalia.blindness.description";
        //
        //                tooltip.add(Text.translatable(tooltipText).formatted(Formatting.BLUE));
        //                tooltip.add(Text.translatable(descriptor).formatted(Formatting.BLUE));
        //            } else if (isFireImmune(stack)) {
        //                tooltipText = "text.effectiveregalia.regalia.fire";
        //                descriptor = "text.effectiveregalia.regalia.fire.description";
        //
        //                tooltip.add(Text.translatable(tooltipText).formatted(Formatting.BLUE));
        //                tooltip.add(Text.translatable(descriptor).formatted(Formatting.BLUE));
        //            } else if (isHungerImmune(stack)) {
        //                tooltipText = "text.effectiveregalia.regalia.hunger";
        //                descriptor = "text.effectiveregalia.regalia.hunger.description";
        //
        //                tooltip.add(Text.translatable(tooltipText).formatted(Formatting.BLUE));
        //                tooltip.add(Text.translatable(descriptor).formatted(Formatting.BLUE));
        //            } else if (isMiningFatigueImmune(stack)) {
        //                tooltipText = "text.effectiveregalia.regalia.mining_fatigue";
        //                descriptor = "text.effectiveregalia.regalia.mining_fatigue.description";
        //
        //                tooltip.add(Text.translatable(tooltipText).formatted(Formatting.BLUE));
        //                tooltip.add(Text.translatable(descriptor).formatted(Formatting.BLUE));
        //            } else if (isPoisonImmune(stack)) {
        //                tooltipText = "text.effectiveregalia.regalia.poison";
        //                descriptor = "text.effectiveregalia.regalia.poison.description";
        //
        //                tooltip.add(Text.translatable(tooltipText).formatted(Formatting.BLUE));
        //                tooltip.add(Text.translatable(descriptor).formatted(Formatting.BLUE));
        //            } else if (isWeaknessImmune(stack)) {
        //                tooltipText = "text.effectiveregalia.regalia.weakness";
        //                descriptor = "text.effectiveregalia.regalia.weakness.description";
        //
        //                tooltip.add(Text.translatable(tooltipText).formatted(Formatting.BLUE));
        //                tooltip.add(Text.translatable(descriptor).formatted(Formatting.BLUE));
        //            } else if (isWitherImmune(stack)) {
        //                tooltipText = "text.effectiveregalia.regalia.wither";
        //                descriptor = "text.effectiveregalia.regalia.wither.description";
        //
        //                tooltip.add(Text.translatable(tooltipText).formatted(Formatting.BLUE));
        //                tooltip.add(Text.translatable(descriptor).formatted(Formatting.BLUE));
        //            }
        //
        //            if (isHealth(stack)) {
        //                tooltipText = "text.effectiveregalia.regalia.health";
        //                descriptor = "text.effectiveregalia.regalia.health.description";
        //
        //                tooltip.add(Text.translatable(tooltipText).formatted(Formatting.BLUE));
        //                tooltip.add(Text.translatable(descriptor).formatted(Formatting.BLUE));
        //            }
        }

}
