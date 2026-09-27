package com.inmobi.media.ads.network.inmobiJson.model;

import androidx.annotation.Keep;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class NativeMedia {

    @m
    private final NativeImage image;

    @l
    private String type = "";

    @m
    private final NativeVideo video;

    @m
    public final NativeImage getImage() {
        return this.image;
    }

    @l
    public final String getType() {
        return this.type;
    }

    @m
    public final NativeVideo getVideo() {
        return this.video;
    }

    public static /* synthetic */ void getType$annotations() {
    }
}
