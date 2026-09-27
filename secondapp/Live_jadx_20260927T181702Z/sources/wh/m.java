package wh;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@k.y0({k.y0.a.LIBRARY_GROUP})
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f143144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f143145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f143146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f143147d;

    public m(int i10) {
        i(i10);
    }

    public static m a(double d10, double d11, double d12) {
        return new m(n.r(d10, d11, d12));
    }

    public static m b(int i10) {
        return new m(i10);
    }

    public double c() {
        return this.f143145b;
    }

    public double d() {
        return this.f143144a;
    }

    public double e() {
        return this.f143146c;
    }

    public m f(x6 x6Var) {
        double[] dArrT = b.b(k()).t(x6Var, null);
        b bVarH = b.h(dArrT[0], dArrT[1], dArrT[2], x6.f143219k);
        return a(bVarH.l(), bVarH.k(), c.p(dArrT[1]));
    }

    public void g(double d10) {
        i(n.r(this.f143144a, d10, this.f143146c));
    }

    public void h(double d10) {
        i(n.r(d10, this.f143145b, this.f143146c));
    }

    public final void i(int i10) {
        this.f143147d = i10;
        b bVarB = b.b(i10);
        this.f143144a = bVarB.l();
        this.f143145b = bVarB.k();
        this.f143146c = c.o(i10);
    }

    public void j(double d10) {
        i(n.r(this.f143144a, this.f143145b, d10));
    }

    public int k() {
        return this.f143147d;
    }
}
