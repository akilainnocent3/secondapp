package ks;

import dr.l1;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import ms.o;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/RandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,387:1\n1#2:388\n*E\n"})
public final class g {
    @l
    @l1(version = "1.3")
    public static final f a(int i10) {
        return new i(i10, i10 >> 31);
    }

    @l
    @l1(version = "1.3")
    public static final f b(long j10) {
        return new i((int) j10, (int) (j10 >> 32));
    }

    @l
    public static final String c(@l Object from, @l Object until) {
        m0.p(from, "from");
        m0.p(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    public static final void d(double d10, double d11) {
        if (d11 <= d10) {
            throw new IllegalArgumentException(c(Double.valueOf(d10), Double.valueOf(d11)).toString());
        }
    }

    public static final void e(int i10, int i11) {
        if (i11 <= i10) {
            throw new IllegalArgumentException(c(Integer.valueOf(i10), Integer.valueOf(i11)).toString());
        }
    }

    public static final void f(long j10, long j11) {
        if (j11 <= j10) {
            throw new IllegalArgumentException(c(Long.valueOf(j10), Long.valueOf(j11)).toString());
        }
    }

    public static final int g(int i10) {
        return 31 - Integer.numberOfLeadingZeros(i10);
    }

    @l1(version = "1.3")
    public static final int h(@l f fVar, @l ms.l range) {
        m0.p(fVar, "<this>");
        m0.p(range, "range");
        if (!range.isEmpty()) {
            if (range.g() < Integer.MAX_VALUE) {
                return fVar.r(range.f(), range.g() + 1);
            }
            return range.f() > Integer.MIN_VALUE ? fVar.r(range.f() - 1, range.g()) + 1 : fVar.p();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    @l1(version = "1.3")
    public static final long i(@l f fVar, @l o range) {
        m0.p(fVar, "<this>");
        m0.p(range, "range");
        if (!range.isEmpty()) {
            if (range.g() < Long.MAX_VALUE) {
                return fVar.u(range.f(), range.g() + 1);
            }
            return range.f() > Long.MIN_VALUE ? fVar.u(range.f() - 1, range.g()) + 1 : fVar.s();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    public static final int j(int i10, int i11) {
        return (i10 >>> (32 - i11)) & ((-i11) >> 31);
    }
}
