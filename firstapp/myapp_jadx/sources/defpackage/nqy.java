package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public final class nqy implements InputFilter {
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (spanned.toString().contains(".") && TextUtils.equals(".", charSequence.toString())) {
            return "";
        }
        return null;
    }
}
