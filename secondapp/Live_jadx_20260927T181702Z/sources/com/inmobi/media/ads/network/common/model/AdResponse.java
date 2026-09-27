package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import com.inmobi.media.Ue;
import java.util.ArrayList;
import java.util.List;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class AdResponse {

    @l
    private String requestId = "";
    private final long placementId = -1;

    @l
    @Ue
    private final List<AdSet> adSets = new ArrayList();

    @l
    public final List<AdSet> getAdSets() {
        return this.adSets;
    }

    public final long getPlacementId() {
        return this.placementId;
    }

    @l
    public final String getRequestId() {
        return this.requestId;
    }
}
