package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public class vth implements kze, ujt {
    public ob50[] a = null;
    public final pb50 b;
    public final int c;

    public vth(int i, pb50 pb50Var) {
        this.c = i;
        this.b = pb50Var;
    }

    @Override // defpackage.ujt
    public void a(long j, m21 m21Var, m0b m0bVar) {
        ob50[] ob50VarArr = this.a;
        if (ob50VarArr == null) {
            int i = this.c;
            ob50[] ob50VarArr2 = new ob50[i];
            for (int i2 = 0; i2 < i; i2++) {
                ob50 ob50Var = new ob50();
                ui1 ui1Var = ui1.f;
                ob50VarArr2[i2] = ob50Var;
            }
            this.a = ob50VarArr2;
            ob50VarArr = ob50VarArr2;
        }
        int iA = this.b.a(ob50VarArr, j);
        if (iA != -1) {
            ob50 ob50Var2 = this.a[iA];
            synchronized (ob50Var2) {
                ob50Var2.a = m21Var;
                eqe0.a(false);
                oqa0.i(m0bVar).b().f();
            }
        }
    }

    @Override // defpackage.kze
    public final void b(double d, m21 m21Var, m0b m0bVar) {
        ob50[] ob50VarArr = this.a;
        if (ob50VarArr == null) {
            int i = this.c;
            ob50[] ob50VarArr2 = new ob50[i];
            for (int i2 = 0; i2 < i; i2++) {
                ob50 ob50Var = new ob50();
                ui1 ui1Var = ui1.f;
                ob50VarArr2[i2] = ob50Var;
            }
            this.a = ob50VarArr2;
            ob50VarArr = ob50VarArr2;
        }
        int iB = this.b.b(ob50VarArr, d);
        if (iB != -1) {
            ob50 ob50Var2 = this.a[iB];
            synchronized (ob50Var2) {
                ob50Var2.a = m21Var;
                eqe0.a(false);
                oqa0.i(m0bVar).b().f();
            }
        }
    }
}
