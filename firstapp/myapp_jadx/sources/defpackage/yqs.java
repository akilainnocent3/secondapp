package defpackage;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.live.livepage.LivePageViewModel$getUpcomingEvents$4", f = "LivePageViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class yqs extends tje0 implements gaj<myh<? super lk50<? extends List<? extends ing>>>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ uqs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqs(uqs uqsVar, v1b<? super yqs> v1bVar) {
        super(3, v1bVar);
        this.b = uqsVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super lk50<? extends List<? extends ing>>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        yqs yqsVar = new yqs(this.b, v1bVar);
        yqsVar.a = th;
        return yqsVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.Y.m(new lk50.a(th));
        return Unit.a;
    }
}
