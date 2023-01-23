package net.dakotapride.effectiveRegalia.common.item;

import net.dakotapride.effectiveRegalia.common.item.base.RegaliaItem;
import net.dakotapride.effectiveRegalia.common.register.ItemInit;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class NightVisionRegaliaItem extends RegaliaItem {
    public NightVisionRegaliaItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (user.getOffHandStack().isOf(this.getDefaultStack().getItem())
                || user.getMainHandStack().isOf(this.getDefaultStack().getItem())) {
            user.getOffHandStack().decrement(1);

            user.giveItemStack(new ItemStack(ItemInit.REGALIA, 1));
            user.giveItemStack(new ItemStack(ItemInit.GOLDEN_RELIC, 1));


            return TypedActionResult.pass(user.getOffHandStack());
        } else {
            return TypedActionResult.fail(user.getOffHandStack());
        }
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (entity instanceof PlayerEntity playerEntity) {
            if (playerEntity.getOffHandStack().isOf(this.getDefaultStack().getItem()) && (entity.age % 60) == 0) {
                stack.damage(1, playerEntity, (player) -> player.sendToolBreakStatus(player.getActiveHand()));
            }
        }
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

        @Override
        public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
            if (user.getOffHandStack().isOf(this.getDefaultStack().getItem())
                || user.getMainHandStack().isOf(this.getDefaultStack().getItem())) {
                user.getOffHandStack().decrement(1);

                user.giveItemStack(new ItemStack(ItemInit.REGALIA_GOLDEN, 1));
                user.giveItemStack(new ItemStack(ItemInit.GOLDEN_RELIC, 1));


                return TypedActionResult.pass(user.getOffHandStack());
            } else {
                return TypedActionResult.fail(user.getOffHandStack());
            }
        }

        @Override
        public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
            if (entity instanceof PlayerEntity playerEntity) {
                if (playerEntity.getOffHandStack().isOf(this.getDefaultStack().getItem()) && (entity.age % 75) == 0) {
                    stack.damage(1, playerEntity, (player) -> player.sendToolBreakStatus(player.getActiveHand()));
                }
            }
        }

    }

    public static class NetheritePlatedNightVisionRegalia extends NightVisionRegaliaItem {
        public NetheritePlatedNightVisionRegalia(Settings settings) {
            super(settings);
        }

        @Override
        public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
            if (user.getOffHandStack().isOf(this.getDefaultStack().getItem())
                || user.getMainHandStack().isOf(this.getDefaultStack().getItem())) {
                user.getOffHandStack().decrement(1);

                user.giveItemStack(new ItemStack(ItemInit.REGALIA_PLATED, 1));
                user.giveItemStack(new ItemStack(ItemInit.GOLDEN_RELIC, 1));


                return TypedActionResult.pass(user.getOffHandStack());
            } else {
                return TypedActionResult.fail(user.getOffHandStack());
            }
        }

        @Override
        public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
            if (entity instanceof PlayerEntity playerEntity) {
                if (playerEntity.getOffHandStack().isOf(this.getDefaultStack().getItem()) && (entity.age % 85) == 0) {
                    stack.damage(1, playerEntity, (player) -> player.sendToolBreakStatus(player.getActiveHand()));
                }
            }
        }

    }
}
