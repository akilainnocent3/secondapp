package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.transaction.presentation.viewmodel.TxFixStatusViewModel$init$3", f = "TxFixStatusViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a6h0 extends tje0 implements Function2<Long, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ x5h0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6h0(x5h0 x5h0Var, v1b<? super a6h0> v1bVar) {
        super(2, v1bVar);
        this.b = x5h0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        a6h0 a6h0Var = new a6h0(this.b, v1bVar);
        a6h0Var.a = obj;
        return a6h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Long l, v1b<? super Unit> v1bVar) {
        return ((a6h0) create(l, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Long l = (Long) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        x5h0 x5h0Var = this.b;
        x5h0Var.C = l;
        jvd0 jvd0Var = x5h0Var.E;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        x5h0Var.E = ej5.c(o8i0.d(x5h0Var), null, null, new b6h0(x5h0Var, null), 3);
        return Unit.a;
    }
}
