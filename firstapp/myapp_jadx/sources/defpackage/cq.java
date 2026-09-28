package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.footballfamilysettlement.handler.AfricanCupSettlementHandlerImpl$init$2", f = "AfricanCupSettlementHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class cq extends tje0 implements Function2<obi, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ yp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq(yp ypVar, v1b<? super cq> v1bVar) {
        super(2, v1bVar);
        this.b = ypVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        cq cqVar = new cq(this.b, v1bVar);
        cqVar.a = obj;
        return cqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(obi obiVar, v1b<? super Unit> v1bVar) {
        return ((cq) create(obiVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        obi obiVar = (obi) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.g;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, obiVar));
        return Unit.a;
    }
}
