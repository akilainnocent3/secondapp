package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.domain.usecase.GetBettingStreakStatusUseCase$invoke$2", f = "GetBettingStreakStatusUseCase.kt", l = {47}, m = "invokeSuspend", v = 2)
public final class v3k extends tje0 implements gaj<myh<? super lk50<? extends h44>>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Throwable c;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super lk50<? extends h44>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        v3k v3kVar = new v3k(3, v1bVar);
        v3kVar.b = myhVar;
        v3kVar.c = th;
        return v3kVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        myh myhVar = this.b;
        Throwable th = this.c;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            if (th instanceof CancellationException) {
                throw th;
            }
            lk50.a aVar = new lk50.a(th, vch0.b);
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
