package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.worldcuptournament.presentation.WorldCupPanelViewModel$onStatsClick$1", f = "WorldCupPanelViewModel.kt", l = {576}, m = "invokeSuspend", v = 2)
public final class d1k0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ t0k0 b;
    public final /* synthetic */ Event c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1k0(t0k0 t0k0Var, Event event, v1b<? super d1k0> v1bVar) {
        super(2, v1bVar);
        this.b = t0k0Var;
        this.c = event;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new d1k0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((d1k0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            b390 b390Var = this.b.P;
            Event event = this.c;
            String str = event.eventId;
            str.getClass();
            String str2 = event.sport.id;
            str2.getClass();
            m0k0.f fVar = new m0k0.f(str, str2, event.isLiveOrFinished());
            this.a = 1;
            if (b390Var.emit(fVar, this) == y5bVar) {
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
