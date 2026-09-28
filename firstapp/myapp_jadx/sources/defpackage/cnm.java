package defpackage;

import android.text.Html;
import android.text.Spanned;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.text.Regex;
import kotlin.text.c;

/* JADX INFO: loaded from: classes6.dex */
public final class cnm {
    public static Spanned a(int i, int i2, String str) {
        if ((i2 & 1) != 0) {
            i = 63;
        }
        List listK = b.k("b", "strong", "i", "em", "u", "a", "br", "p", "ul", "ol", "li");
        str.getClass();
        listK.getClass();
        Spanned spannedFromHtml = Html.fromHtml(c.p(new Regex(tug.a("<(?!/?(?:", CollectionsKt.a0(listK, "|", null, null, new bnm(), 30), ")\\b)"), ns40.IGNORE_CASE).replace(str, "&lt;"), "\n", "<br>", false), i);
        spannedFromHtml.getClass();
        return spannedFromHtml;
    }
}
