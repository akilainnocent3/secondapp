package defpackage;

import com.sportybet.plugin.realsports.data.EarlyPayoutMarket;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.MarketExtend;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class iu7 {
    public static final /* synthetic */ int a = 0;

    public static final gkf a(Market market, String str, String str2) {
        Object next;
        Object next2;
        if (market != null) {
            String string = StringsKt.t0(str2).toString();
            if (string == null || string.length() == 0) {
                string = null;
            }
            List<EarlyPayoutMarket> list = market.earlyPayoutMarkets;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                    EarlyPayoutMarket earlyPayoutMarket = (EarlyPayoutMarket) next2;
                    if (earlyPayoutMarket != null) {
                        if (!Intrinsics.g(earlyPayoutMarket.getMappedMarketId(), str)) {
                            String name = earlyPayoutMarket.getName();
                            String string2 = name != null ? StringsKt.t0(name).toString() : null;
                            if (string != null && string2 != null && string2.length() != 0 && string2.equals(string)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                EarlyPayoutMarket earlyPayoutMarket2 = (EarlyPayoutMarket) next2;
                if (earlyPayoutMarket2 != null) {
                    return new gkf(earlyPayoutMarket2.getSourceMarketId(), earlyPayoutMarket2.getMappedMarketId(), earlyPayoutMarket2.getMappedSpecifier(), earlyPayoutMarket2.getSupported());
                }
            }
            List<MarketExtend> list2 = market.marketExtendVOS;
            if (list2 != null) {
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    MarketExtend marketExtend = (MarketExtend) next;
                    if (marketExtend != null) {
                        if (!Intrinsics.g(marketExtend.nodeMarketId, str)) {
                            String str3 = marketExtend.name;
                            String string3 = str3 != null ? StringsKt.t0(str3).toString() : null;
                            if (string != null && string3 != null && string3.length() != 0 && string3.equals(string)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                MarketExtend marketExtend2 = (MarketExtend) next;
                if (marketExtend2 != null) {
                    String str4 = marketExtend2.rootMarketId;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = marketExtend2.nodeMarketId;
                    return new gkf(str4, str5 != null ? str5 : "", null, !marketExtend2.notSupport);
                }
            }
        }
        return null;
    }
}
