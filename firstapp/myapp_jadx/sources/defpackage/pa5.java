package defpackage;

import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class pa5 extends d.c implements ca5, mrr {
    public nza D;
    public boolean E;

    public static final lk40 p2(pa5 pa5Var, ywx ywxVar, da5 da5Var) {
        lk40 lk40Var;
        if (pa5Var.C && pa5Var.E) {
            ywx ywxVarE = pkd.e(pa5Var);
            if (!ywxVar.E1().C) {
                ywxVar = null;
            }
            if (ywxVar != null && (lk40Var = (lk40) da5Var.invoke()) != null) {
                return lk40Var.j(ywxVarE.P(ywxVar, false).e());
            }
        }
        return null;
    }

    @Override // defpackage.mrr
    public final void T0(urr urrVar) {
        this.E = true;
    }

    @Override // androidx.compose.ui.d.c
    public final boolean e2() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [na5] */
    @Override // defpackage.ca5
    public final Object t1(final ywx ywxVar, final da5 da5Var, x1b x1bVar) {
        Object objD = w5b.d(new oa5(this, ywxVar, da5Var, new Function0() { // from class: na5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ywx ywxVar2 = ywxVar;
                da5 da5Var2 = da5Var;
                pa5 pa5Var = this.a;
                lk40 lk40VarP2 = pa5.p2(pa5Var, ywxVar2, da5Var2);
                if (lk40VarP2 == null) {
                    return null;
                }
                nza nzaVar = pa5Var.D;
                if (jxo.b(nzaVar.L, 0L)) {
                    zkn.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return lk40VarP2.j(nzaVar.t2(lk40VarP2, nzaVar.L) ^ (-9223372034707292160L));
            }
        }, null), x1bVar);
        return objD == y5b.a ? objD : Unit.a;
    }
}
