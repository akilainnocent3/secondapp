package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballSessionDataHandlerImpl$init$1$2", f = "ScheduledFootballSessionDataHandlerImpl.kt", l = {569}, m = "invokeSuspend", v = 2)
public final class ej70 extends tje0 implements gaj<myh<? super Boolean>, Throwable, v1b<? super Unit>, Object> {
    public tuw a;
    public pj70 b;
    public int c;
    public /* synthetic */ Throwable d;
    public final /* synthetic */ pj70 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej70(v1b v1bVar, pj70 pj70Var) {
        super(3, v1bVar);
        this.e = pj70Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super Boolean> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        ej70 ej70Var = new ej70(v1bVar, this.e);
        ej70Var.d = th;
        return ej70Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        pj70 pj70Var;
        tuw tuwVar;
        Object value;
        Throwable th = this.d;
        y5b y5bVar = y5b.a;
        int i = this.c;
        if (i == 0) {
            uj50.b(obj);
            pj70 pj70Var2 = this.e;
            tuw tuwVar2 = pj70Var2.g;
            this.d = th;
            this.a = tuwVar2;
            this.b = pj70Var2;
            this.c = 1;
            if (tuwVar2.d(this) == y5bVar) {
                return y5bVar;
            }
            pj70Var = pj70Var2;
            tuwVar = tuwVar2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pj70Var = this.b;
            tuwVar = this.a;
            uj50.b(obj);
        }
        try {
            wwd0 wwd0Var = pj70Var.h;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, new rj70.a(new oi70.a(th))));
            Unit unit = Unit.a;
            return Unit.a;
        } finally {
            tuwVar.f(null);
        }
    }
}
