package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.viewmodel.InstantWinConfigViewModel$checkIvOneCutReleased$2", f = "InstantWinConfigViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class pdo extends tje0 implements gaj<myh<? super lk50<? extends Boolean>>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super lk50<? extends Boolean>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        pdo pdoVar = new pdo(3, v1bVar);
        pdoVar.a = th;
        return pdoVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        itf0.a.a(a320.a("BO Config Error: ", th), new Object[0]);
        return Unit.a;
    }
}
