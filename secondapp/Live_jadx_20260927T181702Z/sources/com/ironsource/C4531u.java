package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4531u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final EnumC4282ff f64195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final String f64196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    private final String f64197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    private final String f64198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    private final W7 f64199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    private final String f64200f;

    public C4531u(@oy.l EnumC4282ff recordType, @oy.l String advertiserBundleId, @oy.l String networkInstanceId, @oy.l String adUnitId, @oy.l W7 adProvider, @oy.l String adInstanceId) {
        kotlin.jvm.internal.m0.p(recordType, "recordType");
        kotlin.jvm.internal.m0.p(advertiserBundleId, "advertiserBundleId");
        kotlin.jvm.internal.m0.p(networkInstanceId, "networkInstanceId");
        kotlin.jvm.internal.m0.p(adUnitId, "adUnitId");
        kotlin.jvm.internal.m0.p(adProvider, "adProvider");
        kotlin.jvm.internal.m0.p(adInstanceId, "adInstanceId");
        this.f64195a = recordType;
        this.f64196b = advertiserBundleId;
        this.f64197c = networkInstanceId;
        this.f64198d = adUnitId;
        this.f64199e = adProvider;
        this.f64200f = adInstanceId;
    }

    @oy.l
    public final String a() {
        return this.f64200f;
    }

    @oy.l
    public final W7 b() {
        return this.f64199e;
    }

    @oy.l
    public final String c() {
        return this.f64198d;
    }

    @oy.l
    public final String d() {
        return this.f64196b;
    }

    @oy.l
    public final String e() {
        return this.f64197c;
    }

    @oy.l
    public final EnumC4282ff f() {
        return this.f64195a;
    }

    @oy.l
    public final F0 a(@oy.l Kb<C4531u, F0> mapper) {
        kotlin.jvm.internal.m0.p(mapper, "mapper");
        return mapper.a(this);
    }
}
