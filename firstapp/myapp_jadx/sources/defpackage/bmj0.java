package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class bmj0 {
    public final zqj0 a;
    public boolean b;
    public String c;
    public String d;
    public bag e;

    public bmj0(zqj0 zqj0Var) {
        this.a = zqj0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(msj0 msj0Var, x1b x1bVar) {
        amj0 amj0Var;
        Object objA;
        if (x1bVar instanceof amj0) {
            amj0Var = (amj0) x1bVar;
            int i = amj0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                amj0Var.c = i - Integer.MIN_VALUE;
            } else {
                amj0Var = new amj0(this, x1bVar);
            }
        } else {
            amj0Var = new amj0(this, x1bVar);
        }
        Object obj = amj0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = amj0Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            msj0Var.a = this.b ? 1 : 0;
            msj0Var.b = this.c;
            msj0Var.c = this.d;
            bag bagVar = this.e;
            amj0Var.c = 1;
            objA = this.a.a(msj0Var, bagVar, Boolean.FALSE, amj0Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objA = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        this.b = (objA instanceof zi50.b ? null : objA) instanceof xoj0.b.a;
        return objA;
    }
}
