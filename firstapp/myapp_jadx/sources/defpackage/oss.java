package defpackage;

import android.content.Context;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.Bet;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderInRound;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderSelection;
import com.sportybet.android.instantwin.newtork.model.response.BetDetail;
import com.sportybet.android.instantwin.newtork.model.response.EventInRound;
import com.sportybet.android.instantwin.newtork.model.response.League;
import com.sportybet.android.instantwin.newtork.model.response.MarketInRound;
import com.sportybet.android.instantwin.newtork.model.response.OutcomeInRound;
import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.android.instantwin.newtork.model.response.TicketInRound;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes5.dex */
public final class oss {
    /* JADX WARN: Code duplicated, block: B:119:0x0292 A[PHI: r16
      0x0292: PHI (r16v15 java.lang.String) = (r16v11 java.lang.String), (r16v14 java.lang.String), (r16v16 java.lang.String) binds: [B:117:0x028f, B:106:0x025e, B:103:0x0253] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x020a  */
    public static ArrayList a(Context context, ji2 ji2Var, Round round) throws Throwable {
        boolean z;
        EventInRound eventInRound;
        LinkedHashMap linkedHashMap;
        String str;
        int i;
        int i2;
        Throwable th;
        boolean z2;
        m2g m2gVar;
        List list;
        boolean z3;
        int i3;
        int i4;
        String strA;
        HashMap<String, MarketInRound> map;
        boolean z4;
        String str2;
        String str3;
        boolean z5;
        String str4;
        String str5;
        String str6;
        String str7;
        Context context2 = context;
        context2.getClass();
        ji2Var.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new nss.a(false));
        HashMap<String, League> lookupLeagueByLeagueIdMapping = round.getLookupLeagueByLeagueIdMapping();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        List<TicketInRound> list2 = round.tickets;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                Iterable iterable = ((TicketInRound) it.next()).bets;
                if (iterable == null) {
                    iterable = t3g.a;
                }
                p48.w(iterable, arrayList2);
            }
            int size = arrayList2.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList2.get(i5);
                i5++;
                List<BetDetail> list3 = ((Bet) obj).betDetails;
                if (list3 != null) {
                    for (BetDetail betDetail : list3) {
                        String str8 = betDetail.eventId;
                        if (str8 != null && (str6 = betDetail.marketId) != null && (str7 = betDetail.outcomeId) != null) {
                            Object linkedHashSet = linkedHashMap2.get(str8);
                            if (linkedHashSet == null) {
                                linkedHashSet = new LinkedHashSet();
                                linkedHashMap2.put(str8, linkedHashSet);
                            }
                            ((LinkedHashSet) linkedHashSet).add(str7);
                            linkedHashMap3.put(str7, str6);
                        }
                    }
                }
            }
        }
        arrayList.add(new nss.e(sn5.b(context2, R.string.page_instant_virtual__my_events, new Object[0])));
        List<EventInRound> list4 = round.events;
        String str9 = "";
        if (list4 != null) {
            Iterator it2 = list4.iterator();
            int i6 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i7 = i6 + 1;
                if (i6 < 0) {
                    b.q();
                    throw null;
                }
                EventInRound eventInRound2 = (EventInRound) next;
                String str10 = eventInRound2.eventId;
                if (str10 == null) {
                    linkedHashMap2 = linkedHashMap2;
                    linkedHashMap = linkedHashMap3;
                    it2 = it2;
                    str = str9;
                    i2 = i7;
                } else {
                    LinkedHashSet<String> linkedHashSet2 = (LinkedHashSet) linkedHashMap2.get(str10);
                    if (linkedHashSet2 != null) {
                        ArrayList arrayList3 = new ArrayList();
                        th = null;
                        HashMap<String, MarketInRound> lookupMarketByMarketIdMapping = round.getLookupMarketByMarketIdMapping();
                        z2 = true;
                        HashMap<String, OutcomeInRound> lookupOutcomeByOutcomeIdMapping = round.getLookupOutcomeByOutcomeIdMapping();
                        HashMap<String, BetBuilderInRound> lookupBetBuilderByBetBuilderIdMapping = round.getLookupBetBuilderByBetBuilderIdMapping();
                        HashMap<String, List<w8z>> lookUpOutcomeTagByOutcomeIdMapping = round.getLookUpOutcomeTagByOutcomeIdMapping();
                        for (String str11 : linkedHashSet2) {
                            String str12 = str9;
                            LinkedHashMap linkedHashMap4 = linkedHashMap3;
                            String str13 = (String) linkedHashMap3.get(str11);
                            if (str13 == null) {
                                lookupBetBuilderByBetBuilderIdMapping = lookupBetBuilderByBetBuilderIdMapping;
                                map = lookupMarketByMarketIdMapping;
                                i3 = i6;
                                i4 = i7;
                            } else {
                                MarketInRound marketInRound = lookupMarketByMarketIdMapping.get(str13);
                                i3 = i6;
                                boolean z6 = marketInRound == null;
                                if (z6) {
                                    i4 = i7;
                                    strA = ji2Var.a();
                                } else {
                                    i4 = i7;
                                    strA = marketInRound != null ? marketInRound.marketId : null;
                                }
                                OutcomeInRound outcomeBy = round.getOutcomeBy(context2, strA, str11, z6);
                                if (outcomeBy == null) {
                                    lookupBetBuilderByBetBuilderIdMapping = lookupBetBuilderByBetBuilderIdMapping;
                                    map = lookupMarketByMarketIdMapping;
                                } else {
                                    if (z6) {
                                        BetBuilderInRound betBuilderInRound = lookupBetBuilderByBetBuilderIdMapping.get(str11);
                                        List<BetBuilderSelection> list5 = betBuilderInRound != null ? betBuilderInRound.selections : null;
                                        if (list5 != null) {
                                            str2 = str12;
                                            String str14 = str2;
                                            int i8 = 0;
                                            for (Object obj2 : list5) {
                                                int i9 = i8 + 1;
                                                if (i8 < 0) {
                                                    b.q();
                                                    throw null;
                                                }
                                                boolean z7 = z6;
                                                BetBuilderSelection betBuilderSelection = (BetBuilderSelection) obj2;
                                                List<BetBuilderSelection> list6 = list5;
                                                MarketInRound marketInRound2 = lookupMarketByMarketIdMapping.get(betBuilderSelection.marketId);
                                                OutcomeInRound outcomeInRound = lookupOutcomeByOutcomeIdMapping.get(betBuilderSelection.outcomeId);
                                                String str15 = marketInRound2 != null ? marketInRound2.title : null;
                                                if (str15 == null) {
                                                    str15 = str12;
                                                }
                                                HashMap<String, MarketInRound> map2 = lookupMarketByMarketIdMapping;
                                                str2 = ((Object) str2) + str15;
                                                String str16 = outcomeInRound != null ? outcomeInRound.desc : null;
                                                if (str16 == null) {
                                                    str16 = str12;
                                                }
                                                str14 = ((Object) str14) + str16;
                                                if (i8 != list6.size() - 1) {
                                                    str14 = ((Object) str14) + "\n\n";
                                                    str2 = ((Object) str2) + "\n\n";
                                                }
                                                list5 = list6;
                                                i8 = i9;
                                                z6 = z7;
                                                lookupMarketByMarketIdMapping = map2;
                                            }
                                            map = lookupMarketByMarketIdMapping;
                                            z4 = z6;
                                            str3 = str14;
                                        } else {
                                            map = lookupMarketByMarketIdMapping;
                                            z4 = z6;
                                            str2 = str12;
                                            str3 = str2;
                                        }
                                    } else {
                                        map = lookupMarketByMarketIdMapping;
                                        z4 = z6;
                                        str2 = str12;
                                        str3 = str2;
                                    }
                                    ArrayList arrayList4 = new ArrayList();
                                    ArrayList arrayList5 = new ArrayList();
                                    ArrayList arrayList6 = new ArrayList();
                                    List<w8z> list7 = lookUpOutcomeTagByOutcomeIdMapping.get(str11);
                                    if (list7 != null) {
                                        for (w8z w8zVar : list7) {
                                            String str17 = w8zVar.b;
                                            int i10 = w8zVar.c;
                                            switch (str17.hashCode()) {
                                                case -1349076209:
                                                    str5 = str2;
                                                    if (str17.equals(SimulateBetConsts.BetslipType.CUTBET)) {
                                                        arrayList5.add(Integer.valueOf(i10));
                                                    }
                                                    break;
                                                case -902265784:
                                                    str5 = str2;
                                                    if (str17.equals(SimulateBetConsts.BetslipType.SINGLE)) {
                                                        arrayList4.add(Integer.valueOf(i10));
                                                    }
                                                    break;
                                                case -887328209:
                                                    str5 = str2;
                                                    if (str17.equals("system")) {
                                                        arrayList6.add(Integer.valueOf(i10));
                                                    }
                                                    break;
                                                case 653829648:
                                                    str5 = str2;
                                                    if (str17.equals(SimulateBetConsts.BetslipType.MULTIPLE)) {
                                                        arrayList5.add(Integer.valueOf(i10));
                                                    }
                                                    break;
                                                case 1744737227:
                                                    str5 = str2;
                                                    if (str17.equals(SimulateBetConsts.BetslipType.FLEX)) {
                                                        arrayList5.add(Integer.valueOf(i10));
                                                    }
                                                    break;
                                                default:
                                                    str5 = str2;
                                                    break;
                                            }
                                            str2 = str5;
                                        }
                                    }
                                    String str18 = str2;
                                    if (arrayList4.isEmpty()) {
                                        z5 = z4;
                                        str4 = str18;
                                    } else {
                                        z5 = z4;
                                        str4 = str18;
                                        arrayList3.addAll(b(arrayList4, SimulateBetConsts.BetslipType.SINGLE, marketInRound, outcomeBy, z5, str4, str3));
                                    }
                                    if (!arrayList5.isEmpty()) {
                                        arrayList3.addAll(b(arrayList5, SimulateBetConsts.BetslipType.MULTIPLE, marketInRound, outcomeBy, z5, str4, str3));
                                    }
                                    if (!arrayList6.isEmpty()) {
                                        arrayList3.addAll(b(arrayList6, "system", marketInRound, outcomeBy, z5, str4, str3));
                                    }
                                }
                            }
                            context2 = context;
                            i6 = i3;
                            lookupBetBuilderByBetBuilderIdMapping = lookupBetBuilderByBetBuilderIdMapping;
                            lookupMarketByMarketIdMapping = map;
                            str9 = str12;
                            linkedHashMap3 = linkedHashMap4;
                            i7 = i4;
                        }
                        linkedHashMap = linkedHashMap3;
                        str = str9;
                        i = i6;
                        i2 = i7;
                        list = arrayList3;
                    } else {
                        linkedHashMap = linkedHashMap3;
                        str = str9;
                        i = i6;
                        i2 = i7;
                        th = null;
                        z2 = true;
                        m2gVar = m2g.a;
                    }
                    if (i == 0) {
                        list = m2gVar;
                        z3 = z2;
                    } else {
                        list = m2gVar;
                        z3 = false;
                    }
                    String str19 = eventInRound2.homeTeamName;
                    String str20 = str19 == null ? str : str19;
                    String str21 = eventInRound2.homeTeamLogo;
                    String str22 = str21 == null ? str : str21;
                    String str23 = eventInRound2.awayTeamName;
                    String str24 = str23 == null ? str : str23;
                    String str25 = eventInRound2.awayTeamLogo;
                    String str26 = str25 == null ? str : str25;
                    String str27 = eventInRound2.resultSequence;
                    arrayList.add(new nss.c(str10, str20, str22, str24, str26, str27 == null ? str : str27, o8i0.b(str27, !z3), true, !list.isEmpty(), false, z3));
                    ArrayList arrayList7 = new ArrayList(l48.r(list, 10));
                    int i11 = 0;
                    for (Object obj3 : list) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            b.q();
                            throw th;
                        }
                        arrayList7.add(new nss.b(str10, (sw2) obj3, i11 == list.size() + (-1) ? z2 : false));
                        i11 = i12;
                    }
                    arrayList.addAll(arrayList7);
                }
                context2 = context;
                linkedHashMap2 = linkedHashMap2;
                it2 = it2;
                str9 = str;
                linkedHashMap3 = linkedHashMap;
                i6 = i2;
            }
        }
        String str28 = str9;
        boolean z8 = true;
        List<EventInRound> list8 = round.fillingEvents;
        League league = (list8 == null || (eventInRound = (EventInRound) CollectionsKt.firstOrNull(list8)) == null) ? null : lookupLeagueByLeagueIdMapping.get(eventInRound.leagueId);
        String str29 = league != null ? league.name : null;
        if (str29 == null) {
            str29 = str28;
        }
        arrayList.add(new nss.e(str29));
        List<EventInRound> list9 = round.fillingEvents;
        if (list9 != null) {
            for (EventInRound eventInRound3 : list9) {
                String str30 = eventInRound3.eventId;
                if (str30 == null) {
                    z = z8;
                } else {
                    String str31 = eventInRound3.homeTeamName;
                    if (str31 == null) {
                        str31 = str28;
                    }
                    String str32 = eventInRound3.homeTeamLogo;
                    if (str32 == null) {
                        str32 = str28;
                    }
                    String str33 = eventInRound3.awayTeamName;
                    if (str33 == null) {
                        str33 = str28;
                    }
                    String str34 = eventInRound3.awayTeamLogo;
                    if (str34 == null) {
                        str34 = str28;
                    }
                    String str35 = eventInRound3.resultSequence;
                    z = z8;
                    arrayList.add(new nss.c(str30, str31, str32, str33, str34, str35 == null ? str28 : str35, o8i0.b(str35, z), false, false, false, false));
                }
                z8 = z;
            }
        }
        return arrayList;
    }

    public static ArrayList b(ArrayList arrayList, String str, MarketInRound marketInRound, OutcomeInRound outcomeInRound, boolean z, String str2, String str3) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size() % 3 == 0 ? arrayList.size() / 3 : (arrayList.size() / 3) + 1;
        int i = 0;
        while (i < size) {
            int i2 = i * 3;
            i++;
            int size2 = i * 3;
            if (size2 >= arrayList.size()) {
                size2 = arrayList.size();
            }
            String str4 = marketInRound != null ? marketInRound.title : null;
            if (str4 == null) {
                str4 = "";
            }
            arrayList2.add(new sw2(str4, outcomeInRound.desc, outcomeInRound.odds, new a88(str, arrayList.subList(i2, size2)), z, false, outcomeInRound.hit));
            if (z) {
                arrayList2.add(new sw2(str2, str3, "", new a88(str, arrayList.subList(i2, size2)), false, true, outcomeInRound.hit));
            }
        }
        return arrayList2;
    }
}
