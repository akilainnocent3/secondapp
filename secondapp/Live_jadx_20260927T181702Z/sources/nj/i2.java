package nj;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@o0
@yi.c
@yi.d
@yi.a
public abstract class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f117082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @zq.a
    public volatile Object f117083b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class a {

        /* JADX INFO: renamed from: nj.i2$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class C1074a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final zi.s0 f117084a = zi.s0.c();

            @Override // nj.i2.a
            public long b() {
                return this.f117084a.g(TimeUnit.MICROSECONDS);
            }

            @Override // nj.i2.a
            public void c(long micros) {
                if (micros > 0) {
                    h3.k(micros, TimeUnit.MICROSECONDS);
                }
            }
        }

        public static a a() {
            return new C1074a();
        }

        public abstract long b();

        public abstract void c(long micros);
    }

    public i2(a stopwatch) {
        this.f117082a = (a) zi.l0.E(stopwatch);
    }

    public static void d(int permits) {
        zi.l0.k(permits > 0, "Requested permits (%s) must be positive", permits);
    }

    public static i2 e(double permitsPerSecond) {
        return h(permitsPerSecond, a.a());
    }

    public static i2 f(double permitsPerSecond, long warmupPeriod, TimeUnit unit) {
        zi.l0.p(warmupPeriod >= 0, "warmupPeriod must not be negative: %s", warmupPeriod);
        return g(permitsPerSecond, warmupPeriod, unit, 3.0d, a.a());
    }

    @yi.e
    public static i2 g(double permitsPerSecond, long warmupPeriod, TimeUnit unit, double coldFactor, a stopwatch) {
        r2.c cVar = new r2.c(stopwatch, warmupPeriod, unit, coldFactor);
        cVar.q(permitsPerSecond);
        return cVar;
    }

    @yi.e
    public static i2 h(double permitsPerSecond, a stopwatch) {
        r2.b bVar = new r2.b(stopwatch, 1.0d);
        bVar.q(permitsPerSecond);
        return bVar;
    }

    @qj.a
    public double a() {
        return b(1);
    }

    @qj.a
    public double b(int permits) {
        long jN = n(permits);
        this.f117082a.c(jN);
        return (jN * 1.0d) / TimeUnit.SECONDS.toMicros(1L);
    }

    public final boolean c(long nowMicros, long timeoutMicros) {
        return m(nowMicros) - timeoutMicros <= nowMicros;
    }

    public abstract double i();

    public abstract void j(double permitsPerSecond, long nowMicros);

    public final double k() {
        double dI;
        synchronized (l()) {
            dI = i();
        }
        return dI;
    }

    public final Object l() {
        Object obj;
        Object obj2 = this.f117083b;
        if (obj2 != null) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f117083b;
                if (obj == null) {
                    obj = new Object();
                    this.f117083b = obj;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    public abstract long m(long nowMicros);

    public final long n(int permits) {
        long jO;
        d(permits);
        synchronized (l()) {
            jO = o(permits, this.f117082a.b());
        }
        return jO;
    }

    public final long o(int permits, long nowMicros) {
        return Math.max(p(permits, nowMicros) - nowMicros, 0L);
    }

    public abstract long p(int permits, long nowMicros);

    public final void q(double permitsPerSecond) {
        zi.l0.e(permitsPerSecond > 0.0d, "rate must be positive");
        synchronized (l()) {
            j(permitsPerSecond, this.f117082a.b());
        }
    }

    public boolean r() {
        return t(1, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean s(int permits) {
        return t(permits, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean t(int permits, long timeout, TimeUnit unit) {
        long jMax = Math.max(unit.toMicros(timeout), 0L);
        d(permits);
        synchronized (l()) {
            try {
                long jB = this.f117082a.b();
                if (!c(jB, jMax)) {
                    return false;
                }
                this.f117082a.c(o(permits, jB));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        return String.format(Locale.ROOT, "RateLimiter[stableRate=%3.1fqps]", Double.valueOf(k()));
    }

    public boolean u(long timeout, TimeUnit unit) {
        return t(1, timeout, unit);
    }
}
