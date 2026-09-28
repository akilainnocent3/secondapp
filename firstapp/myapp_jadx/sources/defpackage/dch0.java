package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.sportybet.android.ugpay.deposit.CommonDepositActivity;
import com.sportybet.android.ugpay.withdraw.momo.CommonMobileMoneyWithdrawAgentActivity;

/* JADX INFO: loaded from: classes5.dex */
public final class dch0 implements j800 {
    public final uqm a;

    public dch0(uqm uqmVar) {
        uqmVar.getClass();
        this.a = uqmVar;
    }

    @Override // defpackage.j800
    public final void b(final Bundle bundle) {
        final Activity activityD = oti.c().d();
        if (activityD == null) {
            return;
        }
        this.a.demandAccount(activityD, new tit() { // from class: cch0
            @Override // defpackage.tit
            public final void w(Account account, boolean z) {
                if (account == null) {
                    return;
                }
                int i = CommonDepositActivity.D;
                long j = z600.a().b.a;
                long j2 = z600.a().b.b;
                Activity activity = activityD;
                Intent intent = new Intent(activity, (Class<?>) CommonDepositActivity.class);
                intent.putExtra("mobileMoneyMethodId", "20");
                intent.putExtra("paybillMethodId", "21");
                intent.putExtra("minDepositAmount", j);
                intent.putExtra("maxDepositAmount", j2);
                intent.setFlags(268435456);
                Bundle bundle2 = bundle;
                if (bundle2 != null) {
                    intent.putExtras(bundle2);
                }
                activity.startActivity(intent);
            }
        });
    }

    @Override // defpackage.j800
    public final void c(Activity activity, Bundle bundle) {
        yrh0.t(activity, CommonMobileMoneyWithdrawAgentActivity.class, false);
    }
}
