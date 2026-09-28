package defpackage;

import com.sportybet.android.globalpay.data.FullSummaryData;
import com.sportybet.android.globalpay.data.KycLimitData;

/* JADX INFO: loaded from: classes5.dex */
public final class l8k {
    public final psm a;

    public l8k(psm psmVar) {
        psmVar.getClass();
        this.a = psmVar;
    }

    public final double a(KycLimitData kycLimitData, FullSummaryData fullSummaryData, String str, String str2, ga00 ga00Var) {
        str.getClass();
        str2.getClass();
        ga00Var.getClass();
        double d = 0.0d;
        if (!this.a.O()) {
            z600 z600VarA = z600.a();
            z600VarA.getClass();
            int iOrdinal = ga00Var.ordinal();
            if (iOrdinal == 0) {
                d = z600VarA.c.b;
            } else {
                if (iOrdinal != 1) {
                    uhc.a();
                    return 0.0d;
                }
                d = z600VarA.c.d;
            }
        }
        return o1l.b(kycLimitData, fullSummaryData, str, str2, d, ga00Var.a);
    }
}
