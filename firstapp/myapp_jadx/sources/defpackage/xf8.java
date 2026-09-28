package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.ugpay.withdraw.momo.CommonMobileMoneyWithdrawActivity;
import com.sportybet.feature.payment.impl.withdraw.domain.model.WithdrawAlertHintStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xf8 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xf8(int i, Function1 function1) {
        this.a = 1;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                CommonMobileMoneyWithdrawActivity commonMobileMoneyWithdrawActivity = (CommonMobileMoneyWithdrawActivity) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = CommonMobileMoneyWithdrawActivity.z;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ihj0.a((WithdrawAlertHintStatus) wyh.c(commonMobileMoneyWithdrawActivity.z1().a0, aVar, 0, 7).getValue(), false, null, aVar, 0, 6);
                } else {
                    aVar.G();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                zrq.b((Function1) obj3, (a) obj, qj40.a(1));
                break;
            default:
                r680 r680Var = (r680) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    q680.a(r680Var, aVar2, 0);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ xf8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
