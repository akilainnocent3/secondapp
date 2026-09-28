package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.OutcomeEnum;
import com.sportybet.plugin.realsports.data.Sport;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class zty {
    public static final boolean a(yty ytyVar) {
        Market market;
        Sport sport;
        ytyVar.getClass();
        gty gtyVar = ytyVar.c;
        Selection selection = ytyVar.a;
        int iOrdinal = gtyVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
            if (ytyVar.d) {
                Event event = selection.a;
                if (Intrinsics.g((event == null || (sport = event.sport) == null) ? null : sport.id, "sr:sport:1") && (market = selection.b) != null && market.product == 3) {
                    if (Intrinsics.g(market != null ? market.id : null, "60200")) {
                        Outcome outcome = selection.c;
                        String str = outcome != null ? outcome.id : null;
                        if (Intrinsics.g(str, OutcomeEnum.Home.getId()) || Intrinsics.g(str, OutcomeEnum.Away.getId())) {
                            return true;
                        }
                    }
                }
            }
        } else if (iOrdinal != 5) {
            uhc.a();
            return false;
        }
        return false;
    }
}
