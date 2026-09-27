package com.yandex.mobile.ads.instream.player.ad;

import com.yandex.mobile.ads.instream.player.ad.error.InstreamAdPlayerError;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import k.j0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@j0
public interface InstreamAdPlayerListener {
    void onAdBufferingFinished(@l VideoAd videoAd);

    void onAdBufferingStarted(@l VideoAd videoAd);

    void onAdCompleted(@l VideoAd videoAd);

    void onAdPaused(@l VideoAd videoAd);

    void onAdPrepared(@l VideoAd videoAd);

    void onAdResumed(@l VideoAd videoAd);

    void onAdSkipped(@l VideoAd videoAd);

    void onAdStarted(@l VideoAd videoAd);

    void onAdStopped(@l VideoAd videoAd);

    void onError(@l VideoAd videoAd, @l InstreamAdPlayerError instreamAdPlayerError);

    void onVolumeChanged(@l VideoAd videoAd, float f10);
}
