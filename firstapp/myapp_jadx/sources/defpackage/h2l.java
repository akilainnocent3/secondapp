package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.sportybet.android.globalpay.GlobalDepositActivity;
import com.sportybet.android.globalpay.GlobalWithdrawActivity;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class h2l implements j800 {
    public final uqm a;

    public h2l(uqm uqmVar) {
        uqmVar.getClass();
        this.a = uqmVar;
    }

    @Override // defpackage.j800
    public final void b(final Bundle bundle) {
        final Activity activityD = oti.c().d();
        if (activityD == null) {
            return;
        }
        this.a.demandAccount(activityD, new tit() { // from class: f2l
            @Override // defpackage.tit
            public final void w(Account account, boolean z) {
                if (account == null) {
                    return;
                }
                int i = GlobalDepositActivity.w;
                Activity activity = activityD;
                Intent intent = new Intent(activity, (Class<?>) GlobalDepositActivity.class);
                intent.setFlags(268435456);
                Bundle bundle2 = bundle;
                if (bundle2 != null) {
                    intent.putExtras(bundle2);
                }
                yrh0.s(activity, intent, true);
            }
        });
    }

    @Override // defpackage.j800
    public final void c(final Activity activity, final Bundle bundle) {
        this.a.demandAccount(activity, new tit() { // from class: g2l
            @Override // defpackage.tit
            public final void w(Account account, boolean z) {
                if (account == null) {
                    return;
                }
                int i = GlobalWithdrawActivity.y;
                Activity activity2 = activity;
                Intent intent = new Intent(activity2, (Class<?>) GlobalWithdrawActivity.class);
                intent.putExtra("withdrawChannelId", (Serializable) null);
                intent.setFlags(268435456);
                Bundle bundle2 = bundle;
                if (bundle2 != null) {
                    intent.putExtras(bundle2);
                }
                yrh0.s(activity2, intent, true);
            }
        });
    }
}
