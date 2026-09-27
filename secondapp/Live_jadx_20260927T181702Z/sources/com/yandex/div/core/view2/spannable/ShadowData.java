package com.yandex.div.core.view2.spannable;

import k.k;
import k.q0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ShadowData {
    private final int color;
    private final float offsetX;
    private final float offsetY;
    private final float radius;

    public ShadowData(@q0 float f10, @q0 float f11, @q0 float f12, @k int i10) {
        this.offsetX = f10;
        this.offsetY = f11;
        this.radius = f12;
        this.color = i10;
    }

    public static /* synthetic */ ShadowData copy$default(ShadowData shadowData, float f10, float f11, float f12, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f10 = shadowData.offsetX;
        }
        if ((i11 & 2) != 0) {
            f11 = shadowData.offsetY;
        }
        if ((i11 & 4) != 0) {
            f12 = shadowData.radius;
        }
        if ((i11 & 8) != 0) {
            i10 = shadowData.color;
        }
        return shadowData.copy(f10, f11, f12, i10);
    }

    public final float component1() {
        return this.offsetX;
    }

    public final float component2() {
        return this.offsetY;
    }

    public final float component3() {
        return this.radius;
    }

    public final int component4() {
        return this.color;
    }

    @l
    public final ShadowData copy(@q0 float f10, @q0 float f11, @q0 float f12, @k int i10) {
        return new ShadowData(f10, f11, f12, i10);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowData)) {
            return false;
        }
        ShadowData shadowData = (ShadowData) obj;
        return Float.compare(this.offsetX, shadowData.offsetX) == 0 && Float.compare(this.offsetY, shadowData.offsetY) == 0 && Float.compare(this.radius, shadowData.radius) == 0 && this.color == shadowData.color;
    }

    public final int getColor() {
        return this.color;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final float getRadius() {
        return this.radius;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.offsetX) * 31) + Float.floatToIntBits(this.offsetY)) * 31) + Float.floatToIntBits(this.radius)) * 31) + this.color;
    }

    @l
    public String toString() {
        return "ShadowData(offsetX=" + this.offsetX + ", offsetY=" + this.offsetY + ", radius=" + this.radius + ", color=" + this.color + ')';
    }
}
