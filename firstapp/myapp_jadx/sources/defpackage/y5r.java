package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class y5r implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y5r(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                ((b6r) obj3).b.m(vp60Var, (e6r) obj2);
                return Unit.a;
            default:
                String str = (String) obj3;
                String str2 = (String) obj2;
                vp60 vp60Var2 = (vp60) obj;
                vp60Var2.getClass();
                hq60 hq60VarH1 = vp60Var2.H1("UPDATE real_bet_history_order_table SET user_note = ? WHERE order_id = ?");
                try {
                    hq60VarH1.L(1, str);
                    hq60VarH1.L(2, str2);
                    hq60VarH1.D1();
                    return Unit.a;
                } finally {
                    hq60VarH1.close();
                }
        }
    }
}
