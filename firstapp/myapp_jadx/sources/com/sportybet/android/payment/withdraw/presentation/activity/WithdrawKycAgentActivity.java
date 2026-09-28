package com.sportybet.android.payment.withdraw.presentation.activity;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.sporty.android.core.model.patron.KycSource;
import com.sportybet.android.account.RegistrationKYC$Result;
import com.sportybet.feature.payment.impl.common.presentation.activity.TradingActivity;
import defpackage.log0;
import defpackage.pwx;
import defpackage.x7m;
import defpackage.zux;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sportybet/android/payment/withdraw/presentation/activity/WithdrawKycAgentActivity;", "Lpw40;", "Lzux;", "Lpwx;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class WithdrawKycAgentActivity extends x7m implements zux, pwx {
    @Override // defpackage.pw40
    public final KycSource getRegistrationKYCSource() {
        return KycSource.WITHDRAW;
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
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
            log0 log0Var = log0.b;
            Intent intent = new Intent(this, (Class<?>) TradingActivity.class);
            intent.putExtra("EXTRA_TRADE_TYPE", log0Var);
            startActivity(intent);
        }
        finish();
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        getWindow().clearFlags(8192);
    }
}
