package ks;

import dr.l1;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.x;
import oy.l;
import ur.n;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@l1(version = "1.3")
@s1({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/Random\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,387:1\n1#2:388\n*E\n"})
public abstract class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    public static final a f102880b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    public static final f f102881c = n.f139648a.b();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends f implements Serializable {

        /* JADX INFO: renamed from: ks.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C0972a implements Serializable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @l
            public static final C0972a f102882b = new C0972a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final long f102883c = 0;

            public final Object d() {
                return f.f102880b;
            }
        }

        public /* synthetic */ a(x xVar) {
            this();
        }

        @Override // ks.f
        public int e(int i10) {
            return f.f102881c.e(i10);
        }

        @Override // ks.f
        public boolean g() {
            return f.f102881c.g();
        }

        @Override // ks.f
        @l
        public byte[] h(int i10) {
            return f.f102881c.h(i10);
        }

        @Override // ks.f
        @l
        public byte[] i(@l byte[] array) {
            m0.p(array, "array");
            return f.f102881c.i(array);
        }

        @Override // ks.f
        @l
        public byte[] j(@l byte[] array, int i10, int i11) {
            m0.p(array, "array");
            return f.f102881c.j(array, i10, i11);
        }

        @Override // ks.f
        public double l() {
            return f.f102881c.l();
        }

        @Override // ks.f
        public double m(double d10) {
            return f.f102881c.m(d10);
        }

        @Override // ks.f
        public double n(double d10, double d11) {
            return f.f102881c.n(d10, d11);
        }

        @Override // ks.f
        public float o() {
            return f.f102881c.o();
        }

        @Override // ks.f
        public int p() {
            return f.f102881c.p();
        }

        @Override // ks.f
        public int q(int i10) {
            return f.f102881c.q(i10);
        }

        @Override // ks.f
        public int r(int i10, int i11) {
            return f.f102881c.r(i10, i11);
        }

        @Override // ks.f
        public long s() {
            return f.f102881c.s();
        }

        @Override // ks.f
        public long t(long j10) {
            return f.f102881c.t(j10);
        }

        @Override // ks.f
        public long u(long j10, long j11) {
            return f.f102881c.u(j10, j11);
        }

        public final void v(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        public final Object w() {
            return C0972a.f102882b;
        }

        public a() {
        }
    }

    public static /* synthetic */ byte[] k(f fVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return fVar.j(bArr, i10, i11);
    }

    public abstract int e(int i10);

    public boolean g() {
        return e(1) != 0;
    }

    @l
    public byte[] h(int i10) {
        return i(new byte[i10]);
    }

    @l
    public byte[] i(@l byte[] array) {
        m0.p(array, "array");
        return j(array, 0, array.length);
    }

    @l
    public byte[] j(@l byte[] array, int i10, int i11) {
        m0.p(array, "array");
        if (i10 < 0 || i10 > array.length || i11 < 0 || i11 > array.length) {
            throw new IllegalArgumentException(("fromIndex (" + i10 + ") or toIndex (" + i11 + ") are out of range: 0.." + array.length + kj.e.f102543c).toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(("fromIndex (" + i10 + ") must be not greater than toIndex (" + i11 + ").").toString());
        }
        int i12 = (i11 - i10) / 4;
        for (int i13 = 0; i13 < i12; i13++) {
            int iP = p();
            array[i10] = (byte) iP;
            array[i10 + 1] = (byte) (iP >>> 8);
            array[i10 + 2] = (byte) (iP >>> 16);
            array[i10 + 3] = (byte) (iP >>> 24);
            i10 += 4;
        }
        int i14 = i11 - i10;
        int iE = e(i14 * 8);
        for (int i15 = 0; i15 < i14; i15++) {
            array[i10 + i15] = (byte) (iE >>> (i15 * 8));
        }
        return array;
    }

    public double l() {
        return e.d(e(26), e(27));
    }

    public double m(double d10) {
        return n(0.0d, d10);
    }

    public double n(double d10, double d11) {
        double dL;
        g.d(d10, d11);
        double d12 = d11 - d10;
        if (!Double.isInfinite(d12) || Math.abs(d10) > Double.MAX_VALUE || Math.abs(d11) > Double.MAX_VALUE) {
            dL = d10 + (l() * d12);
        } else {
            double d13 = 2;
            double dL2 = l() * ((d11 / d13) - (d10 / d13));
            dL = d10 + dL2 + dL2;
        }
        return dL >= d11 ? Math.nextAfter(d11, Double.NEGATIVE_INFINITY) : dL;
    }

    public float o() {
        return e(24) / 1.6777216E7f;
    }

    public int p() {
        return e(32);
    }

    public int q(int i10) {
        return r(0, i10);
    }

    public int r(int i10, int i11) {
        int iP;
        int i12;
        int iE;
        g.e(i10, i11);
        int i13 = i11 - i10;
        if (i13 > 0 || i13 == Integer.MIN_VALUE) {
            if (((-i13) & i13) == i13) {
                iE = e(g.g(i13));
            } else {
                do {
                    iP = p() >>> 1;
                    i12 = iP % i13;
                } while ((iP - i12) + (i13 - 1) < 0);
                iE = i12;
            }
            return i10 + iE;
        }
        while (true) {
            int iP2 = p();
            if (i10 <= iP2 && iP2 < i11) {
                return iP2;
            }
        }
    }

    public long s() {
        return (((long) p()) << 32) + ((long) p());
    }

    public long t(long j10) {
        return u(0L, j10);
    }

    public long u(long j10, long j11) {
        long jS;
        long j12;
        long jE;
        int iP;
        g.f(j10, j11);
        long j13 = j11 - j10;
        if (j13 > 0) {
            if (((-j13) & j13) == j13) {
                int i10 = (int) j13;
                int i11 = (int) (j13 >>> 32);
                if (i10 != 0) {
                    iP = e(g.g(i10));
                } else if (i11 == 1) {
                    iP = p();
                } else {
                    jE = (((long) e(g.g(i11))) << 32) + (4294967295L & ((long) p()));
                }
                jE = ((long) iP) & 4294967295L;
            } else {
                do {
                    jS = s() >>> 1;
                    j12 = jS % j13;
                } while ((jS - j12) + (j13 - 1) < 0);
                jE = j12;
            }
            return j10 + jE;
        }
        while (true) {
            long jS2 = s();
            if (j10 <= jS2 && jS2 < j11) {
                return jS2;
            }
        }
    }
}
