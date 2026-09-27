package b6;

import java.util.ArrayDeque;
import java.util.TreeSet;
import x4.m1;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public class i implements b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f20849g = 10;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final double f20850h = 0.5d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f20852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque<a> f20853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TreeSet<a> f20854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f20855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f20856f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements Comparable<a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f20857b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f20858c;

        public a(long j10, double d10) {
            this.f20857b = j10;
            this.f20858c = d10;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Long.compare(this.f20857b, aVar.f20857b);
        }
    }

    public i() {
        this(10, 0.5d);
    }

    @Override // b6.b
    public long a() {
        return this.f20856f;
    }

    @Override // b6.b
    public void b(long j10, long j11) {
        while (this.f20853c.size() >= this.f20851a) {
            a aVarRemove = this.f20853c.remove();
            this.f20854d.remove(aVarRemove);
            this.f20855e -= aVarRemove.f20858c;
        }
        double dSqrt = Math.sqrt(j10);
        a aVar = new a((j10 * 8000000) / j11, dSqrt);
        this.f20853c.add(aVar);
        this.f20854d.add(aVar);
        this.f20855e += dSqrt;
        this.f20856f = c();
    }

    public final long c() {
        if (this.f20853c.isEmpty()) {
            return Long.MIN_VALUE;
        }
        double d10 = this.f20855e * this.f20852b;
        double d11 = 0.0d;
        long j10 = 0;
        double d12 = 0.0d;
        for (a aVar : this.f20854d) {
            double d13 = d11 + (aVar.f20858c / 2.0d);
            if (d13 >= d10) {
                return j10 == 0 ? aVar.f20857b : j10 + ((long) (((aVar.f20857b - j10) * (d10 - d12)) / (d13 - d12)));
            }
            j10 = aVar.f20857b;
            d12 = d13;
            d11 = (aVar.f20858c / 2.0d) + d13;
        }
        return j10;
    }

    @Override // b6.b
    public void reset() {
        this.f20853c.clear();
        this.f20854d.clear();
        this.f20855e = 0.0d;
        this.f20856f = Long.MIN_VALUE;
    }

    public i(int i10, double d10) {
        l0.d(d10 >= 0.0d && d10 <= 1.0d);
        this.f20851a = i10;
        this.f20852b = d10;
        this.f20853c = new ArrayDeque<>();
        this.f20854d = new TreeSet<>();
        this.f20856f = Long.MIN_VALUE;
    }
}
