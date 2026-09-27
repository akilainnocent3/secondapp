package dr;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@cs.h
@l1(version = "1.5")
public final class l2 implements Comparable<l2> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final a f79474c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f79475d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f79476e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f79477f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f79478g = 64;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f79479b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        public a() {
        }
    }

    @f1
    @ur.g
    public /* synthetic */ l2(long j10) {
        this.f79479b = j10;
    }

    @ur.f
    public static final long A(long j10, long j11) {
        return h(j10 - j11);
    }

    @ur.f
    public static final long B(long j10, int i10) {
        return h(j10 - h(((long) i10) & 4294967295L));
    }

    @ur.f
    public static final long C(long j10, short s10) {
        return h(j10 - h(((long) s10) & 65535));
    }

    @ur.f
    public static final byte E(long j10, byte b10) {
        return d2.h((byte) a2.a(j10, h(((long) b10) & 255)));
    }

    @ur.f
    public static final long F(long j10, long j11) {
        return a2.a(j10, j11);
    }

    @ur.f
    public static final int G(long j10, int i10) {
        return h2.h((int) a2.a(j10, h(((long) i10) & 4294967295L)));
    }

    @ur.f
    public static final short H(long j10, short s10) {
        return r2.h((short) a2.a(j10, h(((long) s10) & 65535)));
    }

    @ur.f
    public static final long I(long j10, long j11) {
        return h(j10 | j11);
    }

    @ur.f
    public static final long J(long j10, byte b10) {
        return h(j10 + h(((long) b10) & 255));
    }

    @ur.f
    public static final long K(long j10, long j11) {
        return h(j10 + j11);
    }

    @ur.f
    public static final long M(long j10, int i10) {
        return h(j10 + h(((long) i10) & 4294967295L));
    }

    @ur.f
    public static final long N(long j10, short s10) {
        return h(j10 + h(((long) s10) & 65535));
    }

    @ur.f
    public static final ms.a0 O(long j10, long j11) {
        return new ms.a0(j10, j11, null);
    }

    @l1(version = "1.9")
    @ur.f
    @a3(markerClass = {v.class})
    public static final ms.a0 P(long j10, long j11) {
        return ms.c0.X(j10, j11);
    }

    @ur.f
    public static final long Q(long j10, byte b10) {
        return a2.a(j10, h(((long) b10) & 255));
    }

    @ur.f
    public static final long R(long j10, long j11) {
        return z2.p(j10, j11);
    }

    @ur.f
    public static final long S(long j10, int i10) {
        return a2.a(j10, h(((long) i10) & 4294967295L));
    }

    @ur.f
    public static final long T(long j10, short s10) {
        return a2.a(j10, h(((long) s10) & 65535));
    }

    @ur.f
    public static final long U(long j10, int i10) {
        return h(j10 << i10);
    }

    @ur.f
    public static final long V(long j10, int i10) {
        return h(j10 >>> i10);
    }

    @ur.f
    public static final long X(long j10, byte b10) {
        return h(j10 * h(((long) b10) & 255));
    }

    @ur.f
    public static final long Y(long j10, long j11) {
        return h(j10 * j11);
    }

    @ur.f
    public static final long Z(long j10, int i10) {
        return h(j10 * h(((long) i10) & 4294967295L));
    }

    @ur.f
    public static final long a(long j10, long j11) {
        return h(j10 & j11);
    }

    @ur.f
    public static final long a0(long j10, short s10) {
        return h(j10 * h(((long) s10) & 65535));
    }

    public static final /* synthetic */ l2 b(long j10) {
        return new l2(j10);
    }

    @ur.f
    public static final byte b0(long j10) {
        return (byte) j10;
    }

    @ur.f
    public static final int c(long j10, byte b10) {
        return Long.compare(j10 ^ Long.MIN_VALUE, h(((long) b10) & 255) ^ Long.MIN_VALUE);
    }

    @ur.f
    public static final double c0(long j10) {
        return z2.q(j10);
    }

    @ur.f
    public static final float d0(long j10) {
        return (float) z2.q(j10);
    }

    @ur.f
    public static int e(long j10, long j11) {
        return z2.n(j10, j11);
    }

    @ur.f
    public static final int e0(long j10) {
        return (int) j10;
    }

    @ur.f
    public static final int f(long j10, int i10) {
        return Long.compare(j10 ^ Long.MIN_VALUE, h(((long) i10) & 4294967295L) ^ Long.MIN_VALUE);
    }

    @ur.f
    public static final int g(long j10, short s10) {
        return Long.compare(j10 ^ Long.MIN_VALUE, h(((long) s10) & 65535) ^ Long.MIN_VALUE);
    }

    @ur.f
    public static final short g0(long j10) {
        return (short) j10;
    }

    @oy.l
    public static String h0(long j10) {
        return z2.t(j10, 10);
    }

    @ur.f
    public static final long i(long j10) {
        return h(j10 - 1);
    }

    @ur.f
    public static final byte i0(long j10) {
        return d2.h((byte) j10);
    }

    @ur.f
    public static final long j(long j10, byte b10) {
        return b2.a(j10, h(((long) b10) & 255));
    }

    @ur.f
    public static final int j0(long j10) {
        return h2.h((int) j10);
    }

    @ur.f
    public static final long k(long j10, long j11) {
        return z2.o(j10, j11);
    }

    @ur.f
    public static final long l(long j10, int i10) {
        return b2.a(j10, h(((long) i10) & 4294967295L));
    }

    @ur.f
    public static final short l0(long j10) {
        return r2.h((short) j10);
    }

    @ur.f
    public static final long m(long j10, short s10) {
        return b2.a(j10, h(((long) s10) & 65535));
    }

    public static boolean n(long j10, Object obj) {
        return (obj instanceof l2) && j10 == ((l2) obj).m0();
    }

    @ur.f
    public static final long n0(long j10, long j11) {
        return h(j10 ^ j11);
    }

    public static final boolean o(long j10, long j11) {
        return j10 == j11;
    }

    @ur.f
    public static final long q(long j10, byte b10) {
        return b2.a(j10, h(((long) b10) & 255));
    }

    @ur.f
    public static final long s(long j10, long j11) {
        return b2.a(j10, j11);
    }

    @ur.f
    public static final long t(long j10, int i10) {
        return b2.a(j10, h(((long) i10) & 4294967295L));
    }

    @ur.f
    public static final long u(long j10, short s10) {
        return b2.a(j10, h(((long) s10) & 65535));
    }

    public static int w(long j10) {
        return f0.p.a(j10);
    }

    @ur.f
    public static final long x(long j10) {
        return h(j10 + 1);
    }

    @ur.f
    public static final long y(long j10) {
        return h(~j10);
    }

    @ur.f
    public static final long z(long j10, byte b10) {
        return h(j10 - h(((long) b10) & 255));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(l2 l2Var) {
        return z2.n(m0(), l2Var.m0());
    }

    @ur.f
    public final int d(long j10) {
        return z2.n(m0(), j10);
    }

    public boolean equals(Object obj) {
        return n(this.f79479b, obj);
    }

    public int hashCode() {
        return w(this.f79479b);
    }

    public final /* synthetic */ long m0() {
        return this.f79479b;
    }

    @oy.l
    public String toString() {
        return h0(this.f79479b);
    }

    @f1
    public static /* synthetic */ void v() {
    }

    @ur.f
    public static final long f0(long j10) {
        return j10;
    }

    @f1
    @ur.g
    public static long h(long j10) {
        return j10;
    }

    @ur.f
    public static final long k0(long j10) {
        return j10;
    }
}
