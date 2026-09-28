package defpackage;

import java.util.Locale;
import kotlin.text.c;

/* JADX INFO: loaded from: classes4.dex */
public final class pg80 {
    public final vwf0 a;
    public final xsh0 b;

    public pg80(vwf0 vwf0Var, xsh0 xsh0Var) {
        vwf0Var.getClass();
        xsh0Var.getClass();
        this.a = vwf0Var;
        this.b = xsh0Var;
    }

    public final eg80 a(eg80 eg80Var) {
        String str;
        String string = this.b.next().toString();
        string.getClass();
        String lowerCase = c.p(string, "-", "", false).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return new eg80(lowerCase, (eg80Var == null || (str = eg80Var.b) == null) ? lowerCase : str, eg80Var != null ? eg80Var.c + 1 : 0, this.a.a().b);
    }
}
