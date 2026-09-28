package com.sportybet.android.ugpay.withdraw.momo;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.sporty.android.core.model.patron.KycSource;
import com.sportybet.android.account.RegistrationKYC$Result;
import com.sportybet.android.ugpay.withdraw.momo.CommonMobileMoneyWithdrawActivity;
import com.sportybet.android.ugpay.withdraw.momo.CommonMobileMoneyWithdrawAgentActivity;
import defpackage.gg8;
import defpackage.pw40;
import defpackage.tit;
import defpackage.zux;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/android/ugpay/withdraw/momo/CommonMobileMoneyWithdrawAgentActivity;", "Lpw40;", "Lzux;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CommonMobileMoneyWithdrawAgentActivity extends pw40 implements zux {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.pw40
    public final KycSource getRegistrationKYCSource() {
        return KycSource.WITHDRAW;
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getConfirmNameStatus(new gg8());
        checkAccountAndRegistrationKYC();
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        getWindow().setFlags(8192, 8192);
    }

    @Override // defpackage.pw40
    public final void onRegistrationKYCResult(RegistrationKYC$Result registrationKYC$Result) {
        registrationKYC$Result.getClass();
        Account account = getAccountHelper().getAccount();
        if (registrationKYC$Result.b && account != null) {
            getAccountHelper().demandAccount(this, new tit() { // from class: hg8
                @Override // defpackage.tit
                public final void w(Account account2, boolean z) {
                    int i = CommonMobileMoneyWithdrawAgentActivity.a;
                    if (account2 == null) {
                        return;
                    }
                    String str = account2.name;
                    str.getClass();
                    CommonMobileMoneyWithdrawAgentActivity commonMobileMoneyWithdrawAgentActivity = this.a;
                    Intent intent = new Intent(commonMobileMoneyWithdrawAgentActivity, (Class<?>) CommonMobileMoneyWithdrawActivity.class);
                    intent.putExtra("phoneNumber", str);
                    intent.putExtra("methodId", "22");
                    intent.putExtra("supportAd", false);
                    commonMobileMoneyWithdrawAgentActivity.startActivity(intent);
                }
            });
        }
        finish();
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        getWindow().clearFlags(8192);
    }
}
