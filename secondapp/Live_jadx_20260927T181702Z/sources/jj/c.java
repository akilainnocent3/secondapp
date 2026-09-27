package jj;

import com.ironsource.G5;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Iterator;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@yi.b(emulated = true)
@e
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f100509a = -2.147483648E9d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double f100510b = 2.147483647E9d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double f100511c = -9.223372036854776E18d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final double f100512d = 9.223372036854776E18d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @yi.e
    public static final int f100514f = 170;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final double f100513e = Math.log(2.0d);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @yi.e
    public static final double[] f100515g = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100516a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f100516a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f100516a[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f100516a[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f100516a[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f100516a[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f100516a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f100516a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f100516a[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    @qj.a
    @yi.c
    public static double a(double argument) {
        l0.d(d.d(argument));
        return argument;
    }

    public static double b(int n10) {
        i.e(G5.f59045q, n10);
        if (n10 > 170) {
            return Double.POSITIVE_INFINITY;
        }
        double d10 = 1.0d;
        for (int i10 = (n10 & (-16)) + 1; i10 <= n10; i10++) {
            d10 *= (double) i10;
        }
        return d10 * f100515g[n10 >> 4];
    }

    public static int c(double a10, double b10, double tolerance) {
        if (d(a10, b10, tolerance)) {
            return 0;
        }
        if (a10 < b10) {
            return -1;
        }
        if (a10 > b10) {
            return 1;
        }
        return Boolean.compare(Double.isNaN(a10), Double.isNaN(b10));
    }

    public static boolean d(double a10, double b10, double tolerance) {
        i.d("tolerance", tolerance);
        if (Math.copySign(a10 - b10, 1.0d) <= tolerance || a10 == b10) {
            return true;
        }
        return Double.isNaN(a10) && Double.isNaN(b10);
    }

    @yi.c
    public static boolean e(double x10) {
        if (d.d(x10)) {
            return x10 == 0.0d || 52 - Long.numberOfTrailingZeros(d.c(x10)) <= Math.getExponent(x10);
        }
        return false;
    }

    @yi.c
    public static boolean f(double x10) {
        if (x10 > 0.0d && d.d(x10)) {
            long jC = d.c(x10);
            if ((jC & (jC - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    public static double g(double x10) {
        return Math.log(x10) / f100513e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    @yi.c
    public static int h(double x10, RoundingMode mode) {
        boolean zF;
        boolean z10 = false;
        l0.e(x10 > 0.0d && d.d(x10), "x must be positive and finite");
        int exponent = Math.getExponent(x10);
        if (!d.e(x10)) {
            return h(x10 * 4.503599627370496E15d, mode) - 52;
        }
        switch (a.f100516a[mode.ordinal()]) {
            case 1:
                i.k(f(x10));
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 2:
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 3:
                z10 = !f(x10);
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                z10 = exponent < 0;
                zF = f(x10);
                z10 &= !zF;
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                z10 = exponent >= 0;
                zF = f(x10);
                z10 &= !zF;
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double dG = d.g(x10);
                if (dG * dG > 2.0d) {
                    z10 = true;
                }
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            default:
                throw new AssertionError();
        }
    }

    @yi.c
    @Deprecated
    public static double i(Iterable<? extends Number> values) {
        return j(values.iterator());
    }

    @yi.c
    @Deprecated
    public static double j(Iterator<? extends Number> values) {
        l0.e(values.hasNext(), "Cannot take mean of 0 values");
        double dA = a(values.next().doubleValue());
        long j10 = 1;
        while (values.hasNext()) {
            j10++;
            dA += (a(values.next().doubleValue()) - dA) / j10;
        }
        return dA;
    }

    @yi.c
    @Deprecated
    public static double k(double... values) {
        l0.e(values.length > 0, "Cannot take mean of 0 values");
        double dA = a(values[0]);
        long j10 = 1;
        for (int i10 = 1; i10 < values.length; i10++) {
            a(values[i10]);
            j10++;
            dA += (values[i10] - dA) / j10;
        }
        return dA;
    }

    @Deprecated
    public static double l(int... values) {
        l0.e(values.length > 0, "Cannot take mean of 0 values");
        long j10 = 0;
        for (int i10 : values) {
            j10 += (long) i10;
        }
        return j10 / ((double) values.length);
    }

    @Deprecated
    public static double m(long... values) {
        l0.e(values.length > 0, "Cannot take mean of 0 values");
        double d10 = values[0];
        long j10 = 1;
        for (int i10 = 1; i10 < values.length; i10++) {
            j10++;
            d10 += (values[i10] - d10) / j10;
        }
        return d10;
    }

    @yi.c
    public static double n(double x10, RoundingMode mode) {
        if (!d.d(x10)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (a.f100516a[mode.ordinal()]) {
            case 1:
                i.k(e(x10));
                return x10;
            case 2:
                return (x10 >= 0.0d || e(x10)) ? x10 : ((long) x10) - 1;
            case 3:
                return (x10 <= 0.0d || e(x10)) ? x10 : ((long) x10) + 1;
            case 4:
                return x10;
            case 5:
                if (e(x10)) {
                    return x10;
                }
                return ((long) x10) + ((long) (x10 > 0.0d ? 1 : -1));
            case 6:
                return Math.rint(x10);
            case 7:
                double dRint = Math.rint(x10);
                return Math.abs(x10 - dRint) == 0.5d ? x10 + Math.copySign(0.5d, x10) : dRint;
            case 8:
                double dRint2 = Math.rint(x10);
                return Math.abs(x10 - dRint2) == 0.5d ? x10 : dRint2;
            default:
                throw new AssertionError();
        }
    }

    @yi.c
    public static BigInteger o(double x10, RoundingMode mode) {
        double dN = n(x10, mode);
        if (((-9.223372036854776E18d) - dN < 1.0d) && (dN < 9.223372036854776E18d)) {
            return BigInteger.valueOf((long) dN);
        }
        BigInteger bigIntegerShiftLeft = BigInteger.valueOf(d.c(dN)).shiftLeft(Math.getExponent(dN) - 52);
        return dN < 0.0d ? bigIntegerShiftLeft.negate() : bigIntegerShiftLeft;
    }

    @yi.c
    public static int p(double x10, RoundingMode mode) {
        double dN = n(x10, mode);
        i.a((dN > -2.147483649E9d) & (dN < 2.147483648E9d), x10, mode);
        return (int) dN;
    }

    @yi.c
    public static long q(double x10, RoundingMode mode) {
        double dN = n(x10, mode);
        i.a(((-9.223372036854776E18d) - dN < 1.0d) & (dN < 9.223372036854776E18d), x10, mode);
        return (long) dN;
    }
}
