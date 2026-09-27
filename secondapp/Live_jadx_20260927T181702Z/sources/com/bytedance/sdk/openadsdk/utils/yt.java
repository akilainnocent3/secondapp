package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.ironsource.C4593xa;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class yt {
    private static String hww;

    public static boolean hww() {
        return com.bytedance.sdk.component.utils.weu.vy() && com.bytedance.sdk.openadsdk.core.rs.tq().bs() && com.bytedance.sdk.openadsdk.core.rs.tq().mrs();
    }

    public static boolean sd() {
        return false;
    }

    public static String tq() {
        if (TextUtils.isEmpty(hww)) {
            hww = new String(Base64.decode("ZGV2aWNlX2lk", 0));
        }
        return hww;
    }

    public static String hww(String str) {
        try {
            if (!hww()) {
                return str;
            }
            String strOmn = com.bytedance.sdk.openadsdk.core.rs.tq().omn();
            if (TextUtils.isEmpty(strOmn)) {
                return str;
            }
            Log.d("TestHelperUtils", "AnyDoorId=".concat(String.valueOf(strOmn)));
            return Uri.parse(str).buildUpon().appendQueryParameter(tq(), strOmn).appendQueryParameter(C4593xa.f64436b, "5001121").toString();
        } catch (Throwable unused) {
            return str;
        }
    }
}
