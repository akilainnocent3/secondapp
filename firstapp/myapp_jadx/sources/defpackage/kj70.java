package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballSessionDataHandlerImpl$init$7", f = "ScheduledFootballSessionDataHandlerImpl.kt", l = {133}, m = "invokeSuspend", v = 2)
public final class kj70 extends tje0 implements Function2<l970, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ pj70 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj70(v1b v1bVar, pj70 pj70Var) {
        super(2, v1bVar);
        this.c = pj70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        kj70 kj70Var = new kj70(v1bVar, this.c);
        kj70Var.b = obj;
        return kj70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(l970 l970Var, v1b<? super Unit> v1bVar) {
        return ((kj70) create(l970Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        l970 l970Var = (l970) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.b = null;
            this.a = 1;
            if (this.c.h(l970Var, this) == y5bVar) {
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
