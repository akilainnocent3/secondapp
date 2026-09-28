package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a6r implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        vp60 vp60Var = (vp60) obj;
        vp60Var.getClass();
        hq60 hq60VarH1 = vp60Var.H1("SELECT * FROM recent_search ORDER BY modifyTime DESC LIMIT 10");
        try {
            int iB = l0b.b(hq60VarH1, "name");
            int iB2 = l0b.b(hq60VarH1, "modifyTime");
            ArrayList arrayList = new ArrayList();
            while (hq60VarH1.D1()) {
                arrayList.add(new e6r(hq60VarH1.k1(iB), hq60VarH1.getLong(iB2)));
            }
            hq60VarH1.close();
            return arrayList;
        } catch (Throwable th) {
            hq60VarH1.close();
            throw th;
        }
    }
}
