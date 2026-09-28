package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RealBetHistoryViewModel$loadRemixBetRedDotState$1", f = "RealBetHistoryViewModel.kt", l = {573}, m = "invokeSuspend", v = 2)
public final class l740 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public wwd0 a;
    public int b;
    public final /* synthetic */ d740 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l740(v1b v1bVar, d740 d740Var) {
        super(2, v1bVar);
        this.c = d740Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new l740(v1bVar, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((l740) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        wwd0 wwd0Var;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            d740 d740Var = this.c;
            wwd0 wwd0Var2 = d740Var.O;
            h450 h450Var = d740Var.v;
            this.a = wwd0Var2;
            this.b = 1;
            obj = h450Var.a(this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            wwd0Var = wwd0Var2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wwd0Var = this.a;
            uj50.b(obj);
        }
        wwd0Var.setValue(Boolean.valueOf(!((Boolean) obj).booleanValue()));
        return Unit.a;
    }
}
