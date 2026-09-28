package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.ticketdetail.handler.WorldCupTicketDetailHandlerImpl$init$4", f = "WorldCupTicketDetailHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a6k0 extends tje0 implements Function2<bno, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ v5k0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6k0(v5k0 v5k0Var, v1b<? super a6k0> v1bVar) {
        super(2, v1bVar);
        this.b = v5k0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        a6k0 a6k0Var = new a6k0(this.b, v1bVar);
        a6k0Var.a = obj;
        return a6k0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(bno bnoVar, v1b<? super Unit> v1bVar) {
        return ((a6k0) create(bnoVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        bno bnoVar = (bno) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.l;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, bnoVar));
        return Unit.a;
    }
}
