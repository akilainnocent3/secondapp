package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.s1({"SMAP\nCappingFeature.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CappingFeature.kt\ncom/unity3d/sdk/internal/init/response/configurations/features/CappingFeature\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,19:1\n1#2:20\n*E\n"})
public final class I3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    private final Boolean f59230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    private final Integer f59231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    private final N3 f59232c;

    public I3(@oy.l JSONObject features) {
        kotlin.jvm.internal.m0.p(features, "features");
        this.f59230a = features.has("enabled") ? Boolean.valueOf(features.getBoolean("enabled")) : null;
        this.f59231b = features.has("maxImpressions") ? Integer.valueOf(features.getInt("maxImpressions")) : null;
        this.f59232c = features.has("unit") ? N3.f59520c.a(features.optString("unit")) : null;
    }

    @oy.m
    public final Boolean a() {
        return this.f59230a;
    }

    @oy.m
    public final Integer b() {
        return this.f59231b;
    }

    @oy.m
    public final N3 c() {
        return this.f59232c;
    }
}
