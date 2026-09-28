package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yi00 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yi00(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
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
                hq60 hq60VarH1 = vp60Var.H1("SELECT * FROM realtime_cms WHERE language = ?");
                try {
                    hq60VarH1.L(1, str);
                    int iB = l0b.b(hq60VarH1, "apiPageName");
                    int iB2 = l0b.b(hq60VarH1, "stringKey");
                    int iB3 = l0b.b(hq60VarH1, "language");
                    int iB4 = l0b.b(hq60VarH1, "value");
                    int iB5 = l0b.b(hq60VarH1, "version");
                    int iB6 = l0b.b(hq60VarH1, "isPageUpdating");
                    ArrayList arrayList = new ArrayList();
                    while (hq60VarH1.D1()) {
                        arrayList.add(new hb40(hq60VarH1.k1(iB), hq60VarH1.k1(iB2), hq60VarH1.k1(iB3), hq60VarH1.k1(iB4), hq60VarH1.getLong(iB5), ((int) hq60VarH1.getLong(iB6)) != 0));
                    }
                    hq60VarH1.close();
                    return arrayList;
                } catch (Throwable th) {
                    hq60VarH1.close();
                    throw th;
                }
        }
    }
}
