package tw;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f137443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f137444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f137445c;

    public a(int i10) {
        this.f137443a = i10;
    }

    public static /* synthetic */ void f(a aVar, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        if ((i10 & 2) != 0) {
            j11 = 0;
        }
        aVar.e(j10, j11);
    }

    public final long a() {
        return this.f137445c;
    }

    public final int b() {
        return this.f137443a;
    }

    public final long c() {
        return this.f137444b;
    }

    public final synchronized long d() {
        return this.f137444b - this.f137445c;
    }

    public final synchronized void e(long j10, long j11) {
        try {
            if (j10 < 0) {
                throw new IllegalStateException("Check failed.");
            }
            if (j11 < 0) {
                throw new IllegalStateException("Check failed.");
            }
            long j12 = this.f137444b + j10;
            this.f137444b = j12;
            long j13 = this.f137445c + j11;
            this.f137445c = j13;
            if (j13 > j12) {
                throw new IllegalStateException("Check failed.");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @l
    public String toString() {
        return "WindowCounter(streamId=" + this.f137443a + ", total=" + this.f137444b + ", acknowledged=" + this.f137445c + ", unacknowledged=" + d() + ')';
    }
}
