package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public enum Ed {
    CAN_RECOVER("Can recover"),
    NO_LOADED_ADS("No loaded ad"),
    MAX_ATTEMPTS_REACHED("Fail to show"),
    FEATURE_DISABLED("Recovery feature is disabled");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final String f58912a;

    Ed(String str) {
        this.f58912a = str;
    }

    @oy.l
    public final String b() {
        return this.f58912a;
    }
}
