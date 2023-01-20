package net.dakotapride.effectiveRegalia.common.item;

import net.dakotapride.effectiveRegalia.common.register.ItemInit;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RegaliaItem extends Item {
    public RegaliaItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (stack.isOf(ItemInit.REGALIA_STRENGTH)) {
            tooltip.add(Text.translatable("text.effectiveregalia.strength").formatted(Formatting.ITALIC));
        }
    }
}
