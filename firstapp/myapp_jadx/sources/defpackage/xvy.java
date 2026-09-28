package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.MarketExtend;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class xvy {
    public static final /* synthetic */ int a = 0;

    public static final MarketExtend a(Market market) {
        gkf gkfVarA;
        if (market == null || (gkfVarA = iu7.a(market, "60200", "1UP")) == null) {
            return null;
        }
        MarketExtend marketExtend = new MarketExtend();
        marketExtend.rootMarketId = gkfVarA.a;
        marketExtend.nodeMarketId = gkfVarA.b;
        marketExtend.notSupport = !gkfVarA.d;
        return marketExtend;
    }

    public static final MarketExtend b(Market market) {
        gkf gkfVarA;
        if (market == null || (gkfVarA = iu7.a(market, "60100", "2UP")) == null) {
            return null;
        }
        MarketExtend marketExtend = new MarketExtend();
        marketExtend.rootMarketId = gkfVarA.a;
        marketExtend.nodeMarketId = gkfVarA.b;
        marketExtend.notSupport = !gkfVarA.d;
        return marketExtend;
    }

    public static final boolean c(List list, boolean z) {
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Market market = (Market) it.next();
                boolean z2 = !z || market.status == 0;
                String str = market.id;
                if (str != null && str.equals("60200") && z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean d(Event event, boolean z, int i) {
        List<Market> list;
        if ((i & 2) != 0) {
            z = false;
        }
        return (event == null || (list = event.markets) == null || !c(list, z)) ? false : true;
    }

    public static boolean e(Tournament tournament, boolean z, int i) {
        List<Event> list;
        List<Market> list2;
        if ((i & 2) != 0) {
            z = false;
        }
        if (tournament != null && (list = tournament.events) != null && !list.isEmpty()) {
            for (Event event : list) {
                if (event != null && (list2 = event.markets) != null && c(list2, z)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean f(List list, boolean z) {
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Market market = (Market) it.next();
                boolean z2 = !z || market.status == 0;
                String str = market.id;
                if (str != null && str.equals("60100") && z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean g(Event event, boolean z, int i) {
        List<Market> list;
        if ((i & 2) != 0) {
            z = false;
        }
        return (event == null || (list = event.markets) == null || !f(list, z)) ? false : true;
    }

    public static boolean h(Tournament tournament, boolean z, int i) {
        List<Event> list;
        List<Market> list2;
        if ((i & 2) != 0) {
            z = false;
        }
        if (tournament != null && (list = tournament.events) != null && !list.isEmpty()) {
            for (Event event : list) {
                if (event != null && (list2 = event.markets) != null && f(list2, z)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean i(RegularMarketRule regularMarketRule) {
        String str;
        String str2;
        return ((regularMarketRule == null || (str2 = regularMarketRule.a) == null || !Intrinsics.g(str2, "60200")) && (regularMarketRule == null || (str = regularMarketRule.a) == null || !Intrinsics.g(str, "60100"))) ? false : true;
    }
}
