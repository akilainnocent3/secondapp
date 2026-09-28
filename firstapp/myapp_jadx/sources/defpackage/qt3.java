package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.factscenter.BetslipStaleOddsResumePolicyDto;

/* JADX INFO: loaded from: classes7.dex */
public final class qt3 implements ot3 {
    public final y7h a;

    public qt3(y7h y7hVar) {
        y7hVar.getClass();
        this.a = y7hVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ot3
    public final Object a(x1b x1bVar) {
        pt3 pt3Var;
        Object bVar;
        if (x1bVar instanceof pt3) {
            pt3Var = (pt3) x1bVar;
            int i = pt3Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pt3Var.c = i - Integer.MIN_VALUE;
            } else {
                pt3Var = new pt3(this, x1bVar);
            }
        } else {
            pt3Var = new pt3(this, x1bVar);
        }
        Object objA = pt3Var.a;
        y5b y5bVar = y5b.a;
        int i2 = pt3Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objA);
                zi50.a aVar = zi50.b;
                y7h y7hVar = this.a;
                pt3Var.c = 1;
                objA = y7hVar.a(pt3Var);
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
            BetslipStaleOddsResumePolicyDto betslipStaleOddsResumePolicyDto = (BetslipStaleOddsResumePolicyDto) n52.b((BaseResponse) objA);
            betslipStaleOddsResumePolicyDto.getClass();
            Boolean enable = betslipStaleOddsResumePolicyDto.getEnable();
            boolean zBooleanValue = enable != null ? enable.booleanValue() : false;
            Long waitThresholdInSeconds = betslipStaleOddsResumePolicyDto.getWaitThresholdInSeconds();
            bVar = new aw3(zBooleanValue, waitThresholdInSeconds != null ? waitThresholdInSeconds.longValue() * 1000 : 0L);
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        return zi50.a(bVar) == null ? bVar : new aw3(0);
    }
}
