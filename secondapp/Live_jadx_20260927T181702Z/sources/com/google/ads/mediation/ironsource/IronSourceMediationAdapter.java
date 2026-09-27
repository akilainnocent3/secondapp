package com.google.ads.mediation.ironsource;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.ironsourceads.InitRequest;
import com.unity3d.ironsourceads.IronSourceAds;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class IronSourceMediationAdapter extends RtbAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f48188a = new AtomicBoolean(false);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements InitListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InitializationCompleteCallback f48189b;

        public a(InitializationCompleteCallback initializationCompleteCallback) {
            this.f48189b = initializationCompleteCallback;
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitFailed(IronSourceError ironSourceError) {
            this.f48189b.onInitializationFailed(ironSourceError.getErrorMessage());
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitSuccess() {
            IronSourceMediationAdapter.f48188a.set(true);
            this.f48189b.onInitializationSucceeded();
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(RtbSignalData rtbSignalData, SignalCallbacks signalCallbacks) {
        signalCallbacks.onSuccess(IronSource.getISDemandOnlyBiddingData(rtbSignalData.getContext()));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        String sdkVersion = IronSourceAds.getSdkVersion();
        String[] strArrSplit = sdkVersion.split("\\.");
        if (strArrSplit.length < 3) {
            Log.w(zt.f48204a, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", sdkVersion));
            return new VersionInfo(0, 0, 0);
        }
        int i10 = Integer.parseInt(strArrSplit[0]);
        int i11 = Integer.parseInt(strArrSplit[1]);
        int i12 = Integer.parseInt(strArrSplit[2]);
        if (strArrSplit.length >= 4) {
            i12 = (i12 * 100) + Integer.parseInt(strArrSplit[3]);
        }
        return new VersionInfo(i10, i11, i12);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getVersionInfo() {
        String strZz = zz.zz();
        String[] strArrSplit = strZz.split("\\.");
        if (strArrSplit.length < 4) {
            Log.w(zt.f48204a, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", strZz));
            return new VersionInfo(0, 0, 0);
        }
        int i10 = Integer.parseInt(strArrSplit[0]);
        int i11 = Integer.parseInt(strArrSplit[1]);
        int i12 = (Integer.parseInt(strArrSplit[2]) * 100) + Integer.parseInt(strArrSplit[3]);
        if (strArrSplit.length >= 5) {
            i12 = (i12 * 100) + Integer.parseInt(strArrSplit[4]);
        }
        return new VersionInfo(i10, i11, i12);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(Context context, InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        if (f48188a.get()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString("appKey");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size <= 0) {
            initializationCompleteCallback.onInitializationFailed(new AdError(101, "Missing or invalid app key.", "com.google.ads.mediation.ironsource").getMessage());
            return;
        }
        String str = (String) hashSet.iterator().next();
        if (TextUtils.isEmpty(str)) {
            initializationCompleteCallback.onInitializationFailed(new AdError(101, "Missing or invalid app key.", "com.google.ads.mediation.ironsource").getMessage());
            return;
        }
        if (size > 1) {
            Log.w(zt.f48204a, String.format("Multiple '%s' entries found: %s. Using app key '%s' to initialize the IronSource SDK.", "appKey", hashSet, str));
        }
        IronSource.setMediationType(zz.zr());
        Log.d(zt.f48204a, "Initializing IronSource SDK with app key: " + str);
        IronSourceAds.init(context, new InitRequest.Builder(str).withLegacyAdFormats(new ArrayList(Arrays.asList(IronSourceAds.AdFormat.BANNER, IronSourceAds.AdFormat.INTERSTITIAL, IronSourceAds.AdFormat.REWARDED))).build(), new a(initializationCompleteCallback));
        IronSource.setISDemandOnlyInterstitialListener(zu.a());
        IronSource.setISDemandOnlyRewardedVideoListener(zw.d());
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        if (f48188a.get()) {
            new zr(mediationAdLoadCallback).zr(mediationBannerAdConfiguration);
            return;
        }
        AdError adError = new AdError(106, "Failed to load IronSource banner ad since IronSource SDK is not initialized.", "com.ironsource.mediationsdk");
        Log.w(zt.f48204a, adError.getMessage());
        mediationAdLoadCallback.onFailure(adError);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        if (f48188a.get()) {
            new zu(mediationInterstitialAdConfiguration, mediationAdLoadCallback).zr(mediationInterstitialAdConfiguration);
            return;
        }
        AdError adError = new AdError(106, "Failed to load IronSource interstitial ad since IronSource SDK is not initialized.", "com.ironsource.mediationsdk");
        Log.w(zt.f48204a, adError.getMessage());
        mediationAdLoadCallback.onFailure(adError);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        if (f48188a.get()) {
            new zw(mediationRewardedAdConfiguration, mediationAdLoadCallback).zr(mediationRewardedAdConfiguration);
            return;
        }
        AdError adError = new AdError(106, "Failed to load IronSource rewarded ad since IronSource SDK is not initialized.", "com.google.ads.mediation.ironsource");
        Log.w(zt.f48204a, adError.getMessage());
        mediationAdLoadCallback.onFailure(adError);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedInterstitialAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        Log.d(zt.f48204a, "IronSource adapter was asked to load a rewarded interstitial ad. Using the rewarded ad request flow to load the ad to attempt to load a rewarded interstitial ad from IronSource.");
        loadRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        new zy(mediationAdLoadCallback).zz(mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        new zb(mediationAdLoadCallback).zz(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        new zc(mediationAdLoadCallback).zz(mediationRewardedAdConfiguration);
    }

    public void setIsInitialized(boolean z10) {
        f48188a.set(z10);
    }
}
