package defpackage;

import com.sportygames.vip.data.LastHeroStandingWinnerSocketResponse;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class qx7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qx7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((yx7) obj2).b.invoke(bool);
                break;
            default:
                qub0 qub0Var = (qub0) obj2;
                String str = (String) obj;
                if (str != null && str.length() != 0) {
                    try {
                        LastHeroStandingWinnerSocketResponse lastHeroStandingWinnerSocketResponse = (LastHeroStandingWinnerSocketResponse) new eal().e(str, LastHeroStandingWinnerSocketResponse.class);
                        if (lastHeroStandingWinnerSocketResponse != null) {
                            qub0Var.t0();
                            op5 op5Var = op5.a;
                            String str2 = qub0Var.y0;
                            if (str2 == null) {
                                str2 = "";
                            }
                            op5Var.getClass();
                            String strI = op5.i(str2);
                            String strB = op5.b("lhs_gift:sg_vip", "You have won a free bet gift", null);
                            TreeMap treeMap = pw.a;
                            qub0Var.b3(strB, "winner", strI + " " + pw.c(pw.n(lastHeroStandingWinnerSocketResponse.getGiftAmount())));
                        }
                        break;
                    } catch (Exception unused) {
                    }
                }
                break;
        }
        return Unit.a;
    }
}
