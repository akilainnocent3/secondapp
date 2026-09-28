package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import com.sportybet.android.user.ChangeUserInfoActivity;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a67 implements InputFilter {
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int i5 = ChangeUserInfoActivity.L;
        StringBuilder sb = new StringBuilder();
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            if (!Character.isWhitespace(cCharAt)) {
                sb.append(cCharAt);
            }
            i++;
        }
        return sb.toString();
    }
}
