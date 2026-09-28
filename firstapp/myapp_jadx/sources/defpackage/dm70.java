package defpackage;

import com.sportybet.android.instantwin.presentation.scheduledfootball.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.ScheduledFootballViewModel$observeSessionDataStatusFlow$3", f = "ScheduledFootballViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class dm70 extends tje0 implements Function2<ni70, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ d b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm70(v1b v1bVar, d dVar) {
        super(2, v1bVar);
        this.b = dVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        dm70 dm70Var = new dm70(v1bVar, this.b);
        dm70Var.a = obj;
        return dm70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ni70 ni70Var, v1b<? super Unit> v1bVar) {
        return ((dm70) create(ni70Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ni70 ni70Var = (ni70) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        jpk jpkVar = this.b.J;
        jpkVar.R0(ni70Var.a.f);
        jpkVar.T0(ni70Var.a.c);
        return Unit.a;
    }
}
