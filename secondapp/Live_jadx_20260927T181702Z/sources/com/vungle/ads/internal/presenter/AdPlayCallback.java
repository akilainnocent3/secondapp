package com.vungle.ads.internal.presenter;

import com.vungle.ads.VungleError;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface AdPlayCallback {
    void onAdClick(@m String str);

    void onAdEnd(@m String str);

    void onAdImpression(@m String str);

    void onAdLeftApplication(@m String str);

    void onAdRewarded(@m String str);

    void onAdStart(@m String str);

    void onFailure(@l VungleError vungleError);
}
