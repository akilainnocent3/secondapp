package com.inmobi.media.ads.network.inmobiJson.model;

import androidx.annotation.Keep;
import com.inmobi.media.ads.network.common.model.TrackingInfo;
import java.util.ArrayList;
import java.util.List;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class Image {
    private int height;

    @m
    private final Link link;
    private int width;

    @l
    private final String url = "";

    @l
    private final List<TrackingInfo> trackers = new ArrayList();

    public final int getHeight() {
        return this.height;
    }

    @m
    public final Link getLink() {
        return this.link;
    }

    @l
    public final List<TrackingInfo> getTrackers() {
        return this.trackers;
    }

    @l
    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }
}
