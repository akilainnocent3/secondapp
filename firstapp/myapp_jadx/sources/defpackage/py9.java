package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.BetBuilderInRound;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderSelection;
import com.sportybet.android.instantwin.newtork.model.response.EventInRound;
import com.sportybet.android.instantwin.newtork.model.response.MarketInRound;
import com.sportybet.android.instantwin.newtork.model.response.OutcomeInRound;
import com.sportybet.android.instantwin.newtork.model.response.Round;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class py9 {
    public static final op8 a = new op8(237908743, new ky9(), false);
    public static final op8 b = new op8(-1528581544, new my9(), false);
    public static final StackTraceElement[] c = new StackTraceElement[0];
    public static final /* synthetic */ int d = 0;

    public static qcn a(Round round) {
        ArrayList arrayList;
        List<MarketInRound> list = round.markets;
        list.getClass();
        int iA = jpu.a(l48.r(list, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : list) {
            linkedHashMap.put(((MarketInRound) obj).marketId, obj);
        }
        List<OutcomeInRound> list2 = round.outcomes;
        list2.getClass();
        int iA2 = jpu.a(l48.r(list2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA2 >= 16 ? iA2 : 16);
        for (Object obj2 : list2) {
            linkedHashMap2.put(((OutcomeInRound) obj2).outcomeId, obj2);
        }
        List<EventInRound> list3 = round.events;
        list3.getClass();
        ArrayList arrayList2 = new ArrayList(l48.r(list3, 10));
        for (EventInRound eventInRound : list3) {
            List<BetBuilderInRound> list4 = round.buildAndGoItems.get(eventInRound.eventId);
            if (list4 == null) {
                list4 = n1a0.c;
            }
            ArrayList arrayList3 = new ArrayList(l48.r(list4, 10));
            for (BetBuilderInRound betBuilderInRound : list4) {
                List<BetBuilderSelection> list5 = betBuilderInRound.selections;
                if (list5 != null) {
                    arrayList = new ArrayList(l48.r(list5, 10));
                    for (BetBuilderSelection betBuilderSelection : list5) {
                        MarketInRound marketInRound = (MarketInRound) linkedHashMap.get(betBuilderSelection.marketId);
                        String str = betBuilderSelection.marketId;
                        String str2 = betBuilderSelection.outcomeId;
                        arrayList.add(new BetBuilderSelection(str, str2, marketInRound, (OutcomeInRound) kpu.c(str2, linkedHashMap2), null, CollectionsKt.A0(linkedHashMap2.values())));
                    }
                } else {
                    arrayList = null;
                }
                arrayList3.add(new BetBuilderInRound(betBuilderInRound.id, betBuilderInRound.odds, false, arrayList));
            }
            arrayList2.add(new cf5(round.roundId, eventInRound, new wf5(a4h.b(arrayList3))));
        }
        return a4h.b(arrayList2);
    }
}
