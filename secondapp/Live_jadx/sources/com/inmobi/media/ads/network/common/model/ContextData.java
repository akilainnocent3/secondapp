package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class ContextData {

    @m
    private final String advertisedContent;

    @m
    private final Long bidderId;
    private final int casAdTypeId = -1;
    private final boolean enabled;

    @m
    public final String getAdvertisedContent() {
        return this.advertisedContent;
    }

    @m
    public final Long getBidderId() {
        return this.bidderId;
    }

    public final int getCasAdTypeId() {
        return this.casAdTypeId;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }
}
