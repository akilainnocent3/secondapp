package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.bethistory.presentation.LNBetHistoryViewModel$1", f = "LNBetHistoryViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ryp extends tje0 implements Function2<ojq, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ syp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ryp(syp sypVar, v1b<? super ryp> v1bVar) {
        super(2, v1bVar);
        this.b = sypVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ryp rypVar = new ryp(this.b, v1bVar);
        rypVar.a = obj;
        return rypVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ojq ojqVar, v1b<? super Unit> v1bVar) {
        return ((ryp) create(ojqVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        rjq rjqVar;
        rjq dVar;
        ojq ojqVar = (ojq) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.e;
        do {
            value = wwd0Var.getValue();
            rjqVar = (rjq) value;
            if (!Intrinsics.g(rjqVar, rjq.a.a)) {
                if (rjqVar instanceof rjq.b) {
                    ojqVar.getClass();
                    dVar = new rjq.b(a4h.a(acr.a(ojq.SETTLED, ojqVar), acr.a(ojq.UNSETTLED, ojqVar), acr.a(ojq.ALL, ojqVar)));
                } else {
                    if (!(rjqVar instanceof rjq.d)) {
                        uhc.a();
                        return null;
                    }
                    ojqVar.getClass();
                    dVar = new rjq.d(a4h.a(tjr.a(ojq.SETTLED_WIN, ojqVar), tjr.a(ojq.SETTLED_LOSE, ojqVar), tjr.a(ojq.SETTLED_VOID, ojqVar), qjq.a.a));
                }
                rjqVar = dVar;
            }
        } while (!wwd0Var.g(value, rjqVar));
        return Unit.a;
    }
}
