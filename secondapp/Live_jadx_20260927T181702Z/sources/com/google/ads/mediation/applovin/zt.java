package com.google.ads.mediation.applovin;

import android.content.Context;
import com.applovin.mediation.BuildConfig;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class zt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static zt f48119b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zx f48120a = new zx();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements AppLovinSdk.SdkInitializationListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ zr f48121b;

        public a(zr zrVar) {
            this.f48121b = zrVar;
        }

        @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
        public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
            this.f48121b.onInitializeSuccess();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface zr {
        void onInitializeSuccess();
    }

    public static zt zz() {
        if (f48119b == null) {
            f48119b = new zt();
        }
        return f48119b;
    }

    public void zz(Context context, String str, zr zrVar) {
        this.f48120a.zz(context).initialize(AppLovinSdkInitializationConfiguration.builder(str).setMediationProvider("admob").setPluginVersion(BuildConfig.ADAPTER_VERSION).build(), new a(zrVar));
    }

    public AppLovinSdk zz(Context context) {
        return this.f48120a.zz(context);
    }
}
