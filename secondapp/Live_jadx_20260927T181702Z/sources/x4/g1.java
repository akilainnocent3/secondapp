package x4;

import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class g1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f144299e = Long.MAX_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f144300f = 9223372036854775806L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f144301g = 8589934592L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @k.a0("this")
    public long f144302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @k.a0("this")
    public long f144303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @k.a0("this")
    public long f144304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal<Long> f144305d = new ThreadLocal<>();

    public g1(long j10) {
        i(j10);
    }

    public static long h(long j10) {
        return b2.l2(j10, 1000000L, 90000L);
    }

    public static long k(long j10) {
        return b2.l2(j10, 90000L, 1000000L);
    }

    public static long l(long j10) {
        return k(j10) % 8589934592L;
    }

    public synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!g()) {
                long jLongValue = this.f144302a;
                if (jLongValue == 9223372036854775806L) {
                    jLongValue = ((Long) zi.l0.E(this.f144305d.get())).longValue();
                }
                this.f144303b = jLongValue - j10;
                notifyAll();
            }
            this.f144304c = j10;
            return j10 + this.f144303b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f144304c;
            if (j11 != -9223372036854775807L) {
                long jK = k(j11);
                long j12 = (4294967296L + jK) / 8589934592L;
                long j13 = ((j12 - 1) * 8589934592L) + j10;
                j10 += j12 * 8589934592L;
                if (Math.abs(j13 - jK) < Math.abs(j10 - jK)) {
                    j10 = j13;
                }
            }
            return a(h(j10));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long c(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = this.f144304c;
        if (j11 != -9223372036854775807L) {
            long jK = k(j11);
            long j12 = jK / 8589934592L;
            Long.signum(j12);
            long j13 = (j12 * 8589934592L) + j10;
            j10 += (j12 + 1) * 8589934592L;
            if (j13 >= jK) {
                j10 = j13;
            }
        }
        return a(h(j10));
    }

    public synchronized long d() {
        long j10;
        j10 = this.f144302a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }

    public synchronized long e() {
        long j10;
        try {
            j10 = this.f144304c;
        } catch (Throwable th2) {
            throw th2;
        }
        return j10 != -9223372036854775807L ? j10 + this.f144303b : d();
    }

    public synchronized long f() {
        return this.f144303b;
    }

    public synchronized boolean g() {
        return this.f144303b != -9223372036854775807L;
    }

    public synchronized void i(long j10) {
        this.f144302a = j10;
        this.f144303b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f144304c = -9223372036854775807L;
    }

    public synchronized void j(boolean z10, long j10, long j11) throws InterruptedException, TimeoutException {
        try {
            zi.l0.g0(this.f144302a == 9223372036854775806L);
            if (g()) {
                return;
            }
            if (z10) {
                this.f144305d.set(Long.valueOf(j10));
            } else {
                long jElapsedRealtime = 0;
                long j12 = j11;
                while (!g()) {
                    if (j11 == 0) {
                        wait();
                    } else {
                        zi.l0.g0(j12 > 0);
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        wait(j12);
                        jElapsedRealtime += SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        if (jElapsedRealtime >= j11 && !g()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j11 + " milliseconds");
                        }
                        j12 = j11 - jElapsedRealtime;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
