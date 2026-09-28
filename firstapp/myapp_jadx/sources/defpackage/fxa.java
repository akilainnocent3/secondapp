package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fxa {
    public static final String a = jgt.g("ConstraintTrkngWrkr");

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(ouj0 ouj0Var, owj0 owj0Var, x1b x1bVar) {
        dxa dxaVar;
        if (x1bVar instanceof dxa) {
            dxaVar = (dxa) x1bVar;
            int i = dxaVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                dxaVar.b = i - Integer.MIN_VALUE;
            } else {
                dxaVar = new dxa(x1bVar);
            }
        } else {
            dxaVar = new dxa(x1bVar);
        }
        Object objA = dxaVar.a;
        y5b y5bVar = y5b.a;
        int i2 = dxaVar.b;
        if (i2 == 0) {
            uj50.b(objA);
            cxa cxaVar = new cxa(new g1i(ouj0Var.b(owj0Var), new exa(owj0Var, null)));
            dxaVar.b = 1;
            objA = s0i.a(cxaVar, dxaVar);
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
        return new Integer(((rxa.b) objA).a);
    }
}
