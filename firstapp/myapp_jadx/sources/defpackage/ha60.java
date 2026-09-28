package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.speedybingo.presentation.betpanel.SBBetPanelViewModel$init$1", f = "SBBetPanelViewModel.kt", l = {66}, m = "invokeSuspend", v = 1)
public final class ha60 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ga60 b;
    public final /* synthetic */ fa60 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha60(ga60 ga60Var, fa60 fa60Var, v1b<? super ha60> v1bVar) {
        super(2, v1bVar);
        this.b = ga60Var;
        this.c = fa60Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ha60(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ha60) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (this.b.z1(this.c) == y5bVar) {
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
