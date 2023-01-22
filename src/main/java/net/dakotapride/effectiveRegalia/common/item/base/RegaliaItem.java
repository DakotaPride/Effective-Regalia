package net.dakotapride.effectiveRegalia.common.item.base;

import net.dakotapride.effectiveRegalia.common.register.Constants;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RegaliaItem extends Item implements Constants {
    public static String tooltipText;

    public RegaliaItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable(tooltipText));
    }

}
