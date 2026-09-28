package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.antest.InstantFootballKickOffVisibilityAnTestHelper$init$2", f = "InstantFootballKickOffVisibilityAnTestHelper.kt", l = {}, m = "invokeSuspend", v = 2)
public final class dqn extends tje0 implements Function2<gqn, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ eqn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqn(v1b v1bVar, eqn eqnVar) {
        super(2, v1bVar);
        this.b = eqnVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        dqn dqnVar = new dqn(v1bVar, this.b);
        dqnVar.a = obj;
        return dqnVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(gqn gqnVar, v1b<? super Unit> v1bVar) {
        return ((dqn) create(gqnVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        ftm ftmVar;
        gqn gqnVar = (gqn) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        eqn eqnVar = this.b;
        wwd0 wwd0Var = eqnVar.i;
        wwd0 wwd0Var2 = eqnVar.g;
        do {
            value = wwd0Var2.getValue();
        } while (!wwd0Var2.g(value, gqnVar));
        if (gqnVar instanceof gqn.a) {
            int iOrdinal = ((gqn.a) gqnVar).a.ordinal();
            if (iOrdinal == 0) {
                ftmVar = ftm.A;
            } else if (iOrdinal == 1) {
                ftmVar = ftm.B;
            } else {
                if (iOrdinal != 2) {
                    uhc.a();
                    return null;
                }
                ftmVar = ftm.C;
            }
            wwd0Var.k(null, ftmVar);
        } else if (gqnVar instanceof gqn.c) {
            wwd0Var.setValue(null);
        }
        return Unit.a;
    }
}
