package dr;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class s0 extends r0 {
    @l1(version = "1.2")
    @ur.f
    public static final BigInteger A(BigInteger bigInteger, int i10) {
        kotlin.jvm.internal.m0.p(bigInteger, "<this>");
        BigInteger bigIntegerShiftRight = bigInteger.shiftRight(i10);
        kotlin.jvm.internal.m0.o(bigIntegerShiftRight, "shiftRight(...)");
        return bigIntegerShiftRight;
    }

    @ur.f
    public static final BigInteger B(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.m0.p(bigInteger, "<this>");
        kotlin.jvm.internal.m0.p(other, "other");
        BigInteger bigIntegerMultiply = bigInteger.multiply(other);
        kotlin.jvm.internal.m0.o(bigIntegerMultiply, "multiply(...)");
        return bigIntegerMultiply;
    }

    @l1(version = "1.2")
    @ur.f
    public static final BigDecimal C(BigInteger bigInteger) {
        kotlin.jvm.internal.m0.p(bigInteger, "<this>");
        return new BigDecimal(bigInteger);
    }

    @l1(version = "1.2")
    @ur.f
    public static final BigDecimal D(BigInteger bigInteger, int i10, MathContext mathContext) {
        kotlin.jvm.internal.m0.p(bigInteger, "<this>");
        kotlin.jvm.internal.m0.p(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i10, mathContext);
    }

    public static /* synthetic */ BigDecimal E(BigInteger bigInteger, int i10, MathContext mathContext, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            mathContext = MathContext.UNLIMITED;
            kotlin.jvm.internal.m0.o(mathContext, "UNLIMITED");
        }
        kotlin.jvm.internal.m0.p(bigInteger, "<this>");
        kotlin.jvm.internal.m0.p(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i10, mathContext);
    }

    @l1(version = "1.2")
    @ur.f
    public static final BigInteger F(int i10) {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(i10);
        kotlin.jvm.internal.m0.o(bigIntegerValueOf, "valueOf(...)");
        return bigIntegerValueOf;
    }

    @l1(version = "1.2")
    @ur.f
    public static final BigInteger G(long j10) {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j10);
        kotlin.jvm.internal.m0.o(bigIntegerValueOf, "valueOf(...)");
        return bigIntegerValueOf;
    }

    @ur.f
    public static final BigInteger H(BigInteger bigInteger) {
        kotlin.jvm.internal.m0.p(bigInteger, "<this>");
        BigInteger bigIntegerNegate = bigInteger.negate();
        kotlin.jvm.internal.m0.o(bigIntegerNegate, "negate(...)");
        return bigIntegerNegate;
    }

    @l1(version = "1.2")
    @ur.f
    public static final BigInteger I(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.m0.p(bigInteger, "<this>");
        kotlin.jvm.internal.m0.p(other, "other");
        BigInteger bigIntegerXor = bigInteger.xor(other);
        kotlin.jvm.internal.m0.o(bigIntegerXor, "xor(...)");
        return bigIntegerXor;
    }

    @l1(version = "1.2")
    @ur.f
    public static final BigInteger q(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.m0.p(bigInteger, "<this>");
        kotlin.jvm.internal.m0.p(other, "other");
        BigInteger bigIntegerAnd = bigInteger.and(other);
        kotlin.jvm.internal.m0.o(bigIntegerAnd, "and(...)");
        return bigIntegerAnd;
    }

    @l1(version = "1.2")
    @ur.f
    public static final BigInteger r(BigInteger bigInteger) {
        kotlin.jvm.internal.m0.p(bigInteger, "<this>");
        BigInteger bigIntegerSubtract = bigInteger.subtract(BigInteger.ONE);
        kotlin.jvm.internal.m0.o(bigIntegerSubtract, "subtract(...)");
        return bigIntegerSubtract;
    }

    @ur.f
    public static final BigInteger s(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.m0.p(bigInteger, "<this>");
        kotlin.jvm.internal.m0.p(other, "other");
        BigInteger bigIntegerDivide = bigInteger.divide(other);
        kotlin.jvm.internal.m0.o(bigIntegerDivide, "divide(...)");
        return bigIntegerDivide;
    }

    @l1(version = "1.2")
    @ur.f
    public static final BigInteger t(BigInteger bigInteger) {
        kotlin.jvm.internal.m0.p(bigInteger, "<this>");
        BigInteger bigIntegerAdd = bigInteger.add(BigInteger.ONE);
        kotlin.jvm.internal.m0.o(bigIntegerAdd, "add(...)");
        return bigIntegerAdd;
    }

    @l1(version = "1.2")
    @ur.f
    public static final BigInteger u(BigInteger bigInteger) {
        kotlin.jvm.internal.m0.p(bigInteger, "<this>");
        BigInteger bigIntegerNot = bigInteger.not();
        kotlin.jvm.internal.m0.o(bigIntegerNot, "not(...)");
        return bigIntegerNot;
    }

    @ur.f
    public static final BigInteger v(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.m0.p(bigInteger, "<this>");
        kotlin.jvm.internal.m0.p(other, "other");
        BigInteger bigIntegerSubtract = bigInteger.subtract(other);
        kotlin.jvm.internal.m0.o(bigIntegerSubtract, "subtract(...)");
        return bigIntegerSubtract;
    }

    @l1(version = "1.2")
    @ur.f
    public static final BigInteger w(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.m0.p(bigInteger, "<this>");
        kotlin.jvm.internal.m0.p(other, "other");
        BigInteger bigIntegerOr = bigInteger.or(other);
        kotlin.jvm.internal.m0.o(bigIntegerOr, "or(...)");
        return bigIntegerOr;
    }

    @ur.f
    public static final BigInteger x(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.m0.p(bigInteger, "<this>");
        kotlin.jvm.internal.m0.p(other, "other");
        BigInteger bigIntegerAdd = bigInteger.add(other);
        kotlin.jvm.internal.m0.o(bigIntegerAdd, "add(...)");
        return bigIntegerAdd;
    }

    @l1(version = "1.1")
    @ur.f
    public static final BigInteger y(BigInteger bigInteger, BigInteger other) {
        kotlin.jvm.internal.m0.p(bigInteger, "<this>");
        kotlin.jvm.internal.m0.p(other, "other");
        BigInteger bigIntegerRemainder = bigInteger.remainder(other);
        kotlin.jvm.internal.m0.o(bigIntegerRemainder, "remainder(...)");
        return bigIntegerRemainder;
    }

    @l1(version = "1.2")
    @ur.f
    public static final BigInteger z(BigInteger bigInteger, int i10) {
        kotlin.jvm.internal.m0.p(bigInteger, "<this>");
        BigInteger bigIntegerShiftLeft = bigInteger.shiftLeft(i10);
        kotlin.jvm.internal.m0.o(bigIntegerShiftLeft, "shiftLeft(...)");
        return bigIntegerShiftLeft;
    }
}
