package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.antest.InstantFootballBetslipRecommendationAnTestHelper$init$2", f = "InstantFootballBetslipRecommendationAnTestHelper.kt", l = {}, m = "invokeSuspend", v = 2)
public final class upn extends tje0 implements Function2<etm, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ypn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public upn(v1b v1bVar, ypn ypnVar) {
        super(2, v1bVar);
        this.b = ypnVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        upn upnVar = new upn(v1bVar, this.b);
        upnVar.a = obj;
        return upnVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(etm etmVar, v1b<? super Unit> v1bVar) {
        return ((upn) create(etmVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        etm etmVar = (etm) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.d;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, etmVar));
        return Unit.a;
    }
}
