package defpackage;

import android.text.Html;
import android.text.Spanned;

/* JADX INFO: loaded from: classes5.dex */
public final class nae0 {
    @fae
    public static final Spanned a(String str) {
        str.getClass();
        Spanned spannedFromHtml = Html.fromHtml(str, 0);
        spannedFromHtml.getClass();
        return spannedFromHtml;
    }

    public static final String b(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }
}
