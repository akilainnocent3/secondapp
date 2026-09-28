package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.core.environment.UrlConfigDataSource$readCachedRemoteDto$prefs$1", f = "UrlConfigDataSource.kt", l = {71}, m = "invokeSuspend", v = 2)
public final class ymh0 extends tje0 implements gaj<myh<? super zn20>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super zn20> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        ymh0 ymh0Var = new ymh0(3, v1bVar);
        ymh0Var.b = myhVar;
        return ymh0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            jtw jtwVar = new jtw(1, true);
            this.b = null;
            this.a = 1;
            if (myhVar.emit(jtwVar, this) == y5bVar) {
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
