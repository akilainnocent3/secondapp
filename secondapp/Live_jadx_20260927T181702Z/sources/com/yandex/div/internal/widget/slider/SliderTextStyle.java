package com.yandex.div.internal.widget.slider;

import android.graphics.Typeface;
import k.k;
import k.q0;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class SliderTextStyle {
    private final float fontSize;

    @m
    private final String fontVariations;

    @l
    private final Typeface fontWeight;
    private final float offsetX;
    private final float offsetY;
    private final float spacing;
    private final int textColor;

    public SliderTextStyle(@q0 float f10, float f11, @l Typeface typeface, @q0 float f12, @q0 float f13, @k int i10, @m String str) {
        this.fontSize = f10;
        this.spacing = f11;
        this.fontWeight = typeface;
        this.offsetX = f12;
        this.offsetY = f13;
        this.textColor = i10;
        this.fontVariations = str;
    }

    public static /* synthetic */ SliderTextStyle copy$default(SliderTextStyle sliderTextStyle, float f10, float f11, Typeface typeface, float f12, float f13, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f10 = sliderTextStyle.fontSize;
        }
        if ((i11 & 2) != 0) {
            f11 = sliderTextStyle.spacing;
        }
        if ((i11 & 4) != 0) {
            typeface = sliderTextStyle.fontWeight;
        }
        if ((i11 & 8) != 0) {
            f12 = sliderTextStyle.offsetX;
        }
        if ((i11 & 16) != 0) {
            f13 = sliderTextStyle.offsetY;
        }
        if ((i11 & 32) != 0) {
            i10 = sliderTextStyle.textColor;
        }
        if ((i11 & 64) != 0) {
            str = sliderTextStyle.fontVariations;
        }
        int i12 = i10;
        String str2 = str;
        float f14 = f13;
        Typeface typeface2 = typeface;
        return sliderTextStyle.copy(f10, f11, typeface2, f12, f14, i12, str2);
    }

    public final float component1() {
        return this.fontSize;
    }

    public final float component2() {
        return this.spacing;
    }

    @l
    public final Typeface component3() {
        return this.fontWeight;
    }

    public final float component4() {
        return this.offsetX;
    }

    public final float component5() {
        return this.offsetY;
    }

    public final int component6() {
        return this.textColor;
    }

    @m
    public final String component7() {
        return this.fontVariations;
    }

    @l
    public final SliderTextStyle copy(@q0 float f10, float f11, @l Typeface typeface, @q0 float f12, @q0 float f13, @k int i10, @m String str) {
        return new SliderTextStyle(f10, f11, typeface, f12, f13, i10, str);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SliderTextStyle)) {
            return false;
        }
        SliderTextStyle sliderTextStyle = (SliderTextStyle) obj;
        return Float.compare(this.fontSize, sliderTextStyle.fontSize) == 0 && Float.compare(this.spacing, sliderTextStyle.spacing) == 0 && m0.g(this.fontWeight, sliderTextStyle.fontWeight) && Float.compare(this.offsetX, sliderTextStyle.offsetX) == 0 && Float.compare(this.offsetY, sliderTextStyle.offsetY) == 0 && this.textColor == sliderTextStyle.textColor && m0.g(this.fontVariations, sliderTextStyle.fontVariations);
    }

    public final float getFontSize() {
        return this.fontSize;
    }

    @m
    public final String getFontVariations() {
        return this.fontVariations;
    }

    @l
    public final Typeface getFontWeight() {
        return this.fontWeight;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final float getSpacing() {
        return this.spacing;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        int iFloatToIntBits = ((((((((((Float.floatToIntBits(this.fontSize) * 31) + Float.floatToIntBits(this.spacing)) * 31) + this.fontWeight.hashCode()) * 31) + Float.floatToIntBits(this.offsetX)) * 31) + Float.floatToIntBits(this.offsetY)) * 31) + this.textColor) * 31;
        String str = this.fontVariations;
        return iFloatToIntBits + (str == null ? 0 : str.hashCode());
    }

    @l
    public String toString() {
        return "SliderTextStyle(fontSize=" + this.fontSize + ", spacing=" + this.spacing + ", fontWeight=" + this.fontWeight + ", offsetX=" + this.offsetX + ", offsetY=" + this.offsetY + ", textColor=" + this.textColor + ", fontVariations=" + this.fontVariations + ')';
    }
}
