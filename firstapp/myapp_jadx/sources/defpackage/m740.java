package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel$markRemixBetRedDotDismissed$1", f = "RealBetHistoryViewModel.kt", l = {568}, m = "invokeSuspend", v = 2)
public final class m740 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ d740 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m740(v1b v1bVar, d740 d740Var) {
        super(2, v1bVar);
        this.b = d740Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new m740(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((m740) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        d740 d740Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            h450 h450Var = d740Var.v;
            this.a = 1;
            d450 d450Var = h450Var.a;
            if (d450Var.c.a(d450Var, d450.e[1]).g(this, Boolean.TRUE) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        wwd0 wwd0Var = d740Var.O;
        Boolean bool = Boolean.FALSE;
        wwd0Var.getClass();
        wwd0Var.k(null, bool);
        return Unit.a;
    }
}
