package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.gift.handler.sim.SimGiftHandlerImpl$init$4", f = "SimGiftHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class qi90 extends tje0 implements gaj<ovk, byk, v1b<? super Unit>, Object> {
    public /* synthetic */ ovk a;
    public /* synthetic */ byk b;
    public final /* synthetic */ mi90 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi90(mi90 mi90Var, v1b<? super qi90> v1bVar) {
        super(3, v1bVar);
        this.c = mi90Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(ovk ovkVar, byk bykVar, v1b<? super Unit> v1bVar) {
        qi90 qi90Var = new qi90(this.c, v1bVar);
        qi90Var.a = ovkVar;
        qi90Var.b = bykVar;
        return qi90Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        ovk ovkVar = this.a;
        byk bykVar = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.c.q;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, new yi90(ovkVar, bykVar)));
        return Unit.a;
    }
}
