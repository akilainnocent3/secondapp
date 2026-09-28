package defpackage;

import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class a4s implements br5.b {
    public final TreeSet<xr5> a = new TreeSet<>(new z3s());
    public long b;

    @Override // br5.b
    public final void a(pj90 pj90Var, xr5 xr5Var) {
        this.a.add(xr5Var);
        this.b += xr5Var.c;
        TreeSet<xr5> treeSet = this.a;
        while (this.b > 104857600 && !treeSet.isEmpty()) {
            xr5 xr5VarFirst = treeSet.first();
            synchronized (pj90Var) {
                pj90Var.q(xr5VarFirst);
            }
        }
    }

    @Override // br5.b
    public final void b(xr5 xr5Var) {
        this.a.remove(xr5Var);
        this.b -= xr5Var.c;
    }

    @Override // br5.b
    public final void c(pj90 pj90Var, xr5 xr5Var, qj90 qj90Var) {
        b(xr5Var);
        a(pj90Var, qj90Var);
    }
}
