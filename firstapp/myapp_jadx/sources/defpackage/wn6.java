package defpackage;

import com.sporty.android.core.model.cashout.CashOutInfo;
import com.sportybet.android.cashoutphase3.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutViewModel$4", f = "CashOutViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wn6 extends tje0 implements Function2<CashOutInfo, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ h b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn6(h hVar, v1b<? super wn6> v1bVar) {
        super(2, v1bVar);
        this.b = hVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        wn6 wn6Var = new wn6(this.b, v1bVar);
        wn6Var.a = obj;
        return wn6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CashOutInfo cashOutInfo, v1b<? super Unit> v1bVar) {
        return ((wn6) create(cashOutInfo, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        CashOutInfo cashOutInfo = (CashOutInfo) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.H1(cashOutInfo);
        return Unit.a;
    }
}
