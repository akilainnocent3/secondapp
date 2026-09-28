package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.timeAlert.local.TimeAlertDataStoreImpl$updatedConsumedTimeAlert$2", f = "TimeAlertDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class stf0 extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ptf0 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public stf0(ptf0 ptf0Var, int i, v1b<? super stf0> v1bVar) {
        super(2, v1bVar);
        this.b = ptf0Var;
        this.c = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        stf0 stf0Var = new stf0(this.b, this.c, v1bVar);
        stf0Var.a = obj;
        return stf0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
        return ((stf0) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        jtw jtwVar = (jtw) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ptf0.a[] aVarArr = ptf0.a.a;
        Integer num = new Integer(this.c);
        zn20.a<?> aVar = new zn20.a<>("consumed_time_alert_time");
        jtwVar.getClass();
        jtwVar.h(aVar, num);
        return Unit.a;
    }
}
