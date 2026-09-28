package defpackage;

import com.sportybet.plugin.realsports.data.BetSelection;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class dj90 {
    public static final boolean a(List<? extends BetSelection> list) {
        list.getClass();
        if (list.isEmpty()) {
            return false;
        }
        for (BetSelection betSelection : list) {
            String str = betSelection.sportId;
            str.getClass();
            String str2 = betSelection.marketId;
            str2.getClass();
            if (iu2.a.j().g(str, str2, betSelection.specifier, betSelection.haveLive) && betSelection.eventStatus <= 2) {
                return true;
            }
        }
        return false;
    }
}
