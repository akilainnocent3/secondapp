package com.ironsource.adqualitysdk.sdk.i;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class hu {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static hu f2403;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final hq f2405 = new hq();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final hz f2404 = new hz();

    private hu() {
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static synchronized hu m2304() {
        try {
            if (f2403 == null) {
                f2403 = new hu();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f2403;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized void m2305() {
        f2403 = null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final hz m2306() {
        return this.f2404;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final hq m2307() {
        return this.f2405;
    }
}
