package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballSessionDataHandlerImpl$init$$inlined$flatMapLatest$3", f = "ScheduledFootballSessionDataHandlerImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class bj70 extends tje0 implements gaj<myh<? super l970>, rj70, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ pj70 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj70(v1b v1bVar, pj70 pj70Var) {
        super(3, v1bVar);
        this.d = pj70Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super l970> myhVar, rj70 rj70Var, v1b<? super Unit> v1bVar) {
        bj70 bj70Var = new bj70(v1bVar, this.d);
        bj70Var.b = myhVar;
        bj70Var.c = rj70Var;
        return bj70Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lyh lyhVarC;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            if (((rj70) this.c) instanceof rj70.c) {
                mg70 mg70Var = this.d.b;
                lyhVarC = ozh.c(new ag70(hzh.a(new cg70(mg70Var, null)), mg70Var), mg70Var.d);
            } else {
                lyhVarC = i2g.a;
            }
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, lyhVarC, this) == y5bVar) {
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
