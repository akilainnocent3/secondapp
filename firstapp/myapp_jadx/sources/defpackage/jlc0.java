package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legendsrace.handler.SportyLegendsSettlementMatchTrackerStateHandlerImpl$initialMatchTrackerStateHandler$4", f = "SportyLegendsSettlementMatchTrackerStateHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jlc0 extends tje0 implements jaj<clc0, qcn<? extends vkc0>, hlc0, wlc0, v1b<? super Unit>, Object> {
    public /* synthetic */ clc0 a;
    public /* synthetic */ qcn b;
    public /* synthetic */ hlc0 c;
    public /* synthetic */ wlc0 d;
    public final /* synthetic */ ilc0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jlc0(ilc0 ilc0Var, v1b<? super jlc0> v1bVar) {
        super(5, v1bVar);
        this.e = ilc0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        clc0 clc0Var = this.a;
        qcn qcnVar = this.b;
        hlc0 hlc0Var = this.c;
        wlc0 wlc0Var = this.d;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ilc0 ilc0Var = this.e;
        wwd0 wwd0Var = ilc0Var.f;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, new slc0(ilc0Var.b, hlc0Var, clc0Var, qcnVar, wlc0Var)));
        return Unit.a;
    }

    @Override // defpackage.jaj
    public final Object l(clc0 clc0Var, qcn<? extends vkc0> qcnVar, hlc0 hlc0Var, wlc0 wlc0Var, v1b<? super Unit> v1bVar) {
        jlc0 jlc0Var = new jlc0(this.e, v1bVar);
        jlc0Var.a = clc0Var;
        jlc0Var.b = qcnVar;
        jlc0Var.c = hlc0Var;
        jlc0Var.d = wlc0Var;
        return jlc0Var.invokeSuspend(Unit.a);
    }
}
