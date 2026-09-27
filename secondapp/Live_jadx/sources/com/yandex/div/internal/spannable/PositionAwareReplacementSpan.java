package com.yandex.div.internal.spannable;

import android.graphics.Paint;
import android.os.Build;
import android.text.style.ReplacementSpan;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class PositionAwareReplacementSpan extends ReplacementSpan {
    private final void updateFontMetrics(int i10, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt == null || i10 != 0 || Build.VERSION.SDK_INT >= 28) {
            return;
        }
        fontMetricsInt.top = 0;
        fontMetricsInt.ascent = 0;
        fontMetricsInt.bottom = 0;
        fontMetricsInt.descent = 0;
        fontMetricsInt.leading = 0;
    }

    public abstract int adjustSize(@l Paint paint, @l CharSequence charSequence, int i10, int i11, @m Paint.FontMetricsInt fontMetricsInt);

    @Override // android.text.style.ReplacementSpan
    public final int getSize(@l Paint paint, @l CharSequence charSequence, int i10, int i11, @m Paint.FontMetricsInt fontMetricsInt) {
        updateFontMetrics(i10, fontMetricsInt);
        return adjustSize(paint, charSequence, i10, i11, fontMetricsInt);
    }
}
