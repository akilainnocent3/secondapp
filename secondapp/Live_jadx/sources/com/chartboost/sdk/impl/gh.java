package com.chartboost.sdk.impl;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class gh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f39037a;

    public gh(SharedPreferences defaultSharedPreferences) {
        kotlin.jvm.internal.m0.p(defaultSharedPreferences, "defaultSharedPreferences");
        this.f39037a = defaultSharedPreferences;
    }

    public final String a() {
        return this.f39037a.getString("IABTCF_TCString", null);
    }
}
