package net.dakotapride.effectiveRegalia.common.item.base;

import net.dakotapride.effectiveRegalia.common.register.Constants;
import net.dakotapride.effectiveRegalia.common.register.ItemInit;
import net.minecraft.client.item.TooltipContext;
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
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (stack.isOf(ItemInit.REGALIA) || stack.isOf(ItemInit.REGALIA_GOLDEN) || stack.isOf(ItemInit.REGALIA_PLATED)) {
            tooltip.add(Text.translatable(emptyTooltipText));
        } else {
            tooltip.add(Text.translatable(tooltipText));
        }
    }

}
