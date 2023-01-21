package net.dakotapride.effectiveRegalia.common.item;

import net.dakotapride.effectiveRegalia.common.item.base.RegaliaItem;

public class NightVisionRegaliaItem extends RegaliaItem {
    public NightVisionRegaliaItem(Settings settings) {
        super(settings);
    }

    @Override
    public void getRegaliaEffect() {
        effect = nightVision;
    }
}
