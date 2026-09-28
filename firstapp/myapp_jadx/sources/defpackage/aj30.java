package defpackage;

import com.sportybet.plugin.realsports.quickmarket.data.MarketGroupData;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.quickmarket.QuickMarketViewModel$getQuickMarketData$4", f = "QuickMarketViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class aj30 extends tje0 implements gaj<myh<? super lk50<? extends List<? extends MarketGroupData>>>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ cj30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj30(cj30 cj30Var, v1b<? super aj30> v1bVar) {
        super(3, v1bVar);
        this.b = cj30Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super lk50<? extends List<? extends MarketGroupData>>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        aj30 aj30Var = new aj30(this.b, v1bVar);
        aj30Var.a = th;
        return aj30Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.b.m(new lk50.a(th));
        return Unit.a;
    }
}
