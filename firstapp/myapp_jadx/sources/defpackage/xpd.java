package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositBankTransferOneTimeAccountViewModel$insufficientFundsStateFlow$4", f = "DepositBankTransferOneTimeAccountViewModel.kt", l = {299}, m = "invokeSuspend", v = 2)
public final class xpd extends tje0 implements Function2<Unit, v1b<? super xi7>, Object> {
    public int a;
    public final /* synthetic */ fqd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xpd(fqd fqdVar, v1b<? super xpd> v1bVar) {
        super(2, v1bVar);
        this.b = fqdVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xpd(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, v1b<? super xi7> v1bVar) {
        return ((xpd) create(unit, v1bVar)).invokeSuspend(Unit.a);
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
        fqd fqdVar = this.b;
        zi7 zi7Var = fqdVar.o0;
        fqdVar.v0.e();
        this.a = 1;
        Object objB = zi7.b(zi7Var, 25, null, null, this, 12);
        return objB == y5bVar ? y5bVar : objB;
    }
}
