package com.iab.omid.library.prebidorg.utils;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zt {
    public static void zz(String str) {
        if (!com.iab.omid.library.prebidorg.zs.zz.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    public static void zz(String str, Exception exc) {
        if ((!com.iab.omid.library.prebidorg.zs.zz.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }
}
