package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.penaltysettlement.viewmodel.SportyPenaltySettlementViewModel$4", f = "SportyPenaltySettlementViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class w3d0 extends tje0 implements Function2<u3d0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ d4d0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3d0(d4d0 d4d0Var, v1b<? super w3d0> v1bVar) {
        super(2, v1bVar);
        this.b = d4d0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        w3d0 w3d0Var = new w3d0(this.b, v1bVar);
        w3d0Var.a = obj;
        return w3d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(u3d0 u3d0Var, v1b<? super Unit> v1bVar) {
        return ((w3d0) create(u3d0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        u3d0 u3d0Var = (u3d0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.y.setValue(u3d0Var);
        return Unit.a;
    }
}
