package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class ij7 {
    public final sr10 a;

    public ij7(sr10 sr10Var) {
        sr10Var.getClass();
        this.a = sr10Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, x1b x1bVar) {
        hj7 hj7Var;
        Object bVar;
        if (x1bVar instanceof hj7) {
            hj7Var = (hj7) x1bVar;
            int i = hj7Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hj7Var.c = i - Integer.MIN_VALUE;
            } else {
                hj7Var = new hj7(this, x1bVar);
            }
        } else {
            hj7Var = new hj7(this, x1bVar);
        }
        Object objA = hj7Var.a;
        y5b y5bVar = y5b.a;
        int i2 = hj7Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objA);
                zi50.a aVar = zi50.b;
                sr10 sr10Var = this.a;
                hj7Var.c = 1;
                objA = sr10Var.A(str, hj7Var);
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
            bVar = (wi7) objA;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Object wi7Var = new wi7("NONE");
        if (bVar instanceof zi50.b) {
            bVar = wi7Var;
        }
        return ((wi7) bVar).a.equals("INSUFFICIENT_FUNDS") ? xi7.a.a : xi7.b.a;
    }
}
