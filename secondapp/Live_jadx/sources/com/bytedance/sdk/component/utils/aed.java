package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class aed {
    private static volatile String hww;

    public static String hww() {
        if (!TextUtils.isEmpty(hww)) {
            return hww;
        }
        String str = Build.MODEL;
        hww = str;
        return str;
    }

    public static int hww(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getApplicationInfo().icon;
        } catch (Exception unused) {
            return 0;
        }
    }
}
