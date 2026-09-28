package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class cze extends xv20<Double, double[], zye> {
    public static final cze c;

    static {
        jze.a.getClass();
        c = new cze(z5f.a);
    }

    @Override // defpackage.r2
    public final int d(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // defpackage.b48, defpackage.r2
    public final void f(dma dmaVar, int i, Object obj) {
        zye zyeVar = (zye) obj;
        zyeVar.getClass();
        double dG = dmaVar.G(this.b, i);
        zyeVar.b(zyeVar.d() + 1);
        double[] dArr = zyeVar.a;
        int i2 = zyeVar.b;
        zyeVar.b = i2 + 1;
        dArr[i2] = dG;
    }

    @Override // defpackage.r2
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        zye zyeVar = new zye();
        zyeVar.a = dArr;
        zyeVar.b = dArr.length;
        zyeVar.b(10);
        return zyeVar;
    }

    @Override // defpackage.xv20
    public final double[] j() {
        return new double[0];
    }

    @Override // defpackage.xv20
    public final void k(fma fmaVar, double[] dArr, int i) {
        double[] dArr2 = dArr;
        fmaVar.getClass();
        dArr2.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            fmaVar.j(this.b, i2, dArr2[i2]);
        }
    }
}
