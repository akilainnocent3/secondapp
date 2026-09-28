package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.worldcuptournament.presentation.WorldCupPanelViewModel$onDiscoverMoreBookingCodesClick$1", f = "WorldCupPanelViewModel.kt", l = {591}, m = "invokeSuspend", v = 2)
public final class z0k0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ t0k0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0k0(t0k0 t0k0Var, v1b<? super z0k0> v1bVar) {
        super(2, v1bVar);
        this.b = t0k0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new z0k0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((z0k0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        t0k0 t0k0Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            b390 b390Var = t0k0Var.P;
            m0k0.a aVar = m0k0.a.a;
            this.a = 1;
            if (b390Var.emit(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        t0k0Var.z.a.a(new ksa0(0), k00.d);
        return Unit.a;
    }
}
