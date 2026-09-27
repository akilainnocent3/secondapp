package wh;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@k.y0({k.y0.a.LIBRARY_GROUP})
public class a {
    public static int a(int i10, int i11, double d10) {
        b bVarB = b.b(i10);
        b bVarB2 = b.b(i11);
        double dN = bVarB.n();
        double dI = bVarB.i();
        double dJ = bVarB.j();
        return b.f(dN + ((bVarB2.n() - dN) * d10), dI + ((bVarB2.i() - dI) * d10), dJ + ((bVarB2.j() - dJ) * d10)).r();
    }

    public static int b(int i10, int i11) {
        m mVarB = m.b(i10);
        m mVarB2 = m.b(i11);
        return m.a(w5.g(mVarB.d() + (Math.min(w5.c(mVarB.d(), mVarB2.d()) * 0.5d, 15.0d) * w5.f(mVarB.d(), mVarB2.d()))), mVarB.c(), mVarB.e()).k();
    }

    public static int c(int i10, int i11, double d10) {
        return m.a(b.b(a(i10, i11, d10)).l(), b.b(i10).k(), c.o(i10)).k();
    }
}
