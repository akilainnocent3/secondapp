package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.Bet;
import com.sportybet.android.instantwin.newtork.model.response.BetDetail;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class tq {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [m2g] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List] */
    public static final oq a(Bet bet) {
        ?? arrayList;
        bet.getClass();
        String str = bet.betId;
        String str2 = str == null ? "" : str;
        String str3 = bet.betGroupId;
        String str4 = str3 == null ? "" : str3;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(bet.stake);
        bigDecimalValueOf.getClass();
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(bet.potWin);
        bigDecimalValueOf2.getClass();
        BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(bet.wht);
        bigDecimalValueOf3.getClass();
        BigDecimal bigDecimalValueOf4 = BigDecimal.valueOf(bet.bonus);
        bigDecimalValueOf4.getClass();
        boolean z = bet.hit;
        List<BetDetail> list = bet.betDetails;
        if (list != null) {
            arrayList = new ArrayList(l48.r(list, 10));
            for (BetDetail betDetail : list) {
                String str5 = betDetail.eventId;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = betDetail.marketId;
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = betDetail.outcomeId;
                if (str7 == null) {
                    str7 = "";
                }
                arrayList.add(new sq(str5, str6, str7));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = m2g.a;
        }
        return new oq(str2, str4, bigDecimalValueOf, bigDecimalValueOf2, bigDecimalValueOf3, bigDecimalValueOf4, arrayList, z);
    }
}
