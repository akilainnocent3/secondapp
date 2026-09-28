package defpackage;

import com.sportygames.crash.models.BetData;
import com.sportygames.crash.models.bet.BetContainerState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dm80 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dm80(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                nm80 nm80Var = (nm80) obj2;
                String str = (String) obj;
                str.getClass();
                m2l m2lVar = nm80Var.d;
                m2lVar.getClass();
                return e1i.e(m2lVar.a.getBooleanByFlow(str, true), o8i0.d(nm80Var), new mwd0(0L, Long.MAX_VALUE), Boolean.TRUE);
            default:
                m9c0 m9c0Var = (m9c0) obj2;
                BetData betData = (BetData) obj;
                betData.getClass();
                ((BetContainerState) m9c0Var.R0().a.getValue()).setBetData(betData);
                ((x5a0) m9c0Var.E1).setValue(Boolean.TRUE);
                return Unit.a;
        }
    }
}
