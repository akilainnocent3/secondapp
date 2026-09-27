package com.inmobi.media.videoPlayer.model;

import androidx.annotation.Keep;
import fr.h0;
import java.util.List;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class HtmlVideoPlayerRequest {
    private boolean isCache;

    @l
    private List<HtmlVideoFile> videoFiles = h0.J();
    private long loadTimeout = 3000;

    @l
    private HtmlVideoPlayerConfig config = new HtmlVideoPlayerConfig();

    @l
    private List<HtmlOmidTracker> omidTrackers = h0.J();

    @l
    public final HtmlVideoPlayerConfig getConfig() {
        return this.config;
    }

    public final long getLoadTimeout() {
        return this.loadTimeout;
    }

    @l
    public final List<HtmlOmidTracker> getOmidTrackers() {
        return this.omidTrackers;
    }

    @l
    public final List<HtmlVideoFile> getVideoFiles() {
        return this.videoFiles;
    }

    public final boolean isCache() {
        return this.isCache;
    }

    public final void setCache(boolean z10) {
        this.isCache = z10;
    }

    public final void setConfig(@l HtmlVideoPlayerConfig htmlVideoPlayerConfig) {
        m0.p(htmlVideoPlayerConfig, "<set-?>");
        this.config = htmlVideoPlayerConfig;
    }

    public final void setLoadTimeout(long j10) {
        this.loadTimeout = j10;
    }

    public final void setOmidTrackers(@l List<HtmlOmidTracker> list) {
        m0.p(list, "<set-?>");
        this.omidTrackers = list;
    }

    public final void setVideoFiles(@l List<HtmlVideoFile> list) {
        m0.p(list, "<set-?>");
        this.videoFiles = list;
    }
}
