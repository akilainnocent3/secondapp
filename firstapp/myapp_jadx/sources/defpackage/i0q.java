package defpackage;

import com.sportygames.crash.models.BetData;
import com.sportygames.crash.models.bet.BetContainerState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i0q implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i0q(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((Function1) obj2).invoke(bool);
                break;
            default:
                ylb0 ylb0Var = (ylb0) obj2;
                BetData betData = (BetData) obj;
                betData.getClass();
                ((BetContainerState) ylb0Var.R0().a.getValue()).setBetData(betData);
                ((x5a0) ylb0Var.E1).setValue(Boolean.TRUE);
                break;
        }
        return Unit.a;
    }
}
