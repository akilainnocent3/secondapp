package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ad, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.s1({"SMAP\nPacingFeature.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PacingFeature.kt\ncom/unity3d/sdk/internal/init/response/configurations/features/PacingFeature\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,16:1\n1#2:17\n*E\n"})
public final class C4190ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    private final Boolean f60592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    private final Integer f60593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    private final N3 f60594c;

    public C4190ad(@oy.l JSONObject features) {
        kotlin.jvm.internal.m0.p(features, "features");
        this.f60592a = features.has("enabled") ? Boolean.valueOf(features.getBoolean("enabled")) : null;
        this.f60593b = features.has("numOfSeconds") ? Integer.valueOf(features.getInt("numOfSeconds")) : null;
        this.f60594c = N3.Second;
    }

    @oy.m
    public final Boolean a() {
        return this.f60592a;
    }

    @oy.m
    public final Integer b() {
        return this.f60593b;
    }

    @oy.l
    public final N3 c() {
        return this.f60594c;
    }
}
