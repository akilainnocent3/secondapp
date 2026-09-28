package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballSessionDataHandlerImpl$init$$inlined$flatMapLatest$2", f = "ScheduledFootballSessionDataHandlerImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class aj70 extends tje0 implements gaj<myh<? super Long>, rj70, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ pj70 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj70(v1b v1bVar, pj70 pj70Var) {
        super(3, v1bVar);
        this.d = pj70Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super Long> myhVar, rj70 rj70Var, v1b<? super Unit> v1bVar) {
        aj70 aj70Var = new aj70(v1bVar, this.d);
        aj70Var.b = myhVar;
        aj70Var.c = rj70Var;
        return aj70Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            rj70 rj70Var = (rj70) this.c;
            lyh or60Var = !(rj70Var instanceof rj70.c) ? i2g.a : new or60(new ij70(rj70Var, this.d, null));
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, or60Var, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
