package lj;

import java.io.Serializable;
import java.math.BigInteger;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@f
@yi.b(serializable = true)
public final class x extends Number implements Comparable<x>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f104676c = Long.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f104677d = new x(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x f104678e = new x(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x f104679f = new x(-1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f104680b;

    public x(long value) {
        this.f104680b = value;
    }

    public static x g(long bits) {
        return new x(bits);
    }

    @qj.a
    public static x m(long value) {
        l0.p(value >= 0, "value (%s) is outside the range for an unsigned long value", value);
        return g(value);
    }

    @qj.a
    public static x n(String string) {
        return o(string, 10);
    }

    @qj.a
    public static x o(String string, int radix) {
        return g(y.j(string, radix));
    }

    @qj.a
    public static x q(BigInteger value) {
        l0.E(value);
        l0.u(value.signum() >= 0 && value.bitLength() <= 64, "value (%s) is outside the range for an unsigned long value", value);
        return g(value.longValue());
    }

    public BigInteger d() {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(this.f104680b & Long.MAX_VALUE);
        return this.f104680b < 0 ? bigIntegerValueOf.setBit(63) : bigIntegerValueOf;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        long j10 = this.f104680b;
        if (j10 >= 0) {
            return j10;
        }
        return ((j10 & 1) | (j10 >>> 1)) * 2.0d;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(x o10) {
        l0.E(o10);
        return y.a(this.f104680b, o10.f104680b);
    }

    public boolean equals(@zq.a Object obj) {
        return (obj instanceof x) && this.f104680b == ((x) obj).f104680b;
    }

    public x f(x val) {
        return g(y.c(this.f104680b, ((x) l0.E(val)).f104680b));
    }

    @Override // java.lang.Number
    public float floatValue() {
        long j10 = this.f104680b;
        if (j10 >= 0) {
            return j10;
        }
        return ((j10 & 1) | (j10 >>> 1)) * 2.0f;
    }

    public x h(x val) {
        return g(this.f104680b - ((x) l0.E(val)).f104680b);
    }

    public int hashCode() {
        return n.l(this.f104680b);
    }

    public x i(x val) {
        return g(y.k(this.f104680b, ((x) l0.E(val)).f104680b));
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.f104680b;
    }

    public x j(x val) {
        return g(this.f104680b + ((x) l0.E(val)).f104680b);
    }

    public x k(x val) {
        return g(this.f104680b * ((x) l0.E(val)).f104680b);
    }

    public String l(int radix) {
        return y.q(this.f104680b, radix);
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.f104680b;
    }

    public String toString() {
        return y.p(this.f104680b);
    }
}
