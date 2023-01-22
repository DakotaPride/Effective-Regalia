package net.dakotapride.effectiveRegalia.common.item;

import net.dakotapride.effectiveRegalia.common.item.base.RegaliaItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class NightVisionRegaliaItem extends RegaliaItem {
    public NightVisionRegaliaItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltipText = "text.effectiveregalia.regalia.night_vision";

        super.appendTooltip(stack, world, tooltip, context);
    }

    public static class GoldenNightVisionRegalia extends NightVisionRegaliaItem {
        public GoldenNightVisionRegalia(Settings settings) {
            super(settings);
        }

    }

    public static class NetheritePlatedNightVisionRegalia extends NightVisionRegaliaItem {
        public NetheritePlatedNightVisionRegalia(Settings settings) {
            super(settings);
        }

    }
}
