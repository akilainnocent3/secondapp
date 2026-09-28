package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class iq50 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iq50(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        Object value;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                wo50.b bVar = (wo50.b) obj;
                bVar.getClass();
                wwd0 wwd0Var = ((nq50) obj2).f;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, sq50.a((sq50) value, null, null, null, null, bVar, null, 95)));
                return Unit.a;
            default:
                String str = (String) obj2;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("DELETE FROM social_following_table WHERE account = ?");
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
