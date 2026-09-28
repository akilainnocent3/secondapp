package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetDetailsViewModel$setBetTicketDetailCSTipShownAction$1", f = "BetDetailsViewModel.kt", l = {28}, m = "invokeSuspend", v = 2)
public final class mm2 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ nm2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mm2(nm2 nm2Var, v1b<? super mm2> v1bVar) {
        super(2, v1bVar);
        this.b = nm2Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new mm2(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((mm2) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            at2 at2Var = this.b.b;
            this.a = 1;
            if (at2Var.o(this) == y5bVar) {
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
