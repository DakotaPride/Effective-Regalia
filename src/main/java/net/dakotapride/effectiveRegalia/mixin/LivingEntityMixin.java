package net.dakotapride.effectiveRegalia.mixin;

import net.dakotapride.effectiveRegalia.common.item.*;
import net.dakotapride.effectiveRegalia.common.item.base.*;
import net.dakotapride.effectiveRegalia.common.register.Constants;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.dakotapride.effectiveRegalia.common.item.RegenerationRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.StrengthRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.NightVisionRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.SaturationRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.JumpBoostRegaliaItem.*;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity implements Constants {
    LivingEntity livingEntity = (LivingEntity) (Object) this;

    public LivingEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Inject(method = "hasStatusEffect", at = @At("HEAD"))
    private void hasStatusEffect(StatusEffect effect, CallbackInfoReturnable<Boolean> cir) {
        RegaliaItem.effect = effect;
        if (livingEntity instanceof PlayerEntity playerEntity) {
            Item getItem = playerEntity.getOffHandStack().getItem();
            ItemStack stack = playerEntity.getOffHandStack();

            if (getItem instanceof StrengthRegaliaItem) {
                playerEntity.addStatusEffect(new StatusEffectInstance
                        (StatusEffects.STRENGTH, 200, 0));
            } else if (getItem instanceof NightVisionRegaliaItem) {
                playerEntity.addStatusEffect(new StatusEffectInstance
                        (StatusEffects.NIGHT_VISION, 200, 0));
            } else if (getItem instanceof RegenerationRegaliaItem) {
                playerEntity.addStatusEffect(new StatusEffectInstance
                        (StatusEffects.REGENERATION, 200, 0));
            } else if (getItem instanceof SaturationRegaliaItem) {
                playerEntity.addStatusEffect(new StatusEffectInstance
                        (StatusEffects.SATURATION, 200, 0));
            } else if (getItem instanceof JumpBoostRegaliaItem) {
                playerEntity.addStatusEffect(new StatusEffectInstance
                        (StatusEffects.JUMP_BOOST, 200, 0));
            }

            if (getItem instanceof GoldenStrengthRegalia) {
                playerEntity.addStatusEffect(new StatusEffectInstance
                        (StatusEffects.STRENGTH, 200, 1));
            } else if (getItem instanceof GoldenNightVisionRegalia) {
                playerEntity.addStatusEffect(new StatusEffectInstance
                        (StatusEffects.NIGHT_VISION, 200, 1));
            } else if (getItem instanceof GoldenRegenerationRegalia) {
                playerEntity.addStatusEffect(new StatusEffectInstance
                        (StatusEffects.REGENERATION, 200, 1));
            } else if (getItem instanceof GoldenSaturationRegalia) {
                playerEntity.addStatusEffect(new StatusEffectInstance
                        (StatusEffects.SATURATION, 200, 1));
            } else if (getItem instanceof GoldenJumpBoostRegalia) {
                playerEntity.addStatusEffect(new StatusEffectInstance
                        (StatusEffects.JUMP_BOOST, 200, 1));
            }

            if (getItem instanceof NetheritePlatedStrengthRegalia) {
                playerEntity.addStatusEffect(new StatusEffectInstance
                        (StatusEffects.STRENGTH, 200, 2));
            } else if (getItem instanceof NetheritePlatedNightVisionRegalia) {
                playerEntity.addStatusEffect(new StatusEffectInstance
                        (StatusEffects.NIGHT_VISION, 200, 2));
            } else if (getItem instanceof NetheritePlatedRegenerationRegalia) {
                playerEntity.addStatusEffect(new StatusEffectInstance
                        (StatusEffects.REGENERATION, 200, 2));
            } else if (getItem instanceof NetheritePlatedSaturationRegalia) {
                playerEntity.addStatusEffect(new StatusEffectInstance
                        (StatusEffects.SATURATION, 200, 2));
            } else if (getItem instanceof NetheritePlatedJumpBoostRegalia) {
                playerEntity.addStatusEffect(new StatusEffectInstance
                        (StatusEffects.JUMP_BOOST, 200, 2));
            }
        }
    }

}
