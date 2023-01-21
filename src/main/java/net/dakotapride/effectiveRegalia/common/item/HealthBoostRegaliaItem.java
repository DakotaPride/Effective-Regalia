package net.dakotapride.effectiveRegalia.common.item;

import net.dakotapride.effectiveRegalia.common.item.base.RegaliaItem;

public class HealthBoostRegaliaItem extends RegaliaItem {
    public HealthBoostRegaliaItem(Settings settings) {
        super(settings);
    }

    @Override
    public void getRegaliaEffect() {
        effect = healthBoost;
    }
}
