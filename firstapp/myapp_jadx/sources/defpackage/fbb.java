package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class fbb implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        switch (this.a) {
            case 0:
                ((String) obj).getClass();
                return Unit.a;
            default:
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("DELETE FROM sporty_bet_table WHERE by_user = 1");
                try {
                    hq60VarH1.D1();
                    return Unit.a;
                } finally {
                    hq60VarH1.close();
                }
        }
    }
}
