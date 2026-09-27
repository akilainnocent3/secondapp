package g5;

import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class j implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f6.h f86037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f86038c;

    public j(f6.h hVar, long j10) {
        this.f86037b = hVar;
        this.f86038c = j10;
    }

    @Override // g5.h
    public long a(long j10, long j11) {
        return this.f86037b.f83485d[(int) j10];
    }

    @Override // g5.h
    public long b(long j10, long j11) {
        return 0L;
    }

    @Override // g5.h
    public long c(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // g5.h
    public long d(long j10, long j11) {
        return this.f86037b.b(j10 + this.f86038c);
    }

    @Override // g5.h
    public long e(long j10) {
        return this.f86037b.f83482a;
    }

    @Override // g5.h
    public long f() {
        return 0L;
    }

    @Override // g5.h
    public h5.i g(long j10) {
        f6.h hVar = this.f86037b;
        int i10 = (int) j10;
        return new h5.i(null, hVar.f83484c[i10], hVar.f83483b[i10]);
    }

    @Override // g5.h
    public long getTimeUs(long j10) {
        return this.f86037b.f83486e[(int) j10] - this.f86038c;
    }

    @Override // g5.h
    public boolean h() {
        return true;
    }

    @Override // g5.h
    public long i(long j10, long j11) {
        return this.f86037b.f83482a;
    }
}
