package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballSessionDataHandlerImpl$init$$inlined$flatMapLatest$1", f = "ScheduledFootballSessionDataHandlerImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class zi70 extends tje0 implements gaj<myh<? super Boolean>, Long, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ pj70 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi70(v1b v1bVar, pj70 pj70Var, String str) {
        super(3, v1bVar);
        this.d = pj70Var;
        this.e = str;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super Boolean> myhVar, Long l, v1b<? super Unit> v1bVar) {
        zi70 zi70Var = new zi70(v1bVar, this.d, this.e);
        zi70Var.b = myhVar;
        zi70Var.c = l;
        return zi70Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            ((Number) this.c).longValue();
            pj70 pj70Var = this.d;
            yzh yzhVar = new yzh(new g1i(pj70Var.c.isLoginFlow(), new dj70(null, pj70Var, this.e)), new ej70(null, pj70Var));
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, yzhVar, this) == y5bVar) {
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
