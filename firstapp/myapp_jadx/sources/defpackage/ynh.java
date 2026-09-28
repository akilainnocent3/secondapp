package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.EarlyPayoutMarket;
import com.sportybet.plugin.realsports.data.Market;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ynh {
    /* JADX WARN: Code duplicated, block: B:68:0x0118  */
    public static String a(Selection selection, Map map) {
        Object next;
        Object next2;
        boolean zG;
        Object next3;
        Object next4;
        selection.getClass();
        Market market = selection.b;
        map.getClass();
        if (u7u.e(selection) || u7u.f(selection)) {
            String str = (String) map.get(selection);
            if (str != null) {
                return str;
            }
            Iterator it = map.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u7u.d((Selection) ((Map.Entry) next).getKey(), selection));
            Map.Entry entry = (Map.Entry) next;
            if (entry != null) {
                return (String) entry.getValue();
            }
        } else if (rlc.b(selection)) {
            String str2 = (String) map.get(selection);
            if (str2 != null) {
                return str2;
            }
            Iterator it2 = map.entrySet().iterator();
            do {
                if (!it2.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it2.next();
            } while (!rlc.a((Selection) ((Map.Entry) next4).getKey(), selection));
            Map.Entry entry2 = (Map.Entry) next4;
            if (entry2 != null) {
                return (String) entry2.getValue();
            }
        } else if (qvy.c(selection)) {
            String str3 = (String) map.get(selection);
            if (str3 != null) {
                return str3;
            }
            Iterator it3 = map.entrySet().iterator();
            do {
                if (!it3.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it3.next();
            } while (!qvy.a((Selection) ((Map.Entry) next3).getKey(), selection));
            Map.Entry entry3 = (Map.Entry) next3;
            if (entry3 != null) {
                return (String) entry3.getValue();
            }
        } else {
            if (yay.e(market) == null) {
                return (String) map.get(selection);
            }
            String str4 = (String) map.get(selection);
            if (str4 != null) {
                return str4;
            }
            Iterator it4 = map.entrySet().iterator();
            do {
                if (!it4.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it4.next();
                Map.Entry entry4 = (Map.Entry) next2;
                if (yay.b((Selection) entry4.getKey(), selection)) {
                    break;
                }
                Selection selection2 = (Selection) entry4.getKey();
                zG = false;
                if (selection2 != null && Intrinsics.g(selection2.a, selection.a)) {
                    EarlyPayoutMarket earlyPayoutMarketE = yay.e(selection2.b);
                    if (Intrinsics.g(earlyPayoutMarketE != null ? earlyPayoutMarketE.getMappedMarketId() : null, market.id) && Intrinsics.g(earlyPayoutMarketE.getMappedSpecifier(), market.specifier)) {
                        zG = Intrinsics.g(selection2.c.id, selection.c.id);
                    } else {
                        if (Intrinsics.g(earlyPayoutMarketE != null ? earlyPayoutMarketE.getSourceMarketId() : null, market.id) && Intrinsics.g(earlyPayoutMarketE.getSourceSpecifier(), market.specifier)) {
                            zG = Intrinsics.g(selection2.c.id, selection.c.id);
                        }
                    }
                }
            } while (!zG);
            Map.Entry entry5 = (Map.Entry) next2;
            if (entry5 != null) {
                return (String) entry5.getValue();
            }
        }
        return null;
    }
}
