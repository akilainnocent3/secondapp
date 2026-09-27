package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class xv0 implements p92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bw0 f158005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0 f158006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f158007c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f158008d = -1;

    public xv0(bw0 bw0Var, aw0 aw0Var) {
        this.f158005a = bw0Var;
        this.f158006b = aw0Var;
    }

    @Override // yads.p92
    public final vw2 a() {
        long j10 = this.f158007c;
        if (j10 != -1) {
            return new zv0(this.f158005a, j10);
        }
        throw new IllegalStateException();
    }

    @Override // yads.p92
    public final long a(ld0 ld0Var) {
        long j10 = this.f158008d;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.f158008d = -1L;
        return j11;
    }

    @Override // yads.p92
    public final void a(long j10) {
        long[] jArr = this.f158006b.f146943a;
        this.f158008d = jArr[ib3.b(jArr, j10, true)];
    }
}
