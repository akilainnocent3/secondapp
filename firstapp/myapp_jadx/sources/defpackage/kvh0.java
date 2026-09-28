package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kvh0 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        vp60 vp60Var = (vp60) obj;
        vp60Var.getClass();
        hq60 hq60VarH1 = vp60Var.H1("SELECT * FROM an_test_variant_override");
        try {
            int iB = l0b.b(hq60VarH1, "campaign_code");
            int iB2 = l0b.b(hq60VarH1, "variant_value");
            ArrayList arrayList = new ArrayList();
            while (hq60VarH1.D1()) {
                arrayList.add(new mvh0(hq60VarH1.k1(iB), hq60VarH1.k1(iB2)));
            }
            hq60VarH1.close();
            return arrayList;
        } catch (Throwable th) {
            hq60VarH1.close();
            throw th;
        }
    }
}
