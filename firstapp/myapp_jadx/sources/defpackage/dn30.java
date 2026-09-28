package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportygames.refscall.conponent.bethsitory.RCBetHistoryViewModel$getBetHistory$2", f = "RCBetHistoryViewModel.kt", l = {111}, m = "invokeSuspend", v = 1)
public final class dn30 extends tje0 implements Function2<mk50<? extends rl30.a>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ en30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn30(en30 en30Var, v1b<? super dn30> v1bVar) {
        super(2, v1bVar);
        this.c = en30Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        dn30 dn30Var = new dn30(this.c, v1bVar);
        dn30Var.b = obj;
        return dn30Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(mk50<? extends rl30.a> mk50Var, v1b<? super Unit> v1bVar) {
        return ((dn30) create(mk50Var, v1bVar)).invokeSuspend(Unit.a);
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
