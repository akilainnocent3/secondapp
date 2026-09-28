package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.racingevent.handler.InstantRacingSelectionHandlerImpl$init$1", f = "InstantRacingSelectionHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i3o extends tje0 implements Function2<List<? extends h3o>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ j3o b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3o(j3o j3oVar, v1b<? super i3o> v1bVar) {
        super(2, v1bVar);
        this.b = j3oVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        i3o i3oVar = new i3o(this.b, v1bVar);
        i3oVar.a = obj;
        return i3oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends h3o> list, v1b<? super Unit> v1bVar) {
        return ((i3o) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        List list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.b;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, new d880(((d880) value).b, list.size())));
        return Unit.a;
    }
}
