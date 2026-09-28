package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.transaction.presentation.viewmodel.TxDetailsV2ViewModel$init$6", f = "TxDetailsV2ViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k4h0 extends tje0 implements Function2<Long, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ r4h0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4h0(v1b v1bVar, r4h0 r4h0Var) {
        super(2, v1bVar);
        this.b = r4h0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        k4h0 k4h0Var = new k4h0(v1bVar, this.b);
        k4h0Var.a = obj;
        return k4h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Long l, v1b<? super Unit> v1bVar) {
        return ((k4h0) create(l, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Long l = (Long) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        r4h0 r4h0Var = this.b;
        r4h0Var.K = l;
        jvd0 jvd0Var = r4h0Var.M;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        r4h0Var.M = ej5.c(o8i0.d(r4h0Var), null, null, new m4h0(null, r4h0Var), 3);
        return Unit.a;
    }
}
