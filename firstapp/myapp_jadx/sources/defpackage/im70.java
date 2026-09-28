package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballWinningDialogHandlerImpl$init$$inlined$flatMapLatest$1", f = "ScheduledFootballWinningDialogHandlerImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class im70 extends tje0 implements gaj<myh<? super nm70>, Boolean, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ mm70 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im70(v1b v1bVar, mm70 mm70Var) {
        super(3, v1bVar);
        this.d = mm70Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super nm70> myhVar, Boolean bool, v1b<? super Unit> v1bVar) {
        im70 im70Var = new im70(v1bVar, this.d);
        im70Var.b = myhVar;
        im70Var.c = bool;
        return im70Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lyh lyhVarF;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            if (((Boolean) this.c).booleanValue()) {
                mm70 mm70Var = this.d;
                lyhVarF = r0i.f(mm70Var.d.getAccountHolderFlow(), new lm70(null, mm70Var));
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
