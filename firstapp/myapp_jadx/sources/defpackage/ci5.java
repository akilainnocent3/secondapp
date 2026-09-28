package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.ticketdetail.handler.BuildAndGoTicketDetailHandlerImpl$init$3", f = "BuildAndGoTicketDetailHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ci5 extends tje0 implements Function2<bno, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ yh5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci5(yh5 yh5Var, v1b<? super ci5> v1bVar) {
        super(2, v1bVar);
        this.b = yh5Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ci5 ci5Var = new ci5(this.b, v1bVar);
        ci5Var.a = obj;
        return ci5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(bno bnoVar, v1b<? super Unit> v1bVar) {
        return ((ci5) create(bnoVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        bno bnoVar = (bno) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.f;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, bnoVar));
        return Unit.a;
    }
}
