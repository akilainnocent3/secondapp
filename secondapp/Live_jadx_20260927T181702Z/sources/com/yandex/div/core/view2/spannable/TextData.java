package com.yandex.div.core.view2.spannable;

import k.k;
import k.q0;
import kotlin.jvm.internal.m0;
import mq.ba;
import mq.vj;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class TextData {

    @m
    private final String fontFamily;
    private final int fontSize;

    @l
    private final vj fontSizeUnit;
    private final int fontSizeValue;

    @m
    private final ba fontWeight;

    @m
    private final Integer fontWeightValue;

    @m
    private final Integer lineHeight;

    @l
    private final String text;
    private final int textColor;
    private final int textLength;

    public TextData(@l String str, @q0 int i10, int i11, @l vj vjVar, @m String str2, @m ba baVar, @m Integer num, @q0 @m Integer num2, @k int i12) {
        this.text = str;
        this.fontSize = i10;
        this.fontSizeValue = i11;
        this.fontSizeUnit = vjVar;
        this.fontFamily = str2;
        this.fontWeight = baVar;
        this.fontWeightValue = num;
        this.lineHeight = num2;
        this.textColor = i12;
        this.textLength = str.length();
    }

    public static /* synthetic */ TextData copy$default(TextData textData, String str, int i10, int i11, vj vjVar, String str2, ba baVar, Integer num, Integer num2, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = textData.text;
        }
        if ((i13 & 2) != 0) {
            i10 = textData.fontSize;
        }
        if ((i13 & 4) != 0) {
            i11 = textData.fontSizeValue;
        }
        if ((i13 & 8) != 0) {
            vjVar = textData.fontSizeUnit;
        }
        if ((i13 & 16) != 0) {
            str2 = textData.fontFamily;
        }
        if ((i13 & 32) != 0) {
            baVar = textData.fontWeight;
        }
        if ((i13 & 64) != 0) {
            num = textData.fontWeightValue;
        }
        if ((i13 & 128) != 0) {
            num2 = textData.lineHeight;
        }
        if ((i13 & 256) != 0) {
            i12 = textData.textColor;
        }
        Integer num3 = num2;
        int i14 = i12;
        ba baVar2 = baVar;
        Integer num4 = num;
        String str3 = str2;
        int i15 = i11;
        return textData.copy(str, i10, i15, vjVar, str3, baVar2, num4, num3, i14);
    }

    @l
    public final String component1() {
        return this.text;
    }

    public final int component2() {
        return this.fontSize;
    }

    public final int component3() {
        return this.fontSizeValue;
    }

    @l
    public final vj component4() {
        return this.fontSizeUnit;
    }

    @m
    public final String component5() {
        return this.fontFamily;
    }

    @m
    public final ba component6() {
        return this.fontWeight;
    }

    @m
    public final Integer component7() {
        return this.fontWeightValue;
    }

    @m
    public final Integer component8() {
        return this.lineHeight;
    }

    public final int component9() {
        return this.textColor;
    }

    @l
    public final TextData copy(@l String str, @q0 int i10, int i11, @l vj vjVar, @m String str2, @m ba baVar, @m Integer num, @q0 @m Integer num2, @k int i12) {
        return new TextData(str, i10, i11, vjVar, str2, baVar, num, num2, i12);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextData)) {
            return false;
        }
        TextData textData = (TextData) obj;
        return m0.g(this.text, textData.text) && this.fontSize == textData.fontSize && this.fontSizeValue == textData.fontSizeValue && this.fontSizeUnit == textData.fontSizeUnit && m0.g(this.fontFamily, textData.fontFamily) && this.fontWeight == textData.fontWeight && m0.g(this.fontWeightValue, textData.fontWeightValue) && m0.g(this.lineHeight, textData.lineHeight) && this.textColor == textData.textColor;
    }

    @m
    public final String getFontFamily() {
        return this.fontFamily;
    }

    public final int getFontSize() {
        return this.fontSize;
    }

    @l
    public final vj getFontSizeUnit() {
        return this.fontSizeUnit;
    }

    public final int getFontSizeValue() {
        return this.fontSizeValue;
    }

    @m
    public final ba getFontWeight() {
        return this.fontWeight;
    }

    @m
    public final Integer getFontWeightValue() {
        return this.fontWeightValue;
    }

    @m
    public final Integer getLineHeight() {
        return this.lineHeight;
    }

    @l
    public final String getText() {
        return this.text;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final int getTextLength() {
        return this.textLength;
    }

    public int hashCode() {
        int iHashCode = ((((((this.text.hashCode() * 31) + this.fontSize) * 31) + this.fontSizeValue) * 31) + this.fontSizeUnit.hashCode()) * 31;
        String str = this.fontFamily;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ba baVar = this.fontWeight;
        int iHashCode3 = (iHashCode2 + (baVar == null ? 0 : baVar.hashCode())) * 31;
        Integer num = this.fontWeightValue;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.lineHeight;
        return ((iHashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.textColor;
    }

    @l
    public String toString() {
        return "TextData(text=" + this.text + ", fontSize=" + this.fontSize + ", fontSizeValue=" + this.fontSizeValue + ", fontSizeUnit=" + this.fontSizeUnit + ", fontFamily=" + this.fontFamily + ", fontWeight=" + this.fontWeight + ", fontWeightValue=" + this.fontWeightValue + ", lineHeight=" + this.lineHeight + ", textColor=" + this.textColor + ')';
    }
}
