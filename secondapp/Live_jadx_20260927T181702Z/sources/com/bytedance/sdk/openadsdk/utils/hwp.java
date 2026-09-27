package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hwp {
    private static final Map<String, hwp> hww = new HashMap();

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private SharedPreferences f37651tq;

    private hwp(String str, Context context) {
        if (context != null) {
            this.f37651tq = context.getSharedPreferences(str, 0);
        }
    }

    public static hwp hww(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_ad_sdk_sp";
        }
        Map<String, hwp> map = hww;
        hwp hwpVar = map.get(str);
        if (hwpVar != null) {
            return hwpVar;
        }
        synchronized (hwp.class) {
            if (hwpVar == null) {
                try {
                    hwpVar = new hwp(str, com.bytedance.sdk.openadsdk.core.bs.hww());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            map.put(str, hwpVar);
        }
        return hwpVar;
    }

    public String hww(String str, String str2) {
        try {
            return this.f37651tq.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public void hww(String str) {
        try {
            this.f37651tq.edit().remove(str).apply();
        } catch (Throwable unused) {
        }
    }
}
