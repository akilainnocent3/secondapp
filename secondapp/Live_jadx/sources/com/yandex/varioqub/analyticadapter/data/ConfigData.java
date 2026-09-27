package com.yandex.varioqub.analyticadapter.data;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class ConfigData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f77033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f77034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f77035c;

    public ConfigData(@l String str, @l String str2, long j10) {
        this.f77033a = str;
        this.f77034b = str2;
        this.f77035c = j10;
    }

    public final long getConfigLoadTimestamp() {
        return this.f77035c;
    }

    @l
    public final String getNewConfigVersion() {
        return this.f77034b;
    }

    @l
    public final String getOldConfigVersion() {
        return this.f77033a;
    }
}
