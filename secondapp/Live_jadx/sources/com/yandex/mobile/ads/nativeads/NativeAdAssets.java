package com.yandex.mobile.ads.nativeads;

import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface NativeAdAssets {
    @m
    String getAge();

    @m
    String getBody();

    @m
    String getCallToAction();

    @m
    String getDomain();

    @m
    NativeAdImage getFavicon();

    @m
    NativeAdImage getIcon();

    @m
    NativeAdImage getImage();

    @m
    NativeAdMedia getMedia();

    @m
    String getPrice();

    @m
    Float getRating();

    @m
    String getReviewCount();

    @m
    String getSponsored();

    @m
    String getTitle();

    @m
    String getWarning();

    boolean isFeedbackAvailable();
}
