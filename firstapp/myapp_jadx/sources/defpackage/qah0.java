package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class qah0 extends xv20<nah0, oah0, pah0> {
    public static final qah0 c;

    static {
        nah0.b.getClass();
        c = new qah0(rah0.a);
    }

    @Override // defpackage.r2
    public final int d(Object obj) {
        return ((oah0) obj).a.length;
    }

    @Override // defpackage.b48, defpackage.r2
    public final void f(dma dmaVar, int i, Object obj) {
        pah0 pah0Var = (pah0) obj;
        pah0Var.getClass();
        byte bF = dmaVar.e(this.b, i).F();
        nah0.a aVar = nah0.b;
        pah0Var.b(pah0Var.d() + 1);
        byte[] bArr = pah0Var.a;
        int i2 = pah0Var.b;
        pah0Var.b = i2 + 1;
        bArr[i2] = bF;
    }

    @Override // defpackage.r2
    public final Object g(Object obj) {
        byte[] bArr = ((oah0) obj).a;
        pah0 pah0Var = new pah0();
        pah0Var.a = bArr;
        pah0Var.b = bArr.length;
        pah0Var.b(10);
        return pah0Var;
    }

    @Override // defpackage.xv20
    public final oah0 j() {
        return new oah0(new byte[0]);
    }

    @Override // defpackage.xv20
    public final void k(fma fmaVar, oah0 oah0Var, int i) {
        byte[] bArr = oah0Var.a;
        fmaVar.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            f4g f4gVarR = fmaVar.r(this.b, i2);
            byte b = bArr[i2];
            nah0.a aVar = nah0.b;
            f4gVarR.g(b);
        }
    }
}
