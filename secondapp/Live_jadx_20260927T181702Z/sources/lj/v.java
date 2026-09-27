package lj;

import java.math.BigInteger;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@f
@yi.b(emulated = true)
public final class v extends Number implements Comparable<v> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f104669c = g(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f104670d = g(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v f104671e = g(-1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f104672b;

    public v(int value) {
        this.f104672b = value;
    }

    public static v g(int bits) {
        return new v(bits);
    }

    public static v m(long value) {
        l0.p((4294967295L & value) == value, "value (%s) is outside the range for an unsigned integer value", value);
        return g((int) value);
    }

    public static v n(String string) {
        return o(string, 10);
    }

    public static v o(String string, int radix) {
        return g(w.k(string, radix));
    }

    public static v q(BigInteger value) {
        l0.E(value);
        l0.u(value.signum() >= 0 && value.bitLength() <= 32, "value (%s) is outside the range for an unsigned integer value", value);
        return g(value.intValue());
    }

    public BigInteger d() {
        return BigInteger.valueOf(longValue());
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return longValue();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(v other) {
        l0.E(other);
        return w.b(this.f104672b, other.f104672b);
    }

    public boolean equals(@zq.a Object obj) {
        return (obj instanceof v) && this.f104672b == ((v) obj).f104672b;
    }

    public v f(v val) {
        return g(w.d(this.f104672b, ((v) l0.E(val)).f104672b));
    }

    @Override // java.lang.Number
    public float floatValue() {
        return longValue();
    }

    public v h(v val) {
        return g(this.f104672b - ((v) l0.E(val)).f104672b);
    }

    public int hashCode() {
        return this.f104672b;
    }

    public v i(v val) {
        return g(w.l(this.f104672b, ((v) l0.E(val)).f104672b));
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.f104672b;
    }

    public v j(v val) {
        return g(this.f104672b + ((v) l0.E(val)).f104672b);
    }

    @yi.c
    @yi.d
    public v k(v val) {
        return g(this.f104672b * ((v) l0.E(val)).f104672b);
    }

    public String l(int radix) {
        return w.t(this.f104672b, radix);
    }

    @Override // java.lang.Number
    public long longValue() {
        return w.r(this.f104672b);
    }

    public String toString() {
        return l(10);
    }
}
