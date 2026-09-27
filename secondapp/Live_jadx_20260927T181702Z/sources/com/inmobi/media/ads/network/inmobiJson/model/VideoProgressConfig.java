package com.inmobi.media.ads.network.inmobiJson.model;

import androidx.annotation.Keep;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class VideoProgressConfig {

    @m
    private int[] color;

    @m
    private Integer height;

    @m
    private final Boolean showProgress;

    @m
    public final int[] getColor() {
        return this.color;
    }

    @m
    public final Integer getHeight() {
        return this.height;
    }

    @m
    public final Boolean getShowProgress() {
        return this.showProgress;
    }
}
