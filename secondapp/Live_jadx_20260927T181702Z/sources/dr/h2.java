package dr;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@cs.h
@l1(version = "1.5")
public final class h2 implements Comparable<h2> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final a f79454c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f79455d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f79456e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f79457f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f79458g = 32;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f79459b;

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
    public /* synthetic */ h2(int i10) {
        this.f79459b = i10;
    }

    @ur.f
    public static final long A(int i10, long j10) {
        return l2.h(l2.h(((long) i10) & 4294967295L) - j10);
    }

    @ur.f
    public static final int B(int i10, int i11) {
        return h(i10 - i11);
    }

    @ur.f
    public static final int C(int i10, short s10) {
        return h(i10 - h(s10 & r2.f79504e));
    }

    @ur.f
    public static final byte E(int i10, byte b10) {
        return d2.h((byte) z1.a(i10, h(b10 & 255)));
    }

    @ur.f
    public static final long F(int i10, long j10) {
        return a2.a(l2.h(((long) i10) & 4294967295L), j10);
    }

    @ur.f
    public static final int G(int i10, int i11) {
        return z1.a(i10, i11);
    }

    @ur.f
    public static final short H(int i10, short s10) {
        return r2.h((short) z1.a(i10, h(s10 & r2.f79504e)));
    }

    @ur.f
    public static final int I(int i10, int i11) {
        return h(i10 | i11);
    }

    @ur.f
    public static final int J(int i10, byte b10) {
        return h(i10 + h(b10 & 255));
    }

    @ur.f
    public static final long K(int i10, long j10) {
        return l2.h(l2.h(((long) i10) & 4294967295L) + j10);
    }

    @ur.f
    public static final int M(int i10, int i11) {
        return h(i10 + i11);
    }

    @ur.f
    public static final int N(int i10, short s10) {
        return h(i10 + h(s10 & r2.f79504e));
    }

    @ur.f
    public static final ms.x O(int i10, int i11) {
        return new ms.x(i10, i11, null);
    }

    @l1(version = "1.9")
    @ur.f
    @a3(markerClass = {v.class})
    public static final ms.x P(int i10, int i11) {
        return ms.c0.V(i10, i11);
    }

    @ur.f
    public static final int Q(int i10, byte b10) {
        return z1.a(i10, h(b10 & 255));
    }

    @ur.f
    public static final long R(int i10, long j10) {
        return a2.a(l2.h(((long) i10) & 4294967295L), j10);
    }

    @ur.f
    public static final int S(int i10, int i11) {
        return z2.g(i10, i11);
    }

    @ur.f
    public static final int T(int i10, short s10) {
        return z1.a(i10, h(s10 & r2.f79504e));
    }

    @ur.f
    public static final int U(int i10, int i11) {
        return h(i10 << i11);
    }

    @ur.f
    public static final int V(int i10, int i11) {
        return h(i10 >>> i11);
    }

    @ur.f
    public static final int X(int i10, byte b10) {
        return h(i10 * h(b10 & 255));
    }

    @ur.f
    public static final long Y(int i10, long j10) {
        return l2.h(l2.h(((long) i10) & 4294967295L) * j10);
    }

    @ur.f
    public static final int Z(int i10, int i11) {
        return h(i10 * i11);
    }

    @ur.f
    public static final int a(int i10, int i11) {
        return h(i10 & i11);
    }

    @ur.f
    public static final int a0(int i10, short s10) {
        return h(i10 * h(s10 & r2.f79504e));
    }

    public static final /* synthetic */ h2 b(int i10) {
        return new h2(i10);
    }

    @ur.f
    public static final byte b0(int i10) {
        return (byte) i10;
    }

    @ur.f
    public static final int c(int i10, byte b10) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, h(b10 & 255) ^ Integer.MIN_VALUE);
    }

    @ur.f
    public static final double c0(int i10) {
        return z2.h(i10);
    }

    @ur.f
    public static final int d(int i10, long j10) {
        return Long.compare(l2.h(((long) i10) & 4294967295L) ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE);
    }

    @ur.f
    public static final float d0(int i10) {
        return (float) z2.h(i10);
    }

    @ur.f
    public static int f(int i10, int i11) {
        return z2.e(i10, i11);
    }

    @ur.f
    public static final long f0(int i10) {
        return ((long) i10) & 4294967295L;
    }

    @ur.f
    public static final int g(int i10, short s10) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, h(s10 & r2.f79504e) ^ Integer.MIN_VALUE);
    }

    @ur.f
    public static final short g0(int i10) {
        return (short) i10;
    }

    @oy.l
    public static String h0(int i10) {
        return String.valueOf(((long) i10) & 4294967295L);
    }

    @ur.f
    public static final int i(int i10) {
        return h(i10 - 1);
    }

    @ur.f
    public static final byte i0(int i10) {
        return d2.h((byte) i10);
    }

    @ur.f
    public static final int j(int i10, byte b10) {
        return y1.a(i10, h(b10 & 255));
    }

    @ur.f
    public static final long k(int i10, long j10) {
        return b2.a(l2.h(((long) i10) & 4294967295L), j10);
    }

    @ur.f
    public static final long k0(int i10) {
        return l2.h(((long) i10) & 4294967295L);
    }

    @ur.f
    public static final int l(int i10, int i11) {
        return z2.f(i10, i11);
    }

    @ur.f
    public static final short l0(int i10) {
        return r2.h((short) i10);
    }

    @ur.f
    public static final int m(int i10, short s10) {
        return y1.a(i10, h(s10 & r2.f79504e));
    }

    public static boolean n(int i10, Object obj) {
        return (obj instanceof h2) && i10 == ((h2) obj).m0();
    }

    @ur.f
    public static final int n0(int i10, int i11) {
        return h(i10 ^ i11);
    }

    public static final boolean o(int i10, int i11) {
        return i10 == i11;
    }

    @ur.f
    public static final int q(int i10, byte b10) {
        return y1.a(i10, h(b10 & 255));
    }

    @ur.f
    public static final long s(int i10, long j10) {
        return b2.a(l2.h(((long) i10) & 4294967295L), j10);
    }

    @ur.f
    public static final int t(int i10, int i11) {
        return y1.a(i10, i11);
    }

    @ur.f
    public static final int u(int i10, short s10) {
        return y1.a(i10, h(s10 & r2.f79504e));
    }

    @ur.f
    public static final int x(int i10) {
        return h(i10 + 1);
    }

    @ur.f
    public static final int y(int i10) {
        return h(~i10);
    }

    @ur.f
    public static final int z(int i10, byte b10) {
        return h(i10 - h(b10 & 255));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(h2 h2Var) {
        return z2.e(m0(), h2Var.m0());
    }

    @ur.f
    public final int e(int i10) {
        return z2.e(m0(), i10);
    }

    public boolean equals(Object obj) {
        return n(this.f79459b, obj);
    }

    public int hashCode() {
        return w(this.f79459b);
    }

    public final /* synthetic */ int m0() {
        return this.f79459b;
    }

    @oy.l
    public String toString() {
        return h0(this.f79459b);
    }

    @f1
    public static /* synthetic */ void v() {
    }

    @ur.f
    public static final int e0(int i10) {
        return i10;
    }

    @f1
    @ur.g
    public static int h(int i10) {
        return i10;
    }

    @ur.f
    public static final int j0(int i10) {
        return i10;
    }

    public static int w(int i10) {
        return i10;
    }
}
