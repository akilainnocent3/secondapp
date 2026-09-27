package jr;

import dr.l1;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class h extends g {
    @l1(version = "1.1")
    @ur.f
    public static final byte I(byte b10, byte b11) {
        return (byte) Math.max((int) b10, (int) b11);
    }

    @l1(version = "1.1")
    @ur.f
    public static final byte J(byte b10, byte b11, byte b12) {
        return (byte) Math.max((int) b10, Math.max((int) b11, (int) b12));
    }

    @l1(version = sc.k.f129877g)
    public static final byte K(byte b10, @oy.l byte... other) {
        m0.p(other, "other");
        for (byte b11 : other) {
            b10 = (byte) Math.max((int) b10, (int) b11);
        }
        return b10;
    }

    @l1(version = "1.1")
    @ur.f
    public static final double L(double d10, double d11) {
        return Math.max(d10, d11);
    }

    @l1(version = "1.1")
    @ur.f
    public static final double M(double d10, double d11, double d12) {
        return Math.max(d10, Math.max(d11, d12));
    }

    @l1(version = sc.k.f129877g)
    public static final double N(double d10, @oy.l double... other) {
        m0.p(other, "other");
        for (double d11 : other) {
            d10 = Math.max(d10, d11);
        }
        return d10;
    }

    @l1(version = "1.1")
    @ur.f
    public static final float O(float f10, float f11) {
        return Math.max(f10, f11);
    }

    @l1(version = "1.1")
    @ur.f
    public static final float P(float f10, float f11, float f12) {
        return Math.max(f10, Math.max(f11, f12));
    }

    @l1(version = sc.k.f129877g)
    public static final float Q(float f10, @oy.l float... other) {
        m0.p(other, "other");
        for (float f11 : other) {
            f10 = Math.max(f10, f11);
        }
        return f10;
    }

    @l1(version = "1.1")
    @ur.f
    public static final int R(int i10, int i11) {
        return Math.max(i10, i11);
    }

    @l1(version = "1.1")
    @ur.f
    public static final int S(int i10, int i11, int i12) {
        return Math.max(i10, Math.max(i11, i12));
    }

    @l1(version = sc.k.f129877g)
    public static int T(int i10, @oy.l int... other) {
        m0.p(other, "other");
        for (int i11 : other) {
            i10 = Math.max(i10, i11);
        }
        return i10;
    }

    @l1(version = "1.1")
    @ur.f
    public static final long U(long j10, long j11) {
        return Math.max(j10, j11);
    }

    @l1(version = "1.1")
    @ur.f
    public static final long V(long j10, long j11, long j12) {
        return Math.max(j10, Math.max(j11, j12));
    }

    @l1(version = sc.k.f129877g)
    public static final long W(long j10, @oy.l long... other) {
        m0.p(other, "other");
        for (long j11 : other) {
            j10 = Math.max(j10, j11);
        }
        return j10;
    }

    @oy.l
    @l1(version = "1.1")
    public static <T extends Comparable<? super T>> T X(@oy.l T a10, @oy.l T b10) {
        m0.p(a10, "a");
        m0.p(b10, "b");
        return a10.compareTo(b10) >= 0 ? a10 : b10;
    }

    @oy.l
    @l1(version = "1.1")
    public static final <T extends Comparable<? super T>> T Y(@oy.l T a10, @oy.l T b10, @oy.l T c10) {
        m0.p(a10, "a");
        m0.p(b10, "b");
        m0.p(c10, "c");
        return (T) X(a10, X(b10, c10));
    }

    @oy.l
    @l1(version = sc.k.f129877g)
    public static final <T extends Comparable<? super T>> T Z(@oy.l T a10, @oy.l T... other) {
        m0.p(a10, "a");
        m0.p(other, "other");
        for (T t10 : other) {
            a10 = (T) X(a10, t10);
        }
        return a10;
    }

    @l1(version = "1.1")
    @ur.f
    public static final short a0(short s10, short s11) {
        return (short) Math.max((int) s10, (int) s11);
    }

    @l1(version = "1.1")
    @ur.f
    public static final short b0(short s10, short s11, short s12) {
        return (short) Math.max((int) s10, Math.max((int) s11, (int) s12));
    }

    @l1(version = sc.k.f129877g)
    public static final short c0(short s10, @oy.l short... other) {
        m0.p(other, "other");
        for (short s11 : other) {
            s10 = (short) Math.max((int) s10, (int) s11);
        }
        return s10;
    }

    @l1(version = "1.1")
    @ur.f
    public static final byte d0(byte b10, byte b11) {
        return (byte) Math.min((int) b10, (int) b11);
    }

    @l1(version = "1.1")
    @ur.f
    public static final byte e0(byte b10, byte b11, byte b12) {
        return (byte) Math.min((int) b10, Math.min((int) b11, (int) b12));
    }

    @l1(version = sc.k.f129877g)
    public static final byte f0(byte b10, @oy.l byte... other) {
        m0.p(other, "other");
        for (byte b11 : other) {
            b10 = (byte) Math.min((int) b10, (int) b11);
        }
        return b10;
    }

    @l1(version = "1.1")
    @ur.f
    public static final double g0(double d10, double d11) {
        return Math.min(d10, d11);
    }

    @l1(version = "1.1")
    @ur.f
    public static final double h0(double d10, double d11, double d12) {
        return Math.min(d10, Math.min(d11, d12));
    }

    @l1(version = sc.k.f129877g)
    public static final double i0(double d10, @oy.l double... other) {
        m0.p(other, "other");
        for (double d11 : other) {
            d10 = Math.min(d10, d11);
        }
        return d10;
    }

    @l1(version = "1.1")
    @ur.f
    public static final float j0(float f10, float f11) {
        return Math.min(f10, f11);
    }

    @l1(version = "1.1")
    @ur.f
    public static final float k0(float f10, float f11, float f12) {
        return Math.min(f10, Math.min(f11, f12));
    }

    @l1(version = sc.k.f129877g)
    public static final float l0(float f10, @oy.l float... other) {
        m0.p(other, "other");
        for (float f11 : other) {
            f10 = Math.min(f10, f11);
        }
        return f10;
    }

    @l1(version = "1.1")
    @ur.f
    public static final int m0(int i10, int i11) {
        return Math.min(i10, i11);
    }

    @l1(version = "1.1")
    @ur.f
    public static final int n0(int i10, int i11, int i12) {
        return Math.min(i10, Math.min(i11, i12));
    }

    @l1(version = sc.k.f129877g)
    public static final int o0(int i10, @oy.l int... other) {
        m0.p(other, "other");
        for (int i11 : other) {
            i10 = Math.min(i10, i11);
        }
        return i10;
    }

    @l1(version = "1.1")
    @ur.f
    public static final long p0(long j10, long j11) {
        return Math.min(j10, j11);
    }

    @l1(version = "1.1")
    @ur.f
    public static final long q0(long j10, long j11, long j12) {
        return Math.min(j10, Math.min(j11, j12));
    }

    @l1(version = sc.k.f129877g)
    public static final long r0(long j10, @oy.l long... other) {
        m0.p(other, "other");
        for (long j11 : other) {
            j10 = Math.min(j10, j11);
        }
        return j10;
    }

    @oy.l
    @l1(version = "1.1")
    public static final <T extends Comparable<? super T>> T s0(@oy.l T a10, @oy.l T b10) {
        m0.p(a10, "a");
        m0.p(b10, "b");
        return a10.compareTo(b10) <= 0 ? a10 : b10;
    }

    @oy.l
    @l1(version = "1.1")
    public static final <T extends Comparable<? super T>> T t0(@oy.l T a10, @oy.l T b10, @oy.l T c10) {
        m0.p(a10, "a");
        m0.p(b10, "b");
        m0.p(c10, "c");
        return (T) s0(a10, s0(b10, c10));
    }

    @oy.l
    @l1(version = sc.k.f129877g)
    public static final <T extends Comparable<? super T>> T u0(@oy.l T a10, @oy.l T... other) {
        m0.p(a10, "a");
        m0.p(other, "other");
        for (T t10 : other) {
            a10 = (T) s0(a10, t10);
        }
        return a10;
    }

    @l1(version = "1.1")
    @ur.f
    public static final short v0(short s10, short s11) {
        return (short) Math.min((int) s10, (int) s11);
    }

    @l1(version = "1.1")
    @ur.f
    public static final short w0(short s10, short s11, short s12) {
        return (short) Math.min((int) s10, Math.min((int) s11, (int) s12));
    }

    @l1(version = sc.k.f129877g)
    public static final short x0(short s10, @oy.l short... other) {
        m0.p(other, "other");
        for (short s11 : other) {
            s10 = (short) Math.min((int) s10, (int) s11);
        }
        return s10;
    }
}
