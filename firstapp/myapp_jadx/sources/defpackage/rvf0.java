package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.timeAlert.viewmodel.TimeAlertViewModel$onOptionChanged$1", f = "TimeAlertViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class rvf0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ tvf0 a;
    public final /* synthetic */ auf0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rvf0(tvf0 tvf0Var, auf0 auf0Var, v1b<? super rvf0> v1bVar) {
        super(2, v1bVar);
        this.a = tvf0Var;
        this.b = auf0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new rvf0(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((rvf0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        ovf0 ovf0Var;
        int i;
        auf0 auf0Var;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        tvf0 tvf0Var = this.a;
        wwd0 wwd0Var = tvf0Var.a;
        do {
            value = wwd0Var.getValue();
            ovf0Var = (ovf0) value;
            i = tvf0Var.v.a;
            auf0Var = this.b;
        } while (!wwd0Var.g(value, ovf0.a(ovf0Var, auf0Var, false, i != auf0Var.a, 13)));
        return Unit.a;
    }
}
