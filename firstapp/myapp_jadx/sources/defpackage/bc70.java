package defpackage;

import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootballopenbets.handler.ScheduledFootballOpenBetsDataHandlerImpl$init$lambda$1$$inlined$flatMapLatest$1", f = "ScheduledFootballOpenBetsDataHandlerImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class bc70 extends tje0 implements gaj<myh<? super mi70>, t8, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ cc70 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc70(v1b v1bVar, cc70 cc70Var) {
        super(3, v1bVar);
        this.d = cc70Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super mi70> myhVar, t8 t8Var, v1b<? super Unit> v1bVar) {
        bc70 bc70Var = new bc70(v1bVar, this.d);
        bc70Var.b = myhVar;
        bc70Var.c = t8Var;
        return bc70Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            t8 t8Var = (t8) this.c;
            mg70 mg70Var = this.d.a;
            String str = t8Var != null ? t8Var.f : null;
            lyh lyhVarC = (str == null || StringsKt.U(str)) ? i2g.a : ozh.c(new gg70(hzh.a(new ig70(str, mg70Var, null)), mg70Var), mg70Var.d);
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, lyhVarC, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a(LGxrN.qhfoRpQQP);
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
