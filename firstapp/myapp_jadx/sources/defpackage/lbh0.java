package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class lbh0 extends xv20<hbh0, jbh0, kbh0> {
    public static final lbh0 c;

    static {
        hbh0.b.getClass();
        c = new lbh0(mbh0.a);
    }

    @Override // defpackage.r2
    public final int d(Object obj) {
        return ((jbh0) obj).a.length;
    }

    @Override // defpackage.b48, defpackage.r2
    public final void f(dma dmaVar, int i, Object obj) {
        kbh0 kbh0Var = (kbh0) obj;
        kbh0Var.getClass();
        int iK = dmaVar.e(this.b, i).k();
        hbh0.a aVar = hbh0.b;
        kbh0Var.b(kbh0Var.d() + 1);
        int[] iArr = kbh0Var.a;
        int i2 = kbh0Var.b;
        kbh0Var.b = i2 + 1;
        iArr[i2] = iK;
    }

    @Override // defpackage.r2
    public final Object g(Object obj) {
        int[] iArr = ((jbh0) obj).a;
        kbh0 kbh0Var = new kbh0();
        kbh0Var.a = iArr;
        kbh0Var.b = iArr.length;
        kbh0Var.b(10);
        return kbh0Var;
    }

    @Override // defpackage.xv20
    public final jbh0 j() {
        return new jbh0(new int[0]);
    }

    @Override // defpackage.xv20
    public final void k(fma fmaVar, jbh0 jbh0Var, int i) {
        int[] iArr = jbh0Var.a;
        fmaVar.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            f4g f4gVarR = fmaVar.r(this.b, i2);
            int i3 = iArr[i2];
            hbh0.a aVar = hbh0.b;
            f4gVarR.C(i3);
        }
    }
}
