package net.dakotapride.effectiveRegalia.common.item.base;

import net.dakotapride.effectiveRegalia.common.register.Constants;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RegaliaItem extends Item implements Constants {
    public static String tooltipText;
    public static String emptyTooltipText = "text.effectiveregalia.regalia.none";

    public RegaliaItem(Settings settings) {
        super(settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (entity instanceof PlayerEntity playerEntity && playerEntity.getOffHandStack() == stack) {
            if (stack.isIn(ironRegaliaItemsTag)) {
                if (stack.getDamage() < 615) {
                    playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 200, 0));
                }

                if (stack.getDamage() < 256) {
                    playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 200, 1));
                    playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 200, 0));
                }
            }

            if (stack.isIn(goldenRegaliaItemsTag)) {
                if (stack.getDamage() < 1006) {
                    playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 200, 0));
                }

                if (stack.getDamage() < 402) {
                    playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 200, 1));
                    playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 200, 0));
                }
            }

            if (stack.isIn(netheritePlatedRegaliaItemsTag)) {
                if (stack.getDamage() < 1358) {
                    playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 200, 0));
                }

                if (stack.getDamage() < 452) {
                    playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 200, 1));
                    playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 200, 0));
                }
            }
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (stack.isIn(regaliaItemsTag)) {
            tooltip.add(Text.translatable(emptyTooltipText));
        } else {
            tooltip.add(Text.translatable(tooltipText));
        }
    }

}
