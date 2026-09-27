package com.unity3d.ads;

import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@UnityAdsExperimental
public interface LoadListener<UnityAd> {
    void onAdLoaded(@m UnityAd unityad, @m UnityAdsError unityAdsError);
}
