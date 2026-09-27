package d6;

import android.util.Range;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class d0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f78160e = 0.2f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f78161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f78162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f78163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Range<Double> f78164d;

    public d0(@k.w(from = 0.0d, fromInclusive = false) float f10) {
        zi.l0.d(f10 > 0.0f);
        Range<Double> range = new Range<>(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f10)));
        this.f78164d = range;
        this.f78163c = ((Double) range.getUpper()).doubleValue();
        this.f78161a = -9223372036854775807L;
        this.f78162b = -9223372036854775807L;
    }

    public final double a(long j10, long j11) {
        long j12 = this.f78161a;
        if (j12 != -9223372036854775807L) {
            long j13 = this.f78162b;
            if (j13 != -9223372036854775807L && j10 != j12) {
                return (j11 - j13) / (j10 - j12);
            }
        }
        return ((Double) this.f78164d.getUpper()).doubleValue();
    }

    public void b(long j10, long j11) {
        zi.l0.d(j10 != -9223372036854775807L);
        zi.l0.d(j11 != -9223372036854775807L);
        f(((Double) this.f78164d.clamp(Double.valueOf(a(j10, j11)))).doubleValue());
        this.f78161a = j10;
        this.f78162b = j11;
    }

    public long c(long j10) {
        long j11 = this.f78161a;
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (long) (this.f78162b + ((j10 - j11) * this.f78163c));
    }

    public void d() {
        this.f78163c = ((Double) this.f78164d.getUpper()).doubleValue();
        this.f78161a = -9223372036854775807L;
        this.f78162b = -9223372036854775807L;
    }

    public void e(@k.w(from = 0.0d, fromInclusive = false) float f10) {
        zi.l0.d(f10 > 0.0f);
        this.f78164d = new Range<>(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f10)));
        d();
    }

    public final void f(double d10) {
        this.f78163c = (this.f78163c * 0.800000011920929d) + (d10 * 0.20000000298023224d);
    }
}
