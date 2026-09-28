package defpackage;

import com.sportybet.plugin.realsports.data.OrderWithFailUpdate;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$getCashOutInfoAndPlaceEditBet$5", f = "BetSlipViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g73 extends tje0 implements Function2<lk50<? extends OrderWithFailUpdate>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ q73 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g73(q73 q73Var, v1b<? super g73> v1bVar) {
        super(2, v1bVar);
        this.b = q73Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        g73 g73Var = new g73(this.b, v1bVar);
        g73Var.a = obj;
        return g73Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends OrderWithFailUpdate> lk50Var, v1b<? super Unit> v1bVar) {
        return ((g73) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50<OrderWithFailUpdate> lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        q73 q73Var = this.b;
        q73Var.J0.m(lk50Var);
        if (lk50Var instanceof lk50.c) {
            q73Var.v.g();
        }
        if (!Intrinsics.g(lk50Var, lk50.b.a)) {
            q73Var.E.j();
        }
        return Unit.a;
    }
}
