package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.codehub.ui.PopularCodeFragment$initObservers$5$1", f = "PopularCodeFragment.kt", l = {282}, m = "invokeSuspend", v = 2)
public final class u320 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ r320 b;
    public final /* synthetic */ jox<zha0> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u320(r320 r320Var, jox<zha0> joxVar, v1b<? super u320> v1bVar) {
        super(2, v1bVar);
        this.b = r320Var;
        this.c = joxVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new u320(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((u320) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            r320 r320Var = this.b;
            lz1 lz1Var = r320Var.O;
            mg6 mg6Var = r320Var.P;
            zha0 zha0Var = (zha0) ((jox.a) this.c).a;
            this.a = 1;
            if (r320Var.v0(lz1Var, mg6Var, zha0Var, this) == y5bVar) {
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
