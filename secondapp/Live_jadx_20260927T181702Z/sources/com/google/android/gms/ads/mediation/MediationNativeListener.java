package com.google.android.gms.ads.mediation;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.internal.ads.zzbmk;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface MediationNativeListener {
    void onAdClicked(@NonNull MediationNativeAdapter mediationNativeAdapter);

    void onAdClosed(@NonNull MediationNativeAdapter mediationNativeAdapter);

    @Deprecated
    void onAdFailedToLoad(@NonNull MediationNativeAdapter mediationNativeAdapter, int i10);

    void onAdFailedToLoad(@NonNull MediationNativeAdapter mediationNativeAdapter, @NonNull AdError adError);

    void onAdImpression(@NonNull MediationNativeAdapter mediationNativeAdapter);

    void onAdLeftApplication(@NonNull MediationNativeAdapter mediationNativeAdapter);

    void onAdLoaded(@NonNull MediationNativeAdapter mediationNativeAdapter, @NonNull UnifiedNativeAdMapper unifiedNativeAdMapper);

    void onAdOpened(@NonNull MediationNativeAdapter mediationNativeAdapter);

    void onVideoEnd(@NonNull MediationNativeAdapter mediationNativeAdapter);

    void zzc(MediationNativeAdapter mediationNativeAdapter, zzbmk zzbmkVar);

    void zzd(MediationNativeAdapter mediationNativeAdapter, zzbmk zzbmkVar, String str);
}
