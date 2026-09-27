package com.inmobi.ads;

import gi.j;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class WatermarkData {
    private float alpha;

    @l
    private final String watermarkBase64EncodedString;

    public WatermarkData(@l String watermarkBase64EncodedString, float f10) {
        m0.p(watermarkBase64EncodedString, "watermarkBase64EncodedString");
        this.watermarkBase64EncodedString = watermarkBase64EncodedString;
        this.alpha = f10;
    }

    public static /* synthetic */ WatermarkData copy$default(WatermarkData watermarkData, String str, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = watermarkData.watermarkBase64EncodedString;
        }
        if ((i10 & 2) != 0) {
            f10 = watermarkData.alpha;
        }
        return watermarkData.copy(str, f10);
    }

    @l
    public final String component1() {
        return this.watermarkBase64EncodedString;
    }

    public final float component2() {
        return this.alpha;
    }

    @l
    public final WatermarkData copy(@l String watermarkBase64EncodedString, float f10) {
        m0.p(watermarkBase64EncodedString, "watermarkBase64EncodedString");
        return new WatermarkData(watermarkBase64EncodedString, f10);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatermarkData)) {
            return false;
        }
        WatermarkData watermarkData = (WatermarkData) obj;
        return m0.g(this.watermarkBase64EncodedString, watermarkData.watermarkBase64EncodedString) && Float.compare(this.alpha, watermarkData.alpha) == 0;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    @l
    public final String getWatermarkBase64EncodedString() {
        return this.watermarkBase64EncodedString;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.alpha) + (this.watermarkBase64EncodedString.hashCode() * 31);
    }

    public final void setAlpha(float f10) {
        this.alpha = f10;
    }

    @l
    public String toString() {
        return "WatermarkData(watermarkBase64EncodedString=" + this.watermarkBase64EncodedString + ", alpha=" + this.alpha + j.f86771d;
    }

    public /* synthetic */ WatermarkData(String str, float f10, int i10, x xVar) {
        this(str, (i10 & 2) != 0 ? 1.0f : f10);
    }
}
