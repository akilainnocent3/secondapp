package ev;

import cv.p0;
import dr.f1;
import dr.l1;
import f0.j3;
import jv.w1;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@l1(version = "1.6")
@cs.h
@s1({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1062:1\n37#1:1063\n37#1:1064\n37#1:1065\n37#1:1066\n37#1:1067\n500#1:1068\n517#1:1076\n170#2,6:1069\n1#3:1075\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n*L\n38#1:1063\n39#1:1064\n274#1:1065\n294#1:1066\n478#1:1067\n727#1:1068\n818#1:1076\n769#1:1069,6\n*E\n"})
public final class h implements Comparable<h> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final a f81657c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f81658d = i(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f81659e = j.j(4611686018427387903L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f81660f = j.j(-4611686018427387903L);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f81661b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        public final long A(double d10) {
            return j.v(d10, k.MINUTES);
        }

        public final long B(int i10) {
            return j.w(i10, k.MINUTES);
        }

        public final long C(long j10) {
            return j.x(j10, k.MINUTES);
        }

        public final long G() {
            return h.f81660f;
        }

        public final long H(double d10) {
            return j.v(d10, k.NANOSECONDS);
        }

        public final long I(int i10) {
            return j.w(i10, k.NANOSECONDS);
        }

        public final long J(long j10) {
            return j.x(j10, k.NANOSECONDS);
        }

        public final long N(double d10) {
            return j.v(d10, k.SECONDS);
        }

        public final long O(int i10) {
            return j.w(i10, k.SECONDS);
        }

        public final long P(long j10) {
            return j.x(j10, k.SECONDS);
        }

        public final long T() {
            return h.f81658d;
        }

        public final long U(@oy.l String value) {
            m0.p(value, "value");
            try {
                return j.p(value, false);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Invalid duration string format: '" + value + "'.", e10);
            }
        }

        public final long V(@oy.l String value) {
            m0.p(value, "value");
            try {
                return j.p(value, true);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e10);
            }
        }

        @oy.m
        public final h W(@oy.l String value) {
            m0.p(value, "value");
            try {
                return h.f(j.p(value, true));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @oy.m
        public final h X(@oy.l String value) {
            m0.p(value, "value");
            try {
                return h.f(j.p(value, false));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @o
        public final double a(double d10, @oy.l k sourceUnit, @oy.l k targetUnit) {
            m0.p(sourceUnit, "sourceUnit");
            m0.p(targetUnit, "targetUnit");
            return m.a(d10, sourceUnit, targetUnit);
        }

        public final long b(double d10) {
            return j.v(d10, k.DAYS);
        }

        public final long c(int i10) {
            return j.w(i10, k.DAYS);
        }

        public final long d(long j10) {
            return j.x(j10, k.DAYS);
        }

        public final long h(double d10) {
            return j.v(d10, k.HOURS);
        }

        public final long i(int i10) {
            return j.w(i10, k.HOURS);
        }

        public final long j(long j10) {
            return j.x(j10, k.HOURS);
        }

        public final long n() {
            return h.f81659e;
        }

        public final long o(double d10) {
            return j.v(d10, k.MICROSECONDS);
        }

        public final long p(int i10) {
            return j.w(i10, k.MICROSECONDS);
        }

        public final long q(long j10) {
            return j.x(j10, k.MICROSECONDS);
        }

        public final long u(double d10) {
            return j.v(d10, k.MILLISECONDS);
        }

        public final long v(int i10) {
            return j.w(i10, k.MILLISECONDS);
        }

        public final long w(long j10) {
            return j.x(j10, k.MILLISECONDS);
        }

        public a() {
        }

        @ur.f
        public static /* synthetic */ void D(double d10) {
        }

        @ur.f
        public static /* synthetic */ void E(int i10) {
        }

        @ur.f
        public static /* synthetic */ void F(long j10) {
        }

        @ur.f
        public static /* synthetic */ void K(double d10) {
        }

        @ur.f
        public static /* synthetic */ void L(int i10) {
        }

        @ur.f
        public static /* synthetic */ void M(long j10) {
        }

        @ur.f
        public static /* synthetic */ void Q(double d10) {
        }

        @ur.f
        public static /* synthetic */ void R(int i10) {
        }

        @ur.f
        public static /* synthetic */ void S(long j10) {
        }

        @ur.f
        public static /* synthetic */ void e(double d10) {
        }

        @ur.f
        public static /* synthetic */ void f(int i10) {
        }

        @ur.f
        public static /* synthetic */ void g(long j10) {
        }

        @ur.f
        public static /* synthetic */ void k(double d10) {
        }

        @ur.f
        public static /* synthetic */ void l(int i10) {
        }

        @ur.f
        public static /* synthetic */ void m(long j10) {
        }

        @ur.f
        public static /* synthetic */ void r(double d10) {
        }

        @ur.f
        public static /* synthetic */ void s(int i10) {
        }

        @ur.f
        public static /* synthetic */ void t(long j10) {
        }

        @ur.f
        public static /* synthetic */ void x(double d10) {
        }

        @ur.f
        public static /* synthetic */ void y(int i10) {
        }

        @ur.f
        public static /* synthetic */ void z(long j10) {
        }
    }

    public /* synthetic */ h(long j10) {
        this.f81661b = j10;
    }

    public static final int B(long j10) {
        if (P(j10)) {
            return 0;
        }
        return (int) (x(j10) % ((long) 60));
    }

    public static final int E(long j10) {
        if (P(j10)) {
            return 0;
        }
        return (int) (N(j10) ? j.n(J(j10) % ((long) 1000)) : J(j10) % ((long) 1000000000));
    }

    public static final int G(long j10) {
        if (P(j10)) {
            return 0;
        }
        return (int) (z(j10) % ((long) 60));
    }

    public static final k H(long j10) {
        return O(j10) ? k.NANOSECONDS : k.MILLISECONDS;
    }

    public static final int I(long j10) {
        return ((int) j10) & 1;
    }

    public static final long J(long j10) {
        return j10 >> 1;
    }

    public static int K(long j10) {
        return f0.p.a(j10);
    }

    public static final boolean M(long j10) {
        return !P(j10);
    }

    public static final boolean N(long j10) {
        return (((int) j10) & 1) == 1;
    }

    public static final boolean O(long j10) {
        return (((int) j10) & 1) == 0;
    }

    public static final boolean P(long j10) {
        return j10 == f81659e || j10 == f81660f;
    }

    public static final boolean Q(long j10) {
        return j10 < 0;
    }

    public static final boolean R(long j10) {
        return j10 > 0;
    }

    public static final long S(long j10, long j11) {
        return T(j10, j0(j11));
    }

    public static final long T(long j10, long j11) {
        if (P(j10)) {
            if (M(j11) || (j11 ^ j10) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (P(j11)) {
            return j11;
        }
        if ((((int) j10) & 1) != (((int) j11) & 1)) {
            return N(j10) ? d(j10, J(j10), J(j11)) : d(j10, J(j11), J(j10));
        }
        long J = J(j10) + J(j11);
        return O(j10) ? j.m(J) : j.k(J);
    }

    public static final long U(long j10, double d10) {
        int iK0 = is.d.K0(d10);
        if (iK0 == d10) {
            return V(j10, iK0);
        }
        k kVarH = H(j10);
        return j.v(b0(j10, kVarH) * d10, kVarH);
    }

    public static final long V(long j10, int i10) {
        if (P(j10)) {
            if (i10 != 0) {
                return i10 > 0 ? j10 : j0(j10);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i10 == 0) {
            return f81658d;
        }
        long J = J(j10);
        long j11 = i10;
        long j12 = J * j11;
        if (!O(j10)) {
            if (j12 / j11 == J) {
                return j.j(ms.u.L(j12, new ms.o(-4611686018427387903L, 4611686018427387903L)));
            }
            return is.d.V(J) * is.d.U(i10) > 0 ? f81659e : f81660f;
        }
        if (-2147483647L <= J && J < sc.k.R) {
            return j.l(j12);
        }
        if (j12 / j11 == J) {
            return j.m(j12);
        }
        long jO = j.o(J);
        long j13 = jO * j11;
        long jO2 = j.o((J - j.n(jO)) * j11) + j13;
        if (j13 / j11 != jO || (jO2 ^ j13) < 0) {
            return is.d.V(J) * is.d.U(i10) > 0 ? f81659e : f81660f;
        }
        return j.j(ms.u.L(jO2, new ms.o(-4611686018427387903L, 4611686018427387903L)));
    }

    public static final <T> T X(long j10, @oy.l ds.p<? super Long, ? super Integer, ? extends T> action) {
        m0.p(action, "action");
        return action.invoke(Long.valueOf(z(j10)), Integer.valueOf(E(j10)));
    }

    public static final <T> T Y(long j10, @oy.l ds.q<? super Long, ? super Integer, ? super Integer, ? extends T> action) {
        m0.p(action, "action");
        return action.invoke(Long.valueOf(x(j10)), Integer.valueOf(G(j10)), Integer.valueOf(E(j10)));
    }

    public static final <T> T Z(long j10, @oy.l ds.r<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        m0.p(action, "action");
        return action.invoke(Long.valueOf(u(j10)), Integer.valueOf(B(j10)), Integer.valueOf(G(j10)), Integer.valueOf(E(j10)));
    }

    public static final <T> T a0(long j10, @oy.l ds.s<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        m0.p(action, "action");
        return action.invoke(Long.valueOf(t(j10)), Integer.valueOf(s(j10)), Integer.valueOf(B(j10)), Integer.valueOf(G(j10)), Integer.valueOf(E(j10)));
    }

    public static final double b0(long j10, @oy.l k unit) {
        m0.p(unit, "unit");
        if (j10 == f81659e) {
            return Double.POSITIVE_INFINITY;
        }
        if (j10 == f81660f) {
            return Double.NEGATIVE_INFINITY;
        }
        return m.a(J(j10), H(j10), unit);
    }

    public static final int c0(long j10, @oy.l k unit) {
        m0.p(unit, "unit");
        return (int) ms.u.K(e0(j10, unit), j3.f81979h, 2147483647L);
    }

    public static final long d(long j10, long j11, long j12) {
        long jO = j.o(j12);
        long j13 = j11 + jO;
        if (-4611686018426L > j13 || j13 >= 4611686018427L) {
            return j.j(ms.u.K(j13, -4611686018427387903L, 4611686018427387903L));
        }
        return j.l(j.n(j13) + (j12 - j.n(jO)));
    }

    @oy.l
    public static final String d0(long j10) {
        StringBuilder sb2 = new StringBuilder();
        if (Q(j10)) {
            sb2.append('-');
        }
        sb2.append("PT");
        long jO = o(j10);
        long jU = u(jO);
        int iB = B(jO);
        int iG = G(jO);
        int iE = E(jO);
        long j11 = P(j10) ? 9999999999999L : jU;
        boolean z10 = false;
        boolean z11 = j11 != 0;
        boolean z12 = (iG == 0 && iE == 0) ? false : true;
        if (iB != 0 || (z12 && z11)) {
            z10 = true;
        }
        if (z11) {
            sb2.append(j11);
            sb2.append('H');
        }
        if (z10) {
            sb2.append(iB);
            sb2.append('M');
        }
        if (z12 || (!z11 && !z10)) {
            e(j10, sb2, iG, iE, 9, l3.a.R4, true);
        }
        return sb2.toString();
    }

    public static final void e(long j10, StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append(kj.e.f102543c);
            String strM4 = p0.m4(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = strM4.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strM4.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z10 || i15 >= 3) {
                sb2.append((CharSequence) strM4, 0, ((i13 + 3) / 3) * 3);
                m0.o(sb2, "append(...)");
            } else {
                sb2.append((CharSequence) strM4, 0, i15);
                m0.o(sb2, "append(...)");
            }
        }
        sb2.append(str);
    }

    public static final long e0(long j10, @oy.l k unit) {
        m0.p(unit, "unit");
        if (j10 == f81659e) {
            return Long.MAX_VALUE;
        }
        if (j10 == f81660f) {
            return Long.MIN_VALUE;
        }
        return m.b(J(j10), H(j10), unit);
    }

    public static final /* synthetic */ h f(long j10) {
        return new h(j10);
    }

    @oy.l
    public static String f0(long j10) {
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f81659e) {
            return "Infinity";
        }
        if (j10 == f81660f) {
            return "-Infinity";
        }
        boolean zQ = Q(j10);
        StringBuilder sb2 = new StringBuilder();
        if (zQ) {
            sb2.append('-');
        }
        long jO = o(j10);
        long jT = t(jO);
        int iS = s(jO);
        int iB = B(jO);
        int iG = G(jO);
        int iE = E(jO);
        int i10 = 0;
        boolean z10 = jT != 0;
        boolean z11 = iS != 0;
        boolean z12 = iB != 0;
        boolean z13 = (iG == 0 && iE == 0) ? false : true;
        if (z10) {
            sb2.append(jT);
            sb2.append('d');
            i10 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iS);
            sb2.append('h');
            i10 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iB);
            sb2.append('m');
            i10 = i12;
        }
        if (z13) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (iG != 0 || z10 || z11 || z12) {
                e(j10, sb2, iG, iE, 9, "s", false);
            } else if (iE >= 1000000) {
                e(j10, sb2, iE / 1000000, iE % 1000000, 6, "ms", false);
            } else if (iE >= 1000) {
                e(j10, sb2, iE / 1000, iE % 1000, 3, "us", false);
            } else {
                sb2.append(iE);
                sb2.append("ns");
            }
            i10 = i13;
        }
        if (zQ && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }

    @oy.l
    public static final String g0(long j10, @oy.l k unit, int i10) {
        m0.p(unit, "unit");
        if (i10 < 0) {
            throw new IllegalArgumentException(("decimals must be not negative, but was " + i10).toString());
        }
        double dB0 = b0(j10, unit);
        if (Double.isInfinite(dB0)) {
            return String.valueOf(dB0);
        }
        return i.b(dB0, ms.u.B(i10, 12)) + n.h(unit);
    }

    public static int h(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return m0.u(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return Q(j10) ? -i10 : i10;
    }

    public static /* synthetic */ String h0(long j10, k kVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return g0(j10, kVar, i10);
    }

    public static long i(long j10) {
        if (!i.c()) {
            return j10;
        }
        if (O(j10)) {
            long J = J(j10);
            if (-4611686018426999999L <= J && J < 4611686018427000000L) {
                return j10;
            }
            throw new AssertionError(J(j10) + " ns is out of nanoseconds range");
        }
        long J2 = J(j10);
        if (-4611686018427387903L > J2 || J2 >= 4611686018427387904L) {
            throw new AssertionError(J(j10) + " ms is out of milliseconds range");
        }
        long J3 = J(j10);
        if (-4611686018426L > J3 || J3 >= 4611686018427L) {
            return j10;
        }
        throw new AssertionError(J(j10) + " ms is denormalized");
    }

    public static final long i0(long j10, @oy.l k unit) {
        m0.p(unit, "unit");
        k kVarH = H(j10);
        if (unit.compareTo(kVarH) <= 0 || P(j10)) {
            return j10;
        }
        return j.x(J(j10) - (J(j10) % m.b(1L, unit, kVarH)), kVarH);
    }

    public static final double j(long j10, long j11) {
        k kVar = (k) jr.h.X(H(j10), H(j11));
        return b0(j10, kVar) / b0(j11, kVar);
    }

    public static final long j0(long j10) {
        return j.i(-J(j10), ((int) j10) & 1);
    }

    public static final long k(long j10, double d10) {
        int iK0 = is.d.K0(d10);
        if (iK0 == d10 && iK0 != 0) {
            return l(j10, iK0);
        }
        k kVarH = H(j10);
        return j.v(b0(j10, kVarH) / d10, kVarH);
    }

    public static final long l(long j10, int i10) {
        if (i10 == 0) {
            if (R(j10)) {
                return f81659e;
            }
            if (Q(j10)) {
                return f81660f;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (O(j10)) {
            return j.l(J(j10) / ((long) i10));
        }
        if (P(j10)) {
            return V(j10, is.d.U(i10));
        }
        long j11 = i10;
        long J = J(j10) / j11;
        if (-4611686018426L > J || J >= 4611686018427L) {
            return j.j(J);
        }
        return j.l(j.n(J) + (j.n(J(j10) - (J * j11)) / j11));
    }

    public static boolean m(long j10, Object obj) {
        return (obj instanceof h) && j10 == ((h) obj).k0();
    }

    public static final boolean n(long j10, long j11) {
        return j10 == j11;
    }

    public static final long o(long j10) {
        return Q(j10) ? j0(j10) : j10;
    }

    public static final int s(long j10) {
        if (P(j10)) {
            return 0;
        }
        return (int) (u(j10) % ((long) 24));
    }

    public static final long t(long j10) {
        return e0(j10, k.DAYS);
    }

    public static final long u(long j10) {
        return e0(j10, k.HOURS);
    }

    public static final long v(long j10) {
        return e0(j10, k.MICROSECONDS);
    }

    public static final long w(long j10) {
        return (N(j10) && M(j10)) ? J(j10) : e0(j10, k.MILLISECONDS);
    }

    public static final long x(long j10) {
        return e0(j10, k.MINUTES);
    }

    public static final long y(long j10) {
        long J = J(j10);
        if (O(j10)) {
            return J;
        }
        if (J > w1.f100937f) {
            return Long.MAX_VALUE;
        }
        if (J < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return j.n(J);
    }

    public static final long z(long j10) {
        return e0(j10, k.SECONDS);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(h hVar) {
        return g(hVar.k0());
    }

    public boolean equals(Object obj) {
        return m(this.f81661b, obj);
    }

    public int g(long j10) {
        return h(this.f81661b, j10);
    }

    public int hashCode() {
        return K(this.f81661b);
    }

    public final /* synthetic */ long k0() {
        return this.f81661b;
    }

    @oy.l
    public String toString() {
        return f0(this.f81661b);
    }

    @f1
    public static /* synthetic */ void A() {
    }

    @f1
    public static /* synthetic */ void C() {
    }

    @f1
    public static /* synthetic */ void F() {
    }

    @f1
    public static /* synthetic */ void q() {
    }
}
