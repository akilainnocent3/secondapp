package com.yandex.mobile.ads.banner;

import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.ImpressionData;
import k.j0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@j0
public interface BannerAdEventListener {
    void onAdClicked();

    void onAdFailedToLoad(@l AdRequestError adRequestError);

    void onAdLoaded();

    void onImpression(@m ImpressionData impressionData);

    void onLeftApplication();

    void onReturnedToApplication();
}
