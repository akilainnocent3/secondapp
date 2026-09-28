package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.sportydesk.domain.LoginUseCase$execute$3", f = "LoginUseCase.kt", l = {48}, m = "invokeSuspend", v = 2)
public final class ajt extends tje0 implements gaj<myh<? super rit>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Throwable c;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super rit> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        ajt ajtVar = new ajt(3, v1bVar);
        ajtVar.b = myhVar;
        ajtVar.c = th;
        return ajtVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = this.b;
        Throwable th = this.c;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            rit.a aVar = new rit.a(null, th, 1);
            this.b = null;
            this.c = null;
            this.a = 1;
            if (myhVar.emit(aVar, this) == y5bVar) {
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
