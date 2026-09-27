package wh;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@k.y0({k.y0.a.LIBRARY_GROUP})
public final class t6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<Integer, Integer> f143188a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f143189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f143190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f143191d;

    public t6(double d10, double d11, m mVar) {
        this.f143190c = d10;
        this.f143191d = d11;
        this.f143189b = mVar;
    }

    public static m a(double d10, double d11) {
        m mVarA = m.a(d10, d11, 50.0d);
        double dAbs = Math.abs(mVarA.c() - d11);
        for (double d12 = 1.0d; d12 < 50.0d && Math.round(d11) != Math.round(mVarA.c()); d12 += 1.0d) {
            m mVarA2 = m.a(d10, d11, 50.0d + d12);
            double dAbs2 = Math.abs(mVarA2.c() - d11);
            if (dAbs2 < dAbs) {
                dAbs = dAbs2;
                mVarA = mVarA2;
            }
            m mVarA3 = m.a(d10, d11, 50.0d - d12);
            double dAbs3 = Math.abs(mVarA3.c() - d11);
            if (dAbs3 < dAbs) {
                dAbs = dAbs3;
                mVarA = mVarA3;
            }
        }
        return mVarA;
    }

    public static t6 b(m mVar) {
        return new t6(mVar.d(), mVar.c(), mVar);
    }

    public static t6 c(double d10, double d11) {
        return new t6(d10, d11, a(d10, d11));
    }

    public static t6 d(int i10) {
        return b(m.b(i10));
    }

    public double e() {
        return this.f143191d;
    }

    public m f(double d10) {
        return m.a(this.f143190c, this.f143191d, d10);
    }

    public double g() {
        return this.f143190c;
    }

    public m h() {
        return this.f143189b;
    }

    public int i(int i10) {
        Integer numValueOf = this.f143188a.get(Integer.valueOf(i10));
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(m.a(this.f143190c, this.f143191d, i10).k());
            this.f143188a.put(Integer.valueOf(i10), numValueOf);
        }
        return numValueOf.intValue();
    }
}
