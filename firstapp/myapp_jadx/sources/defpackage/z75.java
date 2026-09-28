package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositActivity;

/* JADX INFO: loaded from: classes5.dex */
public final class z75 implements j800 {
    public final uqm a;

    public z75(uqm uqmVar) {
        uqmVar.getClass();
        this.a = uqmVar;
    }

    @Override // defpackage.j800
    public final void b(final Bundle bundle) {
        final Activity activityD = oti.c().d();
        if (activityD == null) {
            return;
        }
        this.a.demandAccount(activityD, new tit() { // from class: x75
            @Override // defpackage.tit
            public final void w(Account account, boolean z) {
                if (account == null) {
                    return;
                }
                int i = PixBtgDepositActivity.b;
                Activity activity = activityD;
                Intent intent = new Intent(activity, (Class<?>) PixBtgDepositActivity.class);
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
        this.a.demandAccount(activity, new y75(activity, bundle, 0));
    }
}
