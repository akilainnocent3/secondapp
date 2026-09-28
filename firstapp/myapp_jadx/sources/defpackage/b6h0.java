package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.transaction.presentation.viewmodel.TxFixStatusViewModel$initCoolDownCounter$1", f = "TxFixStatusViewModel.kt", l = {191}, m = "invokeSuspend", v = 2)
public final class b6h0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ x5h0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6h0(x5h0 x5h0Var, v1b<? super b6h0> v1bVar) {
        super(2, v1bVar);
        this.b = x5h0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new b6h0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((b6h0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        x5h0 x5h0Var = this.b;
        wwd0 wwd0Var = x5h0Var.D;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0 && i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        do {
            Long l = x5h0Var.C;
            if (l == null) {
                Integer num = new Integer(0);
                wwd0Var.getClass();
                wwd0Var.k(null, num);
            } else {
                int iIntValue = ((Number) x5h0Var.y.a.getValue()).intValue() - ((int) ((System.currentTimeMillis() - l.longValue()) / 1000));
                if (iIntValue < 0) {
                    Integer num2 = new Integer(0);
                    wwd0Var.getClass();
                    wwd0Var.k(null, num2);
                } else {
                    Integer num3 = new Integer(iIntValue);
                    wwd0Var.getClass();
                    wwd0Var.k(null, num3);
                }
            }
            this.a = 1;
        } while (hkd.b(1000L, this) != y5bVar);
        return y5bVar;
    }
}
