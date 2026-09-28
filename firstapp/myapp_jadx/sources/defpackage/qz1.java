package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class qz1 implements zpc {
    public final boolean a;
    public final ArrayList<mrg0> b = new ArrayList<>(1);
    public int c;
    public gqc d;

    public qz1(boolean z) {
        this.a = z;
    }

    @Override // defpackage.zpc
    public final void g(mrg0 mrg0Var) {
        mrg0Var.getClass();
        ArrayList<mrg0> arrayList = this.b;
        if (arrayList.contains(mrg0Var)) {
            return;
        }
        arrayList.add(mrg0Var);
        this.c++;
    }

    public final void n(int i) {
        gqc gqcVar = this.d;
        String str = jrh0.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            this.b.get(i2).b(gqcVar, this.a, i);
        }
    }

    public final void o() {
        gqc gqcVar = this.d;
        String str = jrh0.a;
        for (int i = 0; i < this.c; i++) {
            this.b.get(i).f(gqcVar, this.a);
        }
        this.d = null;
    }

    public final void p(gqc gqcVar) {
        for (int i = 0; i < this.c; i++) {
            this.b.get(i).getClass();
        }
    }

    public final void q(gqc gqcVar) {
        this.d = gqcVar;
        for (int i = 0; i < this.c; i++) {
            this.b.get(i).g(gqcVar, this.a);
        }
    }
}
