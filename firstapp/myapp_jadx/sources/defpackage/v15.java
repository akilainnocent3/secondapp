package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class v15 extends xv20<Boolean, boolean[], r15> {
    public static final v15 c;

    static {
        w15.a.getClass();
        c = new v15(x15.a);
    }

    @Override // defpackage.r2
    public final int d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // defpackage.b48, defpackage.r2
    public final void f(dma dmaVar, int i, Object obj) {
        r15 r15Var = (r15) obj;
        r15Var.getClass();
        boolean zE = dmaVar.E(this.b, i);
        r15Var.b(r15Var.d() + 1);
        boolean[] zArr = r15Var.a;
        int i2 = r15Var.b;
        r15Var.b = i2 + 1;
        zArr[i2] = zE;
    }

    @Override // defpackage.r2
    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        r15 r15Var = new r15();
        r15Var.a = zArr;
        r15Var.b = zArr.length;
        r15Var.b(10);
        return r15Var;
    }

    @Override // defpackage.xv20
    public final boolean[] j() {
        return new boolean[0];
    }

    @Override // defpackage.xv20
    public final void k(fma fmaVar, boolean[] zArr, int i) {
        boolean[] zArr2 = zArr;
        fmaVar.getClass();
        zArr2.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            fmaVar.i(this.b, i2, zArr2[i2]);
        }
    }
}
