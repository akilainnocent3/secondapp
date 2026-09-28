package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class j1l0 {
    public final pqk0 a;
    public final g3l0 b;
    public final g3l0 c;
    public final hal0 d;

    public j1l0() {
        pqk0 pqk0Var = new pqk0();
        this.a = pqk0Var;
        g3l0 g3l0Var = new g3l0(null, pqk0Var);
        this.c = g3l0Var;
        this.b = g3l0Var.c();
        hal0 hal0Var = new hal0();
        this.d = hal0Var;
        g3l0Var.e("require", new jtl0(hal0Var));
        hal0Var.a.put("internal.platform", jzk0.a);
        g3l0Var.e("runtime.counter", new eok0(Double.valueOf(0.0d)));
    }

    public final ipk0 a(g3l0 g3l0Var, wal0... wal0VarArr) {
        ipk0 ipk0VarB = ipk0.o;
        for (wal0 wal0Var : wal0VarArr) {
            ipk0VarB = b8l0.b(wal0Var);
            r5l0.k(this.c);
            if ((ipk0VarB instanceof lpk0) || (ipk0VarB instanceof fpk0)) {
                ipk0VarB = this.a.b(g3l0Var, ipk0VarB);
            }
        }
        return ipk0VarB;
    }
}
