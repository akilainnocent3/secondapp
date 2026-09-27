package com.inmobi.media.videoPlayer.model;

import androidx.annotation.Keep;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class VideoViewPosition {
    private int height;

    @m
    private String orientation;
    private int width;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f57942x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f57943y;

    public final int getHeight() {
        return this.height;
    }

    @m
    public final String getOrientation() {
        return this.orientation;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getX() {
        return this.f57942x;
    }

    public final int getY() {
        return this.f57943y;
    }

    public final void setHeight(int i10) {
        this.height = i10;
    }

    public final void setOrientation(@m String str) {
        this.orientation = str;
    }

    public final void setWidth(int i10) {
        this.width = i10;
    }

    public final void setX(int i10) {
        this.f57942x = i10;
    }

    public final void setY(int i10) {
        this.f57943y = i10;
    }
}
