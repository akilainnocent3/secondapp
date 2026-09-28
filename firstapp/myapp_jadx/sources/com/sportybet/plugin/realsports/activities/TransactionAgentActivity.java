package com.sportybet.plugin.realsports.activities;

import android.content.Intent;
import android.os.Bundle;
import com.sporty.android.core.model.patron.KycSource;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.account.RegistrationKYC$Result;
import com.sportybet.android.transaction.ui.txlist.TxListActivity;
import defpackage.aqg0;
import defpackage.bag;
import defpackage.pw40;
import defpackage.sj5;
import defpackage.yrh0;
import defpackage.zpg0;
import defpackage.zux;

/* JADX INFO: loaded from: classes6.dex */
public class TransactionAgentActivity extends pw40 implements zux {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.pw40
    public final KycSource getRegistrationKYCSource() {
        return KycSource.TRANSACTION;
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getConfirmNameStatus(new zpg0());
        checkAccountAndRegistrationKYC();
    }

    @Override // defpackage.pw40
    public final void onRegistrationKYCResult(RegistrationKYC$Result registrationKYC$Result) {
        bag bagVar;
        if (registrationKYC$Result.b) {
            int i = aqg0.a.c.a;
            Bundle extras = getIntent().getExtras();
            boolean z = false;
            if (extras != null) {
                z = extras.getBoolean(AnalyticsEvent.DEPOSIT, false);
                i = extras.getInt("key_param_tx_category", i);
                bagVar = (bag) sj5.b(extras, "EXTRA_ENTRANCE", bag.class);
            } else {
                bagVar = null;
            }
            Intent intent = new Intent(this, (Class<?>) TxListActivity.class);
            intent.putExtra("parameter", z);
            intent.putExtra("key_param_tx_category", i);
            if (bagVar != null) {
                intent.putExtra("EXTRA_ENTRANCE", bagVar);
            }
            yrh0.s(this, intent, true);
        }
        finish();
    }
}
