package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class l4d implements InputFilter {
    public Pattern a;

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        Matcher matcher = this.a.matcher(spanned);
        int iIndexOf = spanned.toString().indexOf(".");
        int i5 = i4 - iIndexOf;
        if (matcher.matches()) {
            if (spanned.toString().contains(".") && charSequence.toString().contains(".")) {
                return "";
            }
            if (charSequence.toString().matches("-?\\d+(\\.\\d+)?") || charSequence.toString().contains(".")) {
                return null;
            }
            return "";
        }
        if (spanned.toString().contains(".")) {
            if ((spanned.toString().substring(spanned.toString().indexOf(".")).length() > 2 && spanned.toString().substring(0, spanned.toString().indexOf(".")).length() > 6) || charSequence.toString().contains(".") || !charSequence.toString().matches("-?\\d+(\\.\\d+)?")) {
                return "";
            }
            if (i5 <= 2 || iIndexOf <= 0) {
                return null;
            }
            return "";
        }
        if (Pattern.compile("[0-9]{0,5}").matcher(spanned).matches()) {
            return null;
        }
        if (spanned.toString().contains(".") || !charSequence.toString().equalsIgnoreCase(".")) {
            return "";
        }
        return null;
    }
}
