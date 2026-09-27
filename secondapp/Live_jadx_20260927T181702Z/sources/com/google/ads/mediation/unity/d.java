package com.google.ads.mediation.unity;

import android.content.Context;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.metadata.MediationMetaData;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class d {
    public boolean a() {
        return UnityAds.isInitialized();
    }

    public MediationMetaData b(Context context) {
        return new MediationMetaData(context);
    }

    public String c() {
        return UnityAds.getVersion();
    }

    public void d(Context context, String str, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        UnityAds.initialize(context, str, false, iUnityAdsInitializationListener);
    }

    public void e(IUnityAdsTokenListener iUnityAdsTokenListener) {
        UnityAds.getToken(iUnityAdsTokenListener);
    }

    public void f(TokenConfiguration tokenConfiguration, IUnityAdsTokenListener iUnityAdsTokenListener) {
        UnityAds.getToken(tokenConfiguration, iUnityAdsTokenListener);
    }
}
