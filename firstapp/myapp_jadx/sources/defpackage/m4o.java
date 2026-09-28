package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.ticketdetail.handler.InstantRacingTicketDetailHandlerImpl$init$3", f = "InstantRacingTicketDetailHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m4o extends tje0 implements Function2<bno, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ i4o b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4o(i4o i4oVar, v1b<? super m4o> v1bVar) {
        super(2, v1bVar);
        this.b = i4oVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        m4o m4oVar = new m4o(this.b, v1bVar);
        m4oVar.a = obj;
        return m4oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(bno bnoVar, v1b<? super Unit> v1bVar) {
        return ((m4o) create(bnoVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        bno bnoVar = (bno) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.h;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, bnoVar));
        return Unit.a;
    }
}
