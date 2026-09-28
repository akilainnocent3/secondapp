package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.ui.txdetails.TxDetailsViewModel$init$3", f = "TxDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class x4h0 extends tje0 implements Function2<Long, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ e5h0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4h0(e5h0 e5h0Var, v1b<? super x4h0> v1bVar) {
        super(2, v1bVar);
        this.b = e5h0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        x4h0 x4h0Var = new x4h0(this.b, v1bVar);
        x4h0Var.a = obj;
        return x4h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Long l, v1b<? super Unit> v1bVar) {
        return ((x4h0) create(l, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Long l = (Long) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        e5h0 e5h0Var = this.b;
        e5h0Var.F = l;
        jvd0 jvd0Var = e5h0Var.H;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        e5h0Var.H = ej5.c(o8i0.d(e5h0Var), null, null, new y4h0(e5h0Var, null), 3);
        return Unit.a;
    }
}
