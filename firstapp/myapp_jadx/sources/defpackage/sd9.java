package defpackage;

import com.sportybet.android.multimaker.domain.model.MultiMakerEvent;
import com.sportybet.android.multimaker.domain.model.MultiMakerItem;
import com.sportybet.android.multimaker.domain.model.MultiMakerMarket;
import com.sportybet.android.multimaker.domain.model.MultiMakerOutcome;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.Tournament;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class sd9 {
    public static final op8 a = new op8(31615921, new rd9(), false);

    public static final ArrayList a(List list) {
        List<Outcome> list2;
        ArrayList arrayListA = kw5.a(list);
        for (Object obj : list) {
            Event event = (Event) obj;
            if (!event.isBetBuilderChild() && !event.isBetBuilderParent()) {
                arrayListA.add(obj);
            }
        }
        ArrayList arrayList = new ArrayList(l48.r(arrayListA, 10));
        int size = arrayListA.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayListA.get(i);
            i++;
            Event event2 = (Event) obj2;
            event2.getClass();
            MultiMakerEvent multiMakerEventA = hc9.a(event2);
            List<Market> list3 = event2.markets;
            list3.getClass();
            MultiMakerMarket multiMakerMarketA = dhw.a((Market) CollectionsKt.firstOrNull(list3));
            List<Market> list4 = event2.markets;
            list4.getClass();
            Market market = (Market) CollectionsKt.firstOrNull(list4);
            arrayList.add(new MultiMakerItem(multiMakerEventA, multiMakerMarketA, phw.a((market == null || (list2 = market.outcomes) == null) ? null : (Outcome) CollectionsKt.firstOrNull(list2)), 24));
        }
        return arrayList;
    }

    public static final ArrayList b(List list) {
        ArrayList arrayListA = kw5.a(list);
        for (Object obj : list) {
            if (!((Selection) obj).p()) {
                arrayListA.add(obj);
            }
        }
        ArrayList arrayList = new ArrayList(l48.r(arrayListA, 10));
        int size = arrayListA.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayListA.get(i);
            i++;
            Selection selection = (Selection) obj2;
            selection.getClass();
            arrayList.add(new MultiMakerItem(hc9.a(selection.a), dhw.a(selection.b), phw.a(selection.c), 24));
        }
        return arrayList;
    }

    public static final Selection c(MultiMakerItem multiMakerItem) {
        Object bVar;
        multiMakerItem.getClass();
        Tournament tournament = new Tournament();
        MultiMakerEvent multiMakerEvent = multiMakerItem.a;
        MultiMakerOutcome multiMakerOutcome = multiMakerItem.c;
        tournament.id = multiMakerEvent.y;
        Category category = new Category();
        MultiMakerEvent multiMakerEvent2 = multiMakerItem.a;
        category.id = multiMakerEvent2.w;
        category.tournament = tournament;
        Sport sport = new Sport();
        sport.id = multiMakerEvent2.v;
        sport.category = category;
        Event event = new Event();
        event.eventId = multiMakerEvent2.a;
        event.categoryId = multiMakerEvent2.w;
        event.awayTeamName = multiMakerEvent2.i;
        event.estimateStartTime = multiMakerEvent2.c;
        event.homeTeamName = multiMakerEvent2.f;
        event.matchStatus = multiMakerEvent2.e;
        event.productStatus = multiMakerEvent2.b;
        event.status = multiMakerEvent2.d;
        event.sport = sport;
        Market market = new Market();
        MultiMakerMarket multiMakerMarket = multiMakerItem.b;
        market.id = multiMakerMarket.a;
        market.product = multiMakerMarket.c;
        market.desc = multiMakerMarket.d;
        market.status = multiMakerMarket.e;
        if (multiMakerMarket.b.length() > 0) {
            market.specifier = multiMakerMarket.b;
        }
        Outcome outcome = new Outcome();
        outcome.id = multiMakerOutcome.a;
        outcome.odds = multiMakerOutcome.b;
        try {
            zi50.a aVar = zi50.b;
            bVar = Double.valueOf(Double.parseDouble(multiMakerOutcome.c));
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (zi50.a(bVar) != null) {
            bVar = Double.valueOf(0.0d);
        }
        outcome.probability = ((Number) bVar).doubleValue();
        outcome.isActive = multiMakerOutcome.d;
        outcome.desc = multiMakerOutcome.e;
        return new Selection(event, market, outcome);
    }

    public static final String d(MultiMakerItem multiMakerItem) {
        multiMakerItem.getClass();
        String str = multiMakerItem.a.a;
        MultiMakerMarket multiMakerMarket = multiMakerItem.b;
        int i = multiMakerMarket.c;
        String str2 = multiMakerMarket.a;
        String str3 = multiMakerItem.c.a;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("^");
        sb.append(i);
        sb.append("^");
        sb.append(str2);
        String strA = uf80.a(sb, "^", str3);
        return multiMakerMarket.b.length() > 0 ? tug.a(strA, "^", multiMakerMarket.b) : strA;
    }
}
