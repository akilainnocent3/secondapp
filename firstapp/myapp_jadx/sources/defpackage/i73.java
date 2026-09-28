package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$getSportySimConfig$1", f = "BetSlipViewModel.kt", l = {494}, m = "invokeSuspend", v = 2)
public final class i73 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ q73 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i73(q73 q73Var, v1b<? super i73> v1bVar) {
        super(2, v1bVar);
        this.b = q73Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new i73(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((i73) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objA;
        y5b y5bVar = y5b.a;
        int i = this.a;
        q73 q73Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            hek hekVar = q73Var.l0;
            this.a = 1;
            objA = hekVar.a(this);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objA = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (!(objA instanceof zi50.b)) {
            q73Var.s1.j(Unit.a);
        }
        Throwable thA = zi50.a(objA);
        if (thA != null) {
            itf0.a.f(thA, "Failed to fetch simulation config", new Object[0]);
        }
        return Unit.a;
    }
}
