package com.chartboost.sdk.impl;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class w3 {
    public v3 a(Context context) {
        String strSubstring;
        String strSubstring2;
        if (c(context)) {
            sb.a("Permission READ_PHONE_STATE not granted", null);
            return null;
        }
        TelephonyManager telephonyManagerB = b(context);
        if (!a(telephonyManagerB)) {
            return null;
        }
        String simOperator = telephonyManagerB.getSimOperator();
        if (TextUtils.isEmpty(simOperator)) {
            strSubstring = null;
            strSubstring2 = null;
        } else {
            strSubstring = simOperator.substring(0, 3);
            strSubstring2 = simOperator.substring(3);
        }
        return new v3(simOperator, strSubstring, strSubstring2, telephonyManagerB.getNetworkOperatorName(), telephonyManagerB.getNetworkCountryIso(), telephonyManagerB.getPhoneType());
    }

    public final TelephonyManager b(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return (TelephonyManager) context.getSystemService("phone");
        } catch (Exception e10) {
            sb.b("Unable to retrieve TELEPHONY_SERVICE", e10);
            return null;
        }
    }

    public final boolean c(Context context) {
        return context != null && f1.d.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == -1;
    }

    public final boolean a(TelephonyManager telephonyManager) {
        return (telephonyManager == null || telephonyManager.getPhoneType() == 0 || telephonyManager.getSimState() != 5) ? false : true;
    }
}
