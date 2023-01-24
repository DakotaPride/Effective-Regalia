package net.dakotapride.effectiveRegalia.mixin;

import net.dakotapride.effectiveRegalia.common.item.effect.*;
import net.dakotapride.effectiveRegalia.common.item.effect.JumpBoostRegaliaItem.GoldenJumpBoostRegalia;
import net.dakotapride.effectiveRegalia.common.item.effect.JumpBoostRegaliaItem.NetheritePlatedJumpBoostRegalia;
import net.dakotapride.effectiveRegalia.common.item.effect.NightVisionRegaliaItem.GoldenNightVisionRegalia;
import net.dakotapride.effectiveRegalia.common.item.effect.NightVisionRegaliaItem.NetheritePlatedNightVisionRegalia;
import net.dakotapride.effectiveRegalia.common.item.effect.RegenerationRegaliaItem.GoldenRegenerationRegalia;
import net.dakotapride.effectiveRegalia.common.item.effect.RegenerationRegaliaItem.NetheritePlatedRegenerationRegalia;
import net.dakotapride.effectiveRegalia.common.item.effect.SaturationRegaliaItem.GoldenSaturationRegalia;
import net.dakotapride.effectiveRegalia.common.item.effect.SaturationRegaliaItem.NetheritePlatedSaturationRegalia;
import net.dakotapride.effectiveRegalia.common.item.effect.SlowFallingRegaliaItem.GoldenSlowFallingRegalia;
import net.dakotapride.effectiveRegalia.common.item.effect.SlowFallingRegaliaItem.NetheritePlatedSlowFallingRegalia;
import net.dakotapride.effectiveRegalia.common.item.effect.StrengthRegaliaItem.GoldenStrengthRegalia;
import net.dakotapride.effectiveRegalia.common.item.effect.StrengthRegaliaItem.NetheritePlatedStrengthRegalia;
import net.dakotapride.effectiveRegalia.common.register.Constants;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity implements Constants {
    LivingEntity livingEntity = (LivingEntity) (Object) this;

    public LivingEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Inject(method = "hasStatusEffect", at = @At("HEAD"))
    private void hasStatusEffect(StatusEffect effect, CallbackInfoReturnable<Boolean> cir) {
        if (livingEntity instanceof PlayerEntity playerEntity) {
            Item getItem = playerEntity.getOffHandStack().getItem();

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
            } else if (getItem instanceof SlowFallingRegaliaItem) {
                playerEntity.addStatusEffect(new StatusEffectInstance
                        (StatusEffects.SLOW_FALLING, 200, 0));
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
            } else if (getItem instanceof GoldenSlowFallingRegalia) {
                playerEntity.addStatusEffect(new StatusEffectInstance
                        (StatusEffects.SLOW_FALLING, 200, 1));
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
            } else if (getItem instanceof NetheritePlatedSlowFallingRegalia) {
                playerEntity.addStatusEffect(new StatusEffectInstance
                        (StatusEffects.SLOW_FALLING, 200, 2));
            }
        }
    }

}
