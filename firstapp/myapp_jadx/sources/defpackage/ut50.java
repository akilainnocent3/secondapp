package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ut50 {
    public static final chf a = new chf(new tt50());
    public static final xt50 b;
    public static final xt50 c;

    static {
        long j = j58.m;
        b = new xt50(Float.NaN, j, true);
        c = new xt50(Float.NaN, j, false);
    }

    public static final xt50 a(float f, long j, boolean z) {
        if (g7f.b(f, Float.NaN) && nbh0.a(j, j58.m)) {
            return z ? b : c;
        }
        return new xt50(f, j, z);
    }

    public static xt50 b(float f, int i, long j, boolean z) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        if ((i & 4) != 0) {
            j = j58.m;
        }
        return a(f, j, z);
    }
}
