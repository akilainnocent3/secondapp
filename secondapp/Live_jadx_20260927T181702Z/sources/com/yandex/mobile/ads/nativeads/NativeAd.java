package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.common.AdAttributes;
import k.j0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@j0
public interface NativeAd {
    void addImageLoadingListener(@l NativeAdImageLoadingListener nativeAdImageLoadingListener);

    void bindNativeAd(@l NativeAdViewBinder nativeAdViewBinder) throws NativeAdException;

    @l
    NativeAdAssets getAdAssets();

    @m
    AdAttributes getAdAttributes();

    @l
    NativeAdType getAdType();

    @m
    String getCampaignId();

    @m
    String getCreativeId();

    @m
    String getInfo();

    void loadImages();

    void removeImageLoadingListener(@l NativeAdImageLoadingListener nativeAdImageLoadingListener);

    void setNativeAdEventListener(@m NativeAdEventListener nativeAdEventListener);
}
