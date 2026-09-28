package defpackage;

import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class rrh0 implements InputFilter {
    /* JADX WARN: Code duplicated, block: B:7:0x002a  */
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        StringBuilder sb = new StringBuilder(i2 - i);
        int iIndexOf = spanned.toString().indexOf(".");
        int i5 = i4 - iIndexOf;
        boolean z = true;
        for (int i6 = i; i6 < i2; i6++) {
            char cCharAt = charSequence.charAt(i6);
            if (spanned.toString().contains(".") && cCharAt == '.') {
                z = false;
            } else {
                if (i5 > yrh0.b && iIndexOf > 0) {
                    return spanned.subSequence(i3, i4);
                }
                if (Character.isDigit(cCharAt) || cCharAt == '.') {
                    sb.append(cCharAt);
                } else {
                    z = false;
                }
            }
        }
        if (z) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return sb;
        }
        SpannableString spannableString = new SpannableString(sb);
        TextUtils.copySpansFrom((Spanned) charSequence, i, sb.length(), null, spannableString, 0);
        return spannableString;
    }
}
