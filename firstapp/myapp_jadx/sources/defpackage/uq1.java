package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.json.JsonSerializeService;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class uq1 implements lq1 {
    public final ta8 a;
    public final psm b;
    public final JsonSerializeService c;
    public final k5b d;
    public final wwd0 e;

    public uq1(ta8 ta8Var, psm psmVar, JsonSerializeService jsonSerializeService, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        ta8Var.getClass();
        psmVar.getClass();
        jsonSerializeService.getClass();
        this.a = ta8Var;
        this.b = psmVar;
        this.c = jsonSerializeService;
        this.d = k5bVar;
        this.e = xwd0.a(lk50.b.a);
    }

    @Override // defpackage.lq1
    public final lyh<lk50<BOConfigValueBundle>> a(pu0 pu0Var) {
        pu0Var.getClass();
        yzh yzhVarC = c(BOConfigParam.getEntries());
        boolean z = pu0Var instanceof pu0.a;
        wwd0 wwd0Var = this.e;
        if (z) {
            Object value = wwd0Var.getValue();
            lk50.c cVar = value instanceof lk50.c ? (lk50.c) value : null;
            if (cVar == null || bm50.k(cVar, ((pu0.a) pu0Var).a)) {
                return new g1i(yzhVarC, new qu0(wwd0Var, null));
            }
        } else if (!pu0Var.equals(pu0.b.a)) {
            if (pu0Var.equals(pu0.c.a)) {
                return new g1i(yzhVarC, new ru0(wwd0Var, null));
            }
            uhc.a();
            return null;
        }
        return wwd0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lq1
    public final Object b(x1b x1bVar) {
        rq1 rq1Var;
        if (x1bVar instanceof rq1) {
            rq1Var = (rq1) x1bVar;
            int i = rq1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rq1Var.d = i - Integer.MIN_VALUE;
            } else {
                rq1Var = new rq1(this, x1bVar);
            }
        } else {
            rq1Var = new rq1(this, x1bVar);
        }
        Object objD = rq1Var.b;
        Object obj = y5b.a;
        int i2 = rq1Var.d;
        if (i2 == 0) {
            uj50.b(objD);
            Collection entries = BOConfigParam.getEntries();
            rq1Var.d = 1;
            objD = d(entries, rq1Var);
            if (objD != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            BOConfigValueBundle bOConfigValueBundle = rq1Var.a;
            uj50.b(objD);
            return bOConfigValueBundle;
        }
        uj50.b(objD);
        BOConfigValueBundle bOConfigValueBundle2 = (BOConfigValueBundle) objD;
        lk50.c cVar = new lk50.c(bOConfigValueBundle2);
        rq1Var.a = bOConfigValueBundle2;
        rq1Var.d = 2;
        this.e.k(null, cVar);
        return Unit.a == obj ? obj : bOConfigValueBundle2;
    }

    @Override // defpackage.lq1
    public final yzh c(List list) {
        list.getClass();
        return bm50.a(new or60(new tq1(this, list, null)));
    }

    @Override // defpackage.lq1
    public final Object d(Collection collection, x1b x1bVar) {
        return ej5.d(this.d, new sq1(this, collection, null), x1bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lq1
    public final BOConfigValueBundle e() {
        Object value = this.e.getValue();
        lk50.c cVar = value instanceof lk50.c ? (lk50.c) value : null;
        if (cVar != null) {
            return (BOConfigValueBundle) cVar.a;
        }
        return null;
    }
}
