package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class jdv implements InputFilter {
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        charSequence.getClass();
        spanned.getClass();
        String strA = oxc.a(spanned.subSequence(0, i3).toString(), charSequence.subSequence(i, i2).toString(), spanned.subSequence(i4, spanned.length()).toString());
        int iS = StringsKt.S(strA, '.', 0, 6);
        if (iS == -1) {
            return null;
        }
        int length = strA.length() - iS;
        if (length - 1 <= 2) {
            return null;
        }
        int i5 = (i2 - i) - (length - 3);
        return i5 <= 0 ? "" : charSequence.subSequence(i, i5 + i).toString();
    }
}
