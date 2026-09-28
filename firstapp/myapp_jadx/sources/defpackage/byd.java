package defpackage;

import com.sporty.android.core.model.pocket.deposit.sportybank.SportyBankDto;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositDedicatedAccountViewModel$initAllSportyBankList$1", f = "DepositDedicatedAccountViewModel.kt", l = {105}, m = "invokeSuspend", v = 2)
public final class byd extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ yxd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byd(yxd yxdVar, v1b<? super byd> v1bVar) {
        super(2, v1bVar);
        this.b = yxdVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new byd(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((byd) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            lyh<lk50<List<SportyBankDto>>> lyhVarF = this.b.l0.F(pu0.c.a);
            this.a = 1;
            if (bm50.p(lyhVarF, this) == y5bVar) {
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
