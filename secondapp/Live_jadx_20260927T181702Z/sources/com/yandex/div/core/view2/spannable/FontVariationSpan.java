package com.yandex.div.core.view2.spannable;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import k.t0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@t0(26)
public final class FontVariationSpan extends MetricAffectingSpan {

    @m
    private final String settings;

    public FontVariationSpan(@m String str) {
        this.settings = str;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@l TextPaint textPaint) {
        textPaint.setFontVariationSettings(this.settings);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@l TextPaint textPaint) {
        textPaint.setFontVariationSettings(this.settings);
    }
}
