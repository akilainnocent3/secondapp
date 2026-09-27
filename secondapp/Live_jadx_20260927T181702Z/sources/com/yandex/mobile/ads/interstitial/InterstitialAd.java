package com.yandex.mobile.ads.interstitial;

import android.app.Activity;
import com.yandex.mobile.ads.common.AdAttributes;
import com.yandex.mobile.ads.common.AdInfo;
import java.util.List;
import k.j0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@j0
public interface InterstitialAd {
    @l
    List<AdAttributes> getAdAttributes();

    @l
    AdInfo getInfo();

    void setAdEventListener(@m InterstitialAdEventListener interstitialAdEventListener);

    void show(@l Activity activity);
}
