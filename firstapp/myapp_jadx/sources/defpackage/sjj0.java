package defpackage;

import com.sporty.android.core.model.service.CountryCodeName;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.WithdrawBankV2ViewModel$initSupportBanks$1", f = "WithdrawBankV2ViewModel.kt", l = {375}, m = "invokeSuspend", v = 2)
public final class sjj0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ mjj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjj0(mjj0 mjj0Var, v1b<? super sjj0> v1bVar) {
        super(2, v1bVar);
        this.b = mjj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new sjj0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((sjj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        String strValueOf = null;
        if (i == 0) {
            uj50.b(obj);
            mjj0 mjj0Var = this.b;
            sr10 sr10Var = mjj0Var.n0;
            pu0.c cVar = pu0.c.a;
            CountryCodeName countryCode = mjj0Var.h0.getCountryCode();
            countryCode.getClass();
            int i2 = y300.a.C1320a.a[countryCode.ordinal()];
            if (i2 == 1) {
                strValueOf = "GTBank-gateway-GhIPSS";
            } else if (i2 == 3) {
                c100 c100Var = c100.e;
                strValueOf = String.valueOf(26003);
            }
            g1i g1iVarK = sr10Var.k(cVar, strValueOf);
            this.a = 1;
            if (bm50.p(g1iVarK, this) == y5bVar) {
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
