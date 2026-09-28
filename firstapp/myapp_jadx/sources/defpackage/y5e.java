package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositPaybillViewModel$initPaybillItems$1", f = "DepositPaybillViewModel.kt", l = {119}, m = "invokeSuspend", v = 2)
public final class y5e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public wwd0 a;
    public int b;
    public final /* synthetic */ x5e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5e(x5e x5eVar, v1b<? super y5e> v1bVar) {
        super(2, v1bVar);
        this.c = x5eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new y5e(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((y5e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objA;
        wwd0 wwd0Var;
        x5e x5eVar = this.c;
        wwd0 wwd0Var2 = x5eVar.q0;
        wwd0 wwd0Var3 = x5eVar.s0;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            wwd0Var3.setValue(lk50.b.a);
            l5k l5kVar = x5eVar.l0;
            this.a = wwd0Var2;
            this.b = 1;
            int i2 = l5k.a.a[l5kVar.c.getCountryCode().ordinal()];
            if (i2 == 1) {
                objA = l5kVar.a(this);
            } else if (i2 != 2) {
                objA = i2 != 3 ? m2g.a : l5kVar.c(this);
            } else {
                objA = l5kVar.b(this);
            }
            obj = objA;
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
        wwd0Var.setValue(obj);
        lk50.c cVar = new lk50.c(wwd0Var2.getValue());
        wwd0Var3.getClass();
        wwd0Var3.k(null, cVar);
        return Unit.a;
    }
}
