package re;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a5 f125342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a5 f125343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a5 f125344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a5 f125345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a5 f125346g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f125347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f125348b;

    static {
        a5 a5Var = new a5(0L, 0L);
        f125342c = a5Var;
        f125343d = new a5(Long.MAX_VALUE, Long.MAX_VALUE);
        f125344e = new a5(Long.MAX_VALUE, 0L);
        f125345f = new a5(0L, Long.MAX_VALUE);
        f125346g = a5Var;
    }

    public a5(long j10, long j11) {
        eh.a.a(j10 >= 0);
        eh.a.a(j11 >= 0);
        this.f125347a = j10;
        this.f125348b = j11;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051 A[RETURN] */
    public long a(long j10, long j11, long j12) {
        long j13 = this.f125347a;
        if (j13 == 0 && this.f125348b == 0) {
            return j10;
        }
        long jN1 = eh.o1.N1(j10, j13, Long.MIN_VALUE);
        long jF = eh.o1.f(j10, this.f125348b, Long.MAX_VALUE);
        boolean z10 = false;
        boolean z11 = jN1 <= j11 && j11 <= jF;
        if (jN1 <= j12 && j12 <= jF) {
            z10 = true;
        }
        if (z11 && z10) {
            if (Math.abs(j11 - j10) <= Math.abs(j12 - j10)) {
                return j11;
            }
            return j12;
        }
        if (!z11) {
            if (z10) {
                return j12;
            }
            return jN1;
        }
        return j11;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a5.class == obj.getClass()) {
            a5 a5Var = (a5) obj;
            if (this.f125347a == a5Var.f125347a && this.f125348b == a5Var.f125348b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f125347a) * 31) + ((int) this.f125348b);
    }
}
