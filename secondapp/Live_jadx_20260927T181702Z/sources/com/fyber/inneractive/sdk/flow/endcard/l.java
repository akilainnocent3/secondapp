package com.fyber.inneractive.sdk.flow.endcard;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public enum l {
    Default(1),
    Fmp(2),
    Companion(3);

    private final int mPriority;

    l(int i10) {
        this.mPriority = i10;
    }

    public final int a() {
        return this.mPriority;
    }
}
