package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.penalty.handler.SportyPenaltyBetslipSingleHandlerImpl$init$1", f = "SportyPenaltyBetslipSingleHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class svc0 extends tje0 implements Function2<List<? extends f4d0>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ uvc0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public svc0(v1b v1bVar, uvc0 uvc0Var) {
        super(2, v1bVar);
        this.b = uvc0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        svc0 svc0Var = new svc0(v1bVar, this.b);
        svc0Var.a = obj;
        return svc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends f4d0> list, v1b<? super Unit> v1bVar) {
        return ((svc0) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        List list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (list.isEmpty()) {
            wwd0 wwd0Var = this.b.i;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, null));
        }
        return Unit.a;
    }
}
