package defpackage;

import com.sportybet.android.cashoutphase3.h;
import com.sportybet.plugin.realsports.data.Bet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutViewModel$1", f = "CashOutViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class un6 extends tje0 implements Function2<Bet, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ h b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un6(h hVar, v1b<? super un6> v1bVar) {
        super(2, v1bVar);
        this.b = hVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        un6 un6Var = new un6(this.b, v1bVar);
        un6Var.a = obj;
        return un6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Bet bet, v1b<? super Unit> v1bVar) {
        return ((un6) create(bet, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Bet bet = (Bet) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ((Function1) this.b.C0.getValue()).invoke(bet);
        return Unit.a;
    }
}
