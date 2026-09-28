package defpackage;

import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.instantwin.newtork.model.error.ErrorBody;
import com.sportybet.android.instantwin.newtork.model.request.BetBuilderParameter;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderConfig;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderOutcome;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderRequest;
import com.sportybet.android.instantwin.newtork.model.response.Event;
import com.sportybet.android.instantwin.newtork.model.response.EventData;
import com.sportybet.android.instantwin.newtork.model.response.InstantWinType;
import com.sportybet.android.instantwin.newtork.model.response.Market;
import com.sportybet.android.instantwin.newtork.model.response.MarketCategory;
import com.sportybet.android.instantwin.newtork.model.response.Outcome;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes5.dex */
public final class u0v {
    public final mgb0 a;
    public final n4p b;
    public final JsonSerializeService c;
    public final rdd0 d;
    public final wsm e;
    public final ArrayList<x1v> f;
    public volatile String g;
    public BetBuilderOutcome h;
    public String i;
    public String j;
    public final HashMap<String, EventData> k;
    public final HashMap<String, Map<String, BetBuilderOutcome>> l;

    public u0v(mgb0 mgb0Var, n4p n4pVar, JsonSerializeService jsonSerializeService, rdd0 rdd0Var, wsm wsmVar) {
        mgb0Var.getClass();
        jsonSerializeService.getClass();
        rdd0Var.getClass();
        wsmVar.getClass();
        this.a = mgb0Var;
        this.b = n4pVar;
        this.c = jsonSerializeService;
        this.d = rdd0Var;
        this.e = wsmVar;
        this.f = new ArrayList<>();
        BetBuilderOutcome betBuilderOutcomeGenDefaultBetBuilder = BetBuilderOutcome.genDefaultBetBuilder();
        betBuilderOutcomeGenDefaultBetBuilder.getClass();
        this.h = betBuilderOutcomeGenDefaultBetBuilder;
        this.j = "";
        this.k = new HashMap<>();
        this.l = new HashMap<>();
    }

    public final void a() {
        this.k.clear();
        this.l.clear();
        this.g = null;
        this.i = null;
        BetBuilderOutcome betBuilderOutcomeGenDefaultBetBuilder = BetBuilderOutcome.genDefaultBetBuilder();
        betBuilderOutcomeGenDefaultBetBuilder.getClass();
        this.h = betBuilderOutcomeGenDefaultBetBuilder;
        this.j = "";
    }

    public final kqc b(bi50 bi50Var) {
        Object bVar;
        Object bVar2;
        Object obj = null;
        try {
            zi50.a aVar = zi50.b;
            ResponseBody responseBody = bi50Var.c;
            bVar = responseBody != null ? ci50.a(responseBody) : null;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        String str = (String) bVar;
        if (str != null) {
            try {
                bVar2 = this.c.fromJson(str, (Class<Object>) ErrorBody.class);
            } catch (Throwable th2) {
                zi50.a aVar3 = zi50.b;
                bVar2 = new zi50.b(th2);
            }
            if (!(bVar2 instanceof zi50.b)) {
                obj = bVar2;
            }
        }
        ErrorBody errorBody = (ErrorBody) obj;
        if ((errorBody == null || errorBody.getErrorCode() != 11000) && (errorBody == null || errorBody.getErrorCode() != 19113)) {
            return new kqc();
        }
        kqc kqcVar = new kqc();
        kqcVar.c = Long.valueOf(errorBody.getErrorCode());
        return kqcVar;
    }

    public final kqc c(Throwable th) {
        Object bVar;
        Object bVar2;
        ResponseBody responseBody;
        if (!(th instanceof tom)) {
            return new kqc();
        }
        Object obj = null;
        try {
            zi50.a aVar = zi50.b;
            bi50<?> bi50Var = ((tom) th).c;
            bVar = (bi50Var == null || (responseBody = bi50Var.c) == null) ? null : ci50.a(responseBody);
        } catch (Throwable th2) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th2);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        String str = (String) bVar;
        if (str != null) {
            try {
                bVar2 = this.c.fromJson(str, (Class<Object>) ErrorBody.class);
            } catch (Throwable th3) {
                zi50.a aVar3 = zi50.b;
                bVar2 = new zi50.b(th3);
            }
            if (!(bVar2 instanceof zi50.b)) {
                obj = bVar2;
            }
        }
        ErrorBody errorBody = (ErrorBody) obj;
        if ((errorBody == null || errorBody.getErrorCode() != 11000) && (errorBody == null || errorBody.getErrorCode() != 19113)) {
            return new kqc();
        }
        kqc kqcVar = new kqc();
        kqcVar.c = Long.valueOf(errorBody.getErrorCode());
        return kqcVar;
    }

