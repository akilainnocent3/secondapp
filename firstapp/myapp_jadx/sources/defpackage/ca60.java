package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.speedybingo.presentation.bethsitory.SBBetHistoryViewModel$getBetHistory$2", f = "SBBetHistoryViewModel.kt", l = {108}, m = "invokeSuspend", v = 1)
public final class ca60 extends tje0 implements Function2<mk50<? extends f860.a>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ da60 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca60(da60 da60Var, v1b<? super ca60> v1bVar) {
        super(2, v1bVar);
        this.c = da60Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ca60 ca60Var = new ca60(this.c, v1bVar);
        ca60Var.b = obj;
        return ca60Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(mk50<? extends f860.a> mk50Var, v1b<? super Unit> v1bVar) {
        return ((ca60) create(mk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        mk50 mk50Var = (mk50) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wwd0 wwd0Var = this.c.c;
            this.b = null;
            this.a = 1;
            wwd0Var.setValue(mk50Var);
            if (Unit.a == y5bVar) {
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
