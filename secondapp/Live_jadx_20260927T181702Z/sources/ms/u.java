package ms;

import dr.a3;
import dr.l1;
import f0.j3;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\n_Ranges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Ranges.kt\nkotlin/ranges/RangesKt___RangesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1572:1\n1#2:1573\n*E\n"})
public class u extends t {
    public static float A(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    @l1(version = "1.7")
    @oy.m
    public static final Integer A0(@oy.l j jVar) {
        m0.p(jVar, "<this>");
        if (jVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(jVar.f());
    }

    @oy.l
    public static final a A1(@oy.l a aVar, int i10) {
        m0.p(aVar, "<this>");
        t.a(i10 > 0, Integer.valueOf(i10));
        a.C1047a c1047a = a.f115118e;
        char cF = aVar.f();
        char cG = aVar.g();
        if (aVar.h() <= 0) {
            i10 = -i10;
        }
        return c1047a.a(cF, cG, i10);
    }

    public static int B(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    @l1(version = "1.7")
    @oy.m
    public static final Long B0(@oy.l m mVar) {
        m0.p(mVar, "<this>");
        if (mVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(mVar.f());
    }

    @oy.l
    public static j B1(@oy.l j jVar, int i10) {
        m0.p(jVar, "<this>");
        t.a(i10 > 0, Integer.valueOf(i10));
        j.a aVar = j.f115138e;
        int iF = jVar.f();
        int iG = jVar.g();
        if (jVar.h() <= 0) {
            i10 = -i10;
        }
        return aVar.a(iF, iG, i10);
    }

    public static long C(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    @cs.j(name = "floatRangeContains")
    @dr.p(errorSince = sc.k.f129877g, hiddenSince = "1.5", warningSince = "1.3")
    @dr.o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean C0(g gVar, byte b10) {
        m0.p(gVar, "<this>");
        return gVar.a(Float.valueOf(b10));
    }

    @oy.l
    public static final m C1(@oy.l m mVar, long j10) {
        m0.p(mVar, "<this>");
        t.a(j10 > 0, Long.valueOf(j10));
        m.a aVar = m.f115148e;
        long jF = mVar.f();
        long jG = mVar.g();
        if (mVar.h() <= 0) {
            j10 = -j10;
        }
        return aVar.a(jF, jG, j10);
    }

    @oy.l
    public static final <T extends Comparable<? super T>> T D(@oy.l T t10, @oy.l T maximumValue) {
        m0.p(t10, "<this>");
        m0.p(maximumValue, "maximumValue");
        return t10.compareTo(maximumValue) > 0 ? maximumValue : t10;
    }

    @cs.j(name = "floatRangeContains")
    public static final boolean D0(@oy.l g<Float> gVar, double d10) {
        m0.p(gVar, "<this>");
        return gVar.a(Float.valueOf((float) d10));
    }

    @oy.m
    public static final Byte D1(double d10) {
        if (-128.0d > d10 || d10 > 127.0d) {
            return null;
        }
        return Byte.valueOf((byte) d10);
    }

    public static final short E(short s10, short s11) {
        return s10 > s11 ? s11 : s10;
    }

    @cs.j(name = "floatRangeContains")
    @dr.p(errorSince = sc.k.f129877g, hiddenSince = "1.5", warningSince = "1.3")
    @dr.o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean E0(g gVar, int i10) {
        m0.p(gVar, "<this>");
        return gVar.a(Float.valueOf(i10));
    }

    @oy.m
    public static final Byte E1(float f10) {
        if (-128.0f > f10 || f10 > 127.0f) {
            return null;
        }
        return Byte.valueOf((byte) f10);
    }

    public static final byte F(byte b10, byte b11, byte b12) {
        if (b11 <= b12) {
            if (b10 < b11) {
                return b11;
            }
            return b10 > b12 ? b12 : b10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) b12) + " is less than minimum " + ((int) b11) + kj.e.f102543c);
    }

    @cs.j(name = "floatRangeContains")
    @dr.p(errorSince = sc.k.f129877g, hiddenSince = "1.5", warningSince = "1.3")
    @dr.o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean F0(g gVar, long j10) {
        m0.p(gVar, "<this>");
        return gVar.a(Float.valueOf(j10));
    }

    @oy.m
    public static final Byte F1(int i10) {
        if (-128 > i10 || i10 >= 128) {
            return null;
        }
        return Byte.valueOf((byte) i10);
    }

    public static double G(double d10, double d11, double d12) {
        if (d11 <= d12) {
            if (d10 < d11) {
                return d11;
            }
            return d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + kj.e.f102543c);
    }

    @cs.j(name = "floatRangeContains")
    @dr.p(errorSince = sc.k.f129877g, hiddenSince = "1.5", warningSince = "1.3")
    @dr.o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean G0(g gVar, short s10) {
        m0.p(gVar, "<this>");
        return gVar.a(Float.valueOf(s10));
    }

    @oy.m
    public static final Byte G1(long j10) {
        if (-128 > j10 || j10 >= 128) {
            return null;
        }
        return Byte.valueOf((byte) j10);
    }

    public static float H(float f10, float f11, float f12) {
        if (f11 <= f12) {
            if (f10 < f11) {
                return f11;
            }
            return f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + kj.e.f102543c);
    }

    @cs.j(name = "intRangeContains")
    public static final boolean H0(@oy.l g<Integer> gVar, byte b10) {
        m0.p(gVar, "<this>");
        return gVar.a(Integer.valueOf(b10));
    }

    @oy.m
    public static final Byte H1(short s10) {
        if (-128 > s10 || s10 >= 128) {
            return null;
        }
        return Byte.valueOf((byte) s10);
    }

    public static int I(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i10 < i11) {
                return i11;
            }
            return i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + kj.e.f102543c);
    }

    @cs.j(name = "intRangeContains")
    @dr.p(errorSince = sc.k.f129877g, hiddenSince = "1.5", warningSince = "1.3")
    @dr.o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean I0(g gVar, double d10) {
        m0.p(gVar, "<this>");
        Integer numI1 = I1(d10);
        if (numI1 != null) {
            return gVar.a(numI1);
        }
        return false;
    }

    @oy.m
    public static final Integer I1(double d10) {
        if (-2.147483648E9d > d10 || d10 > 2.147483647E9d) {
            return null;
        }
        return Integer.valueOf((int) d10);
    }

    public static final int J(int i10, @oy.l g<Integer> range) {
        m0.p(range, "range");
        if (range instanceof f) {
            return ((Number) N(Integer.valueOf(i10), (f) range)).intValue();
        }
        if (!range.isEmpty()) {
            if (i10 < ((Number) range.m()).intValue()) {
                return ((Number) range.m()).intValue();
            }
            return i10 > ((Number) range.d()).intValue() ? ((Number) range.d()).intValue() : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + kj.e.f102543c);
    }

    @cs.j(name = "intRangeContains")
    @dr.p(errorSince = sc.k.f129877g, hiddenSince = "1.5", warningSince = "1.3")
    @dr.o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean J0(g gVar, float f10) {
        m0.p(gVar, "<this>");
        Integer numJ1 = J1(f10);
        if (numJ1 != null) {
            return gVar.a(numJ1);
        }
        return false;
    }

    @oy.m
    public static final Integer J1(float f10) {
        if (-2.1474836E9f > f10 || f10 > 2.1474836E9f) {
            return null;
        }
        return Integer.valueOf((int) f10);
    }

    public static long K(long j10, long j11, long j12) {
        if (j11 <= j12) {
            if (j10 < j11) {
                return j11;
            }
            return j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + kj.e.f102543c);
    }

    @cs.j(name = "intRangeContains")
    public static final boolean K0(@oy.l g<Integer> gVar, long j10) {
        m0.p(gVar, "<this>");
        Integer numK1 = K1(j10);
        if (numK1 != null) {
            return gVar.a(numK1);
        }
        return false;
    }

    @oy.m
    public static final Integer K1(long j10) {
        if (j3.f81979h > j10 || j10 >= sc.k.R) {
            return null;
        }
        return Integer.valueOf((int) j10);
    }

    public static long L(long j10, @oy.l g<Long> range) {
        m0.p(range, "range");
        if (range instanceof f) {
            return ((Number) N(Long.valueOf(j10), (f) range)).longValue();
        }
        if (!range.isEmpty()) {
            if (j10 < ((Number) range.m()).longValue()) {
                return ((Number) range.m()).longValue();
            }
            return j10 > ((Number) range.d()).longValue() ? ((Number) range.d()).longValue() : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + kj.e.f102543c);
    }

    @cs.j(name = "intRangeContains")
    public static final boolean L0(@oy.l g<Integer> gVar, short s10) {
        m0.p(gVar, "<this>");
        return gVar.a(Integer.valueOf(s10));
    }

    @oy.m
    public static final Long L1(double d10) {
        if (-9.223372036854776E18d > d10 || d10 > 9.223372036854776E18d) {
            return null;
        }
        return Long.valueOf((long) d10);
    }

    @oy.l
    public static final <T extends Comparable<? super T>> T M(@oy.l T t10, @oy.m T t11, @oy.m T t12) {
        m0.p(t10, "<this>");
        if (t11 == null || t12 == null) {
            if (t11 != null && t10.compareTo(t11) < 0) {
                return t11;
            }
            if (t12 != null && t10.compareTo(t12) > 0) {
                return t12;
            }
        } else {
            if (t11.compareTo(t12) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t12 + " is less than minimum " + t11 + kj.e.f102543c);
            }
            if (t10.compareTo(t11) < 0) {
                return t11;
            }
            if (t10.compareTo(t12) > 0) {
                return t12;
            }
        }
        return t10;
    }

