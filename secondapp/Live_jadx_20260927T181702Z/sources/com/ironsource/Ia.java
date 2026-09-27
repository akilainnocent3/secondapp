package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Ia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f59276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f59277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f59278c;

    public Ia(long j10, long j11, boolean z10) {
        this.f59276a = j10;
        this.f59277b = j11;
        this.f59278c = z10;
    }

    public final long a() {
        return this.f59276a;
    }

    public final long b() {
        return this.f59277b;
    }

    public final boolean c() {
        return this.f59278c;
    }

    public final long d() {
        return this.f59276a;
    }

    public final long e() {
        return this.f59277b;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ia)) {
            return false;
        }
        Ia ia2 = (Ia) obj;
        return this.f59276a == ia2.f59276a && this.f59277b == ia2.f59277b && this.f59278c == ia2.f59278c;
    }

    public final boolean f() {
        return this.f59278c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iA = ((f0.p.a(this.f59276a) * 31) + f0.p.a(this.f59277b)) * 31;
        boolean z10 = this.f59278c;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iA + r10;
    }

    @oy.l
    public String toString() {
        return "LevelPlayBannerReloadAdUnitStrategyConfig(refreshInterval=" + this.f59276a + ", visibilityCheckerInterval=" + this.f59277b + ", isAutoRefreshEnabled=" + this.f59278c + gi.j.f86771d;
    }

    @oy.l
    public final Ia a(long j10, long j11, boolean z10) {
        return new Ia(j10, j11, z10);
    }

    public static /* synthetic */ Ia a(Ia ia2, long j10, long j11, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = ia2.f59276a;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = ia2.f59277b;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            z10 = ia2.f59278c;
        }
        return ia2.a(j12, j13, z10);
    }
}
