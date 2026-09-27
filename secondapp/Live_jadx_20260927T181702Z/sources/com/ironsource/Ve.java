package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Ve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private We f60246a;

    public Ve(@oy.l JSONObject config) {
        kotlin.jvm.internal.m0.p(config, "config");
        this.f60246a = We.f60279b.a(config.optInt(C4235d4.a.f61301t, We.CurrentlyLoadedAds.b()));
    }

    @oy.l
    public final We a() {
        return this.f60246a;
    }
}
