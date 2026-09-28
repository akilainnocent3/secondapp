package defpackage;

import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.kekO.YAzniTbXHYQ;

/* JADX INFO: loaded from: classes2.dex */
public final class fp7 {
    public final psm a;
    public final lyz b;

    public fp7(psm psmVar, lyz lyzVar) {
        psmVar.getClass();
        lyzVar.getClass();
        this.a = psmVar;
        this.b = lyzVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        ep7 ep7Var;
        if (x1bVar instanceof ep7) {
            ep7Var = (ep7) x1bVar;
            int i = ep7Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ep7Var.c = i - Integer.MIN_VALUE;
            } else {
                ep7Var = new ep7(this, x1bVar);
            }
        } else {
            ep7Var = new ep7(this, x1bVar);
        }
        Object objC = ep7Var.a;
        y5b y5bVar = y5b.a;
        int i2 = ep7Var.c;
        boolean zBooleanValue = false;
        if (i2 == 0) {
            uj50.b(objC);
            if (this.a.F()) {
                dp7 dp7Var = new dp7(new sl50(bm50.b(this.b.D0(), vch0.b)));
                ep7Var.c = 1;
                objC = s0i.c(dp7Var, ep7Var);
                if (objC == y5bVar) {
                    return y5bVar;
                }
            }
            return Boolean.valueOf(zBooleanValue);
        }
        if (i2 != 1) {
            ib5.a(YAzniTbXHYQ.czPIRF);
            return null;
        }
        uj50.b(objC);
        Boolean bool = (Boolean) objC;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
