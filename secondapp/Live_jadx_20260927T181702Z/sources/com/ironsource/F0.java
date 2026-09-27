package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final EnumC4282ff f58925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final String f58926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    private final String f58927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    private final W7 f58928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    private final String f58929e;

    public F0(@oy.l EnumC4282ff recordType, @oy.l String advertiserBundleId, @oy.l String networkInstanceId, @oy.l W7 adProvider, @oy.l String adInstanceId) {
        kotlin.jvm.internal.m0.p(recordType, "recordType");
        kotlin.jvm.internal.m0.p(advertiserBundleId, "advertiserBundleId");
        kotlin.jvm.internal.m0.p(networkInstanceId, "networkInstanceId");
        kotlin.jvm.internal.m0.p(adProvider, "adProvider");
        kotlin.jvm.internal.m0.p(adInstanceId, "adInstanceId");
        this.f58925a = recordType;
        this.f58926b = advertiserBundleId;
        this.f58927c = networkInstanceId;
        this.f58928d = adProvider;
        this.f58929e = adInstanceId;
    }

    @oy.l
    public final String a() {
        return this.f58929e;
    }

    @oy.l
    public final W7 b() {
        return this.f58928d;
    }

    @oy.l
    public final String c() {
        return this.f58926b;
    }

    @oy.l
    public final String d() {
        return this.f58927c;
    }

    @oy.l
    public final EnumC4282ff e() {
        return this.f58925a;
    }

    @oy.l
    public final C4493rc a(@oy.l Kb<F0, C4493rc> mapper) {
        kotlin.jvm.internal.m0.p(mapper, "mapper");
        return mapper.a(this);
    }
}
