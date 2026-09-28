package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootballopenbets.handler.ScheduledFootballOpenBetsDataHandlerImpl$init$6", f = "ScheduledFootballOpenBetsDataHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ac70 extends tje0 implements Function2<dc70.a, v1b<? super Unit>, Object> {
    public final /* synthetic */ cc70 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac70(v1b v1bVar, cc70 cc70Var) {
        super(2, v1bVar);
        this.a = cc70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ac70(v1bVar, this.a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(dc70.a aVar, v1b<? super Unit> v1bVar) {
        return ((ac70) create(aVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.c.a(new tz60.h(0), k00.d, k00.c);
        return Unit.a;
    }
}
