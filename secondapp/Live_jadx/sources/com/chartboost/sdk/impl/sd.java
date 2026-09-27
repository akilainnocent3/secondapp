package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public enum sd {
    UNKNOWN(0, "Unknown"),
    ETHERNET(1, "Ethernet"),
    WIFI(2, "WIFI"),
    CELLULAR_UNKNOWN(3, "Cellular_Unknown"),
    CELLULAR_2G(4, "Cellular_2G"),
    CELLULAR_3G(5, "Cellular_3G"),
    CELLULAR_4G(6, "Cellular_4G"),
    CELLULAR_5G(7, "Cellular_5G");


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ sr.a f40896m = sr.c.c(a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40898c;

    sd(int i10, String str) {
        this.f40897b = i10;
        this.f40898c = str;
    }

    public final String b() {
        return this.f40898c;
    }

    public final int c() {
        return this.f40897b;
    }
}
