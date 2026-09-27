package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class jx2 implements as {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qj0 f151298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f151299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f151300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f151301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f151302e;

    public jx2(qj0 qj0Var, long j10, int i10, long j11, int i11) {
        this.f151298a = qj0Var;
        this.f151299b = j10;
        this.f151300c = i10;
        this.f151301d = j11;
        this.f151302e = i11;
    }

    @Override // yads.as
    public final void a(long j10, long j11, long j12) {
        float f10;
        long j13 = this.f151301d + j12;
        this.f151301d = j13;
        qj0 qj0Var = this.f151298a;
        long j14 = this.f151299b;
        if (j14 == -1 || j14 == 0) {
            int i10 = this.f151300c;
            f10 = i10 != 0 ? (this.f151302e * 100.0f) / i10 : -1.0f;
        } else {
            f10 = (j13 * 100.0f) / j14;
        }
        ((lj0) qj0Var).a(j14, j13, f10);
    }
}
