package jj;

import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@yi.b
@e
public final class i {
    public static void a(boolean condition, double input, RoundingMode mode) {
        if (condition) {
            return;
        }
        throw new ArithmeticException("rounded value is out of range for input " + input + " and rounding mode " + mode);
    }

    public static void b(boolean condition, String methodName, int a10, int b10) {
        if (condition) {
            return;
        }
        throw new ArithmeticException("overflow: " + methodName + gi.j.f86770c + a10 + ", " + b10 + gi.j.f86771d);
    }

    public static void c(boolean condition, String methodName, long a10, long b10) {
        if (condition) {
            return;
        }
        throw new ArithmeticException("overflow: " + methodName + gi.j.f86770c + a10 + ", " + b10 + gi.j.f86771d);
    }

    @qj.a
    public static double d(String role, double x10) {
        if (x10 >= 0.0d) {
            return x10;
        }
        throw new IllegalArgumentException(role + " (" + x10 + ") must be >= 0");
    }

    @qj.a
    public static int e(String role, int x10) {
        if (x10 >= 0) {
            return x10;
        }
        throw new IllegalArgumentException(role + " (" + x10 + ") must be >= 0");
    }

    @qj.a
    public static long f(String role, long x10) {
        if (x10 >= 0) {
            return x10;
        }
        throw new IllegalArgumentException(role + " (" + x10 + ") must be >= 0");
    }

    @qj.a
    public static BigInteger g(String role, BigInteger x10) {
        if (x10.signum() >= 0) {
            return x10;
        }
        throw new IllegalArgumentException(role + " (" + x10 + ") must be >= 0");
    }

    @qj.a
    public static int h(String role, int x10) {
        if (x10 > 0) {
            return x10;
        }
        throw new IllegalArgumentException(role + " (" + x10 + ") must be > 0");
    }

    @qj.a
    public static long i(String role, long x10) {
        if (x10 > 0) {
            return x10;
        }
        throw new IllegalArgumentException(role + " (" + x10 + ") must be > 0");
    }

    @qj.a
    public static BigInteger j(String role, BigInteger x10) {
        if (x10.signum() > 0) {
            return x10;
        }
        throw new IllegalArgumentException(role + " (" + x10 + ") must be > 0");
    }

    public static void k(boolean condition) {
        if (!condition) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
