package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class v77 extends xv20<Character, char[], t77> {
    public static final v77 c;

    static {
        w77.a.getClass();
        c = new v77(d87.a);
    }

    @Override // defpackage.r2
    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // defpackage.b48, defpackage.r2
    public final void f(dma dmaVar, int i, Object obj) {
        t77 t77Var = (t77) obj;
        t77Var.getClass();
        char cF = dmaVar.f(this.b, i);
        t77Var.b(t77Var.d() + 1);
        char[] cArr = t77Var.a;
        int i2 = t77Var.b;
        t77Var.b = i2 + 1;
        cArr[i2] = cF;
    }

    @Override // defpackage.r2
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        t77 t77Var = new t77();
        t77Var.a = cArr;
        t77Var.b = cArr.length;
        t77Var.b(10);
        return t77Var;
    }

    @Override // defpackage.xv20
    public final char[] j() {
        return new char[0];
    }

    @Override // defpackage.xv20
    public final void k(fma fmaVar, char[] cArr, int i) {
        char[] cArr2 = cArr;
        fmaVar.getClass();
        cArr2.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            fmaVar.B(this.b, i2, cArr2[i2]);
        }
    }
}
