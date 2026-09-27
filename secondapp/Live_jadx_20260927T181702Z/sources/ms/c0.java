package ms;

import dr.d2;
import dr.h2;
import dr.l1;
import dr.l2;
import dr.r2;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class c0 {
    @l1(version = "1.7")
    public static final int A(@oy.l v vVar) {
        m0.p(vVar, "<this>");
        if (!vVar.isEmpty()) {
            return vVar.f();
        }
        throw new NoSuchElementException("Progression " + vVar + " is empty.");
    }

    @l1(version = "1.7")
    public static final long B(@oy.l y yVar) {
        m0.p(yVar, "<this>");
        if (!yVar.isEmpty()) {
            return yVar.f();
        }
        throw new NoSuchElementException("Progression " + yVar + " is empty.");
    }

    @l1(version = "1.7")
    @oy.m
    public static final h2 C(@oy.l v vVar) {
        m0.p(vVar, "<this>");
        if (vVar.isEmpty()) {
            return null;
        }
        return h2.b(vVar.f());
    }

    @l1(version = "1.7")
    @oy.m
    public static final l2 D(@oy.l y yVar) {
        m0.p(yVar, "<this>");
        if (yVar.isEmpty()) {
            return null;
        }
        return l2.b(yVar.f());
    }

    @l1(version = "1.7")
    public static final int E(@oy.l v vVar) {
        m0.p(vVar, "<this>");
        if (!vVar.isEmpty()) {
            return vVar.g();
        }
        throw new NoSuchElementException("Progression " + vVar + " is empty.");
    }

    @l1(version = "1.7")
    public static final long F(@oy.l y yVar) {
        m0.p(yVar, "<this>");
        if (!yVar.isEmpty()) {
            return yVar.g();
        }
        throw new NoSuchElementException("Progression " + yVar + " is empty.");
    }

    @l1(version = "1.7")
    @oy.m
    public static final h2 G(@oy.l v vVar) {
        m0.p(vVar, "<this>");
        if (vVar.isEmpty()) {
            return null;
        }
        return h2.b(vVar.g());
    }

    @l1(version = "1.7")
    @oy.m
    public static final l2 H(@oy.l y yVar) {
        m0.p(yVar, "<this>");
        if (yVar.isEmpty()) {
            return null;
        }
        return l2.b(yVar.g());
    }

    @l1(version = "1.5")
    @ur.f
    public static final int I(x xVar) {
        m0.p(xVar, "<this>");
        return J(xVar, ks.f.f102880b);
    }

    @l1(version = "1.5")
    public static final int J(@oy.l x xVar, @oy.l ks.f random) {
        m0.p(xVar, "<this>");
        m0.p(random, "random");
        try {
            return ks.h.h(random, xVar);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @l1(version = "1.5")
    @ur.f
    public static final long K(a0 a0Var) {
        m0.p(a0Var, "<this>");
        return L(a0Var, ks.f.f102880b);
    }

    @l1(version = "1.5")
    public static final long L(@oy.l a0 a0Var, @oy.l ks.f random) {
        m0.p(a0Var, "<this>");
        m0.p(random, "random");
        try {
            return ks.h.l(random, a0Var);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @l1(version = "1.5")
    @ur.f
    public static final h2 M(x xVar) {
        m0.p(xVar, "<this>");
        return N(xVar, ks.f.f102880b);
    }

    @l1(version = "1.5")
    @oy.m
    public static final h2 N(@oy.l x xVar, @oy.l ks.f random) {
        m0.p(xVar, "<this>");
        m0.p(random, "random");
        if (xVar.isEmpty()) {
            return null;
        }
        return h2.b(ks.h.h(random, xVar));
    }

    @l1(version = "1.5")
    @ur.f
    public static final l2 O(a0 a0Var) {
        m0.p(a0Var, "<this>");
        return P(a0Var, ks.f.f102880b);
    }

    @l1(version = "1.5")
    @oy.m
    public static final l2 P(@oy.l a0 a0Var, @oy.l ks.f random) {
        m0.p(a0Var, "<this>");
        m0.p(random, "random");
        if (a0Var.isEmpty()) {
            return null;
        }
        return l2.b(ks.h.l(random, a0Var));
    }

    @oy.l
    @l1(version = "1.5")
    public static final v Q(@oy.l v vVar) {
        m0.p(vVar, "<this>");
        return v.f115162e.a(vVar.g(), vVar.f(), -vVar.h());
    }

    @oy.l
    @l1(version = "1.5")
    public static final y R(@oy.l y yVar) {
        m0.p(yVar, "<this>");
        return y.f115172e.a(yVar.g(), yVar.f(), -yVar.h());
    }

    @oy.l
    @l1(version = "1.5")
    public static final v S(@oy.l v vVar, int i10) {
        m0.p(vVar, "<this>");
        t.a(i10 > 0, Integer.valueOf(i10));
        v.a aVar = v.f115162e;
        int iF = vVar.f();
        int iG = vVar.g();
        if (vVar.h() <= 0) {
            i10 = -i10;
        }
        return aVar.a(iF, iG, i10);
    }

    @oy.l
    @l1(version = "1.5")
    public static final y T(@oy.l y yVar, long j10) {
        m0.p(yVar, "<this>");
        t.a(j10 > 0, Long.valueOf(j10));
        y.a aVar = y.f115172e;
        long jF = yVar.f();
        long jG = yVar.g();
        if (yVar.h() <= 0) {
            j10 = -j10;
        }
        return aVar.a(jF, jG, j10);
    }

    @oy.l
    @l1(version = "1.5")
    public static final x U(short s10, short s11) {
        int i10 = s11 & r2.f79504e;
        return m0.t(i10, 0) <= 0 ? x.f115170f.a() : new x(h2.h(s10 & r2.f79504e), h2.h(h2.h(i10) - 1), null);
    }

    @oy.l
    @l1(version = "1.5")
    public static x V(int i10, int i11) {
        return Integer.compare(i11 ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE) <= 0 ? x.f115170f.a() : new x(i10, h2.h(i11 - 1), null);
    }

    @oy.l
    @l1(version = "1.5")
    public static final x W(byte b10, byte b11) {
        int i10 = b11 & 255;
        return m0.t(i10, 0) <= 0 ? x.f115170f.a() : new x(h2.h(b10 & 255), h2.h(h2.h(i10) - 1), null);
    }

    @oy.l
    @l1(version = "1.5")
    public static a0 X(long j10, long j11) {
        return Long.compare(j11 ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE) <= 0 ? a0.f115122f.a() : new a0(j10, l2.h(j11 - l2.h(((long) 1) & 4294967295L)), null);
    }

    @l1(version = "1.5")
    public static final short a(short s10, short s11) {
        return m0.t(s10 & r2.f79504e, 65535 & s11) < 0 ? s11 : s10;
    }

    @l1(version = "1.5")
    public static final int b(int i10, int i11) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) < 0 ? i11 : i10;
    }

    @l1(version = "1.5")
    public static final byte c(byte b10, byte b11) {
        return m0.t(b10 & 255, b11 & 255) < 0 ? b11 : b10;
    }

    @l1(version = "1.5")
    public static final long d(long j10, long j11) {
        return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) < 0 ? j11 : j10;
    }

    @l1(version = "1.5")
    public static final short e(short s10, short s11) {
        return m0.t(s10 & r2.f79504e, 65535 & s11) > 0 ? s11 : s10;
    }

    @l1(version = "1.5")
    public static final int f(int i10, int i11) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) > 0 ? i11 : i10;
    }

    @l1(version = "1.5")
    public static final byte g(byte b10, byte b11) {
        return m0.t(b10 & 255, b11 & 255) > 0 ? b11 : b10;
    }

    @l1(version = "1.5")
    public static final long h(long j10, long j11) {
        return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) > 0 ? j11 : j10;
    }

    @l1(version = "1.5")
    public static final long i(long j10, @oy.l g<l2> range) {
        m0.p(range, "range");
        if (range instanceof f) {
            return ((l2) u.N(l2.b(j10), (f) range)).m0();
        }
        if (!range.isEmpty()) {
            if (Long.compare(j10 ^ Long.MIN_VALUE, ((l2) range.m()).m0() ^ Long.MIN_VALUE) < 0) {
                return ((l2) range.m()).m0();
            }
            return Long.compare(j10 ^ Long.MIN_VALUE, ((l2) range.d()).m0() ^ Long.MIN_VALUE) > 0 ? ((l2) range.d()).m0() : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + kj.e.f102543c);
    }

    @l1(version = "1.5")
    public static final short j(short s10, short s11, short s12) {
        int i10 = s11 & r2.f79504e;
        int i11 = s12 & r2.f79504e;
        if (m0.t(i10, i11) <= 0) {
            int i12 = 65535 & s10;
            if (m0.t(i12, i10) < 0) {
                return s11;
            }
            return m0.t(i12, i11) > 0 ? s12 : s10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) r2.f0(s12)) + " is less than minimum " + ((Object) r2.f0(s11)) + kj.e.f102543c);
    }

    @l1(version = "1.5")
    public static final int k(int i10, int i11, int i12) {
        if (Integer.compare(i11 ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE) <= 0) {
            if (Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) < 0) {
                return i11;
            }
            return Integer.compare(i10 ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE) > 0 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) h2.h0(i12)) + " is less than minimum " + ((Object) h2.h0(i11)) + kj.e.f102543c);
    }

    @l1(version = "1.5")
    public static final byte l(byte b10, byte b11, byte b12) {
        int i10 = b11 & 255;
        int i11 = b12 & 255;
        if (m0.t(i10, i11) <= 0) {
            int i12 = b10 & 255;
            if (m0.t(i12, i10) < 0) {
                return b11;
            }
            return m0.t(i12, i11) > 0 ? b12 : b10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) d2.f0(b12)) + " is less than minimum " + ((Object) d2.f0(b11)) + kj.e.f102543c);
    }

    @l1(version = "1.5")
    public static final long m(long j10, long j11, long j12) {
        if (Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE) <= 0) {
            if (Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) < 0) {
                return j11;
            }
            return Long.compare(j10 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE) > 0 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) l2.h0(j12)) + " is less than minimum " + ((Object) l2.h0(j11)) + kj.e.f102543c);
    }

    @l1(version = "1.5")
    public static final int n(int i10, @oy.l g<h2> range) {
        m0.p(range, "range");
        if (range instanceof f) {
            return ((h2) u.N(h2.b(i10), (f) range)).m0();
        }
        if (!range.isEmpty()) {
            if (Integer.compare(i10 ^ Integer.MIN_VALUE, ((h2) range.m()).m0() ^ Integer.MIN_VALUE) < 0) {
                return ((h2) range.m()).m0();
            }
            return Integer.compare(i10 ^ Integer.MIN_VALUE, ((h2) range.d()).m0() ^ Integer.MIN_VALUE) > 0 ? ((h2) range.d()).m0() : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + kj.e.f102543c);
    }

    @l1(version = "1.5")
    public static final boolean o(@oy.l x contains, byte b10) {
        m0.p(contains, "$this$contains");
        return contains.j(h2.h(b10 & 255));
    }

    @l1(version = "1.5")
    @ur.f
    public static final boolean p(a0 contains, l2 l2Var) {
        m0.p(contains, "$this$contains");
        return l2Var != null && contains.j(l2Var.m0());
    }

    @l1(version = "1.5")
    public static final boolean q(@oy.l a0 contains, int i10) {
        m0.p(contains, "$this$contains");
        return contains.j(l2.h(((long) i10) & 4294967295L));
    }

    @l1(version = "1.5")
    public static final boolean r(@oy.l a0 contains, byte b10) {
        m0.p(contains, "$this$contains");
        return contains.j(l2.h(((long) b10) & 255));
    }

    @l1(version = "1.5")
    public static final boolean s(@oy.l x contains, short s10) {
        m0.p(contains, "$this$contains");
        return contains.j(h2.h(s10 & r2.f79504e));
    }

    @l1(version = "1.5")
    @ur.f
    public static final boolean t(x contains, h2 h2Var) {
        m0.p(contains, "$this$contains");
        return h2Var != null && contains.j(h2Var.m0());
    }

    @l1(version = "1.5")
    public static final boolean u(@oy.l x contains, long j10) {
        m0.p(contains, "$this$contains");
        return l2.h(j10 >>> 32) == 0 && contains.j(h2.h((int) j10));
    }

    @l1(version = "1.5")
    public static final boolean v(@oy.l a0 contains, short s10) {
        m0.p(contains, "$this$contains");
        return contains.j(l2.h(((long) s10) & 65535));
    }

    @oy.l
    @l1(version = "1.5")
    public static final v w(short s10, short s11) {
        return v.f115162e.a(h2.h(s10 & r2.f79504e), h2.h(s11 & r2.f79504e), -1);
    }

    @oy.l
    @l1(version = "1.5")
    public static final v x(int i10, int i11) {
        return v.f115162e.a(i10, i11, -1);
    }

    @oy.l
    @l1(version = "1.5")
    public static final v y(byte b10, byte b11) {
        return v.f115162e.a(h2.h(b10 & 255), h2.h(b11 & 255), -1);
    }

    @oy.l
    @l1(version = "1.5")
    public static final y z(long j10, long j11) {
        return y.f115172e.a(j10, j11, -1L);
    }
}
