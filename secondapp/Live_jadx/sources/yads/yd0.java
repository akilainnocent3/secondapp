package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class yd0 implements rf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f158236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f158237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f158238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f158239d = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f158240e = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f158242g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f158243h = -9223372036854775807L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f158246k = 0.97f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f158245j = 1.03f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f158247l = 1.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f158248m = -9223372036854775807L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f158241f = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f158244i = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f158249n = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f158250o = -9223372036854775807L;

    public yd0(long j10, long j11, float f10) {
        this.f158236a = j10;
        this.f158237b = j11;
        this.f158238c = f10;
    }

    public final void a() {
        long j10 = this.f158239d;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f158240e;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f158242g;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f158243h;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f158241f == j10) {
            return;
        }
        this.f158241f = j10;
        this.f158244i = j10;
        this.f158249n = -9223372036854775807L;
        this.f158250o = -9223372036854775807L;
        this.f158248m = -9223372036854775807L;
    }
}
