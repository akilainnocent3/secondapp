package com.monetization.ads.mediation.base;

import com.monetization.ads.mediation.banner.MediatedBannerSize;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface MediatedBidderTokenLoadListener {
    void onBidderTokenFailedToLoad(@l String str);

    void onBidderTokenLoaded(@l String str, @m MediatedBannerSize mediatedBannerSize);
}
