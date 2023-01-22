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

public class RegenerationRegaliaItem extends RegaliaItem {
    public RegenerationRegaliaItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltipText = "text.effectiveregalia.regalia.regeneration";

        super.appendTooltip(stack, world, tooltip, context);
    }

    public static class GoldenRegenerationRegalia extends RegenerationRegaliaItem {
        public GoldenRegenerationRegalia(Settings settings) {
            super(settings);
        }

    }

    public static class NetheritePlatedRegenerationRegalia extends RegenerationRegaliaItem {
        public NetheritePlatedRegenerationRegalia(Settings settings) {
            super(settings);
        }

    }
}
