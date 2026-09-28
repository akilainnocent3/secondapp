package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.nightnday.conponent.bethsitory.NNDBetHistoryViewModel$getBetHistory$2", f = "NNDBetHistoryViewModel.kt", l = {111}, m = "invokeSuspend", v = 1)
public final class p8x extends tje0 implements Function2<mk50<? extends b7x.a>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ q8x c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8x(q8x q8xVar, v1b<? super p8x> v1bVar) {
        super(2, v1bVar);
        this.c = q8xVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        p8x p8xVar = new p8x(this.c, v1bVar);
        p8xVar.b = obj;
        return p8xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(mk50<? extends b7x.a> mk50Var, v1b<? super Unit> v1bVar) {
        return ((p8x) create(mk50Var, v1bVar)).invokeSuspend(Unit.a);
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
