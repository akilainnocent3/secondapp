package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.presentation.MeViewModel$initRowsObserver$1", f = "MeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ygv extends tje0 implements Function2<List<? extends aev>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ rhv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ygv(rhv rhvVar, v1b<? super ygv> v1bVar) {
        super(2, v1bVar);
        this.b = rhvVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ygv ygvVar = new ygv(this.b, v1bVar);
        ygvVar.a = obj;
        return ygvVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends aev> list, v1b<? super Unit> v1bVar) {
        return ((ygv) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        List list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.O;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, cgv.a((cgv) value, false, list, null, null, null, null, 0, 0, null, null, null, false, false, null, 131067)));
        return Unit.a;
    }
}
