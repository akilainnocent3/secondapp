package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class uvo extends xv20<Integer, int[], qvo> {
    public static final uvo c;

    static {
        wvo.a.getClass();
        c = new uvo(hxo.a);
    }

    @Override // defpackage.r2
    public final int d(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // defpackage.b48, defpackage.r2
    public final void f(dma dmaVar, int i, Object obj) {
        qvo qvoVar = (qvo) obj;
        qvoVar.getClass();
        int iM = dmaVar.m(this.b, i);
        qvoVar.b(qvoVar.d() + 1);
        int[] iArr = qvoVar.a;
        int i2 = qvoVar.b;
        qvoVar.b = i2 + 1;
        iArr[i2] = iM;
    }

    @Override // defpackage.r2
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        qvo qvoVar = new qvo();
        qvoVar.a = iArr;
        qvoVar.b = iArr.length;
        qvoVar.b(10);
        return qvoVar;
    }

    @Override // defpackage.xv20
    public final int[] j() {
        return new int[0];
    }

    @Override // defpackage.xv20
    public final void k(fma fmaVar, int[] iArr, int i) {
        int[] iArr2 = iArr;
        fmaVar.getClass();
        iArr2.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            fmaVar.A(i2, iArr2[i2], this.b);
        }
    }
}
