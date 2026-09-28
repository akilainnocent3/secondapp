package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sportybet.android.cashoutphase3.a;
import com.sportybet.android.cashoutphase3.b;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutFragment$observeCashoutEventFlow$2", f = "CashOutFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class tk6 extends tje0 implements gaj<myh<? super a>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk6(b bVar, v1b<? super tk6> v1bVar) {
        super(3, v1bVar);
        this.b = bVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super a> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        tk6 tk6Var = new tk6(this.b, v1bVar);
        tk6Var.a = th;
        return tk6Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        b bVar = this.b;
        bVar.w0 = 0L;
        xh6 xh6Var = bVar.c0;
        if (xh6Var == null) {
            Intrinsics.n("adapter");
            throw null;
        }
        xh6Var.M = null;
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_CASHOUT_CALC);
        aVar.f(th, "Failed on observeEventStateFlow %s", th.getMessage());
        return Unit.a;
    }
}
