package com.chartboost.sdk.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class m8 {
    @oy.l
    public static final <T> List<T> asList(@oy.l JSONArray jSONArray) {
        return n8.a(jSONArray);
    }

    @oy.l
    public static final <T> List<T> asListSkipNull(@oy.l JSONArray jSONArray) {
        return n8.b(jSONArray);
    }

    @oy.l
    public static final PackageInfo getPackageInfoCompat(@oy.l PackageManager packageManager, @oy.l String str, int i10) {
        return n8.a(packageManager, str, i10);
    }

    @oy.l
    public static final String getPackageVersionName(@oy.l PackageManager packageManager, @oy.l String str) {
        return n8.a(packageManager, str);
    }

    @oy.l
    public static final nh toBodyFields(@oy.l mh mhVar) {
        return n8.a(mhVar);
    }

    @oy.l
    public static final jf toReachabilityBodyFields(@oy.l g3 g3Var) {
        return n8.a(g3Var);
    }
}
