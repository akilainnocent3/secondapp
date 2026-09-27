package cg;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class i implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final af.e f23113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23114c;

    public i(af.e eVar, long j10) {
        this.f23113b = eVar;
        this.f23114c = j10;
    }

    @Override // cg.g
    public long a(long j10, long j11) {
        return this.f23113b.f4904g[(int) j10];
    }

    @Override // cg.g
    public long b(long j10, long j11) {
        return 0L;
    }

    @Override // cg.g
    public long c(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // cg.g
    public long d(long j10, long j11) {
        return this.f23113b.b(j10 + this.f23114c);
    }

    @Override // cg.g
    public long e(long j10) {
        return this.f23113b.f4901d;
    }

    @Override // cg.g
    public long f() {
        return 0L;
    }

    @Override // cg.g
    public dg.i g(long j10) {
        af.e eVar = this.f23113b;
        int i10 = (int) j10;
        return new dg.i(null, eVar.f4903f[i10], eVar.f4902e[i10]);
    }

    @Override // cg.g
    public long getTimeUs(long j10) {
        return this.f23113b.f4905h[(int) j10] - this.f23114c;
    }

    @Override // cg.g
    public boolean h() {
        return true;
    }

    @Override // cg.g
    public long i(long j10, long j11) {
        return this.f23113b.f4901d;
    }
}
