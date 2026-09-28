package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.sportybet.android.kepay.deposit.KeDepositActivity;
import com.sportybet.android.kepay.withdraw.KeWithdrawActivity;

/* JADX INFO: loaded from: classes5.dex */
public final class tjp implements j800 {
    public final uqm a;

    public tjp(uqm uqmVar) {
        uqmVar.getClass();
        this.a = uqmVar;
    }

    @Override // defpackage.j800
    public final void b(final Bundle bundle) {
        Activity activityD = oti.c().d();
        if (activityD == null) {
            return;
        }
        this.a.demandAccount(activityD, new tit() { // from class: rjp
            @Override // defpackage.tit
            public final void w(Account account, boolean z) {
                Bundle bundle2 = bundle;
                if (account == null) {
                    return;
                }
                hp0 hp0Var = hp0.A;
                Intent intent = new Intent(hp0Var, (Class<?>) KeDepositActivity.class);
                intent.setFlags(268435456);
                if (bundle2 != null) {
                    intent.putExtras(bundle2);
                }
                yrh0.s(hp0Var, intent, true);
            }
        });
    }

    @Override // defpackage.j800
    public final void c(final Activity activity, Bundle bundle) {
        this.a.demandAccount(activity, new tit() { // from class: sjp
            @Override // defpackage.tit
            public final void w(Account account, boolean z) {
                if (account == null) {
                    return;
                }
                Activity activity2 = activity;
                Intent intent = new Intent(activity2, (Class<?>) KeWithdrawActivity.class);
                intent.setFlags(268435456);
                intent.putExtra("phone_number", account.name);
                activity2.startActivity(intent);
            }
        });
    }
}
