package com.pairip.application;

import android.content.Context;
import com.pairip.SignatureCheck;
import com.pairip.VMRunner;
import com.pairip.licensecheck.LicenseClient;
import com.sportybet.android.HiltApp;

/* JADX INFO: loaded from: classes.dex */
public class Application extends HiltApp {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        VMRunner.setContext(context);
        SignatureCheck.verifyIntegrity(context);
        LicenseClient.checkLicense(context);
        super.attachBaseContext(context);
    }
}
