package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qwh0 implements hk0 {
    public final jxh[] a;

    public qwh0(float f, float f2, mj0 mj0Var) {
        int iB = mj0Var.b();
        jxh[] jxhVarArr = new jxh[iB];
        for (int i = 0; i < iB; i++) {
            jxhVarArr[i] = new jxh(f, f2, mj0Var.a(i));
        }
        this.a = jxhVarArr;
    }

    @Override // defpackage.hk0
    public final nwh get(int i) {
        return this.a[i];
    }
}
