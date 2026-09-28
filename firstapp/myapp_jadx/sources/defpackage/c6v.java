package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.event.viewmodel.MatchEventViewModel$restoreSelectionsOnce$2", f = "MatchEventViewModel.kt", l = {514}, m = "invokeSuspend", v = 2)
public final class c6v extends tje0 implements gaj<myh<? super lk50<? extends Unit>>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Throwable c;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super lk50<? extends Unit>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        c6v c6vVar = new c6v(3, v1bVar);
        c6vVar.b = myhVar;
        c6vVar.c = th;
        return c6vVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = this.b;
        Throwable th = this.c;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            itf0.a.f(th, "Error restoring selections from cache", new Object[0]);
            lk50.c cVar = new lk50.c(Unit.a);
            this.b = null;
            this.c = null;
            this.a = 1;
            if (myhVar.emit(cVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
