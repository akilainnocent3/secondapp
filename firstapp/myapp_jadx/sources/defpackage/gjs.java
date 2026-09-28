package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class gjs {
    public static final fjs a = new fjs();
    public static final g0h0 b = new g0h0(new ob10(1), new fwh0());
    public static final g0h0 c = new g0h0(new vvh0(), new wvh0());
    public static final g0h0 d = new g0h0(new xvh0(), new yvh0());
    public static final g0h0 e = new g0h0(new zvh0(), new awh0());
    public static final g0h0 f = new g0h0(new hxn(1), new wb10(1));
    public static final g0h0 g = new g0h0(new bwh0(), new cwh0());
    public static final g0h0 h = new g0h0(new mxn(1), new nxn(1));
    public static final g0h0 i = new g0h0(new oxn(2), new dwh0());
    public static final g0h0 j = new g0h0(new ewh0(), new u00(1));
    public static final /* synthetic */ int k = 0;

    public static final boolean a(Market market) {
        List<Outcome> list;
        String str;
        if (market != null && market.status == 0 && (list = market.outcomes) != null) {
            if (!list.isEmpty()) {
                for (Outcome outcome : list) {
                    if (outcome.isActive != 1 || (str = outcome.odds) == null || str.length() == 0) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final ArrayList b(String str, List list) {
        ArrayList arrayListA = kw5.a(list);
        for (Object obj : list) {
            Market market = (Market) obj;
            if (Intrinsics.g(str, market.id) && market.showOutcomeByStatus()) {
                arrayListA.add(obj);
            }
        }
        ArrayList arrayList = new ArrayList(arrayListA);
        o48.v(a, arrayList);
        return arrayList;
    }

    public static final ArrayList c(Event event, String str) {
        event.getClass();
        Iterable iterable = event.markets;
        if (iterable == null) {
            iterable = m2g.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            Market market = (Market) obj;
            if (market != null && Intrinsics.g(str, market.id) && market.showOutcomeByStatus() && a(market)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        o48.v(a, arrayList2);
        return arrayList2;
    }

    public static final ArrayList d(Event event, String str) {
        event.getClass();
        Iterable iterable = event.markets;
        if (iterable == null) {
            iterable = m2g.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            Market market = (Market) obj;
            if (market != null && Intrinsics.g(str, market.id) && market.showOutcomeByStatus()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        o48.v(a, arrayList2);
        return arrayList2;
    }

    public static final ArrayList e(ArrayList arrayList) {
        ArrayList arrayListR = CollectionsKt.R(arrayList);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayListR.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListR.get(i2);
            i2++;
            String str = ((Market) obj).specifier;
            if (str != null) {
                arrayList2.add(str);
            }
        }
        return arrayList2;
    }

    public static final Market f(List list) {
        Object next;
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (a((Market) next)) {
                return (Market) next;
            }
        }
        next = null;
        return (Market) next;
    }

    public static final boolean g(RegularMarketRule regularMarketRule) {
        regularMarketRule.getClass();
        return hi9.a(regularMarketRule) || yay.f(regularMarketRule);
    }
}
