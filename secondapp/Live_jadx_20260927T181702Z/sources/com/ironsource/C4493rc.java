package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.rc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4493rc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final EnumC4282ff f63478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final String f63479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    private final W7 f63480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    private final String f63481d;

    public C4493rc(@oy.l EnumC4282ff recordType, @oy.l String advertiserBundleId, @oy.l W7 adProvider, @oy.l String adInstanceId) {
        kotlin.jvm.internal.m0.p(recordType, "recordType");
        kotlin.jvm.internal.m0.p(advertiserBundleId, "advertiserBundleId");
        kotlin.jvm.internal.m0.p(adProvider, "adProvider");
        kotlin.jvm.internal.m0.p(adInstanceId, "adInstanceId");
        this.f63478a = recordType;
        this.f63479b = advertiserBundleId;
        this.f63480c = adProvider;
        this.f63481d = adInstanceId;
    }

    @oy.l
    public final String a() {
        return this.f63481d;
    }

    @oy.l
    public final W7 b() {
        return this.f63480c;
    }

    @oy.l
    public final String c() {
        return this.f63479b;
    }

    @oy.l
    public final EnumC4282ff d() {
        return this.f63478a;
    }

    @oy.l
    public final C4286g1 a(@oy.l Kb<C4493rc, C4286g1> mapper) {
        kotlin.jvm.internal.m0.p(mapper, "mapper");
        return mapper.a(this);
    }
}
