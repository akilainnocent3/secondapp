package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.allpayments.AllPaymentsViewModel$checkClaimBonusVisibility$1", f = "AllPaymentsViewModel.kt", l = {56}, m = "invokeSuspend", v = 2)
public final class pv extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public wwd0 a;
    public int b;
    public final /* synthetic */ sv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv(sv svVar, v1b<? super pv> v1bVar) {
        super(2, v1bVar);
        this.c = svVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pv(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pv) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        wwd0 wwd0Var;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            sv svVar = this.c;
            wwd0 wwd0Var2 = svVar.i;
            fp7 fp7Var = svVar.b;
            this.a = wwd0Var2;
            this.b = 1;
            obj = fp7Var.a(this);
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
        return Unit.a;
    }
}
