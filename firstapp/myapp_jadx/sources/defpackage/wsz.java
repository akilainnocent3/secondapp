package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class wsz implements InputFilter {
    public final int a;

    public wsz(int i) {
        this.a = i;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        String string = new StringBuilder(spanned).replace(i3, i4, String.valueOf(charSequence != null ? charSequence.subSequence(i, i2) : null)).toString();
        StringBuilder sb = new StringBuilder();
        int length = string.length();
        for (int i5 = 0; i5 < length; i5++) {
            char cCharAt = string.charAt(i5);
            if (Character.isDigit(cCharAt) || cCharAt == '.') {
                sb.append(cCharAt);
            }
        }
        List listSplit$default = StringsKt__StringsKt.split$default(sb.toString(), new String[]{"."}, false, 0, 6, null);
        String str = (String) CollectionsKt.V(0, listSplit$default);
        if (str == null) {
            str = "";
        }
        String str2 = (String) CollectionsKt.V(1, listSplit$default);
        if (str2 == null) {
            str2 = "";
        }
        if (str.length() <= this.a && (listSplit$default.size() <= 1 || str2.length() <= 2)) {
            return null;
        }
        return "";
    }
}
