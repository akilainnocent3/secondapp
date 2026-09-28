package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.feature.payment.impl.withdraw.domain.model.WithdrawAlertHintStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class stf implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ttf.b((Function0) obj3, (a) obj, qj40.a(7));
                break;
            default:
                tmj0 tmj0Var = (tmj0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ihj0.a((WithdrawAlertHintStatus) wyh.c(tmj0Var.P0().K0, aVar, 0, 7).getValue(), false, null, aVar, 0, 6);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ stf(tmj0 tmj0Var) {
        this.b = tmj0Var;
    }
}
