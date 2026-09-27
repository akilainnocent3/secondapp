package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class op3 implements zw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f153582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f153583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f153584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f153585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f153586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f153587f;

    public op3(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f153582a = j10;
        this.f153583b = i10;
        this.f153584c = j11;
        this.f153587f = jArr;
        this.f153585d = j12;
        this.f153586e = j12 != -1 ? j10 + j12 : -1L;
    }

    @Override // yads.zw2
    public final long a() {
        return this.f153586e;
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        if (!b()) {
            xw2 xw2Var = new xw2(0L, this.f153582a + ((long) this.f153583b));
            return new tw2(xw2Var, xw2Var);
        }
        long j11 = this.f153584c;
        int i10 = ib3.f150516a;
        long jMax = Math.max(0L, Math.min(j10, j11));
        double d10 = (jMax * 100.0d) / this.f153584c;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i11 = (int) d10;
                long[] jArr = this.f153587f;
                if (jArr == null) {
                    throw new IllegalStateException();
                }
                double d12 = jArr[i11];
                d11 = d12 + (((i11 == 99 ? 256.0d : jArr[i11 + 1]) - d12) * (d10 - ((double) i11)));
            }
        }
        xw2 xw2Var2 = new xw2(jMax, this.f153582a + Math.max(this.f153583b, Math.min(Math.round((d11 / 256.0d) * this.f153585d), this.f153585d - 1)));
        return new tw2(xw2Var2, xw2Var2);
    }

    @Override // yads.vw2
    public final long c() {
        return this.f153584c;
    }

    @Override // yads.zw2
    public final long a(long j10) {
        long j11 = j10 - this.f153582a;
        if (!b() || j11 <= this.f153583b) {
            return 0L;
        }
        long[] jArr = this.f153587f;
        if (jArr == null) {
            throw new IllegalStateException();
        }
        double d10 = (j11 * 256.0d) / this.f153585d;
        int iB = ib3.b(jArr, (long) d10, true);
        long j12 = this.f153584c;
        long j13 = (((long) iB) * j12) / 100;
        long j14 = jArr[iB];
        int i10 = iB + 1;
        long j15 = (j12 * ((long) i10)) / 100;
        long j16 = iB == 99 ? 256L : jArr[i10];
        return Math.round((j14 == j16 ? 0.0d : (d10 - j14) / (j16 - j14)) * (j15 - j13)) + j13;
    }

    @Override // yads.vw2
    public final boolean b() {
        return this.f153587f != null;
    }
}
