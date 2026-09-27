package x4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class p implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f144407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f144408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f144409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f144410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f144411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f144412f;

    public p(@k.e0(from = 1) long j10, @k.w(from = 0.0d, fromInclusive = false) float f10) {
        this(0L, j10, f10);
    }

    @Override // x4.j1
    public long a() {
        int i10 = this.f144409c;
        if (i10 == 0) {
            return -9223372036854775807L;
        }
        return d(i10 - 1);
    }

    @Override // x4.j1
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public p b() {
        return new p(this.f144410d, this.f144411e, this.f144407a);
    }

    public final long d(int i10) {
        long jRound = this.f144410d + Math.round(this.f144408b * ((double) i10));
        zi.l0.g0(jRound >= 0);
        return jRound;
    }

    @Override // x4.j1
    public boolean hasNext() {
        return this.f144412f < this.f144409c;
    }

    @Override // x4.j1
    public long next() {
        zi.l0.g0(hasNext());
        int i10 = this.f144412f;
        this.f144412f = i10 + 1;
        return d(i10);
    }

    public p(@k.e0(from = 0) long j10, @k.e0(from = 1) long j11, @k.w(from = 0.0d, fromInclusive = false) float f10) {
        boolean z10 = false;
        zi.l0.d(j11 > 0);
        zi.l0.d(f10 > 0.0f);
        if (0 <= j10 && j10 < j11) {
            z10 = true;
        }
        zi.l0.d(z10);
        this.f144410d = j10;
        this.f144411e = j11;
        this.f144407a = f10;
        this.f144409c = Math.max(Math.round(((j11 - j10) / 1000000.0f) * f10), 1);
        this.f144408b = 1000000.0f / f10;
    }
}
