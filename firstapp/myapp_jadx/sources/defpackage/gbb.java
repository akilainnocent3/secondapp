package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gbb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gbb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ((fgb) obj2).N0(str);
                return Unit.a;
            case 1:
                String str2 = (String) obj2;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("SELECT response_json_string FROM sporty_bet_table WHERE end_point = ? AND extra_identifier = ?");
                try {
                    hq60VarH1.L(1, "promotion/v1/gifts+promotion/luckyWheel/allTicketInfo");
                    hq60VarH1.L(2, str2);
                    String strK1 = null;
                    if (hq60VarH1.D1() && !hq60VarH1.isNull(0)) {
                        strK1 = hq60VarH1.k1(0);
                        break;
                    }
                    return strK1;
                } finally {
                    hq60VarH1.close();
                }
            default:
                ku90<spg0> ku90Var = ((dnj0) obj2).v;
                int i2 = vpg0.a;
                ku90Var.getClass();
                ku90Var.a(spg0.c.a);
                return Unit.a;
        }
    }
}
