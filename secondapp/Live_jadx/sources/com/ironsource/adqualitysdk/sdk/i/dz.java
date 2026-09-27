package com.ironsource.adqualitysdk.sdk.i;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class dz {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Map<String, String> f1911 = new HashMap();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static String m2088(String str) {
        String str2 = f1911.get(str);
        if (str2 != null) {
            return str2;
        }
        f1911.put(str, str);
        return str;
    }
}
