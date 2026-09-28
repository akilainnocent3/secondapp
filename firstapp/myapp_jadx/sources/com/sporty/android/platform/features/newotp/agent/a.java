package com.sporty.android.platform.features.newotp.agent;

import android.content.Context;
import android.content.Intent;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import defpackage.vd;
import defpackage.vxo;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends vd<OtpModule<Object>, Object> {
    @Override // defpackage.vd
    public final Intent a(Object obj, Context context) {
        OtpModule otpModule = (OtpModule) obj;
        otpModule.getClass();
        int i = OTPAgentActivity.b;
        return OTPAgentActivity.a.a(context, otpModule);
    }

    @Override // defpackage.vd
    public final Object c(Intent intent, int i) {
        OtpData otpData;
        if (i != -1 || intent == null || (otpData = (OtpData) vxo.a(intent, "key - otp data", OtpData.class)) == null) {
            return null;
        }
        return otpData;
    }
}
