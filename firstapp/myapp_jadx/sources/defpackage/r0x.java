package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class r0x extends InputFilter.AllCaps {
    @Override // android.text.InputFilter.AllCaps, android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        String lowerCase = String.valueOf(charSequence).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }
}
