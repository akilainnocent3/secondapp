package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballOverviewStatsHandlerImpl$init$9", f = "ScheduledFootballOverviewStatsHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ee70 extends tje0 implements Function2<kd70, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ td70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee70(td70 td70Var, v1b<? super ee70> v1bVar) {
        super(2, v1bVar);
        this.b = td70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ee70 ee70Var = new ee70(this.b, v1bVar);
        ee70Var.a = obj;
        return ee70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kd70 kd70Var, v1b<? super Unit> v1bVar) {
        return ((ee70) create(kd70Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        pdd0 mVar;
        kd70 kd70Var = (kd70) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        int iOrdinal = kd70Var.a.ordinal();
        if (iOrdinal == 0) {
            mVar = new tz60.m(0);
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return null;
            }
            mVar = new tz60.n(0);
        }
        this.b.b.a(mVar, k00.d, k00.c);
        return Unit.a;
    }
}
