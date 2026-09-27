package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class TrackersV2 {

    @m
    private final String type;

    @l
    private final List<String> url = new ArrayList();

    @l
    private final List<String> imExts = new ArrayList();

    @l
    public final List<String> getImExts() {
        return this.imExts;
    }

    @m
    public final String getType() {
        return this.type;
    }

    @l
    public final List<String> getUrl() {
        return this.url;
    }

    public static /* synthetic */ void getType$annotations() {
    }
}
