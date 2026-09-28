package defpackage;

import com.sporty.android.core.model.realsports.EarlyPayoutConfig;
import com.sporty.android.core.model.realsports.EarlyPayoutConfigModel;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class nuy implements ouy {
    public final pjf a;
    public final mjf b;

    public nuy(pjf pjfVar, mjf mjfVar) {
        this.a = pjfVar;
        this.b = mjfVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ouy
    public final Serializable a(x1b x1bVar) {
        muy muyVar;
        if (x1bVar instanceof muy) {
            muyVar = (muy) x1bVar;
            int i = muyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                muyVar.c = i - Integer.MIN_VALUE;
            } else {
                muyVar = new muy(this, x1bVar);
            }
        } else {
            muyVar = new muy(this, x1bVar);
        }
        Object objA = muyVar.a;
        y5b y5bVar = y5b.a;
        int i2 = muyVar.c;
        if (i2 == 0) {
            uj50.b(objA);
            g1i g1iVarA = this.a.a();
            muyVar.c = 1;
            objA = s0i.a(g1iVarA, muyVar);
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
        Map mapD = g2k.d((EarlyPayoutConfigModel) objA);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ckf ckfVar = ckf.a;
        EarlyPayoutConfig earlyPayoutConfig = (EarlyPayoutConfig) mapD.get(ckfVar);
        ckf ckfVar2 = ckf.b;
        EarlyPayoutConfig earlyPayoutConfig2 = (EarlyPayoutConfig) mapD.get(ckfVar2);
        boolean zB = g2k.b(earlyPayoutConfig);
        boolean zB2 = g2k.b(earlyPayoutConfig2);
        linkedHashMap.put(ckfVar, Boolean.valueOf(zB));
        linkedHashMap.put(ckfVar2, Boolean.valueOf(zB2));
        return linkedHashMap;
    }

    @Override // defpackage.ouy
    public final yvy b() {
        ckf ckfVar = ckf.a;
        mjf mjfVar = this.b;
        return new yvy(mjfVar.a(ckfVar), mjfVar.a(ckf.b));
    }
}
