package zi;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b(emulated = true)
@k
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f161851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f161852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f161853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f161854d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f161855a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f161855a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f161855a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f161855a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f161855a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f161855a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f161855a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f161855a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public s0() {
        this.f161851a = z0.b();
    }

    public static String a(TimeUnit unit) {
        switch (a.f161855a[unit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "min";
            case 6:
                return "h";
            case 7:
                return "d";
            default:
                throw new AssertionError();
        }
    }

    public static TimeUnit b(long nanos) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(nanos, timeUnit2) > 0) {
            return timeUnit;
        }
        TimeUnit timeUnit3 = TimeUnit.HOURS;
        if (timeUnit3.convert(nanos, timeUnit2) > 0) {
            return timeUnit3;
        }
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        if (timeUnit4.convert(nanos, timeUnit2) > 0) {
            return timeUnit4;
        }
        TimeUnit timeUnit5 = TimeUnit.SECONDS;
        if (timeUnit5.convert(nanos, timeUnit2) > 0) {
            return timeUnit5;
        }
        TimeUnit timeUnit6 = TimeUnit.MILLISECONDS;
        if (timeUnit6.convert(nanos, timeUnit2) > 0) {
            return timeUnit6;
        }
        TimeUnit timeUnit7 = TimeUnit.MICROSECONDS;
        return timeUnit7.convert(nanos, timeUnit2) > 0 ? timeUnit7 : timeUnit2;
    }

    public static s0 c() {
        return new s0().k();
    }

    public static s0 d(z0 ticker) {
        return new s0(ticker).k();
    }

    public static s0 e() {
        return new s0();
    }

    public static s0 f(z0 ticker) {
        return new s0(ticker);
    }

    public long g(TimeUnit desiredUnit) {
        return desiredUnit.convert(h(), TimeUnit.NANOSECONDS);
    }

    public final long h() {
        return this.f161852b ? (this.f161851a.a() - this.f161854d) + this.f161853c : this.f161853c;
    }

    public boolean i() {
        return this.f161852b;
    }

    @qj.a
    public s0 j() {
        this.f161853c = 0L;
        this.f161852b = false;
        return this;
    }

    @qj.a
    public s0 k() {
        l0.h0(!this.f161852b, "This stopwatch is already running.");
        this.f161852b = true;
        this.f161854d = this.f161851a.a();
        return this;
    }

    @qj.a
    public s0 l() {
        long jA = this.f161851a.a();
        l0.h0(this.f161852b, "This stopwatch is already stopped.");
        this.f161852b = false;
        this.f161853c += jA - this.f161854d;
        return this;
    }

    public String toString() {
        long jH = h();
        TimeUnit timeUnitB = b(jH);
        return k0.c(jH / TimeUnit.NANOSECONDS.convert(1L, timeUnitB)) + " " + a(timeUnitB);
    }

    public s0(z0 ticker) {
        this.f161851a = (z0) l0.F(ticker, "ticker");
    }
}
