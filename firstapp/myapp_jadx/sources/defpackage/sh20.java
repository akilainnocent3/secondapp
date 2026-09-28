package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class sh20 {
    public final Object a;

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object a(Integer num, x1b x1bVar) {
        zs60 zs60Var;
        ptf0 ptf0Var = (ptf0) this.a;
        if (x1bVar instanceof zs60) {
            zs60Var = (zs60) x1bVar;
            int i = zs60Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zs60Var.c = i - Integer.MIN_VALUE;
            } else {
                zs60Var = new zs60(this, x1bVar);
            }
        } else {
            zs60Var = new zs60(this, x1bVar);
        }
        Object obj = zs60Var.a;
        y5b y5bVar = y5b.a;
        int i2 = zs60Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            zs60Var.c = 1;
            if (ptf0Var.b(num, zs60Var) != y5bVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        zs60Var.c = 2;
        Object objA = ptf0Var.a(0, zs60Var);
        return objA == y5bVar ? y5bVar : objA;
    }

    public int b() {
        return ((th20) this.a).b.z0;
    }
}
