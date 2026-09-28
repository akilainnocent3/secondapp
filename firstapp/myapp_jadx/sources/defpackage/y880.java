package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y880 {
    public static final jj0 a = new jj0(Float.NaN, Float.NaN);
    public static final g0h0 b = new g0h0(new n100(1), new o100(1));
    public static final long c;
    public static final fkd0<gly> d;

    static {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        c = jFloatToRawIntBits;
        d = new fkd0<>(new gly(jFloatToRawIntBits), 3);
    }
}
