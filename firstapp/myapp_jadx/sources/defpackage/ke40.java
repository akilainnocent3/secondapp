package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.recap.data.repository.RecapRepositoryImpl$setRecapNewBadgeDismissed$2", f = "RecapRepositoryImpl.kt", l = {43}, m = "invokeSuspend", v = 2)
public final class ke40 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ me40 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke40(me40 me40Var, v1b v1bVar) {
        super(2, v1bVar);
        this.b = me40Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ke40(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ke40) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ld40 ld40Var = this.b.b;
            wm20 wm20VarA = ld40Var.c.a(ld40Var, ld40.d[1]);
            Boolean bool = Boolean.TRUE;
            this.a = 1;
            if (wm20VarA.g(this, bool) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
