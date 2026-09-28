package defpackage;

import com.sportybet.plugin.realsports.data.CashOutBet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.data.repository.CashoutRepositoryImpl$fetchCashoutInfoByLite$payload$1", f = "CashoutRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wq6 extends tje0 implements Function2<v5b, v1b<? super String>, Object> {
    public final /* synthetic */ fr6 a;
    public final /* synthetic */ CashOutBet b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq6(fr6 fr6Var, CashOutBet cashOutBet, v1b<? super wq6> v1bVar) {
        super(2, v1bVar);
        this.a = fr6Var;
        this.b = cashOutBet;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wq6(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super String> v1bVar) {
        return ((wq6) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return this.a.e.toJson(this.b);
    }
}
