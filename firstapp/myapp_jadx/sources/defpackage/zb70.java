package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootballopenbets.handler.ScheduledFootballOpenBetsDataHandlerImpl$init$4", f = "ScheduledFootballOpenBetsDataHandlerImpl.kt", l = {62}, m = "invokeSuspend", v = 2)
public final class zb70 extends tje0 implements Function2<mi70, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ cc70 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb70(v1b v1bVar, cc70 cc70Var) {
        super(2, v1bVar);
        this.c = cc70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        zb70 zb70Var = new zb70(v1bVar, this.c);
        zb70Var.b = obj;
        return zb70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(mi70 mi70Var, v1b<? super Unit> v1bVar) {
        return ((zb70) create(mi70Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        mi70 mi70Var = (mi70) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.b = null;
            this.a = 1;
            if (this.c.b(mi70Var, this) == y5bVar) {
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
