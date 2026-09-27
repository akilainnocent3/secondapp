package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.common.ImpressionData;
import k.j0;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@j0
public interface NativeAdEventListener {
    void onAdClicked();

    void onImpression(@m ImpressionData impressionData);

    void onLeftApplication();

    void onReturnedToApplication();
}
