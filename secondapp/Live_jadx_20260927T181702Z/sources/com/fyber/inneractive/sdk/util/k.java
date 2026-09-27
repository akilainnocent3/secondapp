package com.fyber.inneractive.sdk.util;

import android.os.Build;
import android.telephony.TelephonyManager;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k extends o {
    public static String i() {
        try {
            return ((TelephonyManager) o.f47884a.getSystemService("phone")).getNetworkCountryIso();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String j() {
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    public static int k() {
        try {
            if (!o.a("android.permission.READ_PHONE_STATE")) {
                return 0;
            }
            TelephonyManager telephonyManager = (TelephonyManager) o.f47884a.getSystemService("phone");
            return Build.VERSION.SDK_INT >= 24 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static String l() {
        try {
            return o.f47884a.getPackageManager().getPackageInfo(o.f47884a.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean m() {
        boolean z10 = (o.f47884a.getResources().getConfiguration().screenLayout & 15) == 4;
        IAlog.e("This device has a tablet resolution? %s", Boolean.valueOf(z10));
        return z10;
    }

    public static boolean n() {
        TelephonyManager telephonyManager = (TelephonyManager) o.f47884a.getSystemService("phone");
        return telephonyManager != null && telephonyManager.getSimState() == 5;
    }
}
