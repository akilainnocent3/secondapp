package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportygames.crashInitiated.view.SgCrashInitiatedChatComponentFragment$observeAutoBetLiveData$2$1", f = "SgCrashInitiatedChatComponentFragment.kt", l = {90}, m = "invokeSuspend", v = 1)
public final class un80 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ tn80 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un80(tn80 tn80Var, v1b<? super un80> v1bVar) {
        super(2, v1bVar);
        this.b = tn80Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new un80(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((un80) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(2000L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        v91.c.j(Boolean.TRUE);
        tn80 tn80Var = this.b;
        wn80 wn80Var = (wn80) tn80Var.b;
        if (wn80Var != null) {
            wn80Var.b.setVisibility(4);
        }
        wn80 wn80Var2 = (wn80) tn80Var.b;
        if (wn80Var2 != null) {
            wn80Var2.d.setVisibility(4);
        }
        return Unit.a;
    }
}
