package defpackage;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.QuickBetViewModel$fetchBannedList$2", f = "QuickBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class lf30 extends tje0 implements gaj<myh<? super lk50<? extends List<? extends String>>>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super lk50<? extends List<? extends String>>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        lf30 lf30Var = new lf30(3, v1bVar);
        lf30Var.a = th;
        return lf30Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        itf0.a.d(a320.a("Fetch banned list error: ", th), new Object[0]);
        return Unit.a;
    }
}
