package com.ironsource.adqualitysdk.sdk.i;

import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class dd extends cz {
    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static String m1822(List<Object> list) {
        return kc.m2815((String) cz.m1806(list, 0, String.class));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static List<String> m1823(List<Object> list) {
        String str = (String) cz.m1806(list, 0, String.class);
        return list.get(1) instanceof String ? kc.m2822(str, (String) cz.m1806(list, 1, String.class)) : kc.m2823(str, new JSONArray((Collection) cz.m1806(list, 1, List.class)));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m1824(List<Object> list) {
        return kc.m2821((String) cz.m1806(list, 0, String.class));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static List<String> m1825(List<Object> list) {
        return hu.m2304().m2306().m2409(cz.m1806(list, 0, Object.class), (List<String>) cz.m1806(list, 1, List.class), ((Integer) cz.m1806(list, 2, Integer.class)).intValue());
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static String m1826(List<Object> list) {
        String str = (String) cz.m1806(list, 0, String.class);
        boolean zBooleanValue = list.size() > 2 ? ((Boolean) cz.m1806(list, 2, Boolean.class)).booleanValue() : true;
        return list.get(1) instanceof String ? kc.m2816(str, (String) cz.m1806(list, 1, String.class), zBooleanValue) : kc.m2825(str, new JSONArray((Collection) cz.m1806(list, 1, List.class)), zBooleanValue);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static int m1827(List<Object> list) {
        return kc.m2814((String) cz.m1806(list, 0, String.class), (String) cz.m1806(list, 1, String.class));
    }
}
