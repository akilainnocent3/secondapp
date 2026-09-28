package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.penalty.handler.SportyPenaltyQuickBetHandlerImpl$init$1", f = "SportyPenaltyQuickBetHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class pzc0 extends tje0 implements Function2<List<? extends f4d0>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ jzc0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pzc0(v1b v1bVar, jzc0 jzc0Var) {
        super(2, v1bVar);
        this.b = jzc0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        pzc0 pzc0Var = new pzc0(v1bVar, this.b);
        pzc0Var.a = obj;
        return pzc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends f4d0> list, v1b<? super Unit> v1bVar) {
        return ((pzc0) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        jzc0.a aVar;
        Object value2;
        List list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        jzc0 jzc0Var = this.b;
        wwd0 wwd0Var = jzc0Var.j;
        do {
            value = wwd0Var.getValue();
            aVar = (jzc0.a) value;
            if (list.isEmpty()) {
                aVar = jzc0.a.b;
            } else if (aVar != jzc0.a.c) {
                aVar = jzc0.a.a;
            }
        } while (!wwd0Var.g(value, aVar));
        if (list.isEmpty()) {
            wwd0 wwd0Var2 = jzc0Var.i;
            do {
                value2 = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value2, null));
        }
        return Unit.a;
    }
}
