package defpackage;

import com.sporty.android.book.domain.entity.BetTypeFlexiBetConfig;
import com.sporty.android.core.model.MyLog;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$fetchFlexBetConfig$2", f = "BetSlipViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a73 extends tje0 implements gaj<myh<? super BetTypeFlexiBetConfig>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super BetTypeFlexiBetConfig> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        a73 a73Var = new a73(3, v1bVar);
        a73Var.a = th;
        return a73Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_BET_SLIP);
        aVar.p(th, "Flexi bet type config fetch failed!", new Object[0]);
        return Unit.a;
    }
}
