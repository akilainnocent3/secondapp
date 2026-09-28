package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.BetBuilderOutcome;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class s0v implements gv5<BetBuilderOutcome> {
    public final /* synthetic */ ssw<hqc> a;
    public final /* synthetic */ u0v b;
    public final /* synthetic */ BetBuilderOutcome c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public s0v(ssw<hqc> sswVar, u0v u0vVar, BetBuilderOutcome betBuilderOutcome, String str, String str2) {
        this.a = sswVar;
        this.b = u0vVar;
        this.c = betBuilderOutcome;
        this.d = str;
        this.e = str2;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BetBuilderOutcome> su5Var, Throwable th) {
        th.getClass();
        ssw<hqc> sswVar = this.a;
        if (sswVar != null) {
            try {
                sswVar.m(this.b.c(th));
            } catch (Throwable th2) {
                sswVar.m(new mqc());
                throw th2;
            }
        }
        if (sswVar != null) {
            sswVar.m(new mqc());
        }
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BetBuilderOutcome> su5Var, bi50<BetBuilderOutcome> bi50Var) {
        mqc mqcVar;
        BetBuilderOutcome betBuilderOutcome;
        String str = this.e;
        BetBuilderOutcome betBuilderOutcome2 = this.c;
        ssw<hqc> sswVar = this.a;
        try {
            boolean isSuccessful = bi50Var.a.getIsSuccessful();
            u0v u0vVar = this.b;
            if (!isSuccessful || (betBuilderOutcome = bi50Var.b) == null) {
                if (sswVar != null) {
                    sswVar.m(u0vVar.b(bi50Var));
                }
                if (sswVar == null) {
                    return;
                } else {
                    mqcVar = new mqc();
                }
            } else {
                BetBuilderOutcome betBuilderOutcome3 = betBuilderOutcome;
                betBuilderOutcome2.update(betBuilderOutcome3.id, betBuilderOutcome3.odds, betBuilderOutcome3.probability, betBuilderOutcome3.enable);
                String str2 = this.d;
                HashMap<String, Map<String, BetBuilderOutcome>> map = u0vVar.l;
                Map<String, BetBuilderOutcome> map2 = map.get(str2);
                if (map2 == null) {
                    map2 = new HashMap<>();
                    map.put(str2, map2);
                }
                map2.put(str, betBuilderOutcome2);
                if (u0vVar.j.equals(str)) {
                    u0vVar.h = betBuilderOutcome2;
                    if (sswVar != null) {
                        sswVar.m(new nqc(betBuilderOutcome2));
                    }
                }
                if (sswVar == null) {
                    return;
                } else {
                    mqcVar = new mqc();
                }
            }
            sswVar.m(mqcVar);
        } catch (Throwable th) {
            if (sswVar != null) {
                sswVar.m(new mqc());
            }
            throw th;
        }
    }
}
