package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.OutcomeInRound;
import java.math.BigDecimal;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
public final class o6k0 {
    public static final n6k0 a(OutcomeInRound outcomeInRound) {
        BigDecimal bigDecimalG;
        String str = outcomeInRound.outcomeId;
        if (str == null) {
            str = "";
        }
        String str2 = outcomeInRound.odds;
        if (str2 == null || (bigDecimalG = b.g(str2)) == null) {
            bigDecimalG = BigDecimal.ZERO;
        }
        bigDecimalG.getClass();
        String str3 = outcomeInRound.desc;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = outcomeInRound.marketId;
        return new n6k0(str, bigDecimalG, str3, str4 != null ? str4 : "", outcomeInRound.hit);
    }
}
