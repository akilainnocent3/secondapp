package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class TrackingInfo {

    @l
    private final String imBaseUrl = "";

    @l
    private final List<TrackersV2> trackers = new ArrayList();

    @l
    public final String getImBaseUrl() {
        return this.imBaseUrl;
    }

    @l
    public final List<TrackersV2> getTrackers() {
        return this.trackers;
    }
}