    @cs.j(name = "intRangeContains")
    @l1(version = "1.9")
    @a3(markerClass = {dr.v.class})
    public static final boolean M0(@oy.l r<Integer> rVar, byte b10) {
        m0.p(rVar, "<this>");
        return rVar.a(Integer.valueOf(b10));
    }

    @oy.m
    public static final Long M1(float f10) {
        if (-9.223372E18f > f10 || f10 > 9.223372E18f) {
            return null;
        }
        return Long.valueOf((long) f10);
    }

    @oy.l
    @l1(version = "1.1")
    public static final <T extends Comparable<? super T>> T N(@oy.l T t10, @oy.l f<T> range) {
        m0.p(t10, "<this>");
        m0.p(range, "range");
        if (!range.isEmpty()) {
            if (!range.b(t10, range.m()) || range.b(range.m(), t10)) {
                return (!range.b(range.d(), t10) || range.b(t10, range.d())) ? t10 : range.d();
            }
            return range.m();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + kj.e.f102543c);
    }

    @cs.j(name = "intRangeContains")
    @l1(version = "1.9")
    @a3(markerClass = {dr.v.class})
    public static final boolean N0(@oy.l r<Integer> rVar, long j10) {
        m0.p(rVar, "<this>");
        Integer numK1 = K1(j10);
        if (numK1 != null) {
            return rVar.a(numK1);
        }
        return false;
    }

