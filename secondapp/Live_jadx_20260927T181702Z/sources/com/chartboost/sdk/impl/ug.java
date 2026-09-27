package com.chartboost.sdk.impl;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class ug {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f41110a;

    public ug(SharedPreferences sharedPrefs) {
        kotlin.jvm.internal.m0.p(sharedPrefs, "sharedPrefs");
        this.f41110a = sharedPrefs;
    }

    public final String a(String sharedPrefsKey) {
        kotlin.jvm.internal.m0.p(sharedPrefsKey, "sharedPrefsKey");
        try {
            return this.f41110a.getString(sharedPrefsKey, null);
        } catch (Exception e10) {
            sb.b("Load from shared prefs exception", e10);
            return null;
        }
    }

    public final void a(String sharedPrefsKey, String str) {
        kotlin.jvm.internal.m0.p(sharedPrefsKey, "sharedPrefsKey");
        try {
            this.f41110a.edit().putString(sharedPrefsKey, str).apply();
        } catch (Exception e10) {
            sb.b("Save to shared prefs exception", e10);
        }
    }
}
