package com.yandex.div.internal.spannable;

import android.text.TextPaint;
import android.text.style.UnderlineSpan;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class NoUnderlineSpan extends UnderlineSpan {
    @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
    public void updateDrawState(@l TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
