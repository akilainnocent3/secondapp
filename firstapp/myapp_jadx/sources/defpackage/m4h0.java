package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.transaction.presentation.viewmodel.TxDetailsV2ViewModel$initCoolDownCounter$1", f = "TxDetailsV2ViewModel.kt", l = {226}, m = "invokeSuspend", v = 2)
public final class m4h0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ r4h0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4h0(v1b v1bVar, r4h0 r4h0Var) {
        super(2, v1bVar);
        this.b = r4h0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new m4h0(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((m4h0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        r4h0 r4h0Var = this.b;
        wwd0 wwd0Var = r4h0Var.L;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            long jX1 = r4h0Var.x1();
            Boolean bool = Boolean.TRUE;
            wwd0Var.getClass();
            wwd0Var.k(null, bool);
            this.a = 1;
            if (hkd.b(jX1, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        Boolean bool2 = Boolean.FALSE;
        wwd0Var.getClass();
        wwd0Var.k(null, bool2);
        return Unit.a;
    }
}
