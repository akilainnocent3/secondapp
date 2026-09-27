package com.yandex.div.internal.spannable;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class TypefaceSpan extends MetricAffectingSpan {

    @l
    private final Typeface typeface;

    public TypefaceSpan(@l Typeface typeface) {
        this.typeface = typeface;
    }

    private final void apply(TextPaint textPaint) {
        textPaint.setTypeface(this.typeface);
    }

    @l
    public final Typeface getTypeface() {
        return this.typeface;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@l TextPaint textPaint) {
        apply(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@l TextPaint textPaint) {
        apply(textPaint);
    }
}
