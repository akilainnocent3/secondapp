package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAdsError;
import com.unity3d.ads.core.data.model.AdObject;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface InternalLoadListener {
    void onAdLoadFail(@l UnityAdsError unityAdsError);

    void onAdLoaded(@l AdObject adObject);
}
