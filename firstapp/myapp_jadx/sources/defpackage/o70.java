package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingTicketOutcome;
import java.math.BigDecimal;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
public final class o70 {
    public static final /* synthetic */ int a = 0;

    public static final int a(t9i t9iVar, int i) {
        boolean z = t9iVar.compareTo(t9i.i) >= 0;
        boolean z2 = i == 1;
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    public static final x4o b(NetworkInstantRacingTicketOutcome networkInstantRacingTicketOutcome) {
        BigDecimal bigDecimalG;
        networkInstantRacingTicketOutcome.getClass();
        String outcomeId = networkInstantRacingTicketOutcome.getOutcomeId();
        if (outcomeId == null) {
            outcomeId = "";
        }
        String odds = networkInstantRacingTicketOutcome.getOdds();
        if (odds == null || (bigDecimalG = b.g(odds)) == null) {
            bigDecimalG = BigDecimal.ZERO;
        }
        bigDecimalG.getClass();
        String desc = networkInstantRacingTicketOutcome.getDesc();
        if (desc == null) {
            desc = "";
        }
        String result = networkInstantRacingTicketOutcome.getResult();
        if (result == null) {
            result = "";
        }
        String marketId = networkInstantRacingTicketOutcome.getMarketId();
        return new x4o(outcomeId, bigDecimalG, desc, result, marketId != null ? marketId : "", networkInstantRacingTicketOutcome.getHit());
    }
}
