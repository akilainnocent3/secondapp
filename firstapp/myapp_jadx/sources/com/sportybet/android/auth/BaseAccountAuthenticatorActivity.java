package com.sportybet.android.auth;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import com.sporty.android.core.model.account.RegistrationData;
import com.sporty.android.core.model.patron.KycSource;
import com.sporty.android.core.model.patron.NameConfirmationStatus;
import com.sportybet.android.account.RegistrationKYC$Result;
import defpackage.ey1;
import defpackage.irm;
import defpackage.k00;
import defpackage.osp;
import defpackage.rdd0;
import defpackage.v5;
import defpackage.y5;

/* JADX INFO: loaded from: classes5.dex */
public class BaseAccountAuthenticatorActivity extends Hilt_BaseAccountAuthenticatorActivity implements irm {
    public v5 accRegistrationHelper;
    private AccountAuthenticatorResponse mAccountAuthenticatorResponse = null;
    private Bundle mResultBundle = null;
    private RegistrationData pendingRegistrationData;
    public rdd0 sportyTrackingUseCase;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onRegistrationKYCResult$0(NameConfirmationStatus nameConfirmationStatus) {
    }

    @Override // android.app.Activity
    public void finish() {
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.mAccountAuthenticatorResponse;
        if (accountAuthenticatorResponse != null) {
            Bundle bundle = this.mResultBundle;
            if (bundle != null) {
                accountAuthenticatorResponse.onResult(bundle);
            } else {
                accountAuthenticatorResponse.onError(4, "canceled");
            }
            this.mAccountAuthenticatorResponse = null;
        }
        super.finish();
    }

    @Override // defpackage.pw40
    public KycSource getRegistrationKYCSource() {
        return KycSource.REGISTRATION;
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse) getIntent().getParcelableExtra("accountAuthenticatorResponse");
        this.mAccountAuthenticatorResponse = accountAuthenticatorResponse;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onRequestContinued();
        }
    }

    @Override // defpackage.pw40
    public void onRegistrationKYCResult(RegistrationKYC$Result registrationKYC$Result) {
        RegistrationData registrationData;
        RegistrationData registrationData2 = this.pendingRegistrationData;
        if (registrationData2 != null) {
            if (registrationKYC$Result.b && (registrationData = registrationKYC$Result.c) != null) {
                registrationData.mobile = registrationData2.mobile;
                registrationData.logEventName = registrationData2.logEventName;
                registrationData.isFacebook = registrationData2.isFacebook;
                this.accRegistrationHelper.c(this, registrationData);
            }
            if (!registrationKYC$Result.b) {
                getConfirmNameStatus(new ey1());
            }
            RegistrationData registrationData3 = this.pendingRegistrationData;
            if (10 == registrationData3.registrationStatus) {
                this.accRegistrationHelper.a(this, registrationData3.logEventName, Boolean.valueOf(registrationData3.isFacebook), Boolean.FALSE);
            }
        }
        finish();
    }

    public y5 processAccountRegistration(RegistrationData registrationData) {
        y5 y5VarE = this.accRegistrationHelper.e(this, registrationData);
        if (y5.a == y5VarE) {
            this.pendingRegistrationData = registrationData;
            this.sportyTrackingUseCase.a(new osp.f(registrationData.registrationStatus), k00.d);
            showRegistrationKYCPageWithSimpleToken(registrationData.registrationKYCToken);
        }
        return y5VarE;
    }

    @Override // defpackage.irm
    public final void setAccountAuthenticatorResult(Bundle bundle) {
        this.mResultBundle = bundle;
    }
}
