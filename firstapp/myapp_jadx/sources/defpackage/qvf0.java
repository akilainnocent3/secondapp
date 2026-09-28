package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.timeAlert.viewmodel.TimeAlertViewModel$onEnableTimeAlertValueChanged$1", f = "TimeAlertViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class qvf0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ tvf0 a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qvf0(tvf0 tvf0Var, boolean z, v1b<? super qvf0> v1bVar) {
        super(2, v1bVar);
        this.a = tvf0Var;
        this.b = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qvf0(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qvf0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        ovf0 ovf0Var;
        auf0 auf0Var;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        tvf0 tvf0Var = this.a;
        nvf0 nvf0Var = tvf0Var.e;
        auf0 auf0Var2 = tvf0Var.v;
        boolean z = !this.b;
        auf0 auf0VarA = nvf0Var.a(auf0Var2, z);
        wwd0 wwd0Var = tvf0Var.a;
        do {
            value = wwd0Var.getValue();
            ovf0Var = (ovf0) value;
            auf0Var = tvf0Var.v;
        } while (!wwd0Var.g(value, ovf0.a(ovf0Var, tvf0Var.e.a(auf0Var, z), z, auf0Var.a != auf0VarA.a, 9)));
        return Unit.a;
    }
}
