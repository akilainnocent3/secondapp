package defpackage;

import com.sporty.android.core.model.json.JsonSerializeService;
import com.sportybet.plugin.sportypicks.domain.model.Kjqv.DZsoPoBl;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class vq40 {
    public final q2j0 a;
    public final w1j0 b;
    public final mgb0 c;
    public final psm d;
    public final JsonSerializeService e;

    public vq40(q2j0 q2j0Var, w1j0 w1j0Var, mgb0 mgb0Var, psm psmVar, JsonSerializeService jsonSerializeService) {
        w1j0Var.getClass();
        mgb0Var.getClass();
        psmVar.getClass();
        jsonSerializeService.getClass();
        this.a = q2j0Var;
        this.b = w1j0Var;
        this.c = mgb0Var;
        this.d = psmVar;
        this.e = jsonSerializeService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        uq40 uq40Var;
        if (x1bVar instanceof uq40) {
            uq40Var = (uq40) x1bVar;
            int i = uq40Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uq40Var.c = i - Integer.MIN_VALUE;
            } else {
                uq40Var = new uq40(this, x1bVar);
            }
        } else {
            uq40Var = new uq40(this, x1bVar);
        }
        Object objP = uq40Var.a;
        y5b y5bVar = y5b.a;
        int i2 = uq40Var.c;
        if (i2 == 0) {
            uj50.b(objP);
            if (this.c.isLogin()) {
                psm psmVar = this.d;
                if (psmVar.o() || psmVar.G() || psmVar.S() || psmVar.x() || psmVar.n() || psmVar.O()) {
                    q2j0 q2j0Var = this.a;
                    yzh yzhVarA = bm50.a(new tq40(ozh.c(new or60(new p2j0(q2j0Var, null)), q2j0Var.b)));
                    uq40Var.c = 1;
                    objP = bm50.p(yzhVarA, uq40Var);
                    if (objP != y5bVar) {
                    }
                }
            }
            return Unit.a;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(objP);
                return objP;
            }
            ib5.a(DZsoPoBl.sPNLMc);
            return null;
        }
        uj50.b(objP);
        lk50 lk50Var = (lk50) objP;
        if (!(lk50Var instanceof lk50.c)) {
            return Unit.a;
        }
        wm20<String> wm20VarC = this.b.c();
        String json = this.e.toJson(((lk50.c) lk50Var).a);
        json.getClass();
        uq40Var.c = 2;
        Object objG = wm20VarC.g(uq40Var, json);
        return objG == y5bVar ? y5bVar : objG;
    }
}
