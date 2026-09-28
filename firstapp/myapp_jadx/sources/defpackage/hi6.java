package defpackage;

import com.sportybet.plugin.realsports.data.Bet;
import com.sportybet.plugin.realsports.data.BetSelection;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hi6 {
    public final yo6 a;
    public final ei6 b;
    public final List<pl6> c;

    public hi6(yo6 yo6Var, ei6 ei6Var, ArrayList arrayList) {
        yo6Var.getClass();
        arrayList.getClass();
        this.a = yo6Var;
        this.b = ei6Var;
        this.c = arrayList;
    }

    public static boolean a(BetSelection betSelection, String str, String str2, String str3) {
        String str4;
        return (Intrinsics.g(betSelection.eventId, str) && Intrinsics.g(betSelection.marketId, str2)) && (Intrinsics.g(betSelection.specifier, str3) || (((str4 = betSelection.specifier) == null || str4.length() == 0) && Intrinsics.g(str3, "~")));
    }

    public final void b(Bet bet) {
        boolean z = bet.isHugeCombo;
        xh6 xh6Var = this.b.a;
        if (z) {
            xh6Var.j(bet);
        } else {
            xh6Var.d.s(bet);
        }
    }
}