    public final EventData d(String str) {
        String str2;
        List<String> list;
        EventData eventData = this.k.get(str);
        if (eventData == null) {
            return new EventData("", 0L, 0, m2g.a);
        }
        List<Event> list2 = eventData.events;
        list2.getClass();
        Event event = (Event) CollectionsKt.firstOrNull(list2);
        if (event == null) {
            return eventData;
        }
        List<Market> list3 = event.markets;
        list3.getClass();
        ArrayList arrayList = new ArrayList(list3);
        Iterator it = arrayList.iterator();
        it.getClass();
        ArrayList arrayList2 = new ArrayList();
        n4p n4pVar = this.b;
        BetBuilderConfig betBuilderConfig = n4pVar.i;
        if (betBuilderConfig == null || (str2 = betBuilderConfig.marketType) == null) {
            str2 = "bb";
        }
        if (str2.equals(this.i)) {
            BetBuilderConfig betBuilderConfig2 = n4pVar.i;
            if (betBuilderConfig2 != null && (list = betBuilderConfig2.supportMarkets) != null) {
                arrayList2.addAll(list);
            }
        } else {
            for (MarketCategory marketCategory : n4pVar.z(n4pVar.c())) {
                if (Intrinsics.g(marketCategory.getId(), this.i)) {
                    Iterator<T> it2 = marketCategory.getMarketTypes().iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((InstantWinType) it2.next()).getType());
                    }
                }
            }
        }
        while (it.hasNext()) {
            if (!arrayList2.contains(((Market) it.next()).type)) {
                it.remove();
            }
        }
        return new EventData(eventData.roundId, eventData.roundNumber, eventData.openBetsCount, a.c(event.cloneWithMarketChange(arrayList.size(), arrayList)));
    }

    public final void e(String str, bs3 bs3Var, String str2, boolean z, ssw<hqc> sswVar, s8o s8oVar) {
        String strRemoveItem;
        String str3;
        str.getClass();
        s8oVar.getClass();
        BetBuilderOutcome betBuilderOutcomeM47clone = this.h.m47clone();
        if (z) {
            strRemoveItem = betBuilderOutcomeM47clone.addItem(new BetBuilderRequest(bs3Var != null ? bs3Var.b : null, bs3Var != null ? bs3Var.c : null, str2));
        } else {
            strRemoveItem = betBuilderOutcomeM47clone.removeItem(new BetBuilderRequest(bs3Var != null ? bs3Var.b : null, bs3Var != null ? bs3Var.c : null, str2));
        }
        strRemoveItem.getClass();
        this.j = strRemoveItem;
        if (betBuilderOutcomeM47clone.originalData.size() <= 1) {
            this.h = betBuilderOutcomeM47clone;
            if (sswVar != null) {
                sswVar.m(new nqc(betBuilderOutcomeM47clone));
                return;
            }
            return;
        }
        if (strRemoveItem.length() == 0 || (str3 = this.g) == null) {
            return;
        }
        HashMap<String, Map<String, BetBuilderOutcome>> map = this.l;
        Map<String, BetBuilderOutcome> map2 = map.get(str3);
        if (map2 == null) {
            map2 = new HashMap<>();
            map.put(str3, map2);
        }
        BetBuilderOutcome betBuilderOutcome = map2.get(strRemoveItem);
        if (betBuilderOutcome != null) {
            this.h = betBuilderOutcome;
            if (!this.j.equals(strRemoveItem) || sswVar == null) {
                return;
            }
            sswVar.m(new nqc(this.h));
            return;
        }
        if (sswVar != null) {
            sswVar.m(new lqc());
        }
        String str4 = this.g;
        if (str4 != null) {
            s8oVar.l(new BetBuilderParameter(str, this.b.t, str4, betBuilderOutcomeM47clone.originalData), new InstantWinBizTypeTag(vcj.a(str))).G(new s0v(sswVar, this, betBuilderOutcomeM47clone, str4, strRemoveItem));
        } else if (sswVar != null) {
            sswVar.m(new kqc());
        }
    }

    public final EventData f(String str) {
        str.getClass();
        this.i = str;
        String str2 = this.g;
        if (str2 != null) {
            EventData eventData = this.k.get(str2);
            if ((eventData == null ? null : new nqc(eventData)) != null) {
                return d(str2);
            }
        }
        return null;
    }

    public final void g(String str) {
        ArrayList<x1v> arrayList = this.f;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            x1v x1vVar = arrayList.get(i);
            i++;
            x1v x1vVar2 = x1vVar;
            if (Intrinsics.g(x1vVar2 != null ? x1vVar2.a : null, str)) {
                x1vVar2.b.m(new mqc());
            }
        }
    }

    public final void h(String str, hqc hqcVar) {
        ArrayList<x1v> arrayList = this.f;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            x1v x1vVar = arrayList.get(i);
            i++;
            x1v x1vVar2 = x1vVar;
            if (Intrinsics.g(x1vVar2 != null ? x1vVar2.a : null, str)) {
                x1vVar2.b.m(hqcVar);
            }
        }
    }

    public final void i(String str, String str2, String str3, String str4, String str5) {
        n4p n4pVar = this.b;
        try {
            zi50.a aVar = zi50.b;
            xdp xdpVar = new xdp();
            String str6 = n4pVar.t;
            String str7 = "";
            if (str6 == null) {
                str6 = "";
            }
            xdpVar.i("roundId", str6);
            xdpVar.i(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, str == null ? "" : str);
            xdpVar.i("marketId", str2 == null ? "" : str2);
            xdpVar.i("outcomeId", str3 == null ? "" : str3);
            xdpVar.i("odds", str4 == null ? "" : str4);
            if (str5 != null) {
                str7 = str5;
            }
            xdpVar.i("probability", str7);
            this.e.g("Null probability for outcome in MatchEventDetailDataSource", xdpVar.toString(), new NullPointerException(), null);
            this.d.a(new a5o.x(n4pVar.c(), n4pVar.t, str, str2, str3, str4, str5), k00.d);
            Unit unit = Unit.a;
        } catch (Throwable unused) {
            zi50.a aVar2 = zi50.b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(EventData eventData) {
        try {
            zi50.a aVar = zi50.b;
            List<Event> list = eventData.events;
            list.getClass();
            ruh.a aVar2 = new ruh.a(ld80.f(new u48(list), new vlq(1)));
            while (aVar2.hasNext()) {
                bxg0 bxg0Var = (bxg0) aVar2.next();
                Event event = (Event) bxg0Var.a;
                Market market = (Market) bxg0Var.b;
                Outcome outcome = (Outcome) bxg0Var.c;
                u0v u0vVar = this;
                u0vVar.i(event.eventId, market.marketId, outcome.outcomeId, outcome.odds, outcome.probability);
                this = u0vVar;
            }
            Unit unit = Unit.a;
        } catch (Throwable unused) {
            zi50.a aVar3 = zi50.b;
        }
    }
}
