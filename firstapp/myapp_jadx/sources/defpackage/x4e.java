package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositOtherBanksViewModel$insufficientFundsStateFlow$4", f = "DepositOtherBanksViewModel.kt", l = {274}, m = "invokeSuspend", v = 2)
public final class x4e extends tje0 implements Function2<Unit, v1b<? super xi7>, Object> {
    public int a;
    public final /* synthetic */ f5e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4e(f5e f5eVar, v1b<? super x4e> v1bVar) {
        super(2, v1bVar);
        this.b = f5eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new x4e(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, v1b<? super xi7> v1bVar) {
        return ((x4e) create(unit, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Exception {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        f5e f5eVar = this.b;
        zi7 zi7Var = f5eVar.n0;
        f5eVar.u0.e();
        this.a = 1;
        Object objB = zi7.b(zi7Var, 21, null, null, this, 12);
        return objB == y5bVar ? y5bVar : objB;
    }
}
