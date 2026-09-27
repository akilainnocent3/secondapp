package com.unity3d.ads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@UnityAdsExperimental
public enum LogLevel {
    DISABLED(0),
    ERROR(1),
    INFO(2),
    DEBUG(3),
    TRACE(4);

    private final int level;

    LogLevel(int i10) {
        this.level = i10;
    }

    public final int getLevel$unity_ads_defaultRelease() {
        return this.level;
    }
}
