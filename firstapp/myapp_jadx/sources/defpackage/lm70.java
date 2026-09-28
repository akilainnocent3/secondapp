package defpackage;

import kotlin.Unit;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballWinningDialogHandlerImpl$init$lambda$0$$inlined$flatMapLatest$1", f = "ScheduledFootballWinningDialogHandlerImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class lm70 extends tje0 implements gaj<myh<? super nm70>, t8, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ mm70 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm70(v1b v1bVar, mm70 mm70Var) {
        super(3, v1bVar);
        this.d = mm70Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super nm70> myhVar, t8 t8Var, v1b<? super Unit> v1bVar) {
        lm70 lm70Var = new lm70(v1bVar, this.d);
        lm70Var.b = myhVar;
        lm70Var.c = t8Var;
        return lm70Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            t8 t8Var = (t8) this.c;
            mg70 mg70Var = this.d.c;
            String str = t8Var != null ? t8Var.f : null;
            lyh lyhVarC = (str == null || StringsKt.U(str)) ? i2g.a : ozh.c(new jg70(hzh.a(new lg70(str, mg70Var, null)), mg70Var), mg70Var.d);
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
