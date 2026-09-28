package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class zbh0 extends xv20<wbh0, xbh0, ybh0> {
    public static final zbh0 c;

    static {
        wbh0.b.getClass();
        c = new zbh0(ach0.a);
    }

    @Override // defpackage.r2
    public final int d(Object obj) {
        return ((xbh0) obj).a.length;
    }

    @Override // defpackage.b48, defpackage.r2
    public final void f(dma dmaVar, int i, Object obj) {
        ybh0 ybh0Var = (ybh0) obj;
        ybh0Var.getClass();
        short sP = dmaVar.e(this.b, i).p();
        wbh0.a aVar = wbh0.b;
        ybh0Var.b(ybh0Var.d() + 1);
        short[] sArr = ybh0Var.a;
        int i2 = ybh0Var.b;
        ybh0Var.b = i2 + 1;
        sArr[i2] = sP;
    }

    @Override // defpackage.r2
    public final Object g(Object obj) {
        short[] sArr = ((xbh0) obj).a;
        ybh0 ybh0Var = new ybh0();
        ybh0Var.a = sArr;
        ybh0Var.b = sArr.length;
        ybh0Var.b(10);
        return ybh0Var;
    }

    @Override // defpackage.xv20
    public final xbh0 j() {
        return new xbh0(new short[0]);
    }

    @Override // defpackage.xv20
    public final void k(fma fmaVar, xbh0 xbh0Var, int i) {
        short[] sArr = xbh0Var.a;
        fmaVar.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            f4g f4gVarR = fmaVar.r(this.b, i2);
            short s = sArr[i2];
            wbh0.a aVar = wbh0.b;
            f4gVarR.u(s);
        }
    }
}
