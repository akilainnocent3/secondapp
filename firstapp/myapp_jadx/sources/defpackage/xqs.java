package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.live.livepage.LivePageViewModel$getUpcomingEvents$3", f = "LivePageViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xqs extends tje0 implements Function2<lk50<? extends List<? extends ing>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ uqs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqs(uqs uqsVar, v1b<? super xqs> v1bVar) {
        super(2, v1bVar);
        this.b = uqsVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xqs xqsVar = new xqs(this.b, v1bVar);
        xqsVar.a = obj;
        return xqsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends List<? extends ing>> lk50Var, v1b<? super Unit> v1bVar) {
        return ((xqs) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50<List<ing>> lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.Y.m(lk50Var);
        return Unit.a;
    }
}
