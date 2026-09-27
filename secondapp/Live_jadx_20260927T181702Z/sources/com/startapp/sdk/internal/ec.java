package com.startapp.sdk.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f74738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f74739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f74740d;

    public ec(Context applicationContext) {
        kotlin.jvm.internal.m0.p(applicationContext, "applicationContext");
        this.f74738b = true;
        PackageManager packageManager = applicationContext.getPackageManager();
        if (packageManager != null) {
            try {
                ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getApplicationInfo(applicationContext.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L)) : packageManager.getApplicationInfo(applicationContext.getPackageName(), 128);
                kotlin.jvm.internal.m0.m(applicationInfo);
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    Object obj = bundle.get("com.startapp.sdk.APPLICATION_ID");
                    String string = obj != null ? obj.toString() : null;
                    this.f74737a = string;
                    if (string != null) {
                        Log.i("StartAppSDK", "appId is " + string);
                    } else {
                        Log.i("StartAppSDK", "appId hasn't been provided in the Manifest");
                    }
                    if (applicationInfo.metaData.containsKey("com.startapp.sdk.CONSENT_ENABLED")) {
                        this.f74738b = applicationInfo.metaData.getBoolean("com.startapp.sdk.CONSENT_ENABLED");
                    }
                    if (applicationInfo.metaData.containsKey("com.startapp.sdk.MIXED_AUDIENCE")) {
                        Boolean boolValueOf = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.startapp.sdk.MIXED_AUDIENCE"));
                        this.f74739c = boolValueOf;
                        Log.i("StartAppSDK", "is mixed audience: " + boolValueOf);
                    }
                    if (applicationInfo.metaData.containsKey("com.startapp.sdk.CHILD_DIRECTED")) {
                        Boolean boolValueOf2 = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.startapp.sdk.CHILD_DIRECTED"));
                        this.f74740d = boolValueOf2;
                        Log.i("StartAppSDK", "is child directed: " + boolValueOf2);
                    }
                    dr.w2 w2Var = dr.w2.f79517a;
                }
            } catch (Throwable th2) {
                d9.a(th2);
                dr.w2 w2Var2 = dr.w2.f79517a;
            }
        }
    }
}
