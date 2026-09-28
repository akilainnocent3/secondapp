package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.racingevent.handler.InstantRacingBetslipSingleHandlerImpl$init$1", f = "InstantRacingBetslipSingleHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class htn extends tje0 implements Function2<List<? extends x3o>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ jtn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htn(v1b v1bVar, jtn jtnVar) {
        super(2, v1bVar);
        this.b = jtnVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        htn htnVar = new htn(v1bVar, this.b);
        htnVar.a = obj;
        return htnVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends x3o> list, v1b<? super Unit> v1bVar) {
        return ((htn) create(list, v1bVar)).invokeSuspend(Unit.a);
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
