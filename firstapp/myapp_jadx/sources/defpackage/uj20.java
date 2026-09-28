package defpackage;

import com.sportybet.plugin.realsports.prematch.data.PreMatchWrappedData;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class uj20 implements Function1 {
    public final /* synthetic */ jk20 a;
    public final /* synthetic */ RegularMarketRule b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;

    public /* synthetic */ uj20(jk20 jk20Var, RegularMarketRule regularMarketRule, boolean z, String str) {
        this.a = jk20Var;
        this.b = regularMarketRule;
        this.c = z;
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        lk50<PreMatchWrappedData> lk50Var = (lk50) obj;
        lk50Var.getClass();
        jk20 jk20Var = this.a;
        RegularMarketRule regularMarketRule = jk20Var.f;
        if (!Intrinsics.g(regularMarketRule != null ? regularMarketRule.a : null, this.b.a)) {
            return Unit.a;
        }
        wwd0 wwd0Var = jk20Var.H;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, this.c ? jk20Var.E1(lk50Var, this.d) : jk20Var.F1(lk50Var, (lk50) value, true)));
        return Unit.a;
    }
}
