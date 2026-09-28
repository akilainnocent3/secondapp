package defpackage;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: loaded from: classes.dex */
public final class ype implements InputFilter {
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        charSequence.getClass();
        spanned.getClass();
        StringBuilder sb = new StringBuilder();
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
            i++;
        }
        return sb.toString();
    }
}
