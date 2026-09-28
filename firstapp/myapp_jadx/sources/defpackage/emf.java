package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.data.Bet;
import com.sportybet.plugin.realsports.data.BetSelection;
import com.sportybet.plugin.realsports.data.CashOut;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.FeaturesWithoutMarketStatus;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.SelectionFeatures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class emf {
    public final e8h a;
    public final fr6 b;
    public final xlf c;
    public final nzm d;

    public emf(e8h e8hVar, fr6 fr6Var, xlf xlfVar, nzm nzmVar) {
        e8hVar.getClass();
        nzmVar.getClass();
        this.a = e8hVar;
        this.b = fr6Var;
        this.c = xlfVar;
        this.d = nzmVar;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0109 A[LOOP:3: B:43:0x0103->B:45:0x0109, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x014f  */
    /* JADX WARN: Code duplicated, block: B:53:0x016f  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:69:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:89:0x0212 A[SYNTHETIC] */
    public final Object a(String str, x1b x1bVar) throws JSONException, amf {
        cmf cmfVar;
        String str2;
        List<BetSelection> list;
        List list2;
        JSONArray jSONArray;
        Object objL;
        List<SelectionFeatures> list3;
        List<BetSelection> list4;
        String str3;
        wlf wlfVar;
        ArrayList arrayList;
        Iterator<T> it;
        Object next;
        Event event;
        SelectionFeatures selectionFeaturesCopy$default;
        List<Market> list5;
        BetSelection betSelection;
        String str4 = str;
        if (x1bVar instanceof cmf) {
            cmfVar = (cmf) x1bVar;
            int i = cmfVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                cmfVar.i = i - Integer.MIN_VALUE;
            } else {
                cmfVar = new cmf(this, x1bVar);
            }
        } else {
            cmfVar = new cmf(this, x1bVar);
        }
        Object objA = cmfVar.e;
        y5b y5bVar = y5b.a;
        int i2 = cmfVar.i;
        if (i2 == 0) {
            uj50.b(objA);
            cmfVar.a = str4;
            cmfVar.i = 1;
            objA = this.b.a(str4, cmfVar);
            if (objA != y5bVar) {
            }
            return y5bVar;
        }
        if (i2 == 1) {
            str4 = cmfVar.a;
            uj50.b(objA);
        } else {
            if (i2 == 2) {
                list2 = cmfVar.d;
                List<BetSelection> list6 = cmfVar.c;
                str2 = cmfVar.b;
                uj50.b(objA);
                list = list6;
                jqa0 jqa0Var = jqa0.EDIT_BET_EVENT_USE_CASE;
                list.getClass();
                jSONArray = new JSONArray();
                for (BetSelection betSelection2 : list) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, betSelection2.eventId);
                    jSONObject.put("marketId", betSelection2.marketId);
                    jSONObject.put("specifier", betSelection2.specifier);
                    jSONObject.put("outcomeId", betSelection2.outcomeId);
                    jSONArray.put(jSONObject);
                }
                String string = jSONArray.toString();
                string.getClass();
                cmfVar.a = null;
                cmfVar.b = str2;
                cmfVar.c = list;
                cmfVar.d = list2;
                cmfVar.i = 3;
                objL = this.a.l(jqa0Var, string, cmfVar);
                if (objL != y5bVar) {
                    List<BetSelection> list7 = list;
                    objA = objL;
                    list3 = list2;
                    list4 = list7;
                    str3 = str2;
                }
                return y5bVar;
            }
            if (i2 != 3) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list3 = cmfVar.d;
            list4 = cmfVar.c;
            str3 = cmfVar.b;
            uj50.b(objA);
        }
        List<Event> list8 = (List) n52.b((BaseResponse) objA);
        str3.getClass();
        wlfVar = new wlf(list8, str3);
        for (Event event2 : list8) {
            list5 = event2.markets;
            if ((list5 != null || list5.isEmpty()) && (betSelection = list4.get(0)) != null) {
                String str5 = betSelection.outcomeDesc;
                String str6 = betSelection.outcomeId;
                String str7 = betSelection.odds;
                double d = betSelection.originalProbability;
                String str8 = betSelection.marketDesc;
                String str9 = betSelection.marketId;
                String str10 = betSelection.specifier;
                Long l = new Long(betSelection.product);
                Outcome outcome = new Outcome();
                outcome.id = str6;
                outcome.desc = str5;
                outcome.odds = str7;
                outcome.probability = d;
                outcome.isActive = 0;
                Market market = new Market();
                market.id = str9;
                market.desc = str8;
                market.status = 3;
                market.specifier = str10;
                market.product = (int) l.longValue();
                market.outcomes = a.c(outcome);
                event2.markets = a.c(market);
            }
        }
        arrayList = new ArrayList(l48.r(list3, 10));
        for (SelectionFeatures selectionFeatures : list3) {
            it = wlfVar.a.iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.g(selectionFeatures.getSelectionFeatures().getEventID(), ((Event) next).eventId));
            event = (Event) next;
            if (event != null && (selectionFeaturesCopy$default = SelectionFeatures.copy$default(selectionFeatures, event.markets.get(0).status, null, 2, null)) != null) {
                selectionFeatures = selectionFeaturesCopy$default;
            }
            arrayList.add(selectionFeatures);
        }
        iu2.a.j().W0(arrayList);
        return wlfVar;
        Bet bet = (Bet) objA;
        CashOut cashOut = bet.cashOut;
        str2 = cashOut.maxCashOutAmount;
        String str11 = cashOut.errorMsg;
        if (str11 != null) {
            if (StringsKt.U(str11)) {
                str11 = null;
            }
            if (str11 != null) {
                throw new amf(str11);
            }
        }
        list = bet.selections;
        list.getClass();
        ArrayList arrayList2 = new ArrayList(l48.r(list, 10));
        for (BetSelection betSelection3 : list) {
            betSelection3.getClass();
            List<String> list9 = dz2.a;
            int i3 = betSelection3.marketStatus;
            String str12 = betSelection3.eventId;
            str12.getClass();
            String str13 = betSelection3.odds;
            str13.getClass();
            k980 k980Var = k980.EDIT_BET;
            String str14 = betSelection3.outcomeId;
            str14.getClass();
            arrayList2.add(new SelectionFeatures(i3, new FeaturesWithoutMarketStatus(str12, str13, false, k980Var, str14)));
        }
        str2.getClass();
        cmfVar.a = null;
        cmfVar.b = str2;
        cmfVar.c = list;
        cmfVar.d = arrayList2;
        cmfVar.i = 2;
        pfd pfdVar = fse.a;
        Object objD = ej5.d(odd.b, new dmf(this, str4, str2, null), cmfVar);
        if (objD != y5b.a) {
            objD = Unit.a;
        }
        if (objD != y5bVar) {
            list2 = arrayList2;
            jqa0 jqa0Var2 = jqa0.EDIT_BET_EVENT_USE_CASE;
            list.getClass();
            jSONArray = new JSONArray();
            while (r8.hasNext()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, betSelection2.eventId);
                jSONObject2.put("marketId", betSelection2.marketId);
                jSONObject2.put("specifier", betSelection2.specifier);
                jSONObject2.put("outcomeId", betSelection2.outcomeId);
                jSONArray.put(jSONObject2);
            }
            String string2 = jSONArray.toString();
            string2.getClass();
            cmfVar.a = null;
            cmfVar.b = str2;
            cmfVar.c = list;
            cmfVar.d = list2;
            cmfVar.i = 3;
            objL = this.a.l(jqa0Var2, string2, cmfVar);
            if (objL != y5bVar) {
                List<BetSelection> list10 = list;
                objA = objL;
                list3 = list2;
                list4 = list10;
                str3 = str2;
                List<Event> list11 = (List) n52.b((BaseResponse) objA);
                str3.getClass();
                wlfVar = new wlf(list11, str3);
                while (r2.hasNext()) {
                    list5 = event2.markets;
                    if (list5 != null) {
                        String str15 = betSelection.outcomeDesc;
                        String str16 = betSelection.outcomeId;
                        String str17 = betSelection.odds;
                        double d2 = betSelection.originalProbability;
                        String str18 = betSelection.marketDesc;
                        String str19 = betSelection.marketId;
                        String str110 = betSelection.specifier;
                        Long l2 = new Long(betSelection.product);
                        Outcome outcome2 = new Outcome();
                        outcome2.id = str16;
                        outcome2.desc = str15;
                        outcome2.odds = str17;
                        outcome2.probability = d2;
                        outcome2.isActive = 0;
                        Market market2 = new Market();
                        market2.id = str19;
                        market2.desc = str18;
                        market2.status = 3;
                        market2.specifier = str110;
                        market2.product = (int) l2.longValue();
                        market2.outcomes = a.c(outcome2);
                        event2.markets = a.c(market2);
                    } else {
                        String str111 = betSelection.outcomeDesc;
                        String str112 = betSelection.outcomeId;
                        String str113 = betSelection.odds;
                        double d3 = betSelection.originalProbability;
                        String str114 = betSelection.marketDesc;
                        String str115 = betSelection.marketId;
                        String str116 = betSelection.specifier;
                        Long l3 = new Long(betSelection.product);
                        Outcome outcome3 = new Outcome();
                        outcome3.id = str112;
                        outcome3.desc = str111;
                        outcome3.odds = str113;
                        outcome3.probability = d3;
                        outcome3.isActive = 0;
                        Market market3 = new Market();
                        market3.id = str115;
                        market3.desc = str114;
                        market3.status = 3;
                        market3.specifier = str116;
                        market3.product = (int) l3.longValue();
                        market3.outcomes = a.c(outcome3);
                        event2.markets = a.c(market3);
                    }
                }
                arrayList = new ArrayList(l48.r(list3, 10));
                while (r0.hasNext()) {
                    it = wlfVar.a.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.g(selectionFeatures.getSelectionFeatures().getEventID(), ((Event) next).eventId));
                    event = (Event) next;
                    if (event != null) {
                        selectionFeatures = selectionFeaturesCopy$default;
                    }
                    arrayList.add(selectionFeatures);
                }
                iu2.a.j().W0(arrayList);
                return wlfVar;
            }
        }
        return y5bVar;
    }
}
