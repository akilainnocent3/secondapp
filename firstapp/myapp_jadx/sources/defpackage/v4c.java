package defpackage;

import java.util.regex.Pattern;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class v4c implements xsm {
    public static final v4c a = new v4c();
    public static final mpe0 b = hwr.b(new kd3(1));

    public static psm j() {
        return (psm) b.getValue();
    }

    public static String k(String str) {
        return inm.a(yk10.a(j().f(), " "), str);
    }

    @Override // defpackage.xsm
    public final char a() {
        return j().U();
    }

    @Override // defpackage.xsm
    public final String b(String str, boolean z) {
        str.getClass();
        String strP = bjb0.P(str, j().D());
        if (z) {
            strP = a.l(strP);
        }
        strP.getClass();
        return strP;
    }

    @Override // defpackage.xsm
    public final double c(String str) {
        boolean zF;
        str.getClass();
        char cA = a();
        if (cA != '.') {
            if (StringsKt.U(str) || str.equals(String.valueOf(cA))) {
                zF = false;
            } else {
                Regex.Companion companion = Regex.INSTANCE;
                String strValueOf = String.valueOf(cA);
                companion.getClass();
                strValueOf.getClass();
                String strQuote = Pattern.quote(strValueOf);
                strQuote.getClass();
                zF = new Regex(tug.a("^\\d*", strQuote, "?\\d*$")).f(StringsKt.t0(str).toString());
            }
            if (zF) {
                str = str.replace(cA, '.');
                str.getClass();
            }
        }
        return Double.parseDouble(str);
    }

    @Override // defpackage.xsm
    public final String d(String str, boolean z) {
        str.getClass();
        String strK = k(bjb0.P(str, j().D()));
        return z ? a.l(strK) : strK;
    }

    @Override // defpackage.xsm
    public final String e(double d) {
        return bjb0.a0(d, j().D());
    }

    @Override // defpackage.xsm
    public final String f() {
        return j().f();
    }

    @Override // defpackage.xsm
    public final String g(long j) {
        return bjb0.U(j, j().D());
    }

    @Override // defpackage.xsm
    public final String h(long j) {
        return k(g(j));
    }

    @Override // defpackage.xsm
    public final String i(double d, boolean z) {
        String strA0 = bjb0.a0(d, j().D());
        if (z) {
            strA0 = a.l(strA0);
        }
        return k(strA0);
    }

    public final String l(String str) {
        Regex.Companion companion = Regex.INSTANCE;
        String strValueOf = String.valueOf(a());
        companion.getClass();
        strValueOf.getClass();
        String strQuote = Pattern.quote(strValueOf);
        strQuote.getClass();
        return new Regex(tug.a("(", strQuote, ")0{1,2}$")).replace(str, "");
    }
}
