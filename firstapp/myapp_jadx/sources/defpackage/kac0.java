package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.BetBuilderConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legends.handler.SportyLegendsBetBuilderHandlerImpl$init$1", f = "SportyLegendsBetBuilderHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class kac0 extends tje0 implements Function2<BetBuilderConfig, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ gac0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kac0(gac0 gac0Var, v1b<? super kac0> v1bVar) {
        super(2, v1bVar);
        this.b = gac0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        kac0 kac0Var = new kac0(this.b, v1bVar);
        kac0Var.a = obj;
        return kac0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BetBuilderConfig betBuilderConfig, v1b<? super Unit> v1bVar) {
        return ((kac0) create(betBuilderConfig, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BetBuilderConfig betBuilderConfig = (BetBuilderConfig) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.l = betBuilderConfig;
        return Unit.a;
    }
}
