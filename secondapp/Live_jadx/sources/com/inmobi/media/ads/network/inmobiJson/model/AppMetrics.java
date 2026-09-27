package com.inmobi.media.ads.network.inmobiJson.model;

import androidx.annotation.Keep;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class AppMetrics {

    @m
    private final Long downloads;

    @m
    private final Long likes;

    @m
    private final Float rating;

    @m
    public final Long getDownloads() {
        return this.downloads;
    }

    @m
    public final Long getLikes() {
        return this.likes;
    }

    @m
    public final Float getRating() {
        return this.rating;
    }
}
