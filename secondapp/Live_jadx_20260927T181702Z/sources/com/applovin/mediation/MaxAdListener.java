package com.applovin.mediation;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface MaxAdListener {
    void onAdClicked(@NonNull MaxAd maxAd);

    void onAdDisplayFailed(@NonNull MaxAd maxAd, @NonNull MaxError maxError);

    void onAdDisplayed(@NonNull MaxAd maxAd);

    void onAdHidden(@NonNull MaxAd maxAd);

    void onAdLoadFailed(@NonNull String str, @NonNull MaxError maxError);

    void onAdLoaded(@NonNull MaxAd maxAd);
}
