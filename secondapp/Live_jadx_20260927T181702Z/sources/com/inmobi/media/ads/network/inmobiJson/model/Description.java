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
public final class Description {

    @m
    private final Link link;
    private final boolean required;

    @l
    private final String text = "";

    @l
    private final List<TrackingInfo> trackers = new ArrayList();

    @m
    public final Link getLink() {
        return this.link;
    }

    public final boolean getRequired() {
        return this.required;
    }

    @l
    public final String getText() {
        return this.text;
    }

    @l
    public final List<TrackingInfo> getTrackers() {
        return this.trackers;
    }
}
