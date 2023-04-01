package net.dakotapride.effectiveRegalia.common.item.base;

import com.google.common.collect.Multimap;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.dakotapride.effectiveRegalia.common.register.Constants;
import net.dakotapride.effectiveRegalia.common.register.ItemInit;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

public class BaseRegaliaTrinketItem extends TrinketItem implements Constants {
    public static String tooltipText;
    public static String emptyTooltipText = "text.effectiveregalia.regalia.none";

    public BaseRegaliaTrinketItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (stack.isIn(regaliaItemsTag)) {
            tooltip.add(Text.translatable(emptyTooltipText));
        } else {
            if (stack.isIn(isStrengthRegalia)) {
                tooltipText = "text.effectiveregalia.regalia.strength";

                tooltip.add(Text.translatable(tooltipText).formatted(Formatting.BLUE));
            } else if (stack.isIn(isNightVisionRegalia)) {
                tooltipText = "text.effectiveregalia.regalia.night_vision";

                tooltip.add(Text.translatable(tooltipText).formatted(Formatting.BLUE));
            } else if (stack.isIn(isRegenerationRegalia)) {
                tooltipText = "text.effectiveregalia.regalia.regeneration";

                tooltip.add(Text.translatable(tooltipText).formatted(Formatting.BLUE));
            } else if (stack.isIn(isSaturationRegalia)) {
                tooltipText = "text.effectiveregalia.regalia.saturation";

                tooltip.add(Text.translatable(tooltipText).formatted(Formatting.BLUE));
            } else if (stack.isIn(isJumpBoostRegalia)) {
                tooltipText = "text.effectiveregalia.regalia.jump_boost";

                tooltip.add(Text.translatable(tooltipText).formatted(Formatting.BLUE));
            } else if (stack.isIn(isSlowFallingRegalia)) {
                tooltipText = "text.effectiveregalia.regalia.slow_falling";

                tooltip.add(Text.translatable(tooltipText).formatted(Formatting.BLUE));
            }
        }
    }

}