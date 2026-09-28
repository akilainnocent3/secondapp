package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.instantwin.presentation.penalty.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.penalty.SportyPenaltyViewModel$observeSelectionCountSnapshotFlow$1", f = "SportyPenaltyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c6d0 extends tje0 implements Function2<d880, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ d b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6d0(v1b v1bVar, d dVar) {
        super(2, v1bVar);
        this.b = dVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        c6d0 c6d0Var = new c6d0(v1bVar, this.b);
        c6d0Var.a = obj;
        return c6d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(d880 d880Var, v1b<? super Unit> v1bVar) {
        return ((c6d0) create(d880Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        d880 d880Var = (d880) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        int i = d880Var.b;
        int i2 = d880Var.a;
        d dVar = this.b;
        if (i > i2) {
            dVar.H.a(new a5o.j(dVar.y1()), k00.d);
            y8j.a(dVar.I, AnalyticsEvent.IV__EVENT_LIST__ADD_TO_BETSLIP_BTN);
        }
        int i3 = d880Var.b;
        wwd0 wwd0Var = dVar.L;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, new hm3(i3)));
        return Unit.a;
    }
}
