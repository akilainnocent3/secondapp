package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class mw implements InputFilter {
    public final Pattern a;
    public final String b;

    public mw() {
        String strValueOf = String.valueOf(v4c.a.a());
        this.b = strValueOf;
        Pattern patternCompile = Pattern.compile("^(0|[1-9][0-9]{0,12})(" + Pattern.quote(strValueOf) + "[0-9]{0,2})?$");
        patternCompile.getClass();
        this.a = patternCompile;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        charSequence.getClass();
        spanned.getClass();
        if (StringsKt.U(spanned)) {
            String string = charSequence.toString();
            String str = this.b;
            if (Intrinsics.g(string, str)) {
                return inm.a("0", str);
            }
        }
        if (this.a.matcher(oxc.a(spanned.subSequence(0, i3).toString(), charSequence.subSequence(i, i2).toString(), spanned.subSequence(i4, spanned.length()).toString())).matches()) {
            return null;
        }
        return "";
    }
}
