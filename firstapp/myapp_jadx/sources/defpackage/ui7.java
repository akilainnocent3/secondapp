package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class ui7 {
    public final kc50 a;

    public ui7(kc50 kc50Var) {
        kc50Var.getClass();
        this.a = kc50Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        ti7 ti7Var;
        if (x1bVar instanceof ti7) {
            ti7Var = (ti7) x1bVar;
            int i = ti7Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ti7Var.c = i - Integer.MIN_VALUE;
            } else {
                ti7Var = new ti7(this, x1bVar);
            }
        } else {
            ti7Var = new ti7(this, x1bVar);
        }
        Object objA = ti7Var.a;
        y5b y5bVar = y5b.a;
        int i2 = ti7Var.c;
        if (i2 == 0) {
            uj50.b(objA);
            ti7Var.c = 1;
            objA = this.a.a(ti7Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objA);
        }
        return bm50.l((lk50) objA, new si7(0));
    }
}
