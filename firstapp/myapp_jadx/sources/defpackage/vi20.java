package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.PreMatchSportsData;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.prematch.data.AssociateTournamentData;
import com.sportybet.plugin.realsports.prematch.data.EarlyPayoutCapability;
import com.sportybet.plugin.realsports.prematch.data.EarlyPayoutCapabilityKt;
import com.sportybet.plugin.realsports.prematch.data.LiveEventDataInPreMatch;
import com.sportybet.plugin.realsports.prematch.data.NotSortByLeaguesEvents;
import com.sportybet.plugin.realsports.prematch.data.PreMatchEventData;
import com.sportybet.plugin.realsports.prematch.data.PreMatchEventsRequestBody;
import com.sportybet.plugin.realsports.prematch.data.PreMatchSectionData;
import com.sportybet.plugin.realsports.prematch.data.PreMatchWrappedData;
import com.sportybet.plugin.realsports.prematch.data.SortByLeaguesEvents;
import com.sportybet.plugin.realsports.prematch.data.TournamentTitleData;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class vi20 {
    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    public static final AssociateTournamentData a(List<? extends Tournament> list, String str, RegularMarketRule regularMarketRule, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z, int i) {
        List listS;
        Collection collectionB;
        List<LiveEventDataInPreMatch> listB;
        Map linkedHashMap;
        str.getClass();
        regularMarketRule.getClass();
        int i2 = 0;
        if (z) {
            Tournament tournament = list != null ? (Tournament) CollectionsKt.V(0, list) : null;
            if (tournament == null) {
                listB = m2g.a;
            } else {
                listB = i == 1 ? b(tournament, str, regularMarketRule, bigDecimal, bigDecimal2, -1) : (List) c(tournament, str, regularMarketRule, bigDecimal, bigDecimal2, 0L).a;
                if (listB == null) {
                    listB = m2g.a;
                }
            }
            if (list != null) {
                int iA = jpu.a(l48.r(list, 10));
                if (iA < 16) {
                    iA = 16;
                }
                linkedHashMap = new LinkedHashMap(iA);
                for (Tournament tournament2 : list) {
                    linkedHashMap.put(tournament2, Integer.valueOf((i == 3 && Intrinsics.g(tournament2, tournament)) ? listB.size() : tournament2.eventSize));
                }
            } else {
                linkedHashMap = o2g.a;
                linkedHashMap.getClass();
            }
            return new SortByLeaguesEvents(linkedHashMap, listB);
        }
        long j = 0;
        if (list != null) {
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            Iterator<T> it = list.iterator();
            long j2 = 0;
            while (true) {
                int i3 = i2;
                if (!it.hasNext()) {
                    listS = l48.s(arrayList);
                    j = j2;
                    break;
                }
                Object next = it.next();
                i2 = i3 + 1;
                if (i3 < 0) {
                    b.q();
                    throw null;
                }
                Tournament tournament3 = (Tournament) next;
                if (i == 1) {
                    collectionB = b(tournament3, str, regularMarketRule, bigDecimal, bigDecimal2, i3);
                } else {
                    Pair<List<PreMatchEventData>, Long> pairC = c(tournament3, str, regularMarketRule, bigDecimal, bigDecimal2, j2);
                    Collection collection = (List) pairC.a;
                    long jLongValue = pairC.b.longValue();
                    collectionB = collection;
                    j2 = jLongValue;
                }
                arrayList.add(collectionB);
            }
        } else {
            listS = m2g.a;
        }
        return new NotSortByLeaguesEvents(listS, j);
    }

    public static final List<LiveEventDataInPreMatch> b(Tournament tournament, String str, RegularMarketRule regularMarketRule, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i) {
        tournament.getClass();
        str.getClass();
        regularMarketRule.getClass();
        List<Event> list = tournament.events;
        if (list == null) {
            return m2g.a;
        }
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                b.q();
                throw null;
            }
            Event event = (Event) obj;
            EarlyPayoutCapability earlyPayoutCapability = EarlyPayoutCapabilityKt.toEarlyPayoutCapability(event);
            event.getClass();
            String str2 = tournament.id;
            str2.getClass();
            arrayList.add(new LiveEventDataInPreMatch(1, regularMarketRule, str, event, str2, i != -1 ? i == 0 : i2 == 0, bigDecimal, bigDecimal2, earlyPayoutCapability.getHaveOneUpMarket(), earlyPayoutCapability.getHaveActiveOneUpMarket(), earlyPayoutCapability.getHaveTwoUpMarket(), earlyPayoutCapability.getHaveActiveTwoUpMarket(), earlyPayoutCapability.getHaveDCOneUpMarket(), earlyPayoutCapability.getHaveActiveDCOneUpMarket(), earlyPayoutCapability.getHaveOUEarlyGoalsMarket(), earlyPayoutCapability.getHaveActiveOUEarlyGoalsMarket(), null, null, 196608, null));
            i2 = i3;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [m2g] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    public static final Pair<List<PreMatchEventData>, Long> c(Tournament tournament, String str, RegularMarketRule regularMarketRule, BigDecimal bigDecimal, BigDecimal bigDecimal2, long j) {
        Object arrayList;
        long j2;
        tournament.getClass();
        str.getClass();
        regularMarketRule.getClass();
        List<Event> list = tournament.events;
        if (list != null) {
            arrayList = new ArrayList(l48.r(list, 10));
            j2 = j;
            for (Event event : list) {
                EarlyPayoutCapability earlyPayoutCapability = EarlyPayoutCapabilityKt.toEarlyPayoutCapability(event);
                event.getClass();
                String str2 = tournament.categoryId;
                str2.getClass();
                String str3 = tournament.categoryName;
                str3.getClass();
                String str4 = tournament.id;
                str4.getClass();
                String str5 = tournament.name;
                str5.getClass();
                long j3 = event.estimateStartTime;
                PreMatchEventData preMatchEventData = new PreMatchEventData(2, regularMarketRule, str, event, str2, str3, str4, str5, j3, !vjt.a(j2, j3), false, bigDecimal, bigDecimal2, earlyPayoutCapability.getHaveOneUpMarket(), earlyPayoutCapability.getHaveActiveOneUpMarket(), earlyPayoutCapability.getHaveTwoUpMarket(), earlyPayoutCapability.getHaveActiveTwoUpMarket(), earlyPayoutCapability.getHaveDCOneUpMarket(), earlyPayoutCapability.getHaveActiveDCOneUpMarket(), earlyPayoutCapability.getHaveOUEarlyGoalsMarket(), earlyPayoutCapability.getHaveActiveOUEarlyGoalsMarket(), null, null, 6291456, null);
                j2 = event.estimateStartTime;
                arrayList.add(preMatchEventData);
            }
        } else {
            arrayList = m2g.a;
            j2 = j;
        }
        return new Pair<>(arrayList, Long.valueOf(j2));
    }

    public static final PreMatchWrappedData d(BaseResponse<PreMatchSportsData> baseResponse, BaseResponse<PreMatchSportsData> baseResponse2, String str, PreMatchEventsRequestBody.OddsFilter oddsFilter, RegularMarketRule regularMarketRule, boolean z) {
        List<PreMatchSectionData> eventList;
        List<PreMatchSectionData> eventList2;
        List listS;
        Map<Tournament, Integer> eventCountMap;
        Set<Tournament> setKeySet;
        Collection collectionC;
        List<PreMatchSectionData> eventList3;
        List<PreMatchSectionData> eventList4;
        Map<Tournament, Integer> eventCountMap2;
        Integer num;
        Map<Tournament, Integer> eventCountMap3;
        Integer num2;
        baseResponse.getClass();
        baseResponse2.getClass();
        str.getClass();
        regularMarketRule.getClass();
        PreMatchSportsData preMatchSportsData = (PreMatchSportsData) n52.b(baseResponse);
        PreMatchSportsData preMatchSportsData2 = (PreMatchSportsData) n52.b(baseResponse2);
        BigDecimal bigDecimal = oddsFilter != null ? new BigDecimal(oddsFilter.getMin()) : BigDecimal.ZERO;
        BigDecimal bigDecimal2 = oddsFilter != null ? new BigDecimal(oddsFilter.getMax()) : BigDecimal.ZERO;
        List<Tournament> list = preMatchSportsData.tournaments;
        bigDecimal.getClass();
        bigDecimal2.getClass();
        AssociateTournamentData associateTournamentDataA = a(list, str, regularMarketRule, bigDecimal, bigDecimal2, z, 1);
        AssociateTournamentData associateTournamentDataA2 = a(preMatchSportsData2.tournaments, str, regularMarketRule, bigDecimal, bigDecimal2, z, 3);
        if (!z) {
            if (!(associateTournamentDataA instanceof NotSortByLeaguesEvents)) {
                associateTournamentDataA = null;
            }
            NotSortByLeaguesEvents notSortByLeaguesEvents = (NotSortByLeaguesEvents) associateTournamentDataA;
            if (!(associateTournamentDataA2 instanceof NotSortByLeaguesEvents)) {
                associateTournamentDataA2 = null;
            }
            NotSortByLeaguesEvents notSortByLeaguesEvents2 = (NotSortByLeaguesEvents) associateTournamentDataA2;
            if (notSortByLeaguesEvents == null || (eventList = notSortByLeaguesEvents.getEventList()) == null) {
                eventList = m2g.a;
            }
            if (notSortByLeaguesEvents2 == null || (eventList2 = notSortByLeaguesEvents2.getEventList()) == null) {
                eventList2 = m2g.a;
            }
            return new PreMatchWrappedData(CollectionsKt.i0(eventList2, eventList), preMatchSportsData2.moreEvents, notSortByLeaguesEvents2 != null ? notSortByLeaguesEvents2.getLastItemDay() : 0L, 0, 8, null);
        }
        if (!(associateTournamentDataA instanceof SortByLeaguesEvents)) {
            associateTournamentDataA = null;
        }
        SortByLeaguesEvents sortByLeaguesEvents = (SortByLeaguesEvents) associateTournamentDataA;
        boolean z2 = associateTournamentDataA2 instanceof SortByLeaguesEvents;
        SortByLeaguesEvents sortByLeaguesEvents2 = (SortByLeaguesEvents) (!z2 ? null : associateTournamentDataA2);
        if (!z2) {
            associateTournamentDataA2 = null;
        }
        SortByLeaguesEvents sortByLeaguesEvents3 = (SortByLeaguesEvents) associateTournamentDataA2;
        if (sortByLeaguesEvents3 == null || (eventCountMap = sortByLeaguesEvents3.getEventCountMap()) == null || (setKeySet = eventCountMap.keySet()) == null) {
            listS = m2g.a;
        } else {
            Set<Tournament> set = setKeySet;
            int iA = jpu.a(l48.r(set, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            Iterator<T> it = set.iterator();
            while (true) {
                int iIntValue = 0;
                if (!it.hasNext()) {
                    break;
                }
                Tournament tournament = (Tournament) it.next();
                int iIntValue2 = (sortByLeaguesEvents == null || (eventCountMap3 = sortByLeaguesEvents.getEventCountMap()) == null || (num2 = eventCountMap3.get(tournament)) == null) ? 0 : num2.intValue();
                if (sortByLeaguesEvents2 != null && (eventCountMap2 = sortByLeaguesEvents2.getEventCountMap()) != null && (num = eventCountMap2.get(tournament)) != null) {
                    iIntValue = num.intValue();
                }
                linkedHashMap.put(tournament, Integer.valueOf(iIntValue2 + iIntValue));
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            int i = 0;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Tournament tournament2 = (Tournament) entry.getKey();
                int iIntValue3 = ((Number) entry.getValue()).intValue();
                EarlyPayoutCapability earlyPayoutCapability = EarlyPayoutCapabilityKt.toEarlyPayoutCapability(tournament2);
                String str2 = tournament2.id;
                str2.getClass();
                TournamentTitleData tournamentTitleData = new TournamentTitleData(0, str, str2, oxc.a(tournament2.categoryName, " - ", tournament2.name), iIntValue3, i == 0, zog.h(bigDecimal, bigDecimal2), earlyPayoutCapability.getHaveOneUpMarket(), earlyPayoutCapability.getHaveActiveOneUpMarket(), earlyPayoutCapability.getHaveTwoUpMarket(), earlyPayoutCapability.getHaveActiveTwoUpMarket(), earlyPayoutCapability.getHaveDCOneUpMarket(), earlyPayoutCapability.getHaveActiveDCOneUpMarket(), earlyPayoutCapability.getHaveOUEarlyGoalsMarket(), earlyPayoutCapability.getHaveActiveOUEarlyGoalsMarket(), null, null, null, 229376, null);
                if (i == 0) {
                    i++;
                    List listC = a.c(tournamentTitleData);
                    if (sortByLeaguesEvents == null || (eventList3 = sortByLeaguesEvents.getEventList()) == null) {
                        eventList3 = m2g.a;
                    }
                    ArrayList arrayListI0 = CollectionsKt.i0(eventList3, listC);
                    if (sortByLeaguesEvents2 == null || (eventList4 = sortByLeaguesEvents2.getEventList()) == null) {
                        eventList4 = m2g.a;
                    }
                    collectionC = CollectionsKt.i0(eventList4, arrayListI0);
                } else {
                    i++;
                    collectionC = a.c(tournamentTitleData);
                }
                arrayList.add(collectionC);
            }
            listS = l48.s(arrayList);
        }
        return new PreMatchWrappedData(listS, false, 0L, 0, 14, null);
    }
}
