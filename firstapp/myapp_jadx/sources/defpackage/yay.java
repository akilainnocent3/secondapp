package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.EarlyPayoutMarket;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class yay {
    public static final String a(String str, boolean z) {
        if (!h(str)) {
            return str;
        }
        if (z) {
            cby.a.getClass();
            return "60180";
        }
        cby.a.getClass();
        return "18";
    }

    public static final boolean b(Selection selection, Selection selection2) {
        if (selection != null) {
            Market market = selection.b;
            if (selection2 != null) {
                Market market2 = selection2.b;
                if (!Intrinsics.g(selection.a, selection2.a)) {
                    return false;
                }
                boolean zG = Intrinsics.g(market.specifier, market2.specifier);
                boolean zG2 = Intrinsics.g(market.id, market2.id);
                if (zG || zG2) {
                    return Intrinsics.g(selection.c, selection2.c);
                }
                return false;
            }
        }
        return false;
    }

    public static final boolean c(Selection selection, Selection selection2) {
        Market market = selection.b;
        if (!Intrinsics.g(selection.a, selection2.a)) {
            return false;
        }
        EarlyPayoutMarket earlyPayoutMarketE = e(selection2.b);
        boolean zG = Intrinsics.g(market.specifier, earlyPayoutMarketE != null ? earlyPayoutMarketE.getSourceSpecifier() : null);
        if (Intrinsics.g(market.specifier, earlyPayoutMarketE != null ? earlyPayoutMarketE.getMappedSpecifier() : null) || zG) {
            return Intrinsics.g(selection.c, selection2.c);
        }
        return false;
    }

    public static final aby d(String str, String str2) {
        str.getClass();
        str2.getClass();
        aby.a aVar = aby.a.a;
        aVar.getClass();
        if (Intrinsics.g(str, aby.a.d)) {
            aVar.getClass();
            if (Intrinsics.g(str2, aby.a.e)) {
                return aVar;
            }
        }
        aby.c cVar = aby.c.a;
        cVar.getClass();
        if (Intrinsics.g(str, aby.c.d)) {
            cVar.getClass();
            if (Intrinsics.g(str2, aby.c.e)) {
                return cVar;
            }
        }
        aby.b bVar = aby.b.a;
        bVar.getClass();
        if (!Intrinsics.g(str, aby.b.d)) {
            return null;
        }
        bVar.getClass();
        if (Intrinsics.g(str2, aby.b.e)) {
            return bVar;
        }
        return null;
    }

    public static final EarlyPayoutMarket e(Market market) {
        return akf.b(market, cby.a, true);
    }

    public static final boolean f(RegularMarketRule regularMarketRule) {
        if (regularMarketRule == null) {
            return false;
        }
        String str = regularMarketRule.a;
        cby.a.getClass();
        return Intrinsics.g(str, "60180");
    }

    public static final boolean g(String str) {
        if (str == null) {
            return false;
        }
        cby.a.getClass();
        return str.equals("60180");
    }

    public static final boolean h(String str) {
        if (str == null) {
            return false;
        }
        cby cbyVar = cby.a;
        cbyVar.getClass();
        if (str.equals("18")) {
            return true;
        }
        cbyVar.getClass();
        return str.equals("60180");
    }

    public static final boolean i(Selection selection) {
        Market market;
        if (selection != null && (market = selection.b) != null && market.id != null && market.specifier != null && Intrinsics.g(selection.getOutcomeId(), "12")) {
            String str = market.id;
            str.getClass();
            String str2 = market.specifier;
            str2.getClass();
            if (d(str, str2) != null) {
                return true;
            }
        }
        return false;
    }

    public static final boolean j(Selection selection) {
        EarlyPayoutMarket earlyPayoutMarketE;
        return (selection == null || (earlyPayoutMarketE = e(selection.b)) == null || !Intrinsics.g(selection.getOutcomeId(), "12") || !earlyPayoutMarketE.getSupported() || selection.q()) ? false : true;
    }
}
