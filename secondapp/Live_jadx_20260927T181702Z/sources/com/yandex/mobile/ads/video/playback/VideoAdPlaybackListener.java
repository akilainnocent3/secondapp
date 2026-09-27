package com.yandex.mobile.ads.video.playback;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import k.j0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@j0
public interface VideoAdPlaybackListener {
    void onAdClicked(@l VideoAd videoAd);

    void onAdCompleted(@l VideoAd videoAd);

    void onAdError(@l VideoAd videoAd);

    void onAdPaused(@l VideoAd videoAd);

    void onAdPrepared(@l VideoAd videoAd);

    void onAdResumed(@l VideoAd videoAd);

    void onAdSkipped(@l VideoAd videoAd);

    void onAdStarted(@l VideoAd videoAd);

    void onAdStopped(@l VideoAd videoAd);

    void onImpression(@l VideoAd videoAd);

    void onVolumeChanged(@l VideoAd videoAd, float f10);
}
