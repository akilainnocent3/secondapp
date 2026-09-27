package com.chartboost.sdk.impl;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class t8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f40948a;

    public t8(SharedPreferences defaultSharedPreferences) {
        kotlin.jvm.internal.m0.p(defaultSharedPreferences, "defaultSharedPreferences");
        this.f40948a = defaultSharedPreferences;
    }

    public final String a() {
        return this.f40948a.getString("IABGPP_GppSID", null);
    }

    public final String b() {
        return this.f40948a.getString("IABGPP_HDR_GppString", null);
    }
}
