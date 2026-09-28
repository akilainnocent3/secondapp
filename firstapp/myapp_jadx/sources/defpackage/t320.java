package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.codehub.ui.PopularCodeFragment$handleSuccessResult$1", f = "PopularCodeFragment.kt", l = {320}, m = "invokeSuspend", v = 2)
public final class t320 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ r320 b;
    public final /* synthetic */ lz1 c;
    public final /* synthetic */ mg6 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t320(r320 r320Var, lz1 lz1Var, mg6 mg6Var, v1b<? super t320> v1bVar) {
        super(2, v1bVar);
        this.b = r320Var;
        this.c = lz1Var;
        this.d = mg6Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new t320(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((t320) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            zha0 zha0Var = new zha0(31, null, null, null);
            this.a = 1;
            if (this.b.v0(this.c, this.d, zha0Var, this) == y5bVar) {
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
