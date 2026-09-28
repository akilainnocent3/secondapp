package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legends.handler.SportyLegendsSelectionHandlerImpl$init$1", f = "SportyLegendsSelectionHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class mjc0 extends tje0 implements Function2<List<? extends kjc0>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ njc0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mjc0(njc0 njc0Var, v1b<? super mjc0> v1bVar) {
        super(2, v1bVar);
        this.b = njc0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        mjc0 mjc0Var = new mjc0(this.b, v1bVar);
        mjc0Var.a = obj;
        return mjc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends kjc0> list, v1b<? super Unit> v1bVar) {
        return ((mjc0) create(list, v1bVar)).invokeSuspend(Unit.a);
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
