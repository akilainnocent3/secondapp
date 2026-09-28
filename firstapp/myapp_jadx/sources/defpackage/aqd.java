package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.pocket.common.PayHintData;
import com.sportybet.feature.payment.impl.deposit.domain.model.DepositDropAlertStatus;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositBankTransferOneTimeAccountViewModel$payHintOrDropAlertFlow$1", f = "DepositBankTransferOneTimeAccountViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class aqd extends tje0 implements gaj<PayHintData, DepositDropAlertStatus, v1b<? super o200>, Object> {
    public /* synthetic */ PayHintData a;
    public /* synthetic */ DepositDropAlertStatus b;

    @Override // defpackage.gaj
    public final Object invoke(PayHintData payHintData, DepositDropAlertStatus depositDropAlertStatus, v1b<? super o200> v1bVar) {
        aqd aqdVar = new aqd(3, v1bVar);
        aqdVar.a = payHintData;
        aqdVar.b = depositDropAlertStatus;
        return aqdVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        StringUiText stringUiText;
        String str;
        PayHintData payHintData = this.a;
        DepositDropAlertStatus depositDropAlertStatus = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (payHintData == null || (str = payHintData.alert) == null) {
            stringUiText = null;
        } else {
            StringUiText stringUiText2 = vch0.a;
            stringUiText = new StringUiText(str);
        }
        depositDropAlertStatus.getClass();
        return n200.a(stringUiText, depositDropAlertStatus, false, true);
    }
}
