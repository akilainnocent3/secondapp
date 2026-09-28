package defpackage;

import com.sporty.android.core.model.cashout.CashOutInfo;
import com.sportybet.android.cashoutphase3.b;
import com.sportybet.plugin.realsports.data.Bet;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutFragment$subscribeDebugLiteApiFlow$1", f = "CashOutFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class kl6 extends tje0 implements Function2<CashOutInfo, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl6(b bVar, v1b<? super kl6> v1bVar) {
        super(2, v1bVar);
        this.b = bVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        kl6 kl6Var = new kl6(this.b, v1bVar);
        kl6Var.a = obj;
        return kl6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CashOutInfo cashOutInfo, v1b<? super Unit> v1bVar) {
        return ((kl6) create(cashOutInfo, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        CashOutInfo cashOutInfo = (CashOutInfo) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        String betId = cashOutInfo.getBetId();
        if (betId == null) {
            return Unit.a;
        }
        String maxCashOutAmount = cashOutInfo.getMaxCashOutAmount();
        if (maxCashOutAmount == null) {
            return Unit.a;
        }
        xh6 xh6Var = this.b.c0;
        if (xh6Var == null) {
            Intrinsics.n("adapter");
            throw null;
        }
        ArrayList arrayList = xh6Var.A;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            pl6 pl6Var = (pl6) obj2;
            Bet bet = pl6Var.a;
            if (Intrinsics.g(bet != null ? bet.id : null, betId)) {
                pl6Var.C = maxCashOutAmount;
            }
        }
        xh6Var.p();
        return Unit.a;
    }
}
