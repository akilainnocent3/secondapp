package com.yandex.div.core.player;

import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivVideoResolution {
    private final int height;
    private final int width;

    public DivVideoResolution(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }

    public static /* synthetic */ DivVideoResolution copy$default(DivVideoResolution divVideoResolution, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = divVideoResolution.width;
        }
        if ((i12 & 2) != 0) {
            i11 = divVideoResolution.height;
        }
        return divVideoResolution.copy(i10, i11);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    @l
    public final DivVideoResolution copy(int i10, int i11) {
        return new DivVideoResolution(i10, i11);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DivVideoResolution)) {
            return false;
        }
        DivVideoResolution divVideoResolution = (DivVideoResolution) obj;
        return this.width == divVideoResolution.width && this.height == divVideoResolution.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (this.width * 31) + this.height;
    }

    @l
    public String toString() {
        return "DivVideoResolution(width=" + this.width + ", height=" + this.height + ')';
    }
}
