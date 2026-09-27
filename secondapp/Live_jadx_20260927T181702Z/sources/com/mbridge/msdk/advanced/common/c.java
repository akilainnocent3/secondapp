package com.mbridge.msdk.advanced.common;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, Boolean> f64667a = new HashMap();

    public static void a(String str, boolean z10) {
        f64667a.put(str, Boolean.valueOf(z10));
    }

    public static void b(String str) {
        f64667a.remove(str);
    }

    public static boolean a(String str) {
        if (f64667a.containsKey(str)) {
            return f64667a.get(str).booleanValue();
        }
        return false;
    }
}
