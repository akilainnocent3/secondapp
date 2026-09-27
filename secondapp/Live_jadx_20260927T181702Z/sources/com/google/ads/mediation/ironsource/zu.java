package com.google.ads.mediation.ironsource;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.ironsource.mediationsdk.IronSource;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class zu implements MediationInterstitialAd {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f48205e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final zv f48206f = new zv();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediationInterstitialAdCallback f48207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback f48208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48209d;

    public zu(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback) {
        this.f48209d = mediationInterstitialAdConfiguration.getServerParameters().getString("instanceId", "0");
        this.f48208c = mediationAdLoadCallback;
    }

    public static zv a() {
        return f48206f;
    }

    public static void b(String str) {
        f48205e.remove(str);
    }

    public static zu c(String str) {
        ConcurrentHashMap concurrentHashMap = f48205e;
        if (concurrentHashMap.containsKey(str)) {
            return (zu) ((WeakReference) concurrentHashMap.get(str)).get();
        }
        return null;
    }

    private void e(AdError adError) {
        Log.e(zt.f48204a, adError.toString());
        MediationAdLoadCallback mediationAdLoadCallback = this.f48208c;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
    }

    private boolean g(Context context) {
        AdError adErrorZz = zz.zz(context, this.f48209d);
        if (adErrorZz != null) {
            e(adErrorZz);
            return false;
        }
        if (zz.zz(this.f48209d, f48205e)) {
            return true;
        }
        e(new AdError(103, String.format("An IronSource interstitial ad is already loading for instance ID: %s", this.f48209d), "com.google.ads.mediation.ironsource"));
        return false;
    }

    public MediationInterstitialAdCallback d() {
        return this.f48207b;
    }

    public void f(MediationInterstitialAdCallback mediationInterstitialAdCallback) {
        this.f48207b = mediationInterstitialAdCallback;
    }

    public final boolean h(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        if (!g(mediationInterstitialAdConfiguration.getContext())) {
            return false;
        }
        f48205e.put(this.f48209d, new WeakReference(this));
        Log.d(zt.f48204a, String.format("Loading IronSource interstitial ad with instance ID: %s", this.f48209d));
        return true;
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        IronSource.showISDemandOnlyInterstitial(this.f48209d);
    }

    public void zr(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        if (h(mediationInterstitialAdConfiguration)) {
            IronSource.loadISDemandOnlyInterstitial((Activity) mediationInterstitialAdConfiguration.getContext(), this.f48209d);
        }
    }

    public MediationAdLoadCallback zs() {
        return this.f48208c;
    }
}
