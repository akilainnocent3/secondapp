package defpackage;

import com.sporty.android.book.domain.entity.BetTypeAnyWinConfig;
import com.sporty.android.core.model.MyLog;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$fetchAnyWinConfig$2", f = "BetSlipViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class x63 extends tje0 implements gaj<myh<? super BetTypeAnyWinConfig>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super BetTypeAnyWinConfig> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        x63 x63Var = new x63(3, v1bVar);
        x63Var.a = th;
        return x63Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_BET_SLIP);
        aVar.p(th, "AnyWin bet config fetch failed!", new Object[0]);
        return Unit.a;
    }
}
