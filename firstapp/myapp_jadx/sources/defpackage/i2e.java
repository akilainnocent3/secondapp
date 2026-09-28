package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.pocket.common.PayHintData;
import com.sportybet.feature.payment.impl.deposit.domain.model.DepositDropAlertStatus;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositMomoViewModel$payHintOrDropAlertFlow$1", f = "DepositMomoViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i2e extends tje0 implements iaj<PayHintData, DepositDropAlertStatus, rr00, v1b<? super o200>, Object> {
    public /* synthetic */ PayHintData a;
    public /* synthetic */ DepositDropAlertStatus b;
    public /* synthetic */ rr00 c;

    @Override // defpackage.iaj
    public final Object d(PayHintData payHintData, DepositDropAlertStatus depositDropAlertStatus, rr00 rr00Var, v1b<? super o200> v1bVar) {
        i2e i2eVar = new i2e(4, v1bVar);
        i2eVar.a = payHintData;
        i2eVar.b = depositDropAlertStatus;
        i2eVar.c = rr00Var;
        return i2eVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str;
        PayHintData payHintData = this.a;
        DepositDropAlertStatus depositDropAlertStatus = this.b;
        rr00 rr00Var = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        StringUiText stringUiText = null;
        if (rr00Var instanceof rr00.a) {
            return new o200(2, (UiText) null);
        }
        if (payHintData != null && (str = payHintData.alert) != null) {
            StringUiText stringUiText2 = vch0.a;
            stringUiText = new StringUiText(str);
        }
        depositDropAlertStatus.getClass();
        return n200.a(stringUiText, depositDropAlertStatus, true, true);
    }
}
