package defpackage;

import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes.dex */
public final class gu5 {
    public static final jsc a(String str) {
        String strC0 = StringsKt.c0(c.p(fu5.a("y{1,4}", fu5.a("M{1,2}", fu5.a("d{1,2}", fu5.a("[^dMy/\\-.]", str, ""), "dd"), "MM"), "yyyy"), "My", "M/y", false), ".");
        n8v n8vVarB = new Regex("[/\\-.]").b(strC0);
        n8vVarB.getClass();
        MatchGroup matchGroupC = n8vVarB.c.c(0);
        matchGroupC.getClass();
        return new jsc(matchGroupC.a.charAt(0), strC0);
    }
}
