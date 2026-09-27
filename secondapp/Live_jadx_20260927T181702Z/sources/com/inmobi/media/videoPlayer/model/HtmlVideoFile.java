package com.inmobi.media.videoPlayer.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class HtmlVideoFile {
    private int height;

    @l
    private String url = "";
    private int width;

    public final int getHeight() {
        return this.height;
    }

    @l
    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setHeight(int i10) {
        this.height = i10;
    }

    public final void setUrl(@l String str) {
        m0.p(str, "<set-?>");
        this.url = str;
    }

    public final void setWidth(int i10) {
        this.width = i10;
    }
}
