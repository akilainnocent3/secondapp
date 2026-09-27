package f6;

import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public class k implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f83518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f83519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f83520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f83521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f83522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f83523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f83524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f83525h;

    public k(long j10, long j11, int i10, int i11) {
        this(j10, j11, i10, i11, false);
    }

    public static long i(long j10, long j11, int i10) {
        return (Math.max(0L, j10 - j11) * 8000000) / ((long) i10);
    }

    public final long b(long j10) {
        long j11 = (j10 * ((long) this.f83522e)) / 8000000;
        int i10 = this.f83520c;
        long jMin = (j11 / ((long) i10)) * ((long) i10);
        long j12 = this.f83521d;
        if (j12 != -1) {
            jMin = Math.min(jMin, j12 - ((long) i10));
        }
        return this.f83519b + Math.max(jMin, 0L);
    }

    @Override // f6.w0
    public boolean e() {
        return this.f83525h;
    }

    @Override // f6.w0
    public long getDurationUs() {
        return this.f83523f;
    }

    @Override // f6.w0
    public w0.a getSeekPoints(long j10) {
        if (this.f83521d == -1 && !this.f83524g) {
            return new w0.a(new x0(0L, this.f83519b));
        }
        long jB = b(j10);
        long jH = h(jB);
        x0 x0Var = new x0(jH, jB);
        if (this.f83521d != -1 && jH < j10) {
            int i10 = this.f83520c;
            if (((long) i10) + jB < this.f83518a) {
                long j11 = jB + ((long) i10);
                return new w0.a(x0Var, new x0(h(j11), j11));
            }
        }
        return new w0.a(x0Var);
    }

    public long h(long j10) {
        return i(j10, this.f83519b, this.f83522e);
    }

    @Override // f6.w0
    public boolean isSeekable() {
        return this.f83521d != -1 || this.f83524g;
    }

    public k(long j10, long j11, int i10, int i11, boolean z10) {
        this(j10, j11, i10, i11, z10, true);
    }

    public k(long j10, long j11, int i10, int i11, boolean z10, boolean z11) {
        this.f83518a = j10;
        this.f83519b = j11;
        this.f83520c = i11 == -1 ? 1 : i11;
        this.f83522e = i10;
        this.f83524g = z10;
        this.f83525h = z11;
        if (j10 == -1) {
            this.f83521d = -1L;
            this.f83523f = -9223372036854775807L;
        } else {
            this.f83521d = j10 - j11;
            this.f83523f = i(j10, j11, i10);
        }
    }
}
