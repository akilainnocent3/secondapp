package com.inmobi.media.ads.network.inmobiJson.model;

import androidx.annotation.Keep;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class JsonAssetObject {

    @m
    private final Image adChoice;

    @m
    private final AppMetrics appMetrics;

    @m
    private final CTA cta;

    @m
    private final Description description;

    @m
    private final Icon icon;

    @m
    private final NativeMedia media;

    @m
    private final Sponsored sponsored;

    @m
    private final Title title;

    @m
    public final Image getAdChoice() {
        return this.adChoice;
    }

    @m
    public final AppMetrics getAppMetrics() {
        return this.appMetrics;
    }

    @m
    public final CTA getCta() {
        return this.cta;
    }

    @m
    public final Description getDescription() {
        return this.description;
    }

    @m
    public final Icon getIcon() {
        return this.icon;
    }

    @m
    public final NativeMedia getMedia() {
        return this.media;
    }

    @m
    public final Sponsored getSponsored() {
        return this.sponsored;
    }

    @m
    public final Title getTitle() {
        return this.title;
    }
}
