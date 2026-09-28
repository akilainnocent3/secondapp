package defpackage;

import android.view.inputmethod.ExtractedText;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class lmn {
    public static final ExtractedText a(ijf0 ijf0Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = ijf0Var.a.b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = ijf0Var.b;
        extractedText.selectionStart = ulf0.f(j);
        extractedText.selectionEnd = ulf0.e(j);
        extractedText.flags = !StringsKt.N(ijf0Var.a.b, '\n') ? 1 : 0;
        return extractedText;
    }
}
