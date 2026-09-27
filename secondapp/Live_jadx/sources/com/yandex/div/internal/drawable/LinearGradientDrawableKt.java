package com.yandex.div.internal.drawable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class LinearGradientDrawableKt {
    private static final float snap(float f10, float f11, float f12) {
        return Math.abs(f11 - f10) <= f12 ? f11 : f10;
    }

    public static /* synthetic */ float snap$default(float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f12 = 1.0E-4f;
        }
        return snap(f10, f11, f12);
    }
}
