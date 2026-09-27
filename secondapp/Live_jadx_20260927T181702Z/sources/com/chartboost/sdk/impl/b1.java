package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b1 {
    public static final String b(int i10) {
        if (i10 == 1) {
            return "STATE_IDLE";
        }
        if (i10 == 2) {
            return "STATE_BUFFERING";
        }
        if (i10 != 3) {
            return i10 != 4 ? "UNKNOWN" : "STATE_ENDED";
        }
        return "STATE_READY";
    }
}
