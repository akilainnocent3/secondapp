package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class pp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f154047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f154048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f154049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f154050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f154051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f154052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f154053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f154054h;

    public pp(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f154047a = j10;
        this.f154048b = j11;
        this.f154050d = j12;
        this.f154051e = j13;
        this.f154052f = j14;
        this.f154053g = j15;
        this.f154049c = j16;
        this.f154054h = a(j11, j12, j13, j14, j15, j16);
    }

    public static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 >= j14 || j11 + 1 >= j12) {
            return j13;
        }
        long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
        long j17 = j16 / 20;
        int i10 = ib3.f150516a;
        return Math.max(j13, Math.min(((j16 + j13) - j15) - j17, j14 - 1));
    }
}
