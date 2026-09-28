package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.betslip.liabilitycheck.domain.model.LiabilityCheckSelection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Sport;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class l8s {
    public static final LiabilityCheckSelection a(Selection selection) {
        ArrayList arrayList;
        Sport sport;
        selection.getClass();
        String eventId = selection.getEventId();
        String marketId = selection.getMarketId();
        String outcomeId = selection.getOutcomeId();
        String specifier = selection.getSpecifier();
        List<Selection> list = selection.d;
        if (list != null) {
            arrayList = new ArrayList(l48.r(list, 10));
            for (Selection selection2 : list) {
                selection2.getClass();
                arrayList.add(a(selection2));
            }
        } else {
            arrayList = null;
        }
        Event event = selection.a;
        String str = (event == null || (sport = event.sport) == null) ? null : sport.id;
        Market market = selection.b;
        return new LiabilityCheckSelection(eventId, marketId, outcomeId, specifier, arrayList, str, market != null ? Boolean.valueOf(market.isLive()) : null);
    }
}
