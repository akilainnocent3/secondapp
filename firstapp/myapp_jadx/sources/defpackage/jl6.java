package defpackage;

import com.sportybet.android.cashoutphase3.b;
import com.sportybet.plugin.realsports.data.Bet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutFragment$subscribeCashOutInfoJSSubject$1", f = "CashOutFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jl6 extends tje0 implements Function2<Bet, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl6(b bVar, v1b<? super jl6> v1bVar) {
        super(2, v1bVar);
        this.b = bVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        jl6 jl6Var = new jl6(this.b, v1bVar);
        jl6Var.a = obj;
        return jl6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Bet bet, v1b<? super Unit> v1bVar) {
        return ((jl6) create(bet, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Bet bet = (Bet) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.m0(bet);
        return Unit.a;
    }
}
