package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class qbh0 extends xv20<nbh0, obh0, pbh0> {
    public static final qbh0 c;

    static {
        nbh0.b.getClass();
        c = new qbh0(rbh0.a);
    }

    @Override // defpackage.r2
    public final int d(Object obj) {
        return ((obh0) obj).a.length;
    }

    @Override // defpackage.b48, defpackage.r2
    public final void f(dma dmaVar, int i, Object obj) {
        pbh0 pbh0Var = (pbh0) obj;
        pbh0Var.getClass();
        long jO = dmaVar.e(this.b, i).o();
        nbh0.a aVar = nbh0.b;
        pbh0Var.b(pbh0Var.d() + 1);
        long[] jArr = pbh0Var.a;
        int i2 = pbh0Var.b;
        pbh0Var.b = i2 + 1;
        jArr[i2] = jO;
    }

    @Override // defpackage.r2
    public final Object g(Object obj) {
        long[] jArr = ((obh0) obj).a;
        pbh0 pbh0Var = new pbh0();
        pbh0Var.a = jArr;
        pbh0Var.b = jArr.length;
        pbh0Var.b(10);
        return pbh0Var;
    }

    @Override // defpackage.xv20
    public final obh0 j() {
        return new obh0(new long[0]);
    }

    @Override // defpackage.xv20
    public final void k(fma fmaVar, obh0 obh0Var, int i) {
        long[] jArr = obh0Var.a;
        fmaVar.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            f4g f4gVarR = fmaVar.r(this.b, i2);
            long j = jArr[i2];
            nbh0.a aVar = nbh0.b;
            f4gVarR.p(j);
        }
    }
}
