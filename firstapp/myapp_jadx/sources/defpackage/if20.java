package defpackage;

import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sportybet.plugin.realsports.data.Event;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.PreMatchEventViewModel$onEventInitialised$1", f = "PreMatchEventViewModel.kt", l = {402}, m = "invokeSuspend", v = 2)
public final class if20 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ of20 b;
    public final /* synthetic */ Event c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if20(of20 of20Var, Event event, v1b<? super if20> v1bVar) {
        super(2, v1bVar);
        this.b = of20Var;
        this.c = event;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new if20(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((if20) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        of20 of20Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            w1p w1pVar = of20Var.A;
            String str = this.c.sport.id;
            this.a = 1;
            w1pVar.getClass();
            obj = !Intrinsics.g(str, "sr:sport:1") ? Boolean.FALSE : qq1.k(w1pVar.a, BOConfigParam.DedicatedTeamPageEnabled, w1pVar.b.b().a(), this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        sd20 sd20Var = of20Var.f;
        Event event = of20Var.l0;
        of20Var.a0.m(sd20Var.a(this.c, true, (event == null && of20Var.m0 == null) ? false : true, event != null, of20Var.m0 != null, !of20Var.n0.isEmpty(), zBooleanValue));
        return Unit.a;
    }
}
