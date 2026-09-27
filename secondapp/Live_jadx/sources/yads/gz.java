package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public class gz implements vw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f149825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f149826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f149827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f149828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f149829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f149830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f149831g;

    public gz(int i10, int i11, long j10, long j11, boolean z10) {
        this.f149825a = j10;
        this.f149826b = j11;
        this.f149827c = i11 == -1 ? 1 : i11;
        this.f149829e = i10;
        this.f149831g = z10;
        if (j10 == -1) {
            this.f149828d = -1L;
            this.f149830f = -9223372036854775807L;
        } else {
            this.f149828d = j10 - j11;
            this.f149830f = a(i10, j10, j11);
        }
    }

    public static long a(int i10, long j10, long j11) {
        return (Math.max(0L, j10 - j11) * 8000000) / ((long) i10);
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        long j11 = this.f149828d;
        if (j11 == -1 && !this.f149831g) {
            xw2 xw2Var = new xw2(0L, this.f149826b);
            return new tw2(xw2Var, xw2Var);
        }
        long j12 = (((long) this.f149829e) * j10) / 8000000;
        long j13 = this.f149827c;
        long jMin = (j12 / j13) * j13;
        if (j11 != -1) {
            jMin = Math.min(jMin, j11 - j13);
        }
        long jMax = Math.max(jMin, 0L);
        long j14 = this.f149826b;
        long j15 = jMax + j14;
        long jA = a(this.f149829e, j15, j14);
        xw2 xw2Var2 = new xw2(jA, j15);
        if (this.f149828d != -1 && jA < j10) {
            long j16 = j15 + ((long) this.f149827c);
            if (j16 < this.f149825a) {
                return new tw2(xw2Var2, new xw2(a(this.f149829e, j16, this.f149826b), j16));
            }
        }
        return new tw2(xw2Var2, xw2Var2);
    }

    @Override // yads.vw2
    public final long c() {
        return this.f149830f;
    }

    @Override // yads.vw2
    public final boolean b() {
        return this.f149828d != -1 || this.f149831g;
    }
}
