package com.bytedance.sdk.component.hww;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
class mrs {
    private static boolean hww;

    public static String hww(Throwable th2) {
        StringBuilder sb2 = new StringBuilder("{\"code\":");
        sb2.append(th2 instanceof wgt ? ((wgt) th2).hww : 0);
        sb2.append("}");
        return sb2.toString();
    }

    public static String hww(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        String strSubstring = (!hww || z10) ? "" : str.substring(1, str.length() - 1);
        String strConcat = "{\"code\":1,\"__data\":".concat(String.valueOf(str));
        if (strSubstring.isEmpty()) {
            return strConcat + "}";
        }
        return strConcat + "," + strSubstring + "}";
    }

    public static String hww() {
        return "";
    }

    public static void hww(boolean z10) {
        hww = z10;
    }
}
