package dr;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class r0 {
    @l1(version = "1.2")
    @ur.f
    public static final BigDecimal a(BigDecimal bigDecimal) {
        kotlin.jvm.internal.m0.p(bigDecimal, "<this>");
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(BigDecimal.ONE);
        kotlin.jvm.internal.m0.o(bigDecimalSubtract, "subtract(...)");
        return bigDecimalSubtract;
    }

    @ur.f
    public static final BigDecimal b(BigDecimal bigDecimal, BigDecimal other) {
        kotlin.jvm.internal.m0.p(bigDecimal, "<this>");
        kotlin.jvm.internal.m0.p(other, "other");
        BigDecimal bigDecimalDivide = bigDecimal.divide(other, RoundingMode.HALF_EVEN);
        kotlin.jvm.internal.m0.o(bigDecimalDivide, "divide(...)");
        return bigDecimalDivide;
    }

    @l1(version = "1.2")
    @ur.f
    public static final BigDecimal c(BigDecimal bigDecimal) {
        kotlin.jvm.internal.m0.p(bigDecimal, "<this>");
        BigDecimal bigDecimalAdd = bigDecimal.add(BigDecimal.ONE);
        kotlin.jvm.internal.m0.o(bigDecimalAdd, "add(...)");
        return bigDecimalAdd;
    }

    @ur.f
    public static final BigDecimal d(BigDecimal bigDecimal, BigDecimal other) {
        kotlin.jvm.internal.m0.p(bigDecimal, "<this>");
        kotlin.jvm.internal.m0.p(other, "other");
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(other);
        kotlin.jvm.internal.m0.o(bigDecimalSubtract, "subtract(...)");
        return bigDecimalSubtract;
    }

    @ur.f
    public static final BigDecimal e(BigDecimal bigDecimal, BigDecimal other) {
        kotlin.jvm.internal.m0.p(bigDecimal, "<this>");
        kotlin.jvm.internal.m0.p(other, "other");
        BigDecimal bigDecimalAdd = bigDecimal.add(other);
        kotlin.jvm.internal.m0.o(bigDecimalAdd, "add(...)");
        return bigDecimalAdd;
    }

    @ur.f
    public static final BigDecimal f(BigDecimal bigDecimal, BigDecimal other) {
        kotlin.jvm.internal.m0.p(bigDecimal, "<this>");
        kotlin.jvm.internal.m0.p(other, "other");
        BigDecimal bigDecimalRemainder = bigDecimal.remainder(other);
        kotlin.jvm.internal.m0.o(bigDecimalRemainder, "remainder(...)");
        return bigDecimalRemainder;
    }

    @ur.f
    public static final BigDecimal g(BigDecimal bigDecimal, BigDecimal other) {
        kotlin.jvm.internal.m0.p(bigDecimal, "<this>");
        kotlin.jvm.internal.m0.p(other, "other");
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(other);
        kotlin.jvm.internal.m0.o(bigDecimalMultiply, "multiply(...)");
        return bigDecimalMultiply;
    }

    @l1(version = "1.2")
    @ur.f
    public static final BigDecimal h(double d10) {
        return new BigDecimal(String.valueOf(d10));
    }

    @l1(version = "1.2")
    @ur.f
    public static final BigDecimal i(double d10, MathContext mathContext) {
        kotlin.jvm.internal.m0.p(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(d10), mathContext);
    }

    @l1(version = "1.2")
    @ur.f
    public static final BigDecimal j(float f10) {
        return new BigDecimal(String.valueOf(f10));
    }

    @l1(version = "1.2")
    @ur.f
    public static final BigDecimal k(float f10, MathContext mathContext) {
        kotlin.jvm.internal.m0.p(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(f10), mathContext);
    }

    @l1(version = "1.2")
    @ur.f
    public static final BigDecimal l(int i10) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i10);
        kotlin.jvm.internal.m0.o(bigDecimalValueOf, "valueOf(...)");
        return bigDecimalValueOf;
    }

    @l1(version = "1.2")
    @ur.f
    public static final BigDecimal m(int i10, MathContext mathContext) {
        kotlin.jvm.internal.m0.p(mathContext, "mathContext");
        return new BigDecimal(i10, mathContext);
    }

    @l1(version = "1.2")
    @ur.f
    public static final BigDecimal n(long j10) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j10);
        kotlin.jvm.internal.m0.o(bigDecimalValueOf, "valueOf(...)");
        return bigDecimalValueOf;
    }

    @l1(version = "1.2")
    @ur.f
    public static final BigDecimal o(long j10, MathContext mathContext) {
        kotlin.jvm.internal.m0.p(mathContext, "mathContext");
        return new BigDecimal(j10, mathContext);
    }

    @ur.f
    public static final BigDecimal p(BigDecimal bigDecimal) {
        kotlin.jvm.internal.m0.p(bigDecimal, "<this>");
        BigDecimal bigDecimalNegate = bigDecimal.negate();
        kotlin.jvm.internal.m0.o(bigDecimalNegate, "negate(...)");
        return bigDecimalNegate;
    }
}
