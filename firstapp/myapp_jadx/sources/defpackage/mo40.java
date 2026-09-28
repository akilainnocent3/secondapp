package defpackage;

import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.redblack.remote.models.PlaceBetRequest;
import java.util.Collection;

/* JADX INFO: loaded from: classes7.dex */
public final class mo40 {
    public static final mo40 a = new mo40();

    public static final boolean a(Market market) {
        market.getClass();
        Collection<Outcome> collection = market.outcomes;
        if (collection == null) {
            collection = m2g.a;
        }
        if (collection != null && collection.isEmpty()) {
            return true;
        }
        for (Outcome outcome : collection) {
            outcome.getClass();
            if (b(market, outcome)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean b(Market market, Outcome outcome) {
        String str;
        market.getClass();
        return market.status == 0 && outcome.isActive == 1 && (str = outcome.odds) != null && str.length() != 0;
    }

    public static final void c(yfx yfxVar, long j, long j2, zix zixVar) {
        yfxVar.getClass();
        yfx.i(yfxVar, "bio_auth_settings_route/" + j2 + "/" + j, zixVar, 4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(PlaceBetRequest placeBetRequest, x1b x1bVar) {
        io40 io40Var;
        if (x1bVar instanceof io40) {
            io40Var = (io40) x1bVar;
            int i = io40Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                io40Var.c = i - Integer.MIN_VALUE;
            } else {
                io40Var = new io40(this, x1bVar);
            }
        } else {
            io40Var = new io40(this, x1bVar);
        }
        Object objD = io40Var.a;
        y5b y5bVar = y5b.a;
        int i2 = io40Var.c;
        if (i2 == 0) {
            uj50.b(objD);
            pfd pfdVar = fse.a;
            odd oddVar = odd.b;
            jo40 jo40Var = new jo40(placeBetRequest, null);
            io40Var.c = 1;
            objD = ej5.d(oddVar, new a52(jo40Var, null), io40Var);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objD);
        }
        return (ResultWrapper) objD;
    }
}
