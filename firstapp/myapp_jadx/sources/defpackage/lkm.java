package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.horseracing.presentation.HorseRacingViewModel$onUserLoggedIn$1", f = "HorseRacingViewModel.kt", l = {89}, m = "invokeSuspend", v = 2)
public final class lkm extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ fkm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lkm(fkm fkmVar, v1b<? super lkm> v1bVar) {
        super(2, v1bVar);
        this.b = fkmVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new lkm(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((lkm) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        fkm fkmVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            mgb0 mgb0Var = fkmVar.d;
            this.a = 1;
            obj = mgb0Var.getUserId(this);
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
        kzh.d(new g1i(fkmVar.a.h(pu0.b.a), new mkm(fkmVar, (String) obj, null)), o8i0.d(fkmVar));
        return Unit.a;
    }
}
