package b6;

import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public class f implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double f20830c = 0.9999d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f20831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f20832b;

    public f() {
        this(0.9999d);
    }

    @Override // b6.b
    public long a() {
        return this.f20832b;
    }

    @Override // b6.b
    public void b(long j10, long j11) {
        long j12 = (8000000 * j10) / j11;
        if (this.f20832b == Long.MIN_VALUE) {
            this.f20832b = j12;
        } else {
            double dPow = Math.pow(this.f20831a, Math.sqrt(j10));
            this.f20832b = (long) ((this.f20832b * dPow) + ((1.0d - dPow) * j12));
        }
    }

    @Override // b6.b
    public void reset() {
        this.f20832b = Long.MIN_VALUE;
    }

    public f(double d10) {
        this.f20831a = d10;
        this.f20832b = Long.MIN_VALUE;
    }
}
