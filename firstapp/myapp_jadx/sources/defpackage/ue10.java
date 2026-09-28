package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.delegates.PixPendingDepositsDelegate$refreshPendingDeposits$1", f = "PixPendingDepositsDelegate.kt", l = {163}, m = "invokeSuspend", v = 2)
public final class ue10 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ qe10 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue10(qe10 qe10Var, v1b<? super ue10> v1bVar) {
        super(2, v1bVar);
        this.b = qe10Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ue10(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ue10) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objA;
        y5b y5bVar = y5b.a;
        int i = this.a;
        qe10 qe10Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            int i2 = qe10Var.f;
            this.a = 1;
            objA = qe10Var.a(i2, this);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objA = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (!(objA instanceof zi50.b)) {
            jvd0 jvd0Var = qe10Var.k;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            qe10Var.k = ej5.c(qe10Var.a, null, null, new re10(qe10Var, null), 3);
        }
        Throwable thA = zi50.a(objA);
        if (thA != null) {
            itf0.a.f(thA, "Failed to refresh pending deposits", new Object[0]);
        }
        return Unit.a;
    }
}
