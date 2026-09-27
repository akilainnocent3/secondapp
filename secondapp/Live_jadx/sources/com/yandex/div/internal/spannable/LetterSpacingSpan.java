package com.yandex.div.internal.spannable;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class LetterSpacingSpan extends MetricAffectingSpan {
    private final float letterSpacing;

    public LetterSpacingSpan(float f10) {
        this.letterSpacing = f10;
    }

    private final void apply(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.letterSpacing);
    }

    public final float getLetterSpacing() {
        return this.letterSpacing;
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
