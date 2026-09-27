package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.crashreport.ANRRemoteConfig;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class w3 implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ANRRemoteConfig f75771a;

    public w3(ANRRemoteConfig aNRRemoteConfig) {
        this.f75771a = aNRRemoteConfig;
    }

    @Override // com.startapp.sdk.internal.e
    public final long a(long j10) {
        return this.f75771a.b() - j10;
    }
}
