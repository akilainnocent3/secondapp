package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.EarlyPayoutMarket;
import com.sportybet.plugin.realsports.data.Market;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class qvy {
    public static final /* synthetic */ int a = 0;

    public static final boolean a(Selection selection, Selection selection2) {
        if (selection == null || selection2 == null || !Intrinsics.g(selection.a, selection2.a)) {
            return false;
        }
        Market market = selection.b;
        String str = market != null ? market.specifier : null;
        Market market2 = selection2.b;
        if (akf.h(str, market2 != null ? market2.specifier : null)) {
            return Intrinsics.g(selection.c, selection2.c);
        }
        return false;
    }

    public static final EarlyPayoutMarket b(Market market) {
        return akf.b(market, svy.a, false);
    }

    public static final boolean c(Selection selection) {
        return b(selection != null ? selection.b : null) != null;
    }

    public static final boolean d(Selection selection) {
        Market market;
        return Intrinsics.g((selection == null || (market = selection.b) == null) ? null : market.id, "60210");
    }

    public static final Selection e(Selection selection) {
        selection.getClass();
        Market market = selection.b;
        if (market == null || b(market) == null) {
            return null;
        }
        Selection selectionS = g880.s(selection);
        Market market2 = selectionS.b;
        rvy rvyVar = rvy.a;
        rvyVar.getClass();
        market2.id = rvy.b;
        rvyVar.getClass();
        market2.specifier = rvy.c;
        return selectionS;
    }
}
