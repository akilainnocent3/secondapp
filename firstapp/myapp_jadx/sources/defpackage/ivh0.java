package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ivh0 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        vp60 vp60Var = (vp60) obj;
        vp60Var.getClass();
        hq60 hq60VarH1 = vp60Var.H1("SELECT enabled FROM an_test_override_setting LIMIT 1");
        try {
            Boolean boolValueOf = null;
            if (hq60VarH1.D1()) {
                Integer numValueOf = hq60VarH1.isNull(0) ? null : Integer.valueOf((int) hq60VarH1.getLong(0));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
            }
            return boolValueOf;
        } finally {
            hq60VarH1.close();
        }
    }
}
