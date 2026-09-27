package com.yandex.mobile.ads.video.playback.model;

import java.util.List;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface VideoAd {
    @l
    VideoAdInfo getAdInfo();

    @l
    AdPodInfo getAdPodInfo();

    long getDuration();

    @l
    VideoAdExtensions getExtensions();

    @m
    String getInfo();

    @l
    MediaFile getMediaFile();

    @l
    List<MediaFile> getMediaFiles();

    @m
    SkipInfo getSkipInfo();
}
