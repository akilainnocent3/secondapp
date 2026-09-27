package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class O5 extends BaseRequestConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f96260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f96261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5080gm f96262c;

    public final String b() {
        return this.f96261b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public String toString() {
        return "CoreRequestConfig{mAppDebuggable='" + this.f96260a + "', mAppSystem='" + this.f96261b + "', startupState=" + this.f96262c + fw.b.f85383j;
    }

    @NonNull
    public final String a() {
        return this.f96260a;
    }
}
