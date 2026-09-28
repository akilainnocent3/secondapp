package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class eg50 {
    public final psm a;
    public final e5k b;

    public eg50(psm psmVar, e5k e5kVar) {
        psmVar.getClass();
        this.a = psmVar;
        this.b = e5kVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, x1b x1bVar) {
        dg50 dg50Var;
        if (x1bVar instanceof dg50) {
            dg50Var = (dg50) x1bVar;
            int i = dg50Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dg50Var.d = i - Integer.MIN_VALUE;
            } else {
                dg50Var = new dg50(this, x1bVar);
            }
        } else {
            dg50Var = new dg50(this, x1bVar);
        }
        Object objA = dg50Var.b;
        Object obj = y5b.a;
        int i2 = dg50Var.d;
        if (i2 == 0) {
            uj50.b(objA);
            if (!this.a.F()) {
                return str;
            }
            dg50Var.a = str;
            dg50Var.d = 1;
            objA = this.b.a(dg50Var);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = dg50Var.a;
            uj50.b(objA);
        }
        String str2 = (String) ((Map) objA).get("mxn_name");
        return str2 == null ? str : str2;
    }
}
