package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class rmf0 extends ClickableSpan {
    public final /* synthetic */ Function0<Unit> a;
    public final /* synthetic */ int b;

    public rmf0(int i, Function0 function0) {
        this.a = function0;
        this.b = i;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        view.getClass();
        this.a.invoke();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        textPaint.setColor(this.b);
        textPaint.setUnderlineText(true);
        textPaint.clearShadowLayer();
    }
}
