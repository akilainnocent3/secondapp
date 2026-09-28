package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.live.livepage.LivePageViewModel$getUpcomingEvents$2", f = "LivePageViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wqs extends tje0 implements Function2<myh<? super lk50<? extends List<? extends ing>>>, v1b<? super Unit>, Object> {
    public final /* synthetic */ uqs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wqs(uqs uqsVar, v1b<? super wqs> v1bVar) {
        super(2, v1bVar);
        this.a = uqsVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wqs(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super lk50<? extends List<? extends ing>>> myhVar, v1b<? super Unit> v1bVar) {
        return ((wqs) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.Y.m(lk50.b.a);
        return Unit.a;
    }
}
