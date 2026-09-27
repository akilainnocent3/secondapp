package com.yandex.mobile.ads.instream.newapi.adbreak;

import com.yandex.mobile.ads.instream.InstreamAdBreakEventListener;
import com.yandex.mobile.ads.instream.newapi.InstreamExperimentalApi;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdView;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import k.j0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@InstreamExperimentalApi
@j0
public interface InstreamAdBreak {
    @l
    AdBreakData getAdBreakData();

    void invalidate();

    void pause();

    void play(@l InstreamAdView instreamAdView);

    void prepare();

    void prepare(@l InstreamAdPlayer instreamAdPlayer);

    void resume();

    void setListener(@m InstreamAdBreakEventListener instreamAdBreakEventListener);

    void setVideoAdPlaybackListener(@m VideoAdPlaybackListener videoAdPlaybackListener);
}
