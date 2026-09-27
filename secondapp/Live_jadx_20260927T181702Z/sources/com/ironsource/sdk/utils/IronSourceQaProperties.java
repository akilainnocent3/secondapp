package com.ironsource.sdk.utils;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class IronSourceQaProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static IronSourceQaProperties f64063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<String, String> f64064b = new HashMap();

    private IronSourceQaProperties() {
    }

    public static IronSourceQaProperties getInstance() {
        if (f64063a == null) {
            f64063a = new IronSourceQaProperties();
        }
        return f64063a;
    }

    public static boolean isInitialized() {
        return f64063a != null;
    }

    public Map<String, String> getParameters() {
        return f64064b;
    }

    public void setQaParameter(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        f64064b.put(str, str2);
    }
}
