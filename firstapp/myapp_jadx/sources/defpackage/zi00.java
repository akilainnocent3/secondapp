package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zi00 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zi00(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        hb40 hb40Var;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                kl00 kl00Var = (kl00) obj;
                kl00Var.getClass();
                ((Function2) obj2).invoke(kl00Var, Boolean.FALSE);
                return Unit.a;
            default:
                String str = (String) obj2;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("SELECT * FROM realtime_cms WHERE isPageUpdating = 0 AND apiPageName = ? ORDER BY version DESC LIMIT 1");
                try {
                    hq60VarH1.L(1, str);
                    int iB = l0b.b(hq60VarH1, "apiPageName");
                    int iB2 = l0b.b(hq60VarH1, "stringKey");
                    int iB3 = l0b.b(hq60VarH1, "language");
                    int iB4 = l0b.b(hq60VarH1, "value");
                    int iB5 = l0b.b(hq60VarH1, "version");
                    int iB6 = l0b.b(hq60VarH1, "isPageUpdating");
                    if (hq60VarH1.D1()) {
                        hb40Var = new hb40(hq60VarH1.k1(iB), hq60VarH1.k1(iB2), hq60VarH1.k1(iB3), hq60VarH1.k1(iB4), hq60VarH1.getLong(iB5), ((int) hq60VarH1.getLong(iB6)) != 0);
                        break;
                    } else {
                        hb40Var = null;
                    }
                    return hb40Var;
                } finally {
                    hq60VarH1.close();
                }
        }
    }
}
