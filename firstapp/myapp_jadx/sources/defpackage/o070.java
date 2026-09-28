package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballBetslipHandlerImpl$init$5", f = "ScheduledFootballBetslipHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class o070 extends tje0 implements Function2<bxg0<? extends bz3, ? extends ft90, ? extends nmw>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ q070 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o070(v1b v1bVar, q070 q070Var) {
        super(2, v1bVar);
        this.b = q070Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        o070 o070Var = new o070(v1bVar, this.b);
        o070Var.a = obj;
        return o070Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(bxg0<? extends bz3, ? extends ft90, ? extends nmw> bxg0Var, v1b<? super Unit> v1bVar) {
        return ((o070) create(bxg0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        bz3 bz3Var;
        bz3 bz3Var2;
        bxg0 bxg0Var = (bxg0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        bz3 bz3Var3 = (bz3) bxg0Var.a;
        ft90 ft90Var = (ft90) bxg0Var.b;
        nmw nmwVar = (nmw) bxg0Var.c;
        boolean z = ft90Var.c;
        boolean z2 = nmwVar.d;
        wwd0 wwd0Var = this.b.e;
        do {
            value = wwd0Var.getValue();
            bz3Var = bz3.MULTIPLE;
            if ((bz3Var3 != bz3Var || !z2) && ((bz3Var3 == (bz3Var2 = bz3.SINGLE) && z) || !z2)) {
                bz3Var = bz3Var2;
            }
        } while (!wwd0Var.g(value, bz3Var));
        return Unit.a;
    }
}
