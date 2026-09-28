package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.presentation.MeViewModel$onDailyStreakClick$1", f = "MeViewModel.kt", l = {739}, m = "invokeSuspend", v = 2)
public final class dhv extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ rhv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhv(rhv rhvVar, v1b<? super dhv> v1bVar) {
        super(2, v1bVar);
        this.b = rhvVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new dhv(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((dhv) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        rhv rhvVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            vl50 vl50VarF = bm50.f(rhvVar.z.a());
            this.a = 1;
            obj = s0i.c(vl50VarF, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        h44 h44Var = (h44) obj;
        if (h44Var != null) {
            rhvVar.B.a(new fgv(h44Var.c), k00.d);
        }
        lfv lfvVar = rhvVar.d;
        Boolean boolValueOf = h44Var != null ? Boolean.valueOf(h44Var.e) : null;
        lfvVar.getClass();
        rhvVar.M.a(new iev.g(boolValueOf));
        return Unit.a;
    }
}
