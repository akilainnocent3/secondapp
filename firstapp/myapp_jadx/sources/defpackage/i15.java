package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class i15 {
    public static final /* synthetic */ int a = 0;

    public static final List a(String str, List list) {
        Market market;
        List<Outcome> list2;
        Outcome outcome;
        if (list == null || list.isEmpty()) {
            return m2g.a;
        }
        LinkedHashMap linkedHashMapA = apg.a(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Event event = (Event) it.next();
            List<Market> list3 = event.markets;
            Selection selection = null;
            if (list3 != null && (market = (Market) CollectionsKt.firstOrNull(list3)) != null && (list2 = market.outcomes) != null && (outcome = (Outcome) CollectionsKt.firstOrNull(list2)) != null && market.status != 3 && !event.isBetBuilderChild()) {
                selection = new Selection(event, market, outcome, (List) linkedHashMapA.get(market.id));
                selection.f = str;
            }
            if (selection != null) {
                arrayList.add(selection);
            }
        }
        return arrayList;
    }
}
