package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootballopenbets.handler.ScheduledFootballOpenBetsDataHandlerImpl$init$$inlined$flatMapLatest$1", f = "ScheduledFootballOpenBetsDataHandlerImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class xb70 extends tje0 implements gaj<myh<? super mi70>, dc70, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ cc70 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb70(v1b v1bVar, cc70 cc70Var) {
        super(3, v1bVar);
        this.d = cc70Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super mi70> myhVar, dc70 dc70Var, v1b<? super Unit> v1bVar) {
        xb70 xb70Var = new xb70(v1bVar, this.d);
        xb70Var.b = myhVar;
        xb70Var.c = dc70Var;
        return xb70Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lyh lyhVarF;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            if (((dc70) this.c) instanceof dc70.c) {
                cc70 cc70Var = this.d;
                lyhVarF = r0i.f(cc70Var.b.getAccountHolderFlow(), new bc70(null, cc70Var));
            } else {
                lyhVarF = i2g.a;
            }
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, lyhVarF, this) == y5bVar) {
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
