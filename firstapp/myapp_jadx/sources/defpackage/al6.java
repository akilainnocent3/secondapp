package defpackage;

import com.sporty.android.core.model.MyLog;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutFragment$observePlayerDataSourceEventFlow$2", f = "CashOutFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class al6 extends tje0 implements gaj<myh<? super qp10>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super qp10> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        al6 al6Var = new al6(3, v1bVar);
        al6Var.a = th;
        return al6Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_CASHOUT_CALC);
        aVar.f(th, "Failed on observePlayerDataSourceEventFlow %s", th.getMessage());
        return Unit.a;
    }
}
