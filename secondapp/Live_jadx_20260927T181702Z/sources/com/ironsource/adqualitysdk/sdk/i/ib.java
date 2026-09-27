package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class ib {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f2449;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ig f2450;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Cif f2451;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Context f2452;

    public ib(Context context, String str, String str2) {
        this.f2452 = context.getApplicationContext();
        this.f2449 = str2;
        this.f2450 = new ig(this.f2452, str);
        this.f2451 = new Cif(id.f2453, this.f2452.getPackageName(), ik.m2461(this.f2452), this.f2449);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m2412(String str) {
        try {
            this.f2450.m2438(str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final HashMap<String, String> m2414(String str, int i10) {
        try {
            HashMap<String, String> mapM2436 = this.f2450.m2436(str, i10);
            HashMap<String, String> map = new HashMap<>();
            for (String str2 : mapM2436.keySet()) {
                String str3 = mapM2436.get(str2);
                if (str3 != null && !TextUtils.isEmpty(str3)) {
                    try {
                        map.put(str2, this.f2451.m2432(str3));
                    } catch (Cif.e unused) {
                    }
                }
            }
            return map;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final int m2415(String str) {
        try {
            return this.f2450.m2435(str);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2416(String str, String str2) {
        try {
            this.f2450.m2437(str, this.f2451.m2431(str2));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m2413(String str) {
        try {
            String strM2439 = this.f2450.m2439(str);
            if (strM2439 == null || TextUtils.isEmpty(strM2439)) {
                return strM2439;
            }
            try {
                return this.f2451.m2432(strM2439);
            } catch (Cif.e unused) {
                return "";
            }
        } catch (Throwable unused2) {
            return null;
        }
    }
}
