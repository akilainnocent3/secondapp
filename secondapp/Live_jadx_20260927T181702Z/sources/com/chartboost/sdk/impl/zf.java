package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zf {
    public static final int a(float f10) {
        if (f10 == 0.0f) {
            return 0;
        }
        double d10 = f10;
        if (d10 < 0.25d) {
            return 1;
        }
        if (d10 < 0.5d) {
            return 2;
        }
        if (d10 < 0.75d) {
            return 3;
        }
        return f10 < 1.0f ? 4 : 5;
    }
}
