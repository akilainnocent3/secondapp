package af;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class f implements d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f4911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f4913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f4914h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f4915i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f4916j;

    public f(long j10, long j11, int i10, int i11) {
        this(j10, j11, i10, i11, false);
    }

    public static long d(long j10, long j11, int i10) {
        return (Math.max(0L, j10 - j11) * 8000000) / ((long) i10);
    }

    public final long b(long j10) {
        long j11 = (j10 * ((long) this.f4914h)) / 8000000;
        int i10 = this.f4912f;
        long jMin = (j11 / ((long) i10)) * ((long) i10);
        long j12 = this.f4913g;
        if (j12 != -1) {
            jMin = Math.min(jMin, j12 - ((long) i10));
        }
        return this.f4911e + Math.max(jMin, 0L);
    }

    public long c(long j10) {
        return d(j10, this.f4911e, this.f4914h);
    }

    @Override // af.d0
    public long getDurationUs() {
        return this.f4915i;
    }

    @Override // af.d0
    public d0.a getSeekPoints(long j10) {
        if (this.f4913g == -1 && !this.f4916j) {
            return new d0.a(new e0(0L, this.f4911e));
        }
        long jB = b(j10);
        long jC = c(jB);
        e0 e0Var = new e0(jC, jB);
        if (this.f4913g != -1 && jC < j10) {
            int i10 = this.f4912f;
            if (((long) i10) + jB < this.f4910d) {
                long j11 = jB + ((long) i10);
                return new d0.a(e0Var, new e0(c(j11), j11));
            }
        }
        return new d0.a(e0Var);
    }

    @Override // af.d0
    public boolean isSeekable() {
        return this.f4913g != -1 || this.f4916j;
    }

    public f(long j10, long j11, int i10, int i11, boolean z10) {
        this.f4910d = j10;
        this.f4911e = j11;
        this.f4912f = i11 == -1 ? 1 : i11;
        this.f4914h = i10;
        this.f4916j = z10;
        if (j10 == -1) {
            this.f4913g = -1L;
            this.f4915i = -9223372036854775807L;
        } else {
            this.f4913g = j10 - j11;
            this.f4915i = d(j10, j11, i10);
        }
    }
}
