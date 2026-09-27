package com.cleveradssolutions.adapters.unity;

import com.cleveradssolutions.mediation.core.j;
import com.unity3d.ads.IUnityAdsTokenListener;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements IUnityAdsTokenListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f43196a;

    public c(j request) {
        m0.p(request, "request");
        this.f43196a = request;
    }

    @Override // com.unity3d.ads.IUnityAdsTokenListener
    public void onUnityAdsTokenReady(String str) {
        j jVar = this.f43196a;
        if (str == null) {
            str = "";
        }
        jVar.onSuccess(str);
    }
}
