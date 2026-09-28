package defpackage;

import com.sporty.android.book.domain.entity.BetTypeAnyWinConfig;
import com.sporty.android.book.domain.entity.BetTypeConfig;
import com.sporty.android.core.model.MyLog;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Outcome;
import java.math.BigDecimal;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class t2k {
    public final nkb0 a;
    public final jrm b;

    public t2k(nkb0 nkb0Var, jrm jrmVar) {
        nkb0Var.getClass();
        jrmVar.getClass();
        this.a = nkb0Var;
        this.b = jrmVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006d  */
    public final rl0 a() {
        BetTypeAnyWinConfig anyWin;
        BigDecimal bigDecimal;
        boolean z;
        String str;
        Object bVar;
        Selection selection;
        BetTypeConfig betTypeConfigM = this.a.m();
        if (betTypeConfigM == null || (anyWin = betTypeConfigM.getAnyWin()) == null) {
            return rl0.a;
        }
        jrm jrmVar = this.b;
        if (!jrmVar.W()) {
            return rl0.a;
        }
        ArrayList arrayListU = jrmVar.U();
        boolean z2 = true;
        if (arrayListU != null && arrayListU.isEmpty()) {
            z = false;
            break;
        }
        int size = arrayListU.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            }
            Object obj = arrayListU.get(i);
            i++;
            Outcome outcome = ((Selection) obj).c;
            if (outcome == null || (str = outcome.odds) == null) {
                bigDecimal = BigDecimal.ZERO;
            } else {
                try {
                    zi50.a aVar = zi50.b;
                    bVar = new BigDecimal(str);
                } catch (Throwable th) {
                    zi50.a aVar2 = zi50.b;
                    bVar = new zi50.b(th);
                }
                Throwable thA = zi50.a(bVar);
                if (thA != null) {
                    itf0.a aVar3 = itf0.a;
                    aVar3.q(MyLog.TAG_BET_SLIP);
                    aVar3.o(thA);
                }
                BigDecimal bigDecimal2 = BigDecimal.ZERO;
                if (bVar instanceof zi50.b) {
                    bVar = bigDecimal2;
                }
                bigDecimal = (BigDecimal) bVar;
                if (bigDecimal == null) {
                    bigDecimal = BigDecimal.ZERO;
                }
            }
            if (bigDecimal.compareTo(anyWin.getMinSelectionOdds()) < 0) {
                z = true;
                break;
            }
        }
        if (arrayListU != null && arrayListU.isEmpty()) {
            z2 = false;
            break;
        }
        int size2 = arrayListU.size();
        int i2 = 0;
        do {
            if (i2 >= size2) {
                z2 = false;
                break;
            }
            Object obj2 = arrayListU.get(i2);
            i2++;
            selection = (Selection) obj2;
            Outcome outcome2 = selection.c;
            if ((outcome2 != null ? outcome2.oddsChangesFlag : 0) != 0 || qz3.i(selection)) {
                break;
            }
        } while (!qz3.j(selection));
        if (z && z2) {
            return rl0.d;
        }
        if (z) {
            return rl0.c;
        }
        return z2 ? rl0.b : rl0.a;
    }
}
