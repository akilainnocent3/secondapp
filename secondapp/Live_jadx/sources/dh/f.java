package dh;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class f implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double f79260c = 0.9999d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f79261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f79262b;

    public f() {
        this(0.9999d);
    }

    @Override // dh.b
    public long a() {
        return this.f79262b;
    }

    @Override // dh.b
    public void b(long j10, long j11) {
        long j12 = (8000000 * j10) / j11;
        if (this.f79262b == Long.MIN_VALUE) {
            this.f79262b = j12;
        } else {
            double dPow = Math.pow(this.f79261a, Math.sqrt(j10));
            this.f79262b = (long) ((this.f79262b * dPow) + ((1.0d - dPow) * j12));
        }
    }

    @Override // dh.b
    public void reset() {
        this.f79262b = Long.MIN_VALUE;
    }

    public f(double d10) {
        this.f79261a = d10;
        this.f79262b = Long.MIN_VALUE;
    }
}
