package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class vo6 implements InputFilter {
    public final Pattern a = Pattern.compile("([0-9]|\\.)*");

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        String string = charSequence.toString();
        String string2 = spanned.toString();
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        Matcher matcher = this.a.matcher(charSequence);
        if (string2.contains(".")) {
            if (!matcher.matches() || ".".equals(string)) {
                return "";
            }
            if (i4 - string2.indexOf(".") > 2) {
                return spanned.subSequence(i3, i4);
            }
        } else {
            if (!matcher.matches()) {
                return "";
            }
            if ((".".equals(string) || "0".equals(string)) && TextUtils.isEmpty(string2)) {
                return "";
            }
        }
        if (Double.parseDouble(string2 + string) > 2.147483647E9d) {
            return spanned.subSequence(i3, i4);
        }
        return ((Object) spanned.subSequence(i3, i4)) + string;
    }
}
