package com.inmobi.media.ads.network.inmobiJson.model;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class NativeImage {

    @l
    private final List<Image> assets = new ArrayList();
    private final boolean required;

    @l
    public final List<Image> getAssets() {
        return this.assets;
    }

    public final boolean getRequired() {
        return this.required;
    }
}
