package defpackage;

import com.sportybet.plugin.event.e;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.event.EventViewModel$fetchLiveStreamData$2", f = "EventViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ksg extends tje0 implements gaj<myh<? super qus>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ksg(v1b v1bVar, e eVar) {
        super(3, v1bVar);
        this.b = eVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super qus> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        ksg ksgVar = new ksg(v1bVar, this.b);
        ksgVar.a = th;
        return ksgVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        itf0.a.d(inm.a("LiveStream Error: ", th.getMessage()), new Object[0]);
        this.b.g0.m(new qus.a(th.getMessage()));
        return Unit.a;
    }
}
