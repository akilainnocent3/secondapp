package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.timeAlert.local.TimeAlertDataStoreImpl$updatedTimeAlertPeriod$2", f = "TimeAlertDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class utf0 extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ptf0 b;
    public final /* synthetic */ Integer c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public utf0(ptf0 ptf0Var, Integer num, v1b<? super utf0> v1bVar) {
        super(2, v1bVar);
        this.b = ptf0Var;
        this.c = num;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        utf0 utf0Var = new utf0(this.b, this.c, v1bVar);
        utf0Var.a = obj;
        return utf0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
        return ((utf0) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        jtw jtwVar = (jtw) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ptf0.a[] aVarArr = ptf0.a.a;
        Integer num = this.c;
        if (num != null) {
            zn20.a<?> aVar = new zn20.a<>("time_alert_period");
            jtwVar.getClass();
            jtwVar.h(aVar, num);
        } else {
            jtwVar.f(new zn20.a("time_alert_period"));
        }
        return Unit.a;
    }
}
