package defpackage;

import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$observeSimulationCreateTicketStatusFlow$1", f = "BetSlipViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l73 extends tje0 implements Function2<vm90, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ q73 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l73(q73 q73Var, v1b<? super l73> v1bVar) {
        super(2, v1bVar);
        this.b = q73Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        l73 l73Var = new l73(this.b, v1bVar);
        l73Var.a = obj;
        return l73Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(vm90 vm90Var, v1b<? super Unit> v1bVar) {
        return ((l73) create(vm90Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        vm90 vm90Var = (vm90) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (!(vm90Var instanceof vm90.a)) {
            return Unit.a;
        }
        if (!(((vm90.a) vm90Var).a instanceof um90.b)) {
            return Unit.a;
        }
        Uri uriB = o7d.b(wae.REACHED_LIMITS, null);
        uriB.getClass();
        x53.i iVar = new x53.i(uriB);
        q73 q73Var = this.b;
        q73Var.q1.a(iVar);
        ej5.c(o8i0.d(q73Var), null, null, new r63(q73Var, new po3(iVar), null), 3);
        return Unit.a;
    }
}
