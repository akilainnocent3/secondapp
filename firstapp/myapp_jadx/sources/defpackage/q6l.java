package defpackage;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class q6l extends kni0 {
    public final CharSequence b;
    public final TextPaint c;

    public q6l(CharSequence charSequence, TextPaint textPaint) {
        this.b = charSequence;
        this.c = textPaint;
    }

    @Override // defpackage.kni0
    public final int n(int i) {
        CharSequence charSequence = this.b;
        return this.c.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // defpackage.kni0
    public final int o(int i) {
        CharSequence charSequence = this.b;
        return this.c.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
