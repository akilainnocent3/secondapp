package defpackage;

import com.sporty.android.core.model.cashout.CashOutInfo;
import com.sportybet.android.cashoutphase3.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutFragment$subscribeUpdateCashoutInfo$1", f = "CashOutFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ll6 extends tje0 implements Function2<CashOutInfo, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll6(b bVar, v1b<? super ll6> v1bVar) {
        super(2, v1bVar);
        this.b = bVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ll6 ll6Var = new ll6(this.b, v1bVar);
        ll6Var.a = obj;
        return ll6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CashOutInfo cashOutInfo, v1b<? super Unit> v1bVar) {
        return ((ll6) create(cashOutInfo, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        CashOutInfo cashOutInfo = (CashOutInfo) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.f0.onNext(cashOutInfo);
        return Unit.a;
    }
}
