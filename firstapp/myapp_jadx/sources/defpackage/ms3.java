package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ms3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ms3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.u(((lt3.c) obj2).c);
                return Unit.a;
            case 1:
                kl00 kl00Var = (kl00) obj;
                kl00Var.getClass();
                ((Function1) obj2).invoke(kl00Var);
                return Unit.a;
            default:
                String str = (String) obj2;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("UPDATE realtime_cms SET isPageUpdating = 0 WHERE apiPageName = ? AND isPageUpdating = 1");
                try {
                    hq60VarH1.L(1, str);
                    hq60VarH1.D1();
                    return Unit.a;
                } finally {
                    hq60VarH1.close();
                }
        }
    }
}
