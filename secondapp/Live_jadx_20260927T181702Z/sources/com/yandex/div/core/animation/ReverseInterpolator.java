package com.yandex.div.core.animation;

import android.view.animation.Interpolator;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ReverseInterpolator implements Interpolator {

    @l
    private final Interpolator base;

    public ReverseInterpolator(@l Interpolator interpolator) {
        this.base = interpolator;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return this.base.getInterpolation(1.0f - f10);
    }
}
