package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.presentation.viewmodel.CashoutSuccessSingleViewModel$trySelectOutcome$1", f = "CashoutSuccessSingleViewModel.kt", l = {74}, m = "invokeSuspend", v = 2)
public final class js6 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ks6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js6(ks6 ks6Var, v1b<? super js6> v1bVar) {
        super(2, v1bVar);
        this.b = ks6Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new js6(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((js6) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            b390 b390Var = this.b.v;
            Unit unit = Unit.a;
            this.a = 1;
            if (b390Var.emit(unit, this) == y5bVar) {
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
