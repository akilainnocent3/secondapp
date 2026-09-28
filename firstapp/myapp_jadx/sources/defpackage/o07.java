package defpackage;

import com.sportybet.plugin.realsports.prematch.data.PreMatchWrappedData;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o07 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o07(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                uf00 uf00Var = (uf00) obj3;
                szr szrVar = (szr) obj;
                szrVar.getClass();
                szrVar.d(uf00Var.size(), new l17.b(new e17(), uf00Var), new l17.c(uf00Var), new op8(802480018, new l17.d(uf00Var, (Function1) obj2), true));
                break;
            default:
                jk20 jk20Var = (jk20) obj3;
                RegularMarketRule regularMarketRule = (RegularMarketRule) obj2;
                lk50<PreMatchWrappedData> lk50Var = (lk50) obj;
                lk50Var.getClass();
                RegularMarketRule regularMarketRule2 = jk20Var.f;
                if (Intrinsics.g(regularMarketRule2 != null ? regularMarketRule2.a : null, regularMarketRule.a)) {
                    wwd0 wwd0Var = jk20Var.H;
                    do {
                        value = wwd0Var.getValue();
                    } while (!wwd0Var.g(value, jk20Var.F1(lk50Var, (lk50) value, false)));
                }
                break;
        }
        return Unit.a;
    }
}
