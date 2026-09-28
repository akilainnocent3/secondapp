package defpackage;

import android.content.Context;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes6.dex */
public final class gky {
    public static eky a = new o4d();
    public static final BigDecimal b = new BigDecimal(2);
    public static final BigDecimal c = new BigDecimal(100);

    public static final String a(String str) {
        str.getClass();
        return a.a(str, false);
    }

    public static final ljy b(Context context) {
        context.getClass();
        eky ekyVar = a;
        if (ekyVar instanceof o4d) {
            return ljy.DECIMAL;
        }
        return ekyVar instanceof lw ? ljy.US : ljy.DECIMAL;
    }

    public static final boolean c(Context context) {
        context.getClass();
        return b(context) == ljy.US;
    }

    public static final void d(Context context, ljy ljyVar) {
        eky o4dVar;
        context.getClass();
        ljyVar.getClass();
        String strName = ljyVar.name();
        m2l m2lVar = new m2l(context);
        if (strName == null) {
            strName = "";
        }
        qnp qnpVar = new qnp();
        zu7.a aVar = zu7.a;
        v5b v5bVarA = zu7.a();
        v5bVarA.getClass();
        m2lVar.a.h("ODDS_FORMAT", strName, qnpVar, v5bVarA);
        ljy.a aVar2 = ljy.c;
        String strName2 = ljyVar.name();
        aVar2.getClass();
        int iOrdinal = ljy.a.a(strName2).ordinal();
        if (iOrdinal == 0) {
            o4dVar = new o4d();
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return;
            }
            o4dVar = new lw();
        }
        a = o4dVar;
    }
}
