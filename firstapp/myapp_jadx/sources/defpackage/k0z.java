package defpackage;

import com.sporty.android.core.model.MyLog;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.openbet.presentation.viewmodel.OpenBetSharedViewModel$fetchOpenBetCount$3", f = "OpenBetSharedViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k0z extends tje0 implements gaj<myh<? super wyy>, Throwable, v1b<? super Unit>, Object> {
    @Override // defpackage.gaj
    public final Object invoke(myh<? super wyy> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        return new k0z(3, v1bVar).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_OPEN_BET);
        aVar.a("fetch Open Bet count failed", new Object[0]);
        return Unit.a;
    }
}
