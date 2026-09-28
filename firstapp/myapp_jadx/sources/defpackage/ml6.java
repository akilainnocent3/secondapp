package defpackage;

import android.text.TextUtils;
import com.sportybet.android.cashoutphase3.b;
import com.sportybet.plugin.realsports.data.Bet;
import com.sportybet.plugin.realsports.data.BetSelection;
import com.sportybet.plugin.realsports.data.SelectionResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutFragment$subscribeUserSelectionStatus$1", f = "CashOutFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ml6 extends tje0 implements Function2<SelectionResult.SelectionResultData, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml6(b bVar, v1b<? super ml6> v1bVar) {
        super(2, v1bVar);
        this.b = bVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ml6 ml6Var = new ml6(this.b, v1bVar);
        ml6Var.a = obj;
        return ml6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SelectionResult.SelectionResultData selectionResultData, v1b<? super Unit> v1bVar) {
        return ((ml6) create(selectionResultData, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        SelectionResult.SelectionResultData selectionResultData = (SelectionResult.SelectionResultData) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        xh6 xh6Var = this.b.c0;
        if (xh6Var == null) {
            Intrinsics.n("adapter");
            throw null;
        }
        selectionResultData.getClass();
        HashSet<Bet> hashSet = new HashSet();
        ArrayList arrayList = xh6Var.A;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            pl6 pl6Var = (pl6) obj2;
            Bet bet = pl6Var.a;
            if (bet != null) {
                for (BetSelection betSelection : bet.selections) {
                    if (TextUtils.equals(betSelection.id, selectionResultData.getSelectionId())) {
                        betSelection.status = selectionResultData.getSelectionStatus();
                        break;
                    }
                }
                pl6 pl6Var2 = xh6Var.B;
                if (pl6Var2 != null && TextUtils.equals(pl6Var.a.id, pl6Var2.a.id)) {
                    for (BetSelection betSelection2 : pl6Var2.a.selections) {
                        if (TextUtils.equals(betSelection2.id, selectionResultData.getSelectionId())) {
                            betSelection2.status = selectionResultData.getSelectionStatus();
                            break;
                        }
                    }
                    Bet bet2 = pl6Var2.a;
                    List<BetSelection> list = bet2.selections;
                    list.getClass();
                    bet2.selections = xi6.c(list);
                }
                Bet bet3 = pl6Var.a;
                bet3.getClass();
                hashSet.add(bet3);
            }
        }
        for (Bet bet4 : hashSet) {
            if (bet4.isHugeCombo) {
                xh6Var.j(bet4);
            } else {
                xh6Var.d.s(bet4);
            }
        }
        xh6Var.p();
        return Unit.a;
    }
}
