package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class uik implements InputFilter {
    public final Pattern a = Pattern.compile("^\\d{0,10}(\\.\\d{0,2})?$");

    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:71:0x0109  */
    /* JADX WARN: Code duplicated, block: B:73:0x010e  */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x010e, please report this as an issue */
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int iIndexOf;
        String strSubstring;
        int iIndexOf2;
        String string = charSequence.toString();
        String string2 = spanned.toString();
        if (!TextUtils.isEmpty(string)) {
            String strSubstring2 = string2.substring(0, i3) + string + string2.substring(i4);
            Matcher matcher = this.a.matcher(charSequence);
            if (string2.contains(".")) {
                if (matcher.matches() && !".".equals(string) && (iIndexOf2 = string2.indexOf(".")) != -1) {
                    int i5 = i4 - iIndexOf2;
                    int length = string2.substring(iIndexOf2).length() - 1;
                    if (length <= 2 && (length != 2 || (iIndexOf2 != i3 - 1 && iIndexOf2 != i3 - 2))) {
                        if (i5 > 2) {
                            return (i3 < 0 || i4 < 0 || i4 > spanned.length() || i3 > i4) ? "" : spanned.subSequence(i3, i4);
                        }
                        iIndexOf = strSubstring2.indexOf(".");
                        if (iIndexOf == -1) {
                            strSubstring = strSubstring2;
                        } else {
                            strSubstring = strSubstring2.substring(0, iIndexOf);
                        }
                        if (strSubstring.length() > 10 || i3 < 0 || i4 < 0 || i4 > spanned.length() || i3 > i4) {
                            return "";
                        }
                        if (!strSubstring2.isEmpty() && ".".equals(strSubstring2.substring(strSubstring2.length() - 1))) {
                            strSubstring2 = strSubstring2.substring(0, strSubstring2.length() - 1);
                        }
                        AccountHelperEntryPointImpl accountHelperEntryPointImpl = yrh0.a;
                        if (strSubstring2.matches("-?\\d+(\\.\\d+)?")) {
                            if (Double.parseDouble(strSubstring2) > 2.147483647E9d) {
                                return spanned.subSequence(i3, i4);
                            }
                            return ((Object) spanned.subSequence(i3, i4)) + string;
                        }
                    }
                }
            } else if (matcher.matches() && ((!".".equals(charSequence.toString()) || !TextUtils.isEmpty(string2)) && (".".equals(charSequence.toString()) || !"0".equals(string2)))) {
                iIndexOf = strSubstring2.indexOf(".");
                if (iIndexOf == -1) {
                    strSubstring = strSubstring2;
                } else {
                    strSubstring = strSubstring2.substring(0, iIndexOf);
                }
                if (strSubstring.length() > 10) {
                    if (!strSubstring2.isEmpty()) {
                        strSubstring2 = strSubstring2.substring(0, strSubstring2.length() - 1);
                    }
                    AccountHelperEntryPointImpl accountHelperEntryPointImpl2 = yrh0.a;
                    if (strSubstring2.matches("-?\\d+(\\.\\d+)?")) {
                        if (Double.parseDouble(strSubstring2) > 2.147483647E9d) {
                            return spanned.subSequence(i3, i4);
                        }
                        return ((Object) spanned.subSequence(i3, i4)) + string;
                    }
                }
            }
        }
        return "";
    }
}
