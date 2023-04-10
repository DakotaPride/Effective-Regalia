package net.dakotapride.effectiveRegalia.common;

import net.dakotapride.effectiveRegalia.common.register.ItemInit;
import net.fabricmc.api.ModInitializer;

public class EffectiveRegalia implements ModInitializer {

    @Override
    public void onInitialize() {

        ItemInit.registerRegaliaItems();

    }
}
