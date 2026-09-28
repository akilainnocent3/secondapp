package com.sportybet.android.sportypin;

import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends ClickableSpan {
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        e.a aVar = this.a.d;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(Color.parseColor("#0d9737"));
    }
}
