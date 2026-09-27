package jr;

import dr.e2;
import dr.i2;
import dr.l1;
import dr.m2;
import dr.r2;
import dr.s2;
import dr.x;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class n {
    @l1(version = "1.5")
    public static final short a(short s10, short s11) {
        return m0.t(s10 & r2.f79504e, 65535 & s11) >= 0 ? s10 : s11;
    }

    @l1(version = "1.5")
    public static int b(int i10, int i11) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) >= 0 ? i10 : i11;
    }

    @l1(version = "1.5")
    public static final byte c(byte b10, byte b11) {
        return m0.t(b10 & 255, b11 & 255) >= 0 ? b10 : b11;
    }

    @l1(version = sc.k.f129877g)
    @x
    public static final int d(int i10, @oy.l int... other) {
        m0.p(other, "other");
        int iQ = i2.q(other);
        for (int i11 = 0; i11 < iQ; i11++) {
            i10 = b(i10, i2.n(other, i11));
        }
        return i10;
    }

    @l1(version = sc.k.f129877g)
    @x
    public static final long e(long j10, @oy.l long... other) {
        m0.p(other, "other");
        int iN = m2.n(other);
        for (int i10 = 0; i10 < iN; i10++) {
            j10 = j(j10, m2.l(other, i10));
        }
        return j10;
    }

    @l1(version = "1.5")
    @ur.f
    public static final short f(short s10, short s11, short s12) {
        return a(s10, a(s11, s12));
    }

    @l1(version = "1.5")
    @ur.f
    public static final int g(int i10, int i11, int i12) {
        return b(i10, b(i11, i12));
    }

    @l1(version = sc.k.f129877g)
    @x
    public static final byte h(byte b10, @oy.l byte... other) {
        m0.p(other, "other");
        int iN = e2.n(other);
        for (int i10 = 0; i10 < iN; i10++) {
            b10 = c(b10, e2.l(other, i10));
        }
        return b10;
    }

    @l1(version = "1.5")
    @ur.f
    public static final byte i(byte b10, byte b11, byte b12) {
        return c(b10, c(b11, b12));
    }

    @l1(version = "1.5")
    public static long j(long j10, long j11) {
        return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) >= 0 ? j10 : j11;
    }

    @l1(version = "1.5")
    @ur.f
    public static final long k(long j10, long j11, long j12) {
        return j(j10, j(j11, j12));
    }

    @l1(version = sc.k.f129877g)
    @x
    public static final short l(short s10, @oy.l short... other) {
        m0.p(other, "other");
        int iN = s2.n(other);
        for (int i10 = 0; i10 < iN; i10++) {
            s10 = a(s10, s2.l(other, i10));
        }
        return s10;
    }

    @l1(version = "1.5")
    public static final short m(short s10, short s11) {
        return m0.t(s10 & r2.f79504e, 65535 & s11) <= 0 ? s10 : s11;
    }

    @l1(version = "1.5")
    public static int n(int i10, int i11) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) <= 0 ? i10 : i11;
    }

    @l1(version = "1.5")
    public static final byte o(byte b10, byte b11) {
        return m0.t(b10 & 255, b11 & 255) <= 0 ? b10 : b11;
    }

    @l1(version = sc.k.f129877g)
    @x
    public static final int p(int i10, @oy.l int... other) {
        m0.p(other, "other");
        int iQ = i2.q(other);
        for (int i11 = 0; i11 < iQ; i11++) {
            i10 = n(i10, i2.n(other, i11));
        }
        return i10;
    }

    @l1(version = sc.k.f129877g)
    @x
    public static final long q(long j10, @oy.l long... other) {
        m0.p(other, "other");
        int iN = m2.n(other);
        for (int i10 = 0; i10 < iN; i10++) {
            j10 = v(j10, m2.l(other, i10));
        }
        return j10;
    }

    @l1(version = "1.5")
    @ur.f
    public static final short r(short s10, short s11, short s12) {
        return m(s10, m(s11, s12));
    }

    @l1(version = "1.5")
    @ur.f
    public static final int s(int i10, int i11, int i12) {
        return n(i10, n(i11, i12));
    }

    @l1(version = sc.k.f129877g)
    @x
    public static final byte t(byte b10, @oy.l byte... other) {
        m0.p(other, "other");
        int iN = e2.n(other);
        for (int i10 = 0; i10 < iN; i10++) {
            b10 = o(b10, e2.l(other, i10));
        }
        return b10;
    }

    @l1(version = "1.5")
    @ur.f
    public static final byte u(byte b10, byte b11, byte b12) {
        return o(b10, o(b11, b12));
    }

    @l1(version = "1.5")
    public static long v(long j10, long j11) {
        return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) <= 0 ? j10 : j11;
    }

    @l1(version = "1.5")
    @ur.f
    public static final long w(long j10, long j11, long j12) {
        return v(j10, v(j11, j12));
    }

    @l1(version = sc.k.f129877g)
    @x
    public static final short x(short s10, @oy.l short... other) {
        m0.p(other, "other");
        int iN = s2.n(other);
        for (int i10 = 0; i10 < iN; i10++) {
            s10 = m(s10, s2.l(other, i10));
        }
        return s10;
    }
}
