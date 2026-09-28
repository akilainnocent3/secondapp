package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.FirebaseRemoteConfigRepositoryImpl$fetch$5", f = "FirebaseRemoteConfigRepositoryImpl.kt", l = {160}, m = "invokeSuspend", v = 2)
public final class vrh extends tje0 implements gaj<myh<? super hih>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Throwable c;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super hih> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        vrh vrhVar = new vrh(3, v1bVar);
        vrhVar.b = myhVar;
        vrhVar.c = th;
        return vrhVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = this.b;
        Throwable th = this.c;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            itf0.a.f(th, "RemoteConfig fetch failed", new Object[0]);
            hih.a aVar = hih.a.a;
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
