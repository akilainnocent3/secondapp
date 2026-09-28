package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.penaltysettlement.viewmodel.SportyPenaltySettlementViewModel$7", f = "SportyPenaltySettlementViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class y3d0 extends tje0 implements Function2<r2d0, v1b<? super Unit>, Object> {
    public final /* synthetic */ d4d0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3d0(d4d0 d4d0Var, v1b<? super y3d0> v1bVar) {
        super(2, v1bVar);
        this.a = d4d0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new y3d0(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(r2d0 r2d0Var, v1b<? super Unit> v1bVar) {
        return ((y3d0) create(r2d0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        d4d0 d4d0Var = this.a;
        d4d0Var.e.a(new a5o.h0(d4d0Var.x1()), k00.d);
        return Unit.a;
    }
}
