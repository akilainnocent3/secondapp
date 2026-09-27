package com.ironsource;

import com.ironsource.sdk.utils.SDKUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class U7 {
    @oy.l
    public final String a() {
        String OMID_LIB_VERSION = Gc.f59081f;
        kotlin.jvm.internal.m0.o(OMID_LIB_VERSION, "OMID_LIB_VERSION");
        return OMID_LIB_VERSION;
    }

    @oy.l
    public final String b() {
        return Gc.f59080e;
    }

    @oy.l
    public final String c() {
        String sDKVersion = SDKUtils.getSDKVersion();
        kotlin.jvm.internal.m0.o(sDKVersion, "getSDKVersion()");
        return sDKVersion;
    }
}
