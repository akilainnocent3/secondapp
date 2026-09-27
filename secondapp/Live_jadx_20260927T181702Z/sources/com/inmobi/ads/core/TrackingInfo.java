package com.inmobi.ads.core;

import androidx.annotation.Keep;
import fr.h0;
import java.util.List;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class TrackingInfo {

    @l
    private final String imBaseUrl = "";

    @l
    private final List<Trackers> trackers = h0.J();

    @l
    public final String getImBaseUrl() {
        return this.imBaseUrl;
    }

    @l
    public final List<Trackers> getTrackers() {
        return this.trackers;
    }
}
