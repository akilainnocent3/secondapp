package com.google.ads.mediation.ironsource;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.ironsource.mediationsdk.IronSource;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class zw implements MediationRewardedAd {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f48210e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final zx f48211f = new zx();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediationRewardedAdCallback f48212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback f48213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48214d;

    public zw(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback) {
        this.f48214d = mediationRewardedAdConfiguration.getServerParameters().getString("instanceId", "0");
        this.f48213c = mediationAdLoadCallback;
    }

    public static void a(String str) {
        f48210e.remove(str);
    }

    public static zw c(String str) {
        ConcurrentHashMap concurrentHashMap = f48210e;
        if (concurrentHashMap.containsKey(str)) {
            return (zw) ((WeakReference) concurrentHashMap.get(str)).get();
        }
        return null;
    }

    public static zx d() {
        return f48211f;
    }

    private void e(AdError adError) {
        Log.w(zt.f48204a, adError.toString());
        this.f48213c.onFailure(adError);
    }

    public MediationRewardedAdCallback b() {
        return this.f48212b;
    }

    public void f(MediationRewardedAdCallback mediationRewardedAdCallback) {
        this.f48212b = mediationRewardedAdCallback;
    }

    public final boolean g(Context context) {
        AdError adErrorZz = zz.zz(context, this.f48214d);
        if (adErrorZz != null) {
            e(adErrorZz);
            return false;
        }
        if (zz.zz(this.f48214d, f48210e)) {
            return true;
        }
        e(new AdError(103, String.format("An IronSource Rewarded ad is already loading for instance ID: %s", this.f48214d), "com.google.ads.mediation.ironsource"));
        return false;
    }

    public final boolean h(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        if (!g(mediationRewardedAdConfiguration.getContext())) {
            return false;
        }
        f48210e.put(this.f48214d, new WeakReference(this));
        Log.d(zt.f48204a, String.format("Loading IronSource rewarded ad with instance ID: %s", this.f48214d));
        return true;
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        Log.d(zt.f48204a, String.format("Showing IronSource rewarded ad for instance ID: %s", this.f48214d));
        IronSource.showISDemandOnlyRewardedVideo(this.f48214d);
    }

    public MediationAdLoadCallback zr() {
        return this.f48213c;
    }

    public void zr(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        if (h(mediationRewardedAdConfiguration)) {
            IronSource.loadISDemandOnlyRewardedVideo((Activity) mediationRewardedAdConfiguration.getContext(), this.f48214d);
        }
    }
}
