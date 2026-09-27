package eh;

import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class f1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f80946e = Long.MAX_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f80947f = 9223372036854775806L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f80948g = 8589934592L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @k.a0("this")
    public long f80949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @k.a0("this")
    public long f80950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @k.a0("this")
    public long f80951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal<Long> f80952d = new ThreadLocal<>();

    public f1(long j10) {
        h(j10);
    }

    public static long g(long j10) {
        return (j10 * 1000000) / 90000;
    }

    public static long j(long j10) {
        return (j10 * 90000) / 1000000;
    }

    public static long k(long j10) {
        return j(j10) % 8589934592L;
    }

    public synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!f()) {
                long jLongValue = this.f80949a;
                if (jLongValue == 9223372036854775806L) {
                    jLongValue = ((Long) a.g(this.f80952d.get())).longValue();
                }
                this.f80950b = jLongValue - j10;
                notifyAll();
            }
            this.f80951c = j10;
            return j10 + this.f80950b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f80951c;
            if (j11 != -9223372036854775807L) {
                long j12 = j(j11);
                long j13 = (4294967296L + j12) / 8589934592L;
                long j14 = ((j13 - 1) * 8589934592L) + j10;
                j10 += j13 * 8589934592L;
                if (Math.abs(j14 - j12) < Math.abs(j10 - j12)) {
                    j10 = j14;
                }
            }
            return a(g(j10));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long c() {
        long j10;
        j10 = this.f80949a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }

    public synchronized long d() {
        long j10;
        try {
            j10 = this.f80951c;
        } catch (Throwable th2) {
            throw th2;
        }
        return j10 != -9223372036854775807L ? j10 + this.f80950b : c();
    }

    public synchronized long e() {
        return this.f80950b;
    }

    public synchronized boolean f() {
        return this.f80950b != -9223372036854775807L;
    }

    public synchronized void h(long j10) {
        this.f80949a = j10;
        this.f80950b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f80951c = -9223372036854775807L;
    }

    public synchronized void i(boolean z10, long j10, long j11) throws InterruptedException, TimeoutException {
        try {
            a.i(this.f80949a == 9223372036854775806L);
            if (f()) {
                return;
            }
            if (z10) {
                this.f80952d.set(Long.valueOf(j10));
            } else {
                long jElapsedRealtime = 0;
                long j12 = j11;
                while (!f()) {
                    if (j11 == 0) {
                        wait();
                    } else {
                        a.i(j12 > 0);
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        wait(j12);
                        jElapsedRealtime += SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        if (jElapsedRealtime >= j11 && !f()) {
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
