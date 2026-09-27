package com.google.ads.mediation.unity;

import android.content.Context;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.metadata.MediationMetaData;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class zv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static zv f48236b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f48237a = new d();

    public static synchronized zv a() {
        try {
            if (f48236b == null) {
                f48236b = new zv();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f48236b;
    }

    public void zz(Context context, String str, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        if (this.f48237a.a()) {
            iUnityAdsInitializationListener.onInitializationComplete();
            return;
        }
        MediationMetaData mediationMetaDataB = this.f48237a.b(context);
        mediationMetaDataB.setName(wc.d.f142717b);
        mediationMetaDataB.setVersion(this.f48237a.c());
        mediationMetaDataB.set("adapter_version", "4.16.4.0");
        mediationMetaDataB.commit();
        this.f48237a.d(context, str, iUnityAdsInitializationListener);
    }
}
