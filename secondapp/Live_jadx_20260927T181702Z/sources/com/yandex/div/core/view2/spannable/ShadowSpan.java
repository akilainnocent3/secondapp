package com.yandex.div.core.view2.spannable;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ShadowSpan extends CharacterStyle {

    @l
    private final ShadowData shadow;

    public ShadowSpan(@l ShadowData shadowData) {
        this.shadow = shadowData;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@m TextPaint textPaint) {
        ShadowData shadowData = this.shadow;
        if (textPaint != null) {
            textPaint.setShadowLayer(shadowData.getRadius(), shadowData.getOffsetX(), shadowData.getOffsetY(), shadowData.getColor());
        }
    }
}
