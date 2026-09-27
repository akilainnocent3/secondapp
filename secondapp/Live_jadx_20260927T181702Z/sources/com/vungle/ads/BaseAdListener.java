package com.vungle.ads;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface BaseAdListener {
    void onAdClicked(@l BaseAd baseAd);

    void onAdEnd(@l BaseAd baseAd);

    void onAdFailedToLoad(@l BaseAd baseAd, @l VungleError vungleError);

    void onAdFailedToPlay(@l BaseAd baseAd, @l VungleError vungleError);

    void onAdImpression(@l BaseAd baseAd);

    void onAdLeftApplication(@l BaseAd baseAd);

    void onAdLoaded(@l BaseAd baseAd);

    void onAdStart(@l BaseAd baseAd);
}
