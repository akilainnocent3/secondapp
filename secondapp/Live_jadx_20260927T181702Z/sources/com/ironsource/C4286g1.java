package com.ironsource;

import java.util.Calendar;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.g1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4286g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final EnumC4282ff f61842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final W7 f61843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    private final String f61844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f61845d;

    public C4286g1(@oy.l EnumC4282ff recordType, @oy.l W7 adProvider, @oy.l String adInstanceId) {
        kotlin.jvm.internal.m0.p(recordType, "recordType");
        kotlin.jvm.internal.m0.p(adProvider, "adProvider");
        kotlin.jvm.internal.m0.p(adInstanceId, "adInstanceId");
        this.f61842a = recordType;
        this.f61843b = adProvider;
        this.f61844c = adInstanceId;
        this.f61845d = Calendar.getInstance().getTimeInMillis() / ((long) 1000);
    }

    @oy.l
    public final String a() {
        return this.f61844c;
    }

    @oy.l
    public final W7 b() {
        return this.f61843b;
    }

    @oy.l
    public final Map<String, Object> c() {
        return fr.n1.W(dr.v1.a(C4593xa.f64437c, Integer.valueOf(this.f61843b.b())), dr.v1.a("ts", String.valueOf(this.f61845d)));
    }

    @oy.l
    public final Map<String, Object> d() {
        return fr.n1.W(dr.v1.a(C4593xa.f64436b, this.f61844c), dr.v1.a(C4593xa.f64437c, Integer.valueOf(this.f61843b.b())), dr.v1.a("ts", String.valueOf(this.f61845d)), dr.v1.a("rt", Integer.valueOf(this.f61842a.ordinal())));
    }

    @oy.l
    public final EnumC4282ff e() {
        return this.f61842a;
    }

    public final long f() {
        return this.f61845d;
    }
}
