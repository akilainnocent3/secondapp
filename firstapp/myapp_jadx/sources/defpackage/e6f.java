package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class e6f {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;

    public static long a(double d) {
        im20.b("not a normal value", b(d));
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static boolean b(double d) {
        return Math.getExponent(d) <= 1023;
    }
}
