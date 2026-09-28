package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.gift.gift.domain.usecase.GetGiftDisplayDataUseCase$getCacheGiftDisplayData$1", f = "GetGiftDisplayDataUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class z6k extends tje0 implements gaj<myh<? super wjk>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super wjk> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        z6k z6kVar = new z6k(3, v1bVar);
        z6kVar.a = th;
        return z6kVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        itf0.a aVar = itf0.a;
        aVar.q("GiftDisplayData");
        aVar.p(th, "Cache deserialization failed, will fetch from remote", new Object[0]);
        return Unit.a;
    }
}
