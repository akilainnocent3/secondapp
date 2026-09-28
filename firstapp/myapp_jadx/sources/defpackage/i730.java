package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballTicketOutcome;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class i730 {
    public static final void a(final long j, final imf0 imf0Var, final Function2 function2, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(-684938728);
        if ((i & 6) == 0) {
            i2 = (bVarI.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(imf0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function2) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            chf chfVar = lkf0.a;
            hna.b(new j730[]{tp0.a(j, iza.a), chfVar.a(((imf0) bVarI.O(chfVar)).e(imf0Var))}, function2, bVarI, ((i2 >> 3) & 112) | 8);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: h730
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    i730.a(j, imf0Var, function2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final wk70 b(NetworkScheduledFootballTicketOutcome networkScheduledFootballTicketOutcome) {
        BigDecimal bigDecimalG;
        networkScheduledFootballTicketOutcome.getClass();
        String outcomeId = networkScheduledFootballTicketOutcome.getOutcomeId();
        if (outcomeId == null) {
            outcomeId = "";
        }
        String odds = networkScheduledFootballTicketOutcome.getOdds();
        if (odds == null || (bigDecimalG = kotlin.text.b.g(odds)) == null) {
            bigDecimalG = BigDecimal.ZERO;
        }
        bigDecimalG.getClass();
        String desc = networkScheduledFootballTicketOutcome.getDesc();
        if (desc == null) {
            desc = "";
        }
        String marketId = networkScheduledFootballTicketOutcome.getMarketId();
        return new wk70(outcomeId, bigDecimalG, desc, marketId != null ? marketId : "", networkScheduledFootballTicketOutcome.getHit());
    }
}
