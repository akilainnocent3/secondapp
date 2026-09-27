package jj;

import java.math.BigInteger;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@yi.c
@e
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f100517a = 4503599627370495L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f100518b = 9218868437227405312L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f100519c = Long.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f100520d = 52;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f100521e = 1023;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f100522f = 4503599627370496L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @yi.e
    public static final long f100523g = 4607182418800017408L;

    public static double a(BigInteger x10) {
        BigInteger bigIntegerAbs = x10.abs();
        int iBitLength = bigIntegerAbs.bitLength();
        int i10 = iBitLength - 1;
        if (i10 < 63) {
            return x10.longValue();
        }
        if (i10 > 1023) {
            return ((double) x10.signum()) * Double.POSITIVE_INFINITY;
        }
        int i11 = iBitLength - 54;
        long jLongValue = bigIntegerAbs.shiftRight(i11).longValue();
        long j10 = jLongValue >> 1;
        long j11 = f100517a & j10;
        if ((jLongValue & 1) != 0 && ((j10 & 1) != 0 || bigIntegerAbs.getLowestSetBit() < i11)) {
            j11++;
        }
        return Double.longBitsToDouble(((((long) (iBitLength + 1022)) << 52) + j11) | (((long) x10.signum()) & Long.MIN_VALUE));
    }

    public static double b(double value) {
        l0.d(!Double.isNaN(value));
        return Math.max(value, 0.0d);
    }

    public static long c(double d10) {
        l0.e(d(d10), "not a normal value");
        int exponent = Math.getExponent(d10);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10) & f100517a;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | f100522f;
    }

    public static boolean d(double d10) {
        return Math.getExponent(d10) <= 1023;
    }

    public static boolean e(double d10) {
        return Math.getExponent(d10) >= -1022;
    }

    public static double f(double d10) {
        return -Math.nextUp(-d10);
    }

    public static double g(double x10) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(x10) & f100517a) | f100523g);
    }
}
