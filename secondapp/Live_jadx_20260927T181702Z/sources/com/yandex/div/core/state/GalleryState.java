package com.yandex.div.core.state;

import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class GalleryState implements DivViewState.BlockState {
    private final int scrollOffset;
    private final int visibleItemIndex;

    public GalleryState(int i10, int i11) {
        this.visibleItemIndex = i10;
        this.scrollOffset = i11;
    }

    public static /* synthetic */ GalleryState copy$default(GalleryState galleryState, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = galleryState.visibleItemIndex;
        }
        if ((i12 & 2) != 0) {
            i11 = galleryState.scrollOffset;
        }
        return galleryState.copy(i10, i11);
    }

    public final int component1() {
        return this.visibleItemIndex;
    }

    public final int component2() {
        return this.scrollOffset;
    }

    @l
    public final GalleryState copy(int i10, int i11) {
        return new GalleryState(i10, i11);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GalleryState)) {
            return false;
        }
        GalleryState galleryState = (GalleryState) obj;
        return this.visibleItemIndex == galleryState.visibleItemIndex && this.scrollOffset == galleryState.scrollOffset;
    }

    public final int getScrollOffset() {
        return this.scrollOffset;
    }

    public final int getVisibleItemIndex() {
        return this.visibleItemIndex;
    }

    public int hashCode() {
        return (this.visibleItemIndex * 31) + this.scrollOffset;
    }

    @l
    public String toString() {
        return "GalleryState(visibleItemIndex=" + this.visibleItemIndex + ", scrollOffset=" + this.scrollOffset + ')';
    }
}
