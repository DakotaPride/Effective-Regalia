package net.dakotapride.effectiveRegalia.common.item.immune;

import net.dakotapride.effectiveRegalia.common.item.base.RegaliaItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class FireImmuneRegaliaItem extends RegaliaItem {
    public FireImmuneRegaliaItem(Settings settings) {
        super(settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (entity instanceof PlayerEntity playerEntity) {
            if (playerEntity.getOffHandStack().isOf(this.getDefaultStack().getItem()) && (entity.age % 60) == 0) {
                stack.damage(1, playerEntity, (player) -> player.sendToolBreakStatus(player.getActiveHand()));
            }
        }

        super.inventoryTick(stack, world, entity, slot, selected);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltipText = "text.effectiveregalia.regalia.fire";

        super.appendTooltip(stack, world, tooltip, context);
    }

    public static class GoldenFireImmuneRegalia extends FireImmuneRegaliaItem {
        public GoldenFireImmuneRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
            if (entity instanceof PlayerEntity playerEntity) {
                if (playerEntity.getOffHandStack().isOf(this.getDefaultStack().getItem()) && (entity.age % 75) == 0) {
                    stack.damage(1, playerEntity, (player) -> player.sendToolBreakStatus(player.getActiveHand()));
                }
            }

            super.inventoryTick(stack, world, entity, slot, selected);
        }

    }

    public static class NetheritePlatedFireImmuneRegalia extends FireImmuneRegaliaItem {
        public NetheritePlatedFireImmuneRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
            if (entity instanceof PlayerEntity playerEntity) {
                if (playerEntity.getOffHandStack().isOf(this.getDefaultStack().getItem()) && (entity.age % 85) == 0) {
                    stack.damage(1, playerEntity, (player) -> player.sendToolBreakStatus(player.getActiveHand()));
                }
            }

            super.inventoryTick(stack, world, entity, slot, selected);
        }

    }
}
