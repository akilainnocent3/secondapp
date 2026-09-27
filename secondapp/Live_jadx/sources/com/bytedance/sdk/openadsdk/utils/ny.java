package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class ny {
    public static void hww(String str) {
        hww("any_door_id", str);
    }

    private static String tq(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return com.bytedance.sdk.openadsdk.multipro.vy.vy.tq(null, str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static String hww() {
        return tq("any_door_id", null);
    }

    private static void hww(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.multipro.vy.vy.hww((String) null, str, str2);
        } catch (Throwable unused) {
        }
    }
}
