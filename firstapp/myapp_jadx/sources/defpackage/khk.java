package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.os.Bundle;
import com.sportybet.android.payment.withdraw.presentation.activity.WithdrawKycAgentActivity;
import com.sportybet.feature.payment.impl.common.presentation.activity.TradingActivity;

/* JADX INFO: loaded from: classes5.dex */
public final class khk implements j800 {
    public final uqm a;

    public khk(uqm uqmVar) {
        uqmVar.getClass();
        this.a = uqmVar;
    }

    @Override // defpackage.j800
    public final void b(final Bundle bundle) {
        final Activity activityD = oti.c().d();
        if (activityD == null) {
            return;
        }
        this.a.demandAccount(activityD, new tit() { // from class: jhk
            @Override // defpackage.tit
            public final void w(Account account, boolean z) {
                if (account == null) {
                    return;
                }
                Bundle bundle2 = bundle;
                Activity activity = activityD;
                if (bundle2 != null) {
                    int i = TradingActivity.X;
                    TradingActivity.a.b(activity, bundle2);
                } else {
                    int i2 = TradingActivity.X;
                    activity.startActivity(TradingActivity.a.a(activity, log0.a));
                }
            }
        });
    }

    @Override // defpackage.j800
    public final void c(Activity activity, Bundle bundle) {
        yrh0.t(activity, WithdrawKycAgentActivity.class, false);
    }
}
