package com.yandex.mobile.ads.instream.player.ad;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import k.j0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@j0
public interface InstreamAdPlayer {
    long getAdDuration(@l VideoAd videoAd);

    long getAdPosition(@l VideoAd videoAd);

    float getVolume(@l VideoAd videoAd);

    boolean isPlayingAd(@l VideoAd videoAd);

    void pauseAd(@l VideoAd videoAd);

    void playAd(@l VideoAd videoAd);

    void prepareAd(@l VideoAd videoAd);

    void releaseAd(@l VideoAd videoAd);

    void resumeAd(@l VideoAd videoAd);

    void setInstreamAdPlayerListener(@m InstreamAdPlayerListener instreamAdPlayerListener);

    void setVolume(@l VideoAd videoAd, float f10);

    void skipAd(@l VideoAd videoAd);

    void stopAd(@l VideoAd videoAd);
}
