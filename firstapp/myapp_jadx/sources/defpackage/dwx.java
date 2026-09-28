package defpackage;

import android.graphics.Canvas;
import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class dwx implements fg4 {
    public static void a(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    @Override // defpackage.fg4
    public boolean d(Canvas canvas) {
        return true;
    }

    @Override // defpackage.fg4
    public void destroy() {
    }

    @Override // defpackage.fg4
    public void f() {
    }

    @Override // defpackage.fg4
    public fg4 e(boolean z) {
        return this;
    }
}
