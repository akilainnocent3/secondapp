package com.yandex.mobile.ads.instream.newapi;

import k.j0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@InstreamExperimentalApi
@j0
public interface InstreamAdLoadListener {
    void onInstreamAdFailedToLoad(@l InstreamAdRequestError instreamAdRequestError);

    void onInstreamAdLoaded(@l InstreamAd instreamAd);
}
