package com.yandex.div.core.view2.spannable;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.text.style.ParagraphStyle;
import k.e0;
import k.q0;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class FontSizeSpan extends MetricAffectingSpan implements ParagraphStyle {
    private final int fontSize;
    private final int lineHeight;

    public /* synthetic */ FontSizeSpan(int i10, int i11, int i12, x xVar) {
        this(i10, (i12 & 2) != 0 ? 0 : i11);
    }

    public final int getFontSize() {
        return this.fontSize;
    }

    public final int getLineHeight() {
        return this.lineHeight;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@l TextPaint textPaint) {
        textPaint.setTextSize(this.fontSize);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@l TextPaint textPaint) {
        int i10 = this.lineHeight;
        if (i10 == 0) {
            textPaint.setTextSize(this.fontSize);
        } else if (i10 >= textPaint.getTextSize()) {
            textPaint.setTextScaleX(this.fontSize / textPaint.getTextSize());
        } else {
            textPaint.setTextScaleX(this.fontSize / this.lineHeight);
            textPaint.setTextSize(this.lineHeight);
        }
    }

    public FontSizeSpan(@q0 int i10, @e0(from = 0) @q0 int i11) {
        this.fontSize = i10;
        this.lineHeight = i11;
    }
}
