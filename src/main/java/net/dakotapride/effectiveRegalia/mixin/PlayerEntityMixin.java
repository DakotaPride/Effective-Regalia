package net.dakotapride.effectiveRegalia.mixin;

import net.dakotapride.effectiveRegalia.common.register.ItemInit;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity {
    PlayerEntity player = (PlayerEntity) (Object) this;

    protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "tick()V", at = @At("HEAD"))
    private void tick(CallbackInfo ci) {
        if (!player.hasStatusEffect(StatusEffects.STRENGTH)) {
            if (player.getOffHandStack().isOf(ItemInit.REGALIA_STRENGTH)) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 100, 0));
            }
        }
    }

}
