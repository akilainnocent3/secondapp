package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.oneuppromo.attribution.OneUpPromoAttributionDataStore$clear$2$1", f = "OneUpPromoAttributionDataStore.kt", l = {}, m = "invokeSuspend", v = 2)
public final class tsy extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ysy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsy(ysy ysyVar, v1b<? super tsy> v1bVar) {
        super(2, v1bVar);
        this.b = ysyVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        tsy tsyVar = new tsy(this.b, v1bVar);
        tsyVar.a = obj;
        return tsyVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
        return ((tsy) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        jtw jtwVar = (jtw) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        jtwVar.f(this.b.b);
        return Unit.a;
    }
}
