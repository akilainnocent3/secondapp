package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class m4d implements InputFilter {
    public final Pattern a;
    public final int b;

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
        boolean zContains = spanned.toString().contains(".");
        int i6 = this.b;
        if (zContains) {
            if ((spanned.toString().substring(spanned.toString().indexOf(".")).length() <= 2 || spanned.toString().substring(0, spanned.toString().indexOf(".")).length() <= i6) && !charSequence.toString().contains(".") && charSequence.toString().matches("-?\\d+(\\.\\d+)?") && (i5 <= 2 || iIndexOf <= 0)) {
                return null;
            }
            return "";
        }
        StringBuilder sb = new StringBuilder("[0-9]{0,");
        sb.append(i6 - 1);
        sb.append("}");
        if (Pattern.compile(sb.toString()).matcher(spanned).matches()) {
            return null;
        }
        if (spanned.toString().contains(".") || !charSequence.toString().equalsIgnoreCase(".")) {
            return "";
        }
        return null;
    }

    public m4d(int i) {
        this.b = i;
        this.a = Pattern.compile("[0-9]{0," + (i - 1) + "}+((\\.[0-9]{0,1" + LGxrN.uNMTLbO);
    }
}
