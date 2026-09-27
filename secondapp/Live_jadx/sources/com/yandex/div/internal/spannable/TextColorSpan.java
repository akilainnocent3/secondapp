package com.yandex.div.internal.spannable;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class TextColorSpan extends ForegroundColorSpan {
    public TextColorSpan(int i10) {
        super(i10);
    }

    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
    public void updateDrawState(@l TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setShader(null);
    }
}
