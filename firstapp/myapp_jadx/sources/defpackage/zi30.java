package defpackage;

import com.sportybet.plugin.realsports.quickmarket.data.MarketGroupData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.quickmarket.QuickMarketViewModel$getQuickMarketData$3", f = "QuickMarketViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class zi30 extends tje0 implements Function2<myh<? super lk50<? extends List<? extends MarketGroupData>>>, v1b<? super Unit>, Object> {
    public final /* synthetic */ cj30 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi30(cj30 cj30Var, v1b<? super zi30> v1bVar) {
        super(2, v1bVar);
        this.a = cj30Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new zi30(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super lk50<? extends List<? extends MarketGroupData>>> myhVar, v1b<? super Unit> v1bVar) {
        return ((zi30) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.b.m(lk50.b.a);
        return Unit.a;
    }
}
