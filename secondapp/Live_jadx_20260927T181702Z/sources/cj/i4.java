package cj;

import java.io.Serializable;
import java.lang.Comparable;
import java.math.BigInteger;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public abstract class i4<C extends Comparable> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23904b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends i4<BigInteger> implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f23905c = new b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final BigInteger f23906d = BigInteger.valueOf(Long.MIN_VALUE);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final BigInteger f23907e = BigInteger.valueOf(Long.MAX_VALUE);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final long f23908f = 0;

        public b() {
            super(true);
        }

        @Override // cj.i4
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public long e(BigInteger start, BigInteger end) {
            return end.subtract(start).max(f23906d).min(f23907e).longValue();
        }

        @Override // cj.i4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public BigInteger k(BigInteger value) {
            return value.add(BigInteger.ONE);
        }

        @Override // cj.i4
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public BigInteger l(BigInteger origin, long distance) {
            j3.c(distance, "distance");
            return origin.add(BigInteger.valueOf(distance));
        }

        @Override // cj.i4
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public BigInteger m(BigInteger value) {
            return value.subtract(BigInteger.ONE);
        }

        public final Object s() {
            return f23905c;
        }

        public String toString() {
            return "DiscreteDomain.bigIntegers()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends i4<Integer> implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f23909c = new c();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f23910d = 0;

        public c() {
            super(true);
        }

        private Object u() {
            return f23909c;
        }

        @Override // cj.i4
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public long e(Integer start, Integer end) {
            return ((long) end.intValue()) - ((long) start.intValue());
        }

        @Override // cj.i4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Integer i() {
            return Integer.MAX_VALUE;
        }

        @Override // cj.i4
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Integer j() {
            return Integer.MIN_VALUE;
        }

        @Override // cj.i4
        @zq.a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Integer k(Integer value) {
            int iIntValue = value.intValue();
            if (iIntValue == Integer.MAX_VALUE) {
                return null;
            }
            return Integer.valueOf(iIntValue + 1);
        }

        @Override // cj.i4
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public Integer l(Integer origin, long distance) {
            j3.c(distance, "distance");
            return Integer.valueOf(lj.l.e(origin.longValue() + distance));
        }

        @Override // cj.i4
        @zq.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public Integer m(Integer value) {
            int iIntValue = value.intValue();
            if (iIntValue == Integer.MIN_VALUE) {
                return null;
            }
            return Integer.valueOf(iIntValue - 1);
        }

        public String toString() {
            return "DiscreteDomain.integers()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d extends i4<Long> implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f23911c = new d();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f23912d = 0;

        public d() {
            super(true);
        }

        private Object u() {
            return f23911c;
        }

        @Override // cj.i4
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public long e(Long start, Long end) {
            long jLongValue = end.longValue() - start.longValue();
            if (end.longValue() > start.longValue() && jLongValue < 0) {
                return Long.MAX_VALUE;
            }
            if (end.longValue() >= start.longValue() || jLongValue <= 0) {
                return jLongValue;
            }
            return Long.MIN_VALUE;
        }

        @Override // cj.i4
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Long i() {
            return Long.MAX_VALUE;
        }

        @Override // cj.i4
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Long j() {
            return Long.MIN_VALUE;
        }

        @Override // cj.i4
        @zq.a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public Long k(Long value) {
            long jLongValue = value.longValue();
            if (jLongValue == Long.MAX_VALUE) {
                return null;
            }
            return Long.valueOf(jLongValue + 1);
        }

        @Override // cj.i4
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public Long l(Long origin, long distance) {
            j3.c(distance, "distance");
            long jLongValue = origin.longValue() + distance;
            if (jLongValue < 0) {
                zi.l0.e(origin.longValue() < 0, "overflow");
            }
            return Long.valueOf(jLongValue);
        }

        @Override // cj.i4
        @zq.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public Long m(Long value) {
            long jLongValue = value.longValue();
            if (jLongValue == Long.MIN_VALUE) {
                return null;
            }
            return Long.valueOf(jLongValue - 1);
        }

        public String toString() {
            return "DiscreteDomain.longs()";
        }
    }

    public static i4<BigInteger> d() {
        return b.f23905c;
    }

    public static i4<Integer> g() {
        return c.f23909c;
    }

    public static i4<Long> h() {
        return d.f23911c;
    }

    public abstract long e(C start, C end);

    @qj.a
    public C i() {
        throw new NoSuchElementException();
    }

    @qj.a
    public C j() {
        throw new NoSuchElementException();
    }

    @zq.a
    public abstract C k(C value);

    public C l(C c10, long j10) {
        j3.c(j10, "distance");
        C c11 = c10;
        for (long j11 = 0; j11 < j10; j11++) {
            c11 = (C) k(c11);
            if (c11 == null) {
                throw new IllegalArgumentException("overflowed computing offset(" + c10 + ", " + j10 + gi.j.f86771d);
            }
        }
        return c11;
    }

    @zq.a
    public abstract C m(C value);

    public i4() {
        this(false);
    }

    public i4(boolean supportsFastOffset) {
        this.f23904b = supportsFastOffset;
    }
}
