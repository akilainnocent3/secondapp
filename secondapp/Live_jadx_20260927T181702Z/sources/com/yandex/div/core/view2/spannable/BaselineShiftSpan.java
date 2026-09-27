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
public final class BaselineShiftSpan extends MetricAffectingSpan implements ParagraphStyle {
    private final int baselineShift;
    private final int lineHeight;

    public /* synthetic */ BaselineShiftSpan(int i10, int i11, int i12, x xVar) {
        this(i10, (i12 & 2) != 0 ? 0 : i11);
    }

    public final int getLineHeight() {
        return this.lineHeight;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@l TextPaint textPaint) {
        textPaint.baselineShift -= this.baselineShift;
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@l TextPaint textPaint) {
        if (this.lineHeight == 0) {
            textPaint.baselineShift -= this.baselineShift;
        }
    }

    public BaselineShiftSpan(@q0 int i10, @e0(from = 0) @q0 int i11) {
        this.baselineShift = i10;
        this.lineHeight = i11;
    }
}
