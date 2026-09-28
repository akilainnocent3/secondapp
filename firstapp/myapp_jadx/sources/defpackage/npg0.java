package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.presentation.viewmodel.TradingSharedViewModel$refresh$1", f = "TradingSharedViewModel.kt", l = {161}, m = "invokeSuspend", v = 2)
public final class npg0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ qpg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npg0(qpg0 qpg0Var, v1b<? super npg0> v1bVar) {
        super(2, v1bVar);
        this.b = qpg0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new npg0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((npg0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        qpg0 qpg0Var = this.b;
        wwd0 wwd0Var = qpg0Var.i;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wwd0Var.setValue(tzs.b.a);
            List<c9p> listX1 = qpg0Var.x1();
            this.a = 1;
            if (up1.c(listX1, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        wwd0Var.setValue(tzs.a.a);
        return Unit.a;
    }
}
