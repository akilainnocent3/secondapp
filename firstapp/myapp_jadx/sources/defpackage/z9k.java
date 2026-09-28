package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.EarlyPayoutMarket;
import com.sportybet.plugin.realsports.data.Market;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class z9k {
    public final jrm a;
    public final mjf b;
    public final t880 c;
    public final c980 d;

    public z9k(jrm jrmVar, mjf mjfVar, t880 t880Var, c980 c980Var) {
        jrmVar.getClass();
        mjfVar.getClass();
        t880Var.getClass();
        c980Var.getClass();
        this.a = jrmVar;
        this.b = mjfVar;
        this.c = t880Var;
        this.d = c980Var;
    }

    public final okf a(Selection selection, boolean z, boolean z2) {
        okf cVar;
        String mappedMarketId;
        String mappedSpecifier;
        if (selection == null) {
            return okf.d.a;
        }
        Market market = selection.b;
        if (!z2) {
            return okf.d.a;
        }
        if (this.a.m0()) {
            return okf.d.a;
        }
        if (!this.b.d(ckf.c)) {
            return okf.d.a;
        }
        if (yay.i(selection)) {
            String str = market.id;
            str.getClass();
            String str2 = market.specifier;
            str2.getClass();
            cVar = new okf.a(str, str2, z);
        } else if (yay.j(selection)) {
            EarlyPayoutMarket earlyPayoutMarketE = yay.e(market);
            String str3 = "";
            if (earlyPayoutMarketE == null || (mappedMarketId = earlyPayoutMarketE.getMappedMarketId()) == null) {
                mappedMarketId = "";
            }
            if (earlyPayoutMarketE != null && (mappedSpecifier = earlyPayoutMarketE.getMappedSpecifier()) != null) {
                str3 = mappedSpecifier;
            }
            cVar = new okf.e(mappedMarketId, str3, z);
        } else {
            EarlyPayoutMarket earlyPayoutMarketE2 = yay.e(market);
            cVar = (earlyPayoutMarketE2 == null || (Intrinsics.g(selection.getOutcomeId(), "12") && earlyPayoutMarketE2.getSupported() && !selection.q())) ? okf.d.a : new okf.c(z);
        }
        Boolean boolC = this.d.c(selection, c980.a.a);
        if (this.c.a(o980.a(selection), t880.a.b) || boolC != null) {
            if (cVar instanceof okf.a) {
                okf.a aVar = (okf.a) cVar;
                return new okf.b(aVar.a, aVar.b, aVar.c, boolC != null ? boolC.booleanValue() : true);
            }
            if (cVar instanceof okf.e) {
                okf.e eVar = (okf.e) cVar;
                return new okf.b(eVar.a, eVar.b, eVar.c, boolC != null ? boolC.booleanValue() : false);
            }
        }
        return cVar;
    }
}
