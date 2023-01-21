package net.dakotapride.effectiveRegalia.common.item.base;

import net.dakotapride.effectiveRegalia.common.register.Constants;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class RegaliaItem extends Item implements Constants {
    public static StatusEffect effect;

    public RegaliaItem(Settings settings) {
        super(settings);
    }

    public void getRegaliaEffect() {}

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        return super.use(world, user, hand);
    }
}
