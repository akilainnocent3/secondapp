package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.sportybet.android.globalpay.mobileMoney.CmMobileMoneyDepositActivity;

/* JADX INFO: loaded from: classes5.dex */
public final class ku7 implements j800 {
    public final uqm a;
    public final h2l b;

    public ku7(uqm uqmVar, h2l h2lVar) {
        uqmVar.getClass();
        this.a = uqmVar;
        this.b = h2lVar;
    }

    @Override // defpackage.j800
    public final void b(final Bundle bundle) {
        final Activity activityD = oti.c().d();
        if (activityD == null) {
            return;
        }
        this.a.demandAccount(activityD, new tit() { // from class: ju7
            @Override // defpackage.tit
            public final void w(Account account, boolean z) {
                if (account == null) {
                    return;
                }
                int i = CmMobileMoneyDepositActivity.f;
                Activity activity = activityD;
                Intent intent = new Intent(activity, (Class<?>) CmMobileMoneyDepositActivity.class);
                Bundle bundle2 = bundle;
                if (bundle2 != null) {
                    intent.putExtras(bundle2);
                }
                yrh0.s(activity, intent, true);
            }
        });
    }

    @Override // defpackage.j800
    public final void c(Activity activity, Bundle bundle) {
        this.b.c(activity, bundle);
    }
}
