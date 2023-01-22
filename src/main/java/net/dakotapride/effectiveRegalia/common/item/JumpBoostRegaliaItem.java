package net.dakotapride.effectiveRegalia.common.item;

import net.dakotapride.effectiveRegalia.common.item.base.RegaliaItem;
import net.dakotapride.effectiveRegalia.common.register.Constants;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class JumpBoostRegaliaItem extends RegaliaItem implements Constants {
    public JumpBoostRegaliaItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltipText = "text.effectiveregalia.regalia.jump_boost";

        super.appendTooltip(stack, world, tooltip, context);
    }

    public static class GoldenJumpBoostRegalia extends JumpBoostRegaliaItem {
        public GoldenJumpBoostRegalia(Settings settings) {
            super(settings);
        }

    }

    public static class NetheritePlatedJumpBoostRegalia extends JumpBoostRegaliaItem {
        public NetheritePlatedJumpBoostRegalia(Settings settings) {
            super(settings);
        }

    }
}
