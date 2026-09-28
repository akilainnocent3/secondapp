package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.sporty.android.core.model.patron.KycSource;
import com.sportybet.android.globalpay.kyc.za.ZAKycAgentActivity;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class zbk0 implements j800 {
    public final uqm a;

    public zbk0(uqm uqmVar) {
        uqmVar.getClass();
        this.a = uqmVar;
    }

    @Override // defpackage.j800
    public final void b(final Bundle bundle) {
        final Activity activityD = oti.c().d();
        if (activityD == null) {
            return;
        }
        this.a.demandAccount(activityD, new tit() { // from class: xbk0
            @Override // defpackage.tit
            public final void w(Account account, boolean z) {
                if (account == null) {
                    return;
                }
                int i = ZAKycAgentActivity.c;
                KycSource kycSource = KycSource.DEPOSIT;
                kycSource.getClass();
                Activity activity = activityD;
                Intent intent = new Intent(activity, (Class<?>) ZAKycAgentActivity.class);
                intent.putExtra("REGISTRATION_KYC_SOURCE", kycSource.getValue());
                intent.putExtra("withdrawChannelId", (Serializable) null);
                Bundle bundle2 = bundle;
                if (bundle2 != null) {
                    intent.putExtras(bundle2);
                }
                yrh0.s(activity, intent, false);
            }
        });
    }

    @Override // defpackage.j800
    public final void c(final Activity activity, final Bundle bundle) {
        this.a.demandAccount(activity, new tit() { // from class: ybk0
            @Override // defpackage.tit
            public final void w(Account account, boolean z) {
                if (account == null) {
                    return;
                }
                int i = ZAKycAgentActivity.c;
                KycSource kycSource = KycSource.WITHDRAW;
                Bundle bundle2 = bundle;
                Integer numValueOf = bundle2 != null ? Integer.valueOf(bundle2.getInt("withdrawChannelId")) : null;
                kycSource.getClass();
                Activity activity2 = activity;
                Intent intent = new Intent(activity2, (Class<?>) ZAKycAgentActivity.class);
                intent.putExtra("REGISTRATION_KYC_SOURCE", kycSource.getValue());
                intent.putExtra("withdrawChannelId", numValueOf);
                if (bundle2 != null) {
                    intent.putExtras(bundle2);
                }
                yrh0.s(activity2, intent, false);
            }
        });
    }
}
