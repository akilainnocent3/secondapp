package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.racingevent.handler.InstantRacingQuickBetHandlerImpl$init$1", f = "InstantRacingQuickBetHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class vzn extends tje0 implements Function2<List<? extends x3o>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ pzn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vzn(v1b v1bVar, pzn pznVar) {
        super(2, v1bVar);
        this.b = pznVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vzn vznVar = new vzn(v1bVar, this.b);
        vznVar.a = obj;
        return vznVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends x3o> list, v1b<? super Unit> v1bVar) {
        return ((vzn) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        pzn.a aVar;
        Object value2;
        List list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        pzn pznVar = this.b;
        wwd0 wwd0Var = pznVar.j;
        do {
            value = wwd0Var.getValue();
            aVar = (pzn.a) value;
            if (list.isEmpty()) {
                aVar = pzn.a.b;
            } else if (aVar != pzn.a.c) {
                aVar = pzn.a.a;
            }
        } while (!wwd0Var.g(value, aVar));
        if (list.isEmpty()) {
            wwd0 wwd0Var2 = pznVar.i;
            do {
                value2 = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value2, null));
        }
        return Unit.a;
    }
}
