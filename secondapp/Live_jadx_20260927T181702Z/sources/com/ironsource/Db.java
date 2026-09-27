package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Db {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final EnumC4457p9 f58772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final String f58773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f58774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f58775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f58776e;

    public Db(@oy.l EnumC4457p9 instanceType, @oy.l String adSourceNameForEvents, long j10, boolean z10, boolean z11) {
        kotlin.jvm.internal.m0.p(instanceType, "instanceType");
        kotlin.jvm.internal.m0.p(adSourceNameForEvents, "adSourceNameForEvents");
        this.f58772a = instanceType;
        this.f58773b = adSourceNameForEvents;
        this.f58774c = j10;
        this.f58775d = z10;
        this.f58776e = z11;
    }

    @oy.l
    public final EnumC4457p9 a() {
        return this.f58772a;
    }

    @oy.l
    public final String b() {
        return this.f58773b;
    }

    public final long c() {
        return this.f58774c;
    }

    public final boolean d() {
        return this.f58775d;
    }

    public final boolean e() {
        return this.f58776e;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Db)) {
            return false;
        }
        Db db2 = (Db) obj;
        return this.f58772a == db2.f58772a && kotlin.jvm.internal.m0.g(this.f58773b, db2.f58773b) && this.f58774c == db2.f58774c && this.f58775d == db2.f58775d && this.f58776e == db2.f58776e;
    }

    @oy.l
    public final String f() {
        return this.f58773b;
    }

    @oy.l
    public final EnumC4457p9 g() {
        return this.f58772a;
    }

    public final long h() {
        return this.f58774c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((this.f58772a.hashCode() * 31) + this.f58773b.hashCode()) * 31) + f0.p.a(this.f58774c)) * 31;
        boolean z10 = this.f58775d;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode + r10) * 31;
        boolean z11 = this.f58776e;
        return i10 + (z11 ? 1 : z11);
    }

    public final boolean i() {
        return this.f58776e;
    }

    public final boolean j() {
        return this.f58775d;
    }

    @oy.l
    public String toString() {
        return "LoadTaskConfig(instanceType=" + this.f58772a + ", adSourceNameForEvents=" + this.f58773b + ", loadTimeoutInMills=" + this.f58774c + ", isOneFlow=" + this.f58775d + ", isMultipleAdObjects=" + this.f58776e + gi.j.f86771d;
    }

    @oy.l
    public final Db a(@oy.l EnumC4457p9 instanceType, @oy.l String adSourceNameForEvents, long j10, boolean z10, boolean z11) {
        kotlin.jvm.internal.m0.p(instanceType, "instanceType");
        kotlin.jvm.internal.m0.p(adSourceNameForEvents, "adSourceNameForEvents");
        return new Db(instanceType, adSourceNameForEvents, j10, z10, z11);
    }

    public static /* synthetic */ Db a(Db db2, EnumC4457p9 enumC4457p9, String str, long j10, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC4457p9 = db2.f58772a;
        }
        if ((i10 & 2) != 0) {
            str = db2.f58773b;
        }
        if ((i10 & 4) != 0) {
            j10 = db2.f58774c;
        }
        if ((i10 & 8) != 0) {
            z10 = db2.f58775d;
        }
        if ((i10 & 16) != 0) {
            z11 = db2.f58776e;
        }
        long j11 = j10;
        return db2.a(enumC4457p9, str, j11, z10, z11);
    }

    public /* synthetic */ Db(EnumC4457p9 enumC4457p9, String str, long j10, boolean z10, boolean z11, int i10, kotlin.jvm.internal.x xVar) {
        this(enumC4457p9, str, j10, z10, (i10 & 16) != 0 ? true : z11);
    }
}
