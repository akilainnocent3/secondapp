package defpackage;

import com.sportybet.plugin.realsports.data.EarlyPayoutMarket;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Tournament;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class akf {
    public static final /* synthetic */ int a = 0;

    public static final EarlyPayoutMarket a(Market market) {
        List<EarlyPayoutMarket> list;
        Object obj = null;
        if (market == null || (list = market.earlyPayoutMarkets) == null) {
            return null;
        }
        for (Object obj2 : list) {
            EarlyPayoutMarket earlyPayoutMarket = (EarlyPayoutMarket) obj2;
            earlyPayoutMarket.getClass();
            if (g(earlyPayoutMarket, market.id, market.specifier)) {
                obj = obj2;
                break;
            }
        }
        return (EarlyPayoutMarket) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v8, types: [m2g] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.ArrayList] */
    public static final EarlyPayoutMarket b(Market market, fkf fkfVar, boolean z) {
        ?? arrayList;
        fkfVar.getClass();
        Object obj = null;
        if (market == null) {
            return null;
        }
        List<EarlyPayoutMarket> list = market.earlyPayoutMarkets;
        if (!z) {
            if (list == null) {
                return null;
            }
            for (Object obj2 : list) {
                EarlyPayoutMarket earlyPayoutMarket = (EarlyPayoutMarket) obj2;
                if (Intrinsics.g(earlyPayoutMarket.getMappedMarketId(), fkfVar.a()) && Intrinsics.g(earlyPayoutMarket.getSourceMarketId(), fkfVar.c())) {
                    obj = obj2;
                    break;
                }
            }
            return (EarlyPayoutMarket) obj;
        }
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj3 : list) {
                EarlyPayoutMarket earlyPayoutMarket2 = (EarlyPayoutMarket) obj3;
                if (Intrinsics.g(earlyPayoutMarket2.getMappedMarketId(), fkfVar.a()) && Intrinsics.g(earlyPayoutMarket2.getSourceMarketId(), fkfVar.c())) {
                    arrayList.add(obj3);
                }
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = m2g.a;
        }
        for (Object obj4 : arrayList) {
            EarlyPayoutMarket earlyPayoutMarket3 = (EarlyPayoutMarket) obj4;
            earlyPayoutMarket3.getClass();
            if (g(earlyPayoutMarket3, market.id, market.specifier)) {
                obj = obj4;
                break;
            }
        }
        return (EarlyPayoutMarket) obj;
    }

    public static final boolean c(List list, fkf fkfVar, boolean z) {
        fkfVar.getClass();
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Market market = (Market) it.next();
                String str = market.id;
                boolean z2 = str != null && str.equals(fkfVar.a());
                boolean z3 = !z || market.status == 0;
                if (z2 && z3) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean d(ing ingVar, fkf fkfVar, boolean z, boolean z2) {
        Event event;
        List<Market> list;
        List<Market> list2;
        fkfVar.getClass();
        if (z) {
            if (ingVar == null || (list2 = ingVar.w) == null || !c(list2, fkfVar, z2)) {
                return false;
            }
        } else if (ingVar == null || (event = ingVar.a) == null || (list = event.markets) == null || !c(list, fkfVar, z2)) {
            return false;
        }
        return true;
    }

    public static boolean e(Event event, fkf fkfVar, boolean z, int i) {
        List<Market> list;
        if ((i & 4) != 0) {
            z = false;
        }
        fkfVar.getClass();
        return (event == null || (list = event.markets) == null || !c(list, fkfVar, z)) ? false : true;
    }

    public static boolean f(Tournament tournament, fkf fkfVar, boolean z, int i) {
        List<Event> list;
        List<Market> list2;
        if ((i & 4) != 0) {
            z = false;
        }
        fkfVar.getClass();
        if (tournament != null && (list = tournament.events) != null && !list.isEmpty()) {
            for (Event event : list) {
                if (event != null && (list2 = event.markets) != null && c(list2, fkfVar, z)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean g(EarlyPayoutMarket earlyPayoutMarket, String str, String str2) {
        if (Intrinsics.g(earlyPayoutMarket.getSourceMarketId(), str) && h(earlyPayoutMarket.getSourceSpecifier(), str2)) {
            return true;
        }
        return Intrinsics.g(earlyPayoutMarket.getMappedMarketId(), str) && h(earlyPayoutMarket.getMappedSpecifier(), str2);
    }

    public static final boolean h(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return str.equals(str2);
    }
}
