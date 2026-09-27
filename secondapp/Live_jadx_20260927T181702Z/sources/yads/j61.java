package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class j61 implements zw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f150944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kh1 f150945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kh1 f150946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f150947d;

    public j61(long j10, long j11, long j12) {
        this.f150947d = j10;
        this.f150944a = j12;
        kh1 kh1Var = new kh1();
        this.f150945b = kh1Var;
        kh1 kh1Var2 = new kh1();
        this.f150946c = kh1Var2;
        kh1Var.a(0L);
        kh1Var2.a(j11);
    }

    @Override // yads.zw2
    public final long a() {
        return this.f150944a;
    }

    @Override // yads.vw2
    public final boolean b() {
        return true;
    }

    @Override // yads.vw2
    public final long c() {
        return this.f150947d;
    }

    @Override // yads.zw2
    public final long a(long j10) {
        return this.f150945b.a(ib3.a(this.f150946c, j10));
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        int iA = ib3.a(this.f150945b, j10);
        long jA = this.f150945b.a(iA);
        xw2 xw2Var = new xw2(jA, this.f150946c.a(iA));
        if (jA != j10) {
            kh1 kh1Var = this.f150945b;
            if (iA != kh1Var.f151538a - 1) {
                int i10 = iA + 1;
                return new tw2(xw2Var, new xw2(kh1Var.a(i10), this.f150946c.a(i10)));
            }
        }
        return new tw2(xw2Var, xw2Var);
    }

    public final boolean c(long j10) {
        kh1 kh1Var = this.f150945b;
        return j10 - kh1Var.a(kh1Var.f151538a - 1) < 100000;
    }
}
