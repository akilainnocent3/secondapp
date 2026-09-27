package com.unity3d.mediation;

import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class LevelPlayConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f76294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @m
    private final String f76295b;

    public LevelPlayConfiguration(boolean z10, @m String str) {
        this.f76294a = z10;
        this.f76295b = str;
    }

    @m
    public final String getAb() {
        return this.f76295b;
    }

    public final boolean isAdQualityEnabled() {
        return this.f76294a;
    }
}
