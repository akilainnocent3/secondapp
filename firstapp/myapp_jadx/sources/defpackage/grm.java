package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes5.dex */
public final class grm {
    public static final BigDecimal h = new BigDecimal("10");
    public static final BigDecimal i = new BigDecimal("50");
    public static final BigDecimal j = new BigDecimal("100");
    public final yqm a;
    public final nzm b;
    public final psm c;
    public jvd0 d;
    public jvd0 e;
    public final j1b f;
    public volatile hrm g;

    public grm(yqm yqmVar, nzm nzmVar, psm psmVar) {
        yqmVar.getClass();
        nzmVar.getClass();
        psmVar.getClass();
        this.a = yqmVar;
        this.b = nzmVar;
        this.c = psmVar;
        pfd pfdVar = fse.a;
        this.f = w5b.a(odd.b.plus(lfe0.a()));
        this.g = hrm.VARIANT_1;
    }

    public final BigDecimal a() {
        int iOrdinal = this.g.ordinal();
        if (iOrdinal == 0) {
            String strJ = this.b.j();
            return (strJ == null || strJ.length() == 0) ? h : new BigDecimal(strJ);
        }
        if (iOrdinal == 1) {
            return i;
        }
        if (iOrdinal == 2) {
            return j;
        }
        uhc.a();
        return null;
    }
}
