package com.inmobi.ads.core;

import androidx.annotation.Keep;
import fr.h0;
import java.util.List;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class Trackers {

    @l
    private final String type = "";

    @l
    private final List<String> imExts = h0.J();

    @l
    private final List<String> url = h0.J();

    @l
    public final List<String> getImExts() {
        return this.imExts;
    }

    @l
    public final String getType() {
        return this.type;
    }

    @l
    public final List<String> getUrl() {
        return this.url;
    }
}