    @oy.m
    public static final Short N1(double d10) {
        if (-32768.0d > d10 || d10 > 32767.0d) {
            return null;
        }
        return Short.valueOf((short) d10);
    }

    @oy.l
    public static final <T extends Comparable<? super T>> T O(@oy.l T t10, @oy.l g<T> range) {
        m0.p(t10, "<this>");
        m0.p(range, "range");
        if (range instanceof f) {
            return (T) N(t10, (f) range);
        }
        if (!range.isEmpty()) {
            if (t10.compareTo(range.m()) < 0) {
                return (T) range.m();
            }
            return t10.compareTo(range.d()) > 0 ? (T) range.d() : t10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + kj.e.f102543c);
    }

    @cs.j(name = "intRangeContains")
    @l1(version = "1.9")
    @a3(markerClass = {dr.v.class})
    public static final boolean O0(@oy.l r<Integer> rVar, short s10) {
        m0.p(rVar, "<this>");
        return rVar.a(Integer.valueOf(s10));
    }

    @oy.m
    public static final Short O1(float f10) {
        if (-32768.0f > f10 || f10 > 32767.0f) {
            return null;
        }
        return Short.valueOf((short) f10);
    }

    public static final short P(short s10, short s11, short s12) {
        if (s11 <= s12) {
            if (s10 < s11) {
                return s11;
            }
            return s10 > s12 ? s12 : s10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) s12) + " is less than minimum " + ((int) s11) + kj.e.f102543c);
    }

    @l1(version = "1.7")
    public static final char P0(@oy.l a aVar) {
        m0.p(aVar, "<this>");
        if (!aVar.isEmpty()) {
            return aVar.g();
        }
        throw new NoSuchElementException("Progression " + aVar + " is empty.");
    }

    @oy.m
    public static final Short P1(int i10) {
        if (-32768 > i10 || i10 >= 32768) {
            return null;
        }
        return Short.valueOf((short) i10);
    }

    @l1(version = "1.3")
    @ur.f
    public static final boolean Q(c cVar, Character ch2) {
        m0.p(cVar, "<this>");
        return ch2 != null && cVar.l(ch2.charValue());
    }

    @l1(version = "1.7")
    public static final int Q0(@oy.l j jVar) {
        m0.p(jVar, "<this>");
        if (!jVar.isEmpty()) {
            return jVar.g();
        }
        throw new NoSuchElementException("Progression " + jVar + " is empty.");
    }

    @oy.m
    public static final Short Q1(long j10) {
        if (-32768 > j10 || j10 >= 32768) {
            return null;
        }
        return Short.valueOf((short) j10);
    }

    @ur.f
    public static final boolean R(l lVar, byte b10) {
        m0.p(lVar, "<this>");
        return H0(lVar, b10);
    }

    @l1(version = "1.7")
    public static final long R0(@oy.l m mVar) {
        m0.p(mVar, "<this>");
        if (!mVar.isEmpty()) {
            return mVar.g();
        }
        throw new NoSuchElementException("Progression " + mVar + " is empty.");
    }

    @oy.l
    public static final c R1(char c10, char c11) {
        return m0.t(c11, 0) <= 0 ? c.f115128f.a() : new c(c10, (char) (c11 - 1));
    }

    @ur.f
    public static final boolean S(l lVar, long j10) {
        m0.p(lVar, "<this>");
        return K0(lVar, j10);
    }

    @l1(version = "1.7")
    @oy.m
    public static final Character S0(@oy.l a aVar) {
        m0.p(aVar, "<this>");
        if (aVar.isEmpty()) {
            return null;
        }
        return Character.valueOf(aVar.g());
    }

    @oy.l
    public static final l S1(byte b10, byte b11) {
        return new l(b10, b11 - 1);
    }

    @l1(version = "1.3")
    @ur.f
    public static final boolean T(l lVar, Integer num) {
        m0.p(lVar, "<this>");
        return num != null && lVar.l(num.intValue());
    }

    @l1(version = "1.7")
    @oy.m
    public static final Integer T0(@oy.l j jVar) {
        m0.p(jVar, "<this>");
        if (jVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(jVar.g());
    }

    @oy.l
    public static final l T1(byte b10, int i10) {
        return i10 <= Integer.MIN_VALUE ? l.f115146f.a() : new l(b10, i10 - 1);
    }

    @ur.f
    public static final boolean U(l lVar, short s10) {
        m0.p(lVar, "<this>");
        return L0(lVar, s10);
    }

    @l1(version = "1.7")
    @oy.m
    public static final Long U0(@oy.l m mVar) {
        m0.p(mVar, "<this>");
        if (mVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(mVar.g());
    }

    @oy.l
    public static final l U1(byte b10, short s10) {
        return new l(b10, s10 - 1);
    }

    @ur.f
    public static final boolean V(o oVar, byte b10) {
        m0.p(oVar, "<this>");
        return V0(oVar, b10);
    }

    @cs.j(name = "longRangeContains")
    public static final boolean V0(@oy.l g<Long> gVar, byte b10) {
        m0.p(gVar, "<this>");
        return gVar.a(Long.valueOf(b10));
    }

    @oy.l
    public static final l V1(int i10, byte b10) {
        return new l(i10, b10 - 1);
    }

    @ur.f
    public static final boolean W(o oVar, int i10) {
        m0.p(oVar, "<this>");
        return Y0(oVar, i10);
    }

    @cs.j(name = "longRangeContains")
    @dr.p(errorSince = sc.k.f129877g, hiddenSince = "1.5", warningSince = "1.3")
    @dr.o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean W0(g gVar, double d10) {
        m0.p(gVar, "<this>");
        Long lL1 = L1(d10);
        if (lL1 != null) {
            return gVar.a(lL1);
        }
        return false;
    }

    @oy.l
    public static l W1(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? l.f115146f.a() : new l(i10, i11 - 1);
    }

    @l1(version = "1.3")
    @ur.f
    public static final boolean X(o oVar, Long l10) {
        m0.p(oVar, "<this>");
        return l10 != null && oVar.l(l10.longValue());
    }

    @cs.j(name = "longRangeContains")
    @dr.p(errorSince = sc.k.f129877g, hiddenSince = "1.5", warningSince = "1.3")
    @dr.o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean X0(g gVar, float f10) {
        m0.p(gVar, "<this>");
        Long lM1 = M1(f10);
        if (lM1 != null) {
            return gVar.a(lM1);
        }
        return false;
    }

    @oy.l
    public static final l X1(int i10, short s10) {
        return new l(i10, s10 - 1);
    }

    @ur.f
    public static final boolean Y(o oVar, short s10) {
        m0.p(oVar, "<this>");
        return Z0(oVar, s10);
    }

    @cs.j(name = "longRangeContains")
    public static final boolean Y0(@oy.l g<Long> gVar, int i10) {
        m0.p(gVar, "<this>");
        return gVar.a(Long.valueOf(i10));
    }

    @oy.l
    public static final l Y1(short s10, byte b10) {
        return new l(s10, b10 - 1);
    }

    @cs.j(name = "doubleRangeContains")
    @dr.p(errorSince = sc.k.f129877g, hiddenSince = "1.5", warningSince = "1.3")
    @dr.o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean Z(g gVar, byte b10) {
        m0.p(gVar, "<this>");
        return gVar.a(Double.valueOf(b10));
    }

    @cs.j(name = "longRangeContains")
    public static final boolean Z0(@oy.l g<Long> gVar, short s10) {
        m0.p(gVar, "<this>");
        return gVar.a(Long.valueOf(s10));
    }

    @oy.l
    public static final l Z1(short s10, int i10) {
        return i10 <= Integer.MIN_VALUE ? l.f115146f.a() : new l(s10, i10 - 1);
    }

    @cs.j(name = "doubleRangeContains")
    public static final boolean a0(@oy.l g<Double> gVar, float f10) {
        m0.p(gVar, "<this>");
        return gVar.a(Double.valueOf(f10));
    }

    @cs.j(name = "longRangeContains")
    @l1(version = "1.9")
    @a3(markerClass = {dr.v.class})
    public static final boolean a1(@oy.l r<Long> rVar, byte b10) {
        m0.p(rVar, "<this>");
        return rVar.a(Long.valueOf(b10));
    }

    @oy.l
    public static final l a2(short s10, short s11) {
        return new l(s10, s11 - 1);
    }

    @cs.j(name = "doubleRangeContains")
    @dr.p(errorSince = sc.k.f129877g, hiddenSince = "1.5", warningSince = "1.3")
    @dr.o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean b0(g gVar, int i10) {
        m0.p(gVar, "<this>");
        return gVar.a(Double.valueOf(i10));
    }

    @cs.j(name = "longRangeContains")
    @l1(version = "1.9")
    @a3(markerClass = {dr.v.class})
    public static final boolean b1(@oy.l r<Long> rVar, int i10) {
        m0.p(rVar, "<this>");
        return rVar.a(Long.valueOf(i10));
    }

    @oy.l
    public static final o b2(byte b10, long j10) {
        return j10 <= Long.MIN_VALUE ? o.f115156f.a() : new o(b10, j10 - 1);
    }

    @cs.j(name = "doubleRangeContains")
    @dr.p(errorSince = sc.k.f129877g, hiddenSince = "1.5", warningSince = "1.3")
    @dr.o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean c0(g gVar, long j10) {
        m0.p(gVar, "<this>");
        return gVar.a(Double.valueOf(j10));
    }

    @cs.j(name = "longRangeContains")
    @l1(version = "1.9")
    @a3(markerClass = {dr.v.class})
    public static final boolean c1(@oy.l r<Long> rVar, short s10) {
        m0.p(rVar, "<this>");
        return rVar.a(Long.valueOf(s10));
    }

    @oy.l
    public static final o c2(int i10, long j10) {
        return j10 <= Long.MIN_VALUE ? o.f115156f.a() : new o(i10, j10 - 1);
    }

    @cs.j(name = "doubleRangeContains")
    @dr.p(errorSince = sc.k.f129877g, hiddenSince = "1.5", warningSince = "1.3")
    @dr.o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean d0(g gVar, short s10) {
        m0.p(gVar, "<this>");
        return gVar.a(Double.valueOf(s10));
    }

    @l1(version = "1.3")
    @ur.f
    public static final char d1(c cVar) {
        m0.p(cVar, "<this>");
        return e1(cVar, ks.f.f102880b);
    }

    @oy.l
    public static final o d2(long j10, byte b10) {
        return new o(j10, ((long) b10) - 1);
    }

    @cs.j(name = "doubleRangeContains")
    @l1(version = "1.9")
    @a3(markerClass = {dr.v.class})
    public static final boolean e0(@oy.l r<Double> rVar, float f10) {
        m0.p(rVar, "<this>");
        return rVar.a(Double.valueOf(f10));
    }

    @l1(version = "1.3")
    public static final char e1(@oy.l c cVar, @oy.l ks.f random) {
        m0.p(cVar, "<this>");
        m0.p(random, "random");
        try {
            return (char) random.r(cVar.f(), cVar.g() + 1);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @oy.l
    public static final o e2(long j10, int i10) {
        return new o(j10, ((long) i10) - 1);
    }

    @oy.l
    public static final a f0(char c10, char c11) {
        return a.f115118e.a(c10, c11, -1);
    }

    @l1(version = "1.3")
    @ur.f
    public static final int f1(l lVar) {
        m0.p(lVar, "<this>");
        return g1(lVar, ks.f.f102880b);
    }

    @oy.l
    public static final o f2(long j10, long j11) {
        return j11 <= Long.MIN_VALUE ? o.f115156f.a() : new o(j10, j11 - 1);
    }

    @oy.l
    public static final j g0(byte b10, byte b11) {
        return j.f115138e.a(b10, b11, -1);
    }

    @l1(version = "1.3")
    public static final int g1(@oy.l l lVar, @oy.l ks.f random) {
        m0.p(lVar, "<this>");
        m0.p(random, "random");
        try {
            return ks.g.h(random, lVar);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @oy.l
    public static final o g2(long j10, short s10) {
        return new o(j10, ((long) s10) - 1);
    }

    @oy.l
    public static final j h0(byte b10, int i10) {
        return j.f115138e.a(b10, i10, -1);
    }

    @l1(version = "1.3")
    @ur.f
    public static final long h1(o oVar) {
        m0.p(oVar, "<this>");
        return i1(oVar, ks.f.f102880b);
    }

    @oy.l
    public static final o h2(short s10, long j10) {
        return j10 <= Long.MIN_VALUE ? o.f115156f.a() : new o(s10, j10 - 1);
    }

    @oy.l
    public static final j i0(byte b10, short s10) {
        return j.f115138e.a(b10, s10, -1);
    }

    @l1(version = "1.3")
    public static final long i1(@oy.l o oVar, @oy.l ks.f random) {
        m0.p(oVar, "<this>");
        m0.p(random, "random");
        try {
            return ks.g.i(random, oVar);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @cs.j(name = "byteRangeContains")
    @dr.p(errorSince = sc.k.f129877g, hiddenSince = "1.5", warningSince = "1.3")
    @dr.o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean j(g gVar, double d10) {
        m0.p(gVar, "<this>");
        Byte bD1 = D1(d10);
        if (bD1 != null) {
            return gVar.a(bD1);
        }
        return false;
    }

    @oy.l
    public static final j j0(int i10, byte b10) {
        return j.f115138e.a(i10, b10, -1);
    }

    @l1(version = sc.k.f129877g)
    @ur.f
    public static final Character j1(c cVar) {
        m0.p(cVar, "<this>");
        return k1(cVar, ks.f.f102880b);
    }

    @cs.j(name = "byteRangeContains")
    @dr.p(errorSince = sc.k.f129877g, hiddenSince = "1.5", warningSince = "1.3")
    @dr.o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean k(g gVar, float f10) {
        m0.p(gVar, "<this>");
        Byte bE1 = E1(f10);
        if (bE1 != null) {
            return gVar.a(bE1);
        }
        return false;
    }

    @oy.l
    public static j k0(int i10, int i11) {
        return j.f115138e.a(i10, i11, -1);
    }

    @l1(version = sc.k.f129877g)
    @oy.m
    public static final Character k1(@oy.l c cVar, @oy.l ks.f random) {
        m0.p(cVar, "<this>");
        m0.p(random, "random");
        if (cVar.isEmpty()) {
            return null;
        }
        return Character.valueOf((char) random.r(cVar.f(), cVar.g() + 1));
    }

    @cs.j(name = "byteRangeContains")
    public static final boolean l(@oy.l g<Byte> gVar, int i10) {
        m0.p(gVar, "<this>");
        Byte bF1 = F1(i10);
        if (bF1 != null) {
            return gVar.a(bF1);
        }
        return false;
    }

    @oy.l
    public static final j l0(int i10, short s10) {
        return j.f115138e.a(i10, s10, -1);
    }

    @l1(version = sc.k.f129877g)
    @ur.f
    public static final Integer l1(l lVar) {
        m0.p(lVar, "<this>");
        return m1(lVar, ks.f.f102880b);
    }

    @cs.j(name = "byteRangeContains")
    public static final boolean m(@oy.l g<Byte> gVar, long j10) {
        m0.p(gVar, "<this>");
        Byte bG1 = G1(j10);
        if (bG1 != null) {
            return gVar.a(bG1);
        }
        return false;
    }

    @oy.l
    public static final j m0(short s10, byte b10) {
        return j.f115138e.a(s10, b10, -1);
    }

    @l1(version = sc.k.f129877g)
    @oy.m
    public static final Integer m1(@oy.l l lVar, @oy.l ks.f random) {
        m0.p(lVar, "<this>");
        m0.p(random, "random");
        if (lVar.isEmpty()) {
            return null;
        }
        return Integer.valueOf(ks.g.h(random, lVar));
    }

    @cs.j(name = "byteRangeContains")
    public static final boolean n(@oy.l g<Byte> gVar, short s10) {
        m0.p(gVar, "<this>");
        Byte bH1 = H1(s10);
        if (bH1 != null) {
            return gVar.a(bH1);
        }
        return false;
    }

    @oy.l
    public static final j n0(short s10, int i10) {
        return j.f115138e.a(s10, i10, -1);
    }

    @l1(version = sc.k.f129877g)
    @ur.f
    public static final Long n1(o oVar) {
        m0.p(oVar, "<this>");
        return o1(oVar, ks.f.f102880b);
    }

    @cs.j(name = "byteRangeContains")
    @l1(version = "1.9")
    @a3(markerClass = {dr.v.class})
    public static final boolean o(@oy.l r<Byte> rVar, int i10) {
        m0.p(rVar, "<this>");
        Byte bF1 = F1(i10);
        if (bF1 != null) {
            return rVar.a(bF1);
        }
        return false;
    }

    @oy.l
    public static final j o0(short s10, short s11) {
        return j.f115138e.a(s10, s11, -1);
    }

    @l1(version = sc.k.f129877g)
    @oy.m
    public static final Long o1(@oy.l o oVar, @oy.l ks.f random) {
        m0.p(oVar, "<this>");
        m0.p(random, "random");
        if (oVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(ks.g.i(random, oVar));
    }

    @cs.j(name = "byteRangeContains")
    @l1(version = "1.9")
    @a3(markerClass = {dr.v.class})
    public static final boolean p(@oy.l r<Byte> rVar, long j10) {
        m0.p(rVar, "<this>");
        Byte bG1 = G1(j10);
        if (bG1 != null) {
            return rVar.a(bG1);
        }
        return false;
    }

    @oy.l
    public static final m p0(byte b10, long j10) {
        return m.f115148e.a(b10, j10, -1L);
    }

    @oy.l
    public static final a p1(@oy.l a aVar) {
        m0.p(aVar, "<this>");
        return a.f115118e.a(aVar.g(), aVar.f(), -aVar.h());
    }

    @cs.j(name = "byteRangeContains")
    @l1(version = "1.9")
    @a3(markerClass = {dr.v.class})
    public static final boolean q(@oy.l r<Byte> rVar, short s10) {
        m0.p(rVar, "<this>");
        Byte bH1 = H1(s10);
        if (bH1 != null) {
            return rVar.a(bH1);
        }
        return false;
    }

    @oy.l
    public static final m q0(int i10, long j10) {
        return m.f115148e.a(i10, j10, -1L);
    }

    @oy.l
    public static j q1(@oy.l j jVar) {
        m0.p(jVar, "<this>");
        return j.f115138e.a(jVar.g(), jVar.f(), -jVar.h());
    }

    public static final byte r(byte b10, byte b11) {
        return b10 < b11 ? b11 : b10;
    }

    @oy.l
    public static final m r0(long j10, byte b10) {
        return m.f115148e.a(j10, b10, -1L);
    }

    @oy.l
    public static final m r1(@oy.l m mVar) {
        m0.p(mVar, "<this>");
        return m.f115148e.a(mVar.g(), mVar.f(), -mVar.h());
    }

    public static final double s(double d10, double d11) {
        return d10 < d11 ? d11 : d10;
    }

    @oy.l
    public static final m s0(long j10, int i10) {
        return m.f115148e.a(j10, i10, -1L);
    }

    @cs.j(name = "shortRangeContains")
    public static final boolean s1(@oy.l g<Short> gVar, byte b10) {
        m0.p(gVar, "<this>");
        return gVar.a(Short.valueOf(b10));
    }

    public static float t(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    @oy.l
    public static final m t0(long j10, long j11) {
        return m.f115148e.a(j10, j11, -1L);
    }

    @cs.j(name = "shortRangeContains")
    @dr.p(errorSince = sc.k.f129877g, hiddenSince = "1.5", warningSince = "1.3")
    @dr.o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean t1(g gVar, double d10) {
        m0.p(gVar, "<this>");
        Short shN1 = N1(d10);
        if (shN1 != null) {
            return gVar.a(shN1);
        }
        return false;
    }

    public static int u(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    @oy.l
    public static final m u0(long j10, short s10) {
        return m.f115148e.a(j10, s10, -1L);
    }

    @cs.j(name = "shortRangeContains")
    @dr.p(errorSince = sc.k.f129877g, hiddenSince = "1.5", warningSince = "1.3")
    @dr.o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean u1(g gVar, float f10) {
        m0.p(gVar, "<this>");
        Short shO1 = O1(f10);
        if (shO1 != null) {
            return gVar.a(shO1);
        }
        return false;
    }

    public static long v(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    @oy.l
    public static final m v0(short s10, long j10) {
        return m.f115148e.a(s10, j10, -1L);
    }

    @cs.j(name = "shortRangeContains")
    public static final boolean v1(@oy.l g<Short> gVar, int i10) {
        m0.p(gVar, "<this>");
        Short shP1 = P1(i10);
        if (shP1 != null) {
            return gVar.a(shP1);
        }
        return false;
    }

    @oy.l
    public static final <T extends Comparable<? super T>> T w(@oy.l T t10, @oy.l T minimumValue) {
        m0.p(t10, "<this>");
        m0.p(minimumValue, "minimumValue");
        return t10.compareTo(minimumValue) < 0 ? minimumValue : t10;
    }

    @l1(version = "1.7")
    public static final char w0(@oy.l a aVar) {
        m0.p(aVar, "<this>");
        if (!aVar.isEmpty()) {
            return aVar.f();
        }
        throw new NoSuchElementException("Progression " + aVar + " is empty.");
    }

    @cs.j(name = "shortRangeContains")
    public static final boolean w1(@oy.l g<Short> gVar, long j10) {
        m0.p(gVar, "<this>");
        Short shQ1 = Q1(j10);
        if (shQ1 != null) {
            return gVar.a(shQ1);
        }
        return false;
    }

    public static final short x(short s10, short s11) {
        return s10 < s11 ? s11 : s10;
    }

    @l1(version = "1.7")
    public static final int x0(@oy.l j jVar) {
        m0.p(jVar, "<this>");
        if (!jVar.isEmpty()) {
            return jVar.f();
        }
        throw new NoSuchElementException("Progression " + jVar + " is empty.");
    }

    @cs.j(name = "shortRangeContains")
    @l1(version = "1.9")
    @a3(markerClass = {dr.v.class})
    public static final boolean x1(@oy.l r<Short> rVar, byte b10) {
        m0.p(rVar, "<this>");
        return rVar.a(Short.valueOf(b10));
    }

    public static final byte y(byte b10, byte b11) {
        return b10 > b11 ? b11 : b10;
    }

    @l1(version = "1.7")
    public static final long y0(@oy.l m mVar) {
        m0.p(mVar, "<this>");
        if (!mVar.isEmpty()) {
            return mVar.f();
        }
        throw new NoSuchElementException("Progression " + mVar + " is empty.");
    }

    @cs.j(name = "shortRangeContains")
    @l1(version = "1.9")
    @a3(markerClass = {dr.v.class})
    public static final boolean y1(@oy.l r<Short> rVar, int i10) {
        m0.p(rVar, "<this>");
        Short shP1 = P1(i10);
        if (shP1 != null) {
            return rVar.a(shP1);
        }
        return false;
    }

    public static final double z(double d10, double d11) {
        return d10 > d11 ? d11 : d10;
    }

    @l1(version = "1.7")
    @oy.m
    public static final Character z0(@oy.l a aVar) {
        m0.p(aVar, "<this>");
        if (aVar.isEmpty()) {
            return null;
        }
        return Character.valueOf(aVar.f());
    }

    @cs.j(name = "shortRangeContains")
    @l1(version = "1.9")
    @a3(markerClass = {dr.v.class})
    public static final boolean z1(@oy.l r<Short> rVar, long j10) {
        m0.p(rVar, "<this>");
        Short shQ1 = Q1(j10);
        if (shQ1 != null) {
            return rVar.a(shQ1);
        }
        return false;
    }
}
