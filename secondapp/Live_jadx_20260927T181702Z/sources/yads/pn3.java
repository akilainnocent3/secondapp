package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class pn3 implements vw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mn3 f154004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f154005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f154006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f154007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f154008e;

    public pn3(mn3 mn3Var, int i10, long j10, long j11) {
        this.f154004a = mn3Var;
        this.f154005b = i10;
        this.f154006c = j10;
        long j12 = (j11 - j10) / ((long) mn3Var.f152573c);
        this.f154007d = j12;
        this.f154008e = c(j12);
    }

    @Override // yads.vw2
    public final boolean b() {
        return true;
    }

    public final long c(long j10) {
        return ib3.a(j10 * ((long) this.f154005b), 1000000L, this.f154004a.f152572b);
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        long j11 = (((long) this.f154004a.f152572b) * j10) / (((long) this.f154005b) * 1000000);
        long j12 = this.f154007d - 1;
        int i10 = ib3.f150516a;
        long jMax = Math.max(0L, Math.min(j11, j12));
        long j13 = (((long) this.f154004a.f152573c) * jMax) + this.f154006c;
        long jC = c(jMax);
        xw2 xw2Var = new xw2(jC, j13);
        if (jC >= j10 || jMax == this.f154007d - 1) {
            return new tw2(xw2Var, xw2Var);
        }
        long j14 = jMax + 1;
        return new tw2(xw2Var, new xw2(c(j14), (((long) this.f154004a.f152573c) * j14) + this.f154006c));
    }

    @Override // yads.vw2
    public final long c() {
        return this.f154008e;
    }
}
