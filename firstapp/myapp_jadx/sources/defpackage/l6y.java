package defpackage;

import android.os.Bundle;
import com.sporty.android.compose.ui.navigation.ext.NavigationResult;
import com.sportybet.android.globalpay.nuvei.deposit.NuveiDepositRouter$JumpBankScreen;
import com.sportybet.feature.loyalty.impl.welcomereward.WelcomeRewardBottomSheetActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l6y implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l6y(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        vu60 vu60VarA;
        Bundle bundle;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                hjx hjxVar = (hjx) obj;
                NuveiDepositRouter$JumpBankScreen.JumpBankCompleted jumpBankCompleted = NuveiDepositRouter$JumpBankScreen.JumpBankCompleted.a;
                hjxVar.getClass();
                ifx ifxVarH = hjxVar.b.h();
                NavigationResult navigationResult = new NavigationResult(gk50.a, (ifxVarH == null || (bundle = (Bundle) ifxVarH.a().b("nav_screen_props")) == null) ? null : bundle.getString("nav_screen_request"), jumpBankCompleted);
                ifx ifxVarE = hjxVar.e();
                if (ifxVarE != null && (vu60VarA = ifxVarE.a()) != null) {
                    vu60VarA.e(navigationResult, "nav_screen_result");
                }
                hjxVar.k();
                break;
            default:
                int i2 = WelcomeRewardBottomSheetActivity.d;
                ((WelcomeRewardBottomSheetActivity) obj).finish();
                break;
        }
        return Unit.a;
    }
}
