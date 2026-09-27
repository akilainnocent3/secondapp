package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class y63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f158158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f158159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f158160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal f158161d = new ThreadLocal();

    public y63(long j10) {
        c(j10);
    }

    public final synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (this.f158159b == -9223372036854775807L) {
                long jLongValue = this.f158158a;
                if (jLongValue == 9223372036854775806L) {
                    Long l10 = (Long) this.f158161d.get();
                    l10.getClass();
                    jLongValue = l10.longValue();
                }
                this.f158159b = jLongValue - j10;
                notifyAll();
            }
            this.f158160c = j10;
            return j10 + this.f158159b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f158160c;
            if (j11 != -9223372036854775807L) {
                long j12 = (j11 * 90000) / 1000000;
                long j13 = (4294967296L + j12) / 8589934592L;
                long j14 = ((j13 - 1) * 8589934592L) + j10;
                j10 += j13 * 8589934592L;
                if (Math.abs(j14 - j12) < Math.abs(j10 - j12)) {
                    j10 = j14;
                }
            }
            return a((j10 * 1000000) / 90000);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c(long j10) {
        this.f158158a = j10;
        this.f158159b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f158160c = -9223372036854775807L;
    }

    public final synchronized long b() {
        return this.f158159b;
    }

    public final synchronized long a() {
        long j10;
        j10 = this.f158158a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }
}
