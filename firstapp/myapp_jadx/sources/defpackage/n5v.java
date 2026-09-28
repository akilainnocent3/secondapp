package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.event.viewmodel.MatchEventViewModel$eventViewState$3", f = "MatchEventViewModel.kt", l = {174}, m = "invokeSuspend", v = 2)
public final class n5v extends tje0 implements gaj<myh<? super ctg>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Throwable c;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super ctg> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        n5v n5vVar = new n5v(3, v1bVar);
        n5vVar.b = myhVar;
        n5vVar.c = th;
        return n5vVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = this.b;
        Throwable th = this.c;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ctg.b bVar = new ctg.b(th);
            this.b = null;
            this.c = null;
            this.a = 1;
            if (myhVar.emit(bVar, this) == y5bVar) {
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
