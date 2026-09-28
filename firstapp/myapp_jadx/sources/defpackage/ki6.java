package defpackage;

import androidx.recyclerview.widget.n;
import com.sportybet.plugin.realsports.data.Bet;
import com.sportybet.plugin.realsports.data.BetSelection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ki6 extends n.e<pl6> {
    @Override // androidx.recyclerview.widget.n.e
    public final boolean areContentsTheSame(pl6 pl6Var, pl6 pl6Var2) {
        String str;
        boolean zG;
        pl6 pl6Var3 = pl6Var;
        pl6 pl6Var4 = pl6Var2;
        pl6Var3.getClass();
        pl6Var4.getClass();
        if (!pl6Var4.w && Intrinsics.g(pl6Var3.B, pl6Var4.B) && Intrinsics.g(pl6Var3.b, pl6Var4.b) && !pl6Var4.z && pl6Var3.v == pl6Var4.v && Intrinsics.g(pl6Var3.C, pl6Var4.C)) {
            Bet bet = pl6Var3.a;
            Bet bet2 = pl6Var4.a;
            if (bet != null && bet2 != null) {
                boolean z = Intrinsics.g(bet.maxCashOutAmount, bet2.maxCashOutAmount) && bet.isCashable == bet2.isCashable && bet.isCashAbleJS == bet2.isCashAbleJS;
                BetSelection betSelectionC = pl6Var3.c();
                BetSelection betSelectionC2 = pl6Var4.c();
                if (betSelectionC == null || betSelectionC2 == null) {
                    return z;
                }
                if (!z || !Intrinsics.g(betSelectionC.currentOdds, betSelectionC2.currentOdds) || !Intrinsics.g(betSelectionC.setScore, betSelectionC2.setScore) || !Intrinsics.g(betSelectionC.pointScore, betSelectionC2.pointScore) || betSelectionC.status != betSelectionC2.status || betSelectionC.eventStatus != betSelectionC2.eventStatus || betSelectionC.marketStatus != betSelectionC2.marketStatus || betSelectionC.currentProbability != betSelectionC2.currentProbability || betSelectionC.bannedEvent != betSelectionC2.bannedEvent || !Intrinsics.g(betSelectionC.cashOutStatus, betSelectionC2.cashOutStatus)) {
                    return false;
                }
                List<String> list = betSelectionC.gameScore;
                List<String> list2 = betSelectionC2.gameScore;
                if (list != null) {
                    try {
                        str = (String) CollectionsKt.d0(list);
                    } catch (Exception unused) {
                        zG = false;
                    }
                } else {
                    str = null;
                }
                zG = Intrinsics.g(str, list2 != null ? (String) CollectionsKt.d0(list2) : null);
                return zG;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areItemsTheSame(pl6 pl6Var, pl6 pl6Var2) {
        pl6 pl6Var3 = pl6Var;
        pl6 pl6Var4 = pl6Var2;
        pl6Var3.getClass();
        pl6Var4.getClass();
        if (pl6Var3.c != pl6Var4.c) {
            return false;
        }
        Bet bet = pl6Var3.a;
        Bet bet2 = pl6Var4.a;
        if (bet == null || bet2 == null) {
            return false;
        }
        return Intrinsics.g(bet.id, bet2.id);
    }
}
