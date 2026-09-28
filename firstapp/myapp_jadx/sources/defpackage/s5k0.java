package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.BetBuilderInRound;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderSelection;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
public final class s5k0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [m2g] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    public static final r5k0 a(BetBuilderInRound betBuilderInRound) {
        BigDecimal bigDecimalG;
        ?? arrayList;
        String str = betBuilderInRound.id;
        if (str == null) {
            str = "";
        }
        String str2 = betBuilderInRound.odds;
        if (str2 == null || (bigDecimalG = b.g(str2)) == null) {
            bigDecimalG = BigDecimal.ZERO;
        }
        bigDecimalG.getClass();
        boolean hit = betBuilderInRound.getHit();
        List<BetBuilderSelection> list = betBuilderInRound.selections;
        if (list != null) {
            arrayList = new ArrayList(l48.r(list, 10));
            for (BetBuilderSelection betBuilderSelection : list) {
                String str3 = betBuilderSelection.marketId;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = betBuilderSelection.outcomeId;
                if (str4 == null) {
                    str4 = "";
                }
                arrayList.add(new t5k0(str3, str4));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = m2g.a;
        }
        return new r5k0(str, bigDecimalG, hit, arrayList);
    }
}
