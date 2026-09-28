package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.plugin.common.gift.GiftViewModel$fetchValidGiftAndSetDefaultGift$2", f = "GiftViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ryk extends tje0 implements gaj<myh<? super Unit>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super Unit> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        ryk rykVar = new ryk(3, v1bVar);
        rykVar.a = th;
        return rykVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        itf0.a aVar = itf0.a;
        aVar.a(e40.a(aVar, "GiftViewModel", "Error fetching valid gift groups: ", th), new Object[0]);
        return Unit.a;
    }
}
