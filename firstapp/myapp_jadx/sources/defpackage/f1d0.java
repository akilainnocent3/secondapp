package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.penalty.handler.SportyPenaltySelectionHandlerImpl$init$1", f = "SportyPenaltySelectionHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f1d0 extends tje0 implements Function2<List<? extends e1d0>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ g1d0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1d0(g1d0 g1d0Var, v1b<? super f1d0> v1bVar) {
        super(2, v1bVar);
        this.b = g1d0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        f1d0 f1d0Var = new f1d0(this.b, v1bVar);
        f1d0Var.a = obj;
        return f1d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends e1d0> list, v1b<? super Unit> v1bVar) {
        return ((f1d0) create(list, v1bVar)).invokeSuspend(Unit.a);
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
