package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xa6 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        vp60 vp60Var = (vp60) obj;
        vp60Var.getClass();
        hq60 hq60VarH1 = vp60Var.H1("DELETE FROM an_test_campaign_variant");
        try {
            hq60VarH1.D1();
            return Unit.a;
        } finally {
            hq60VarH1.close();
        }
    }
}
