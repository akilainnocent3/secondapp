package defpackage;

import com.sportybet.plugin.realsports.quickmarket.data.MarketGroupData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.quickmarket.QuickMarketViewModel$getQuickMarketData$2", f = "QuickMarketViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class yi30 extends tje0 implements Function2<lk50<? extends List<? extends MarketGroupData>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ cj30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi30(cj30 cj30Var, v1b<? super yi30> v1bVar) {
        super(2, v1bVar);
        this.b = cj30Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        yi30 yi30Var = new yi30(this.b, v1bVar);
        yi30Var.a = obj;
        return yi30Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends List<? extends MarketGroupData>> lk50Var, v1b<? super Unit> v1bVar) {
        return ((yi30) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50<List<MarketGroupData>> lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.b.m(lk50Var);
        return Unit.a;
    }
}
