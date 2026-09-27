package com.yandex.mobile.ads.video.playback.model;

import oy.l;
import oy.m;
import yads.cf3;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface MediaFile extends cf3 {
    int getAdHeight();

    int getAdWidth();

    @m
    String getApiFramework();

    @m
    Integer getBitrate();

    @m
    String getMediaType();

    @Override // yads.cf3
    @l
    String getUrl();
}
