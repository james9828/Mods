package com.example.nobreakdelay.mixin;

import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MultiPlayerGameMode.class)
public class NoBreakDelayMixin {

    @Shadow private int destroyDelay;

    @Inject(method = "tick", at = @At("HEAD"))
    private void removeDelay(CallbackInfo ci) {
        this.destroyDelay = 0;
    }
}