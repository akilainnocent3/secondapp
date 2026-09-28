package defpackage;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class v7e {
    public final o500 a;
    public final rdd0 b;

    public v7e(u600 u600Var, o500 o500Var, rdd0 rdd0Var) {
        o500Var.getClass();
        rdd0Var.getClass();
        this.a = o500Var;
        this.b = rdd0Var;
    }

    public final void a(int i, bag bagVar, qnd qndVar, Set<? extends k00> set) {
        qndVar.getClass();
        set.getClass();
        String strValueOf = String.valueOf(i);
        strValueOf.getClass();
        qnd qndVarE = qnd.e(qndVar, bagVar, u600.a(sg8.a(Integer.parseInt(strValueOf))), null, null, null, null, 16373);
        if (bagVar == dag.PAYDAY_PROMO) {
            this.a.a("payday_deposit_started");
        }
        Iterator it = yi80.e(wi80.b(k00.d), set).iterator();
        while (it.hasNext()) {
            this.b.a(qndVarE, (k00) it.next());
        }
    }
}
