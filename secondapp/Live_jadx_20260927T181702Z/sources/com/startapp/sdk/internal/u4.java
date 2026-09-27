package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.crashreport.ANRRemoteConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class u4 implements i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f75590a;

    public u4(Context context) {
        this.f75590a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        ANRRemoteConfig aNRRemoteConfigI = MetaData.E().i();
        f fVar = new f(aNRRemoteConfigI != null ? aNRRemoteConfigI.c() : 2000L, aNRRemoteConfigI != null && aNRRemoteConfigI.g());
        if (aNRRemoteConfigI != null && aNRRemoteConfigI.e()) {
            fVar.f74772b = new w3(aNRRemoteConfigI);
            fVar.f74771a = new com.startapp.sdk.adsbase.crashreport.a(this.f75590a, aNRRemoteConfigI.h(), aNRRemoteConfigI.a(), aNRRemoteConfigI.d());
            if (aNRRemoteConfigI.f()) {
                fVar.f74774d = new x3(this);
            }
            fVar.start();
        }
        return fVar;
    }
}
