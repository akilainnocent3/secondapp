package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class k30 implements i30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hu f151371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f151372b;

    public k30(hu huVar, long j10) {
        this.f151371a = huVar;
        this.f151372b = j10;
    }

    @Override // yads.i30
    public final boolean a() {
        return true;
    }

    @Override // yads.i30
    public final long b() {
        return 0L;
    }

    @Override // yads.i30
    public final long c(long j10, long j11) {
        return 0L;
    }

    @Override // yads.i30
    public final long d(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // yads.i30
    public final long e(long j10, long j11) {
        return this.f151371a.f150299a;
    }

    @Override // yads.i30
    public final long a(long j10, long j11) {
        return ib3.b(this.f151371a.f150303e, j10 + this.f151372b, true);
    }

    @Override // yads.i30
    public final long b(long j10, long j11) {
        return this.f151371a.f150302d[(int) j10];
    }

    @Override // yads.i30
    public final long c(long j10) {
        return this.f151371a.f150299a;
    }

    @Override // yads.i30
    public final pl2 b(long j10) {
        hu huVar = this.f151371a;
        int i10 = (int) j10;
        return new pl2(null, huVar.f150301c[i10], huVar.f150300b[i10]);
    }

    @Override // yads.i30
    public final long a(long j10) {
        return this.f151371a.f150303e[(int) j10] - this.f151372b;
    }
}
