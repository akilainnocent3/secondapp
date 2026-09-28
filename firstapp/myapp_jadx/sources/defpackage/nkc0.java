package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legendsrace.handler.SportyLegendsSettlementAnimationModeStateHandlerImpl$initialAnimationModeStateHandler$4", f = "SportyLegendsSettlementAnimationModeStateHandlerImpl.kt", l = {75}, m = "invokeSuspend", v = 2)
public final class nkc0 extends tje0 implements Function2<sk3, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ jkc0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nkc0(jkc0 jkc0Var, v1b<? super nkc0> v1bVar) {
        super(2, v1bVar);
        this.c = jkc0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        nkc0 nkc0Var = new nkc0(this.c, v1bVar);
        nkc0Var.b = obj;
        return nkc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(sk3 sk3Var, v1b<? super Unit> v1bVar) {
        return ((nkc0) create(sk3Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        sk3 sk3Var = (sk3) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wm20<sk3> wm20Var = this.c.d;
            this.b = null;
            this.a = 1;
            if (wm20Var.g(this, sk3Var) == y5bVar) {
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
