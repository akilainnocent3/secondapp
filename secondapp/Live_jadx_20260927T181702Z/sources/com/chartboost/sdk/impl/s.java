package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public enum s {
    BANNER,
    INTERSTITIAL,
    REWARDED;


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ sr.a f40831f = sr.c.c(a());

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40832a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f40832a = iArr;
        }
    }

    public final boolean b() {
        return a.f40832a[ordinal()] == 1;
    }
}
