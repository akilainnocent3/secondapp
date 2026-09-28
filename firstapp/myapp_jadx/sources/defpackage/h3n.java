package defpackage;

import android.content.Context;
import com.sporty.android.core.model.MyLog;
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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h3n extends saj implements Function1<hqc, Unit> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32, types: [a6b, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.sportybet.android.instantwin.newtork.model.response.Round] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r41v0 */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v10 */
    /* JADX WARN: Type inference failed for: r41v11 */
    /* JADX WARN: Type inference failed for: r41v12 */
    /* JADX WARN: Type inference failed for: r41v13 */
    /* JADX WARN: Type inference failed for: r41v14 */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /* JADX WARN: Type inference failed for: r41v4 */
    /* JADX WARN: Type inference failed for: r41v5 */
    /* JADX WARN: Type inference failed for: r41v6 */
    /* JADX WARN: Type inference failed for: r41v7 */
    /* JADX WARN: Type inference failed for: r41v8 */
    /* JADX WARN: Type inference failed for: r41v9 */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v31, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v33, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v39, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v19, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [T] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(hqc hqcVar) {
        m3n m3nVar;
        ?? r0;
        m3n m3nVar2;
        Object obj;
        List list;
        ?? r1;
        String str;
        String str2;
        ?? r7;
        boolean z;
        Map map;
        Map map2;
        Context context;
        ?? r41;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        Map map3;
        boolean z2;
        ?? r3;
        Context context2;
        ?? r42;
        Map map4;
        Map map5;
        boolean z3;
        dq40 dq40Var;
        MarketInRound marketInRound;
        dq40 dq40Var2;
        Iterator it;
        dq40 dq40Var3;
        Object next;
        ?? r12;
        ?? r10;
        String str3;
        String str4;
        ?? r43;
        String str5;
        ?? r44;
        ?? r2;
        ?? r4;
        Object next2;
        Object next3;
        int i;
        String str6;
        String str7;
        Round round;
        hqc hqcVar2 = hqcVar;
        hqcVar2.getClass();
        i3n i3nVar = (i3n) this.receiver;
        if (hqcVar2 instanceof nqc) {
            i3nVar.m0();
            Object obj2 = ((nqc) hqcVar2).a;
            if (obj2 instanceof Round) {
                round = (Round) obj2;
            } else {
                r0 = 0;
            }
            if (r0 != 0) {
                l3n l3nVar = i3nVar.D;
                Context contextRequireContext = i3nVar.requireContext();
                contextRequireContext.getClass();
                l3nVar.getClass();
                String str8 = "";
                if (r0.events == null) {
                    r0 = round;
                    list = m2g.a;
                    r44 = "";
                    obj = null;
                } else {
                    ArrayList arrayList = new ArrayList();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    Iterable iterable = r0.tickets;
                    if (iterable == null) {
                        r0 = round;
                        iterable = m2g.a;
                    }
                    r0 = round;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        Iterable iterable2 = ((TicketInRound) it2.next()).bets;
                        if (iterable2 == null) {
                            iterable2 = m2g.a;
                        }
                        p48.w(iterable2, arrayList2);
                    }
                    int size = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj3 = arrayList2.get(i2);
                        i2++;
                        Iterable<BetDetail> iterable3 = ((Bet) obj3).betDetails;
                        if (iterable3 == null) {
                            iterable3 = m2g.a;
                        }
                        for (BetDetail betDetail : iterable3) {
                            String str9 = betDetail.eventId;
                            Object obj4 = linkedHashMap3.get(str9);
                            if (obj4 == null) {
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                linkedHashMap3.put(str9, linkedHashSet);
                                obj4 = linkedHashSet;
                            }
                            ((LinkedHashSet) obj4).add(betDetail.outcomeId);
                            linkedHashMap4.put(betDetail.outcomeId, betDetail.marketId);
                        }
                    }
                    obj = null;
                    Map lookupLeagueByLeagueIdMapping = r0.getLookupLeagueByLeagueIdMapping();
                    if (lookupLeagueByLeagueIdMapping == null) {
                        lookupLeagueByLeagueIdMapping = o2g.a;
                        lookupLeagueByLeagueIdMapping.getClass();
                    }
                    Map lookupMarketByMarketIdMapping = r0.getLookupMarketByMarketIdMapping();
                    if (lookupMarketByMarketIdMapping == null) {
                        lookupMarketByMarketIdMapping = o2g.a;
                        lookupMarketByMarketIdMapping.getClass();
                    }
                    Map lookupOutcomeByOutcomeIdMapping = r0.getLookupOutcomeByOutcomeIdMapping();
                    if (lookupOutcomeByOutcomeIdMapping == null) {
                        lookupOutcomeByOutcomeIdMapping = o2g.a;
                        lookupOutcomeByOutcomeIdMapping.getClass();
                    }
                    Map lookupBetBuilderByBetBuilderIdMapping = r0.getLookupBetBuilderByBetBuilderIdMapping();
                    if (lookupBetBuilderByBetBuilderIdMapping == null) {
                        lookupBetBuilderByBetBuilderIdMapping = o2g.a;
                        lookupBetBuilderByBetBuilderIdMapping.getClass();
                    }
                    Map lookUpOutcomeTagByOutcomeIdMapping = r0.getLookUpOutcomeTagByOutcomeIdMapping();
                    if (lookUpOutcomeTagByOutcomeIdMapping == null) {
                        lookUpOutcomeTagByOutcomeIdMapping = o2g.a;
                        lookUpOutcomeTagByOutcomeIdMapping.getClass();
                    }
                    List<EventInRound> list2 = r0.events;
                    ArrayList arrayListA = kw5.a(list2);
                    Iterator it3 = list2.iterator();
                    ?? r8 = str8;
                    while (it3.hasNext()) {
                        boolean z4 = true;
                        EventInRound eventInRound = (EventInRound) it3.next();
                        Iterator it4 = it3;
                        League league = (League) lookupLeagueByLeagueIdMapping.get(eventInRound.leagueId);
                        if (league == null) {
                            map = lookupLeagueByLeagueIdMapping;
                            map2 = lookupMarketByMarketIdMapping;
                            context = contextRequireContext;
                            r41 = r8;
                            linkedHashMap = linkedHashMap3;
                            linkedHashMap2 = linkedHashMap4;
                            map3 = lookupBetBuilderByBetBuilderIdMapping;
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            LinkedHashSet linkedHashSet2 = (LinkedHashSet) linkedHashMap3.get(eventInRound.eventId);
                            if (linkedHashSet2 != null && !linkedHashSet2.isEmpty()) {
                                Iterator it5 = linkedHashSet2.iterator();
                                r8 = r8;
                                while (it5.hasNext()) {
                                    Iterator it6 = it5;
                                    String str10 = (String) it5.next();
                                    LinkedHashMap linkedHashMap5 = linkedHashMap3;
                                    MarketInRound marketInRound2 = (MarketInRound) lookupMarketByMarketIdMapping.get(linkedHashMap4.get(str10));
                                    LinkedHashMap linkedHashMap6 = linkedHashMap4;
                                    boolean z5 = marketInRound2 == null ? z4 : false;
                                    Map map6 = lookupLeagueByLeagueIdMapping;
                                    if (marketInRound2 == null || (str5 = marketInRound2.marketId) == null) {
                                        r3 = str5;
                                        r3 = r8;
                                    }
                                    r3 = str5;
                                    OutcomeInRound outcomeBy = r0.getOutcomeBy(contextRequireContext, r3, str10, z5);
                                    if (outcomeBy == null) {
                                        itf0.a aVar = itf0.a;
                                        aVar.q(MyLog.TAG_INSTANT_WIN);
                                        aVar.n("can't find Outcome by outcomeId: %s", str10);
                                        map4 = lookupMarketByMarketIdMapping;
                                        context2 = contextRequireContext;
                                        r43 = r8;
                                        map5 = lookupBetBuilderByBetBuilderIdMapping;
                                    } else {
                                        dq40 dq40Var4 = new dq40();
                                        dq40Var4.a = r8;
                                        context2 = contextRequireContext;
                                        dq40 dq40Var5 = new dq40();
                                        dq40Var5.a = r8;
                                        if (z5) {
                                            r42 = r8;
                                            BetBuilderInRound betBuilderInRound = (BetBuilderInRound) lookupBetBuilderByBetBuilderIdMapping.get(str10);
                                            List<BetBuilderSelection> list3 = betBuilderInRound != null ? betBuilderInRound.selections : null;
                                            if (list3 == null) {
                                                list3 = m2g.a;
                                            }
                                            List<BetBuilderSelection> list4 = list3;
                                            int i3 = 0;
                                            for (Object obj5 : list3) {
                                                int i4 = i3 + 1;
                                                if (i3 < 0) {
                                                    b.q();
                                                    throw null;
                                                }
                                                MarketInRound marketInRound3 = marketInRound2;
                                                BetBuilderSelection betBuilderSelection = (BetBuilderSelection) obj5;
                                                boolean z6 = z5;
                                                Object obj6 = dq40Var4.a;
                                                Map map7 = lookupBetBuilderByBetBuilderIdMapping;
                                                MarketInRound marketInRound4 = (MarketInRound) lookupMarketByMarketIdMapping.get(betBuilderSelection.marketId);
                                                if (marketInRound4 != null) {
                                                    str4 = marketInRound4.title;
                                                } else {
                                                    r12 = 0;
                                                }
                                                if (r12 == 0) {
                                                    r12 = str4;
                                                    r12 = r42;
                                                }
                                                r12 = str4;
                                                Map map8 = lookupMarketByMarketIdMapping;
                                                ?? sb = new StringBuilder();
                                                sb.append(obj6);
                                                sb.append(r12);
                                                dq40Var4.a = sb.toString();
                                                Object obj7 = dq40Var5.a;
                                                OutcomeInRound outcomeInRound = (OutcomeInRound) lookupOutcomeByOutcomeIdMapping.get(betBuilderSelection.outcomeId);
                                                if (outcomeInRound != null) {
                                                    str3 = outcomeInRound.desc;
                                                } else {
                                                    r10 = 0;
                                                }
                                                if (r10 == 0) {
                                                    r10 = str3;
                                                    r10 = r42;
                                                }
                                                r10 = str3;
                                                ?? sb2 = new StringBuilder();
                                                sb2.append(obj7);
                                                sb2.append(r10);
                                                dq40Var5.a = sb2.toString();
                                                if (i3 != list4.size() - 1) {
                                                    dq40Var4.a = dq40Var4.a + "\n\n";
                                                    dq40Var5.a = dq40Var5.a + "\n\n";
                                                }
                                                z5 = z6;
                                                i3 = i4;
                                                marketInRound2 = marketInRound3;
                                                lookupBetBuilderByBetBuilderIdMapping = map7;
                                                lookupMarketByMarketIdMapping = map8;
                                            }
                                        } else {
                                            r42 = r8;
                                        }
                                        map4 = lookupMarketByMarketIdMapping;
                                        MarketInRound marketInRound5 = marketInRound2;
                                        boolean z7 = z5;
                                        map5 = lookupBetBuilderByBetBuilderIdMapping;
                                        Iterable iterable4 = (List) lookUpOutcomeTagByOutcomeIdMapping.get(str10);
                                        if (iterable4 == null) {
                                            iterable4 = m2g.a;
                                        }
                                        ArrayList arrayList4 = new ArrayList();
                                        ArrayList arrayList5 = new ArrayList();
                                        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                                        Iterator it7 = iterable4.iterator();
                                        while (it7.hasNext()) {
                                            w8z w8zVar = (w8z) it7.next();
                                            Iterator it8 = cd3.f.iterator();
                                            while (true) {
                                                if (!it8.hasNext()) {
                                                    it = it7;
                                                    dq40Var3 = dq40Var4;
                                                    next = null;
                                                    break;
                                                }
                                                next = it8.next();
                                                it = it7;
                                                dq40Var3 = dq40Var4;
                                                if (((cd3) next).a.equalsIgnoreCase(w8zVar.b)) {
                                                    break;
                                                }
                                                it7 = it;
                                                dq40Var4 = dq40Var3;
                                            }
                                            cd3 cd3Var = (cd3) next;
                                            int i5 = cd3Var == null ? -1 : l3n.a.a[cd3Var.ordinal()];
                                            if (i5 == z4) {
                                                arrayList4.add(Integer.valueOf(w8zVar.c));
                                            } else if (i5 == 2 || i5 == 3 || i5 == 4) {
                                                arrayList5.add(Integer.valueOf(w8zVar.c));
                                            } else if (i5 == 5) {
                                                linkedHashSet3.add(Integer.valueOf(w8zVar.c));
                                            }
                                            it7 = it;
                                            dq40Var4 = dq40Var3;
                                            z4 = true;
                                        }
                                        dq40 dq40Var6 = dq40Var4;
                                        List listA0 = CollectionsKt.A0(linkedHashSet3);
                                        if (arrayList4.isEmpty()) {
                                            z3 = z7;
                                            dq40Var = dq40Var6;
                                            marketInRound = marketInRound5;
                                            dq40Var2 = dq40Var5;
                                        } else {
                                            cd3.a aVar2 = cd3.b;
                                            z3 = z7;
                                            dq40Var = dq40Var6;
                                            marketInRound = marketInRound5;
                                            dq40Var2 = dq40Var5;
                                            l3n.b(arrayList3, marketInRound, outcomeBy, z3, dq40Var, dq40Var2, arrayList4, SimulateBetConsts.BetslipType.SINGLE);
                                        }
                                        if (!arrayList5.isEmpty()) {
                                            cd3.a aVar3 = cd3.b;
                                            l3n.b(arrayList3, marketInRound, outcomeBy, z3, dq40Var, dq40Var2, arrayList5, SimulateBetConsts.BetslipType.MULTIPLE);
                                        }
                                        r43 = r42;
                                        if (!listA0.isEmpty()) {
                                            cd3.a aVar4 = cd3.b;
                                            l3n.b(arrayList3, marketInRound, outcomeBy, z3, dq40Var, dq40Var2, listA0, "system");
                                            r43 = r42;
                                        }
                                    }
                                    arrayList3 = arrayList3;
                                    it5 = it6;
                                    linkedHashMap3 = linkedHashMap5;
                                    linkedHashMap4 = linkedHashMap6;
                                    lookupLeagueByLeagueIdMapping = map6;
                                    contextRequireContext = context2;
                                    r8 = r43;
                                    lookupBetBuilderByBetBuilderIdMapping = map5;
                                    lookupMarketByMarketIdMapping = map4;
                                    z4 = true;
                                }
                            }
                            map = lookupLeagueByLeagueIdMapping;
                            map2 = lookupMarketByMarketIdMapping;
                            context = contextRequireContext;
                            r41 = r8;
                            linkedHashMap = linkedHashMap3;
                            linkedHashMap2 = linkedHashMap4;
                            map3 = lookupBetBuilderByBetBuilderIdMapping;
                            ArrayList arrayList6 = arrayList3;
                            String str11 = eventInRound.resultSequence;
                            ?? r5 = str11;
                            if (str11 == null) {
                                r5 = r41;
                            }
                            bxg0 bxg0VarA = l3n.a(r5);
                            List list5 = (List) bxg0VarA.a;
                            List list6 = (List) bxg0VarA.b;
                            int iIntValue = ((Number) bxg0VarA.c).intValue();
                            if (arrayList6.isEmpty()) {
                                z2 = false;
                                break;
                            }
                            int size2 = arrayList6.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size2) {
                                    z2 = false;
                                    break;
                                }
                                Object obj8 = arrayList6.get(i6);
                                i6++;
                                if (((sw2) obj8).e) {
                                    z2 = true;
                                    break;
                                }
                            }
                            String str12 = eventInRound.eventId;
                            ?? r20 = str12 == null ? r41 : str12;
                            String str13 = league.name;
                            ?? r21 = str13 == null ? r41 : str13;
                            String str14 = eventInRound.homeTeamName;
                            ?? r22 = str14 == null ? r41 : str14;
                            String str15 = eventInRound.homeTeamLogo;
                            ?? r23 = str15 == null ? r41 : str15;
                            String str16 = eventInRound.awayTeamLogo;
                            ?? r25 = str16 == null ? r41 : str16;
                            String str17 = eventInRound.awayTeamName;
                            ?? r24 = str17 == null ? r41 : str17;
                            ArrayList arrayList7 = new ArrayList(4);
                            for (int i7 = 0; i7 < 4; i7++) {
                                arrayList7.add("0");
                            }
                            ArrayList arrayList8 = new ArrayList(4);
                            int i8 = 0;
                            for (int i9 = 4; i8 < i9; i9 = 4) {
                                arrayList8.add("0");
                                i8++;
                            }
                            arrayListA.add(new a4n.b(r20, r21, r22, r23, r24, r25, z2, false, iIntValue, list5, list6, arrayList6, 0, 0, arrayList7, arrayList8));
                        }
                        it3 = it4;
                        i3nVar = i3nVar;
                        linkedHashMap3 = linkedHashMap;
                        linkedHashMap4 = linkedHashMap2;
                        lookupLeagueByLeagueIdMapping = map;
                        contextRequireContext = context;
                        r8 = r41;
                        lookupBetBuilderByBetBuilderIdMapping = map3;
                        lookupMarketByMarketIdMapping = map2;
                    }
                    i3n i3nVar2 = i3nVar;
                    Map map9 = lookupLeagueByLeagueIdMapping;
                    ?? r45 = r8;
                    if (!arrayListA.isEmpty()) {
                        if (arrayListA.isEmpty()) {
                            z = false;
                            break;
                        }
                        int size3 = arrayListA.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size3) {
                                z = false;
                                break;
                            }
                            Object obj9 = arrayListA.get(i10);
                            i10++;
                            a4n a4nVar = (a4n) obj9;
                            if ((a4nVar instanceof a4n.b) && ((a4n.b) a4nVar).g) {
                                z = true;
                                break;
                            }
                        }
                        arrayList.add(new a4n.d(z));
                        p48.w(arrayListA, arrayList);
                    }
                    List<EventInRound> list7 = r0.fillingEvents;
                    ArrayList arrayListA2 = kw5.a(list7);
                    for (EventInRound eventInRound2 : list7) {
                        Map map10 = map9;
                        League league2 = (League) map10.get(eventInRound2.leagueId);
                        if (league2 != null) {
                            String str18 = eventInRound2.resultSequence;
                            if (str18 == null) {
                                r7 = str18;
                                r7 = r45;
                            }
                            r7 = str18;
                            bxg0 bxg0VarA2 = l3n.a(r7);
                            List list8 = (List) bxg0VarA2.a;
                            List list9 = (List) bxg0VarA2.b;
                            int iIntValue2 = ((Number) bxg0VarA2.c).intValue();
                            String str19 = eventInRound2.eventId;
                            ?? r26 = str19 == null ? r45 : str19;
                            String str20 = league2.name;
                            ?? r27 = str20 == null ? r45 : str20;
                            String str21 = eventInRound2.homeTeamName;
                            ?? r28 = str21 == null ? r45 : str21;
                            String str22 = eventInRound2.homeTeamLogo;
                            ?? r29 = str22 == null ? r45 : str22;
                            String str23 = eventInRound2.awayTeamLogo;
                            ?? r210 = str23 == null ? r45 : str23;
                            String str24 = eventInRound2.awayTeamName;
                            ?? r211 = str24 == null ? r45 : str24;
                            ArrayList arrayList9 = new ArrayList(4);
                            for (int i11 = 0; i11 < 4; i11++) {
                                arrayList9.add("0");
                            }
                            ArrayList arrayList10 = new ArrayList(4);
                            int i12 = 0;
                            for (int i13 = 4; i12 < i13; i13 = 4) {
                                arrayList10.add("0");
                                i12++;
                            }
                            arrayListA2.add(new a4n.a(r26, r27, r28, r29, r211, r210, iIntValue2, list8, list9, 0, 0, arrayList9, arrayList10));
                        }
                        map9 = map10;
                    }
                    if (!arrayListA2.isEmpty()) {
                        a4n a4nVar2 = (a4n) CollectionsKt.firstOrNull(arrayListA2);
                        if (a4nVar2 == null) {
                            r1 = 0;
                        } else if (a4nVar2 instanceof a4n.b) {
                            str2 = ((a4n.b) a4nVar2).b;
                        } else if (a4nVar2 instanceof a4n.a) {
                            str = ((a4n.a) a4nVar2).b;
                        } else {
                            r1 = r45;
                        }
                        if (r1 == 0) {
                            r1 = str;
                            r1 = str2;
                            r1 = r45;
                        }
                        r1 = str;
                        r1 = str2;
                        arrayList.add(new a4n.c(r1));
                        p48.w(arrayListA2, arrayList);
                    }
                    list = arrayList;
                    i3nVar = i3nVar2;
                    r44 = r45;
                }
                f4n f4nVar = (f4n) i3nVar.B.getValue();
                wwd0 wwd0Var = f4nVar.e;
                list.getClass();
                qcn qcnVarB = a4h.b(list);
                Pair<String, String> pairA = b4n.a(list);
                if (pairA != null) {
                    str7 = pairA.a;
                } else {
                    r2 = obj;
                }
                if (r2 == 0) {
                    r2 = str7;
                    r2 = r44;
                }
                r2 = str7;
                Pair<String, String> pairA2 = b4n.a(list);
                if (pairA2 != null) {
                    str6 = pairA2.b;
                } else {
                    r4 = obj;
                }
                if (r4 == 0) {
                    r4 = str6;
                    r4 = r44;
                }
                r4 = str6;
                ArrayList arrayList11 = new ArrayList();
                for (Object obj10 : qcnVarB) {
                    a4n a4nVar3 = (a4n) obj10;
                    if ((a4nVar3 instanceof a4n.b) || (a4nVar3 instanceof a4n.a)) {
                        arrayList11.add(obj10);
                    }
                }
                Iterator it9 = arrayList11.iterator();
                if (it9.hasNext()) {
                    next2 = it9.next();
                    if (it9.hasNext()) {
                        a4n a4nVar4 = (a4n) next2;
                        int size4 = a4nVar4 instanceof a4n.b ? ((a4n.b) a4nVar4).j.size() : a4nVar4 instanceof a4n.a ? ((a4n.a) a4nVar4).h.size() : 0;
                        do {
                            Object next4 = it9.next();
                            a4n a4nVar5 = (a4n) next4;
                            int size5 = a4nVar5 instanceof a4n.b ? ((a4n.b) a4nVar5).j.size() : a4nVar5 instanceof a4n.a ? ((a4n.a) a4nVar5).h.size() : 0;
                            if (size4 < size5) {
                                next2 = next4;
                                size4 = size5;
                            }
                        } while (it9.hasNext());
                    }
                } else {
                    next2 = obj;
                }
                a4n a4nVar6 = (a4n) next2;
                Iterator it10 = qcnVarB.iterator();
                do {
                    if (!it10.hasNext()) {
                        next3 = obj;
                        break;
                    }
                    next3 = it10.next();
                } while (!(((a4n) next3) instanceof a4n.b));
                a4n a4nVar7 = (a4n) next3;
                if (a4nVar7 != null) {
                    int size6 = ((a4n.b) a4nVar7).j.size() - 4;
                    if (size6 < 0) {
                        size6 = 0;
                    }
                    i = size6;
                } else {
                    i = 0;
                }
                int iMax = Math.max(0, (a4nVar6 instanceof a4n.b ? ((a4n.b) a4nVar6).j.size() : a4nVar6 instanceof a4n.a ? ((a4n.a) a4nVar6).h.size() : 4) - 4);
                ?? r6 = r2;
                while (true) {
                    Object value = wwd0Var.getValue();
                    c4n c4nVar = (c4n) value;
                    if (wwd0Var.g(value, new c4n(c4nVar.a, f3n.a(c4nVar.b, null, null, null, null, null, null, null, new f3n.h(1, qcnVarB), null, null, null, null, null, null, 16255)))) {
                        break;
                    }
                    r6 = r6;
                }
                f4nVar.c = new x2n(wwd0Var, new b3n(), new d4n(1, f4nVar, f4n.class, "handleUiAction", "handleUiAction(Lcom/sportybet/android/instantwin/presentation/kickoff/matchtracker/IbMatchTrackerUiAction;)V", 0));
                et7 et7VarD = o8i0.d(f4nVar);
                e4n e4nVar = new e4n(f4nVar, iMax, i, r6, r4, null);
                ?? r9 = obj;
                ej5.c(et7VarD, r9, r9, e4nVar, 3);
            } else if (!i3nVar.isStateSaved() && (m3nVar2 = i3nVar.E) != null) {
                r0 = round;
                m3nVar2.q0();
            }
        } else if (hqcVar2 instanceof lqc) {
            i3nVar.n0(0);
        } else if (!(hqcVar2 instanceof kqc)) {
            i3nVar.getClass();
        } else if (!i3nVar.isStateSaved() && (m3nVar = i3nVar.E) != null) {
            m3nVar.q0();
        }
        r0 = round;
        r0 = round;
        return Unit.a;
    }
}
