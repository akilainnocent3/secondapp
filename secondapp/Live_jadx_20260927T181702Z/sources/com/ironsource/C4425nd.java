package com.ironsource;

import com.unity3d.mediation.LevelPlay;

/* JADX INFO: renamed from: com.ironsource.nd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4425nd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final String f63168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final LevelPlay.AdFormat f63169b;

    public C4425nd(@oy.l String placementName, @oy.l LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.m0.p(placementName, "placementName");
        kotlin.jvm.internal.m0.p(adFormat, "adFormat");
        this.f63168a = placementName;
        this.f63169b = adFormat;
    }

    @oy.l
    public final String a() {
        return this.f63168a + lk.e.f104695m + this.f63169b;
    }
}
