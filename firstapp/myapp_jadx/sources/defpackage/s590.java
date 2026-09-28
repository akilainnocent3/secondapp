package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class s590 extends xv20<Short, short[], r590> {
    public static final s590 c;

    static {
        u590.a.getClass();
        c = new s590(w590.a);
    }

    @Override // defpackage.r2
    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // defpackage.b48, defpackage.r2
    public final void f(dma dmaVar, int i, Object obj) {
        r590 r590Var = (r590) obj;
        r590Var.getClass();
        short sX = dmaVar.x(this.b, i);
        r590Var.b(r590Var.d() + 1);
        short[] sArr = r590Var.a;
        int i2 = r590Var.b;
        r590Var.b = i2 + 1;
        sArr[i2] = sX;
    }

    @Override // defpackage.r2
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        r590 r590Var = new r590();
        r590Var.a = sArr;
        r590Var.b = sArr.length;
        r590Var.b(10);
        return r590Var;
    }

    @Override // defpackage.xv20
    public final short[] j() {
        return new short[0];
    }

    @Override // defpackage.xv20
    public final void k(fma fmaVar, short[] sArr, int i) {
        short[] sArr2 = sArr;
        fmaVar.getClass();
        sArr2.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            fmaVar.n(this.b, i2, sArr2[i2]);
        }
    }
}
