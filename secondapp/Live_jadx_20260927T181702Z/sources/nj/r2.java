package nj;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@o0
@yi.c
@yi.d
public abstract class r2 extends i2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f117279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f117280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f117281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f117282f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends r2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final double f117283g;

        public b(i2.a stopwatch, double maxBurstSeconds) {
            super(stopwatch);
            this.f117283g = maxBurstSeconds;
        }

        @Override // nj.r2
        public double v() {
            return this.f117281e;
        }

        @Override // nj.r2
        public void w(double permitsPerSecond, double stableIntervalMicros) {
            double d10 = this.f117280d;
            double d11 = this.f117283g * permitsPerSecond;
            this.f117280d = d11;
            if (d10 == Double.POSITIVE_INFINITY) {
                this.f117279c = d11;
            } else {
                this.f117279c = d10 != 0.0d ? (this.f117279c * d11) / d10 : 0.0d;
            }
        }

        @Override // nj.r2
        public long y(double storedPermits, double permitsToTake) {
            return 0L;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends r2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f117284g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public double f117285h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public double f117286i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public double f117287j;

        public c(i2.a stopwatch, long warmupPeriod, TimeUnit timeUnit, double coldFactor) {
            super(stopwatch);
            this.f117284g = timeUnit.toMicros(warmupPeriod);
            this.f117287j = coldFactor;
        }

        @Override // nj.r2
        public double v() {
            return this.f117284g / this.f117280d;
        }

        @Override // nj.r2
        public void w(double permitsPerSecond, double stableIntervalMicros) {
            double d10 = this.f117280d;
            double d11 = this.f117287j * stableIntervalMicros;
            long j10 = this.f117284g;
            double d12 = (j10 * 0.5d) / stableIntervalMicros;
            this.f117286i = d12;
            double d13 = ((j10 * 2.0d) / (stableIntervalMicros + d11)) + d12;
            this.f117280d = d13;
            this.f117285h = (d11 - stableIntervalMicros) / (d13 - d12);
            if (d10 == Double.POSITIVE_INFINITY) {
                this.f117279c = 0.0d;
                return;
            }
            if (d10 != 0.0d) {
                d13 = (this.f117279c * d13) / d10;
            }
            this.f117279c = d13;
        }

        @Override // nj.r2
        public long y(double storedPermits, double permitsToTake) {
            long jZ;
            double d10 = storedPermits - this.f117286i;
            if (d10 > 0.0d) {
                double dMin = Math.min(d10, permitsToTake);
                jZ = (long) (((z(d10) + z(d10 - dMin)) * dMin) / 2.0d);
                permitsToTake -= dMin;
            } else {
                jZ = 0;
            }
            return jZ + ((long) (this.f117281e * permitsToTake));
        }

        public final double z(double permits) {
            return this.f117281e + (permits * this.f117285h);
        }
    }

    @Override // nj.i2
    public final double i() {
        return TimeUnit.SECONDS.toMicros(1L) / this.f117281e;
    }

    @Override // nj.i2
    public final void j(double permitsPerSecond, long nowMicros) {
        x(nowMicros);
        double micros = TimeUnit.SECONDS.toMicros(1L) / permitsPerSecond;
        this.f117281e = micros;
        w(permitsPerSecond, micros);
    }

    @Override // nj.i2
    public final long m(long nowMicros) {
        return this.f117282f;
    }

    @Override // nj.i2
    public final long p(int requiredPermits, long nowMicros) {
        x(nowMicros);
        long j10 = this.f117282f;
        double d10 = requiredPermits;
        double dMin = Math.min(d10, this.f117279c);
        this.f117282f = jj.h.x(this.f117282f, y(this.f117279c, dMin) + ((long) ((d10 - dMin) * this.f117281e)));
        this.f117279c -= dMin;
        return j10;
    }

    public abstract double v();

    public abstract void w(double permitsPerSecond, double stableIntervalMicros);

    public void x(long nowMicros) {
        long j10 = this.f117282f;
        if (nowMicros > j10) {
            this.f117279c = Math.min(this.f117280d, this.f117279c + ((nowMicros - j10) / v()));
            this.f117282f = nowMicros;
        }
    }

    public abstract long y(double storedPermits, double permitsToTake);

    public r2(i2.a stopwatch) {
        super(stopwatch);
        this.f117282f = 0L;
    }
}
