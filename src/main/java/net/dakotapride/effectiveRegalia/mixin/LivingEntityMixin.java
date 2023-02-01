package net.dakotapride.effectiveRegalia.mixin;

import net.dakotapride.effectiveRegalia.common.item.effect.*;
import net.dakotapride.effectiveRegalia.common.item.effect.JumpBoostRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.effect.NightVisionRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.effect.RegenerationRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.effect.SaturationRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.effect.SlowFallingRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.effect.StrengthRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.immune.HungerImmuneRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.immune.PoisonImmuneRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.immune.FireImmuneRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.immune.BlindnessImmuneRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.immune.MiningFatigueImmuneRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.immune.WeaknessImmuneRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.immune.FireImmuneRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.immune.WitherImmuneRegaliaItem.*;
import net.dakotapride.effectiveRegalia.common.item.immune.*;
import net.dakotapride.effectiveRegalia.common.register.Constants;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
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

    @Inject(method = "damage", at = @At("HEAD"), cancellable = true)
    private void damage(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        if (livingEntity instanceof PlayerEntity playerEntity) {
            Item getItem = playerEntity.getOffHandStack().getItem();

            if (source.isFire() && getItem instanceof FireImmuneRegaliaItem) {
                cir.setReturnValue(false);
            } else if (source.isFire() && getItem instanceof GoldenFireImmuneRegalia) {
                cir.setReturnValue(false);
            } else if (source.isFire() && getItem instanceof NetheritePlatedFireImmuneRegalia) {
                cir.setReturnValue(false);
            }
        }
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
            } else if (getItem instanceof HungerImmuneRegaliaItem) {
                playerEntity.removeStatusEffect(StatusEffects.HUNGER);
            } else if (getItem instanceof BlindnessImmuneRegaliaItem) {
                playerEntity.removeStatusEffect(StatusEffects.BLINDNESS);
            } else if (getItem instanceof MiningFatigueImmuneRegaliaItem) {
                playerEntity.removeStatusEffect(StatusEffects.MINING_FATIGUE);
            } else if (getItem instanceof PoisonImmuneRegaliaItem) {
                playerEntity.removeStatusEffect(StatusEffects.POISON);
            } else if (getItem instanceof WeaknessImmuneRegaliaItem) {
                playerEntity.removeStatusEffect(StatusEffects.WEAKNESS);
            } else if (getItem instanceof WitherImmuneRegaliaItem) {
                playerEntity.removeStatusEffect(StatusEffects.WITHER);
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
            } else if (getItem instanceof GoldenHungerImmuneRegalia) {
                playerEntity.removeStatusEffect(StatusEffects.HUNGER);
            } else if (getItem instanceof GoldenBlindnessImmuneRegalia) {
                playerEntity.removeStatusEffect(StatusEffects.BLINDNESS);
            } else if (getItem instanceof GoldenMiningFatigueImmuneRegalia) {
                playerEntity.removeStatusEffect(StatusEffects.MINING_FATIGUE);
            } else if (getItem instanceof GoldenPoisonImmuneRegalia) {
                playerEntity.removeStatusEffect(StatusEffects.POISON);
            } else if (getItem instanceof GoldenWeaknessImmuneRegalia) {
                playerEntity.removeStatusEffect(StatusEffects.WEAKNESS);
            } else if (getItem instanceof GoldenWitherImmuneRegalia) {
                playerEntity.removeStatusEffect(StatusEffects.WITHER);
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
            } else if (getItem instanceof NetheritePlatedHungerImmuneRegalia) {
                playerEntity.removeStatusEffect(StatusEffects.HUNGER);
            } else if (getItem instanceof NetheritePlatedBlindnessImmuneRegalia) {
                playerEntity.removeStatusEffect(StatusEffects.BLINDNESS);
            } else if (getItem instanceof NetheritePlatedMiningFatigueImmuneRegalia) {
                playerEntity.removeStatusEffect(StatusEffects.MINING_FATIGUE);
            } else if (getItem instanceof NetheritePlatedPoisonImmuneRegalia) {
                playerEntity.removeStatusEffect(StatusEffects.POISON);
            } else if (getItem instanceof NetheritePlatedWeaknessImmuneRegalia) {
                playerEntity.removeStatusEffect(StatusEffects.WEAKNESS);
            } else if (getItem instanceof NetheritePlatedWitherImmuneRegalia) {
                playerEntity.removeStatusEffect(StatusEffects.WITHER);
            }
        }
    }

}
