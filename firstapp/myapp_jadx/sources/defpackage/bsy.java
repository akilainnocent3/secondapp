package defpackage;

import com.appsflyer.internal.u;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbsy;", "Lihb0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class bsy extends ihb0 {
    public final muo d;
    public final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsy(muo muoVar) {
        super(0);
        muoVar.getClass();
        this.d = muoVar;
        this.e = "OneTwoUpTracking";
    }

    public static String A1(hvy hvyVar) {
        int iOrdinal = hvyVar.ordinal();
        if (iOrdinal == 0) {
            return "1UP";
        }
        if (iOrdinal == 1) {
            return "2UP";
        }
        if (iOrdinal == 2) {
            return AnalyticsParam.EVENT_STATUS_OFF;
        }
        uhc.a();
        return null;
    }

    public static String z1(wuy wuyVar) {
        int iOrdinal = wuyVar.ordinal();
        if (iOrdinal == 0) {
            return "homePage";
        }
        if (iOrdinal == 1) {
            return "livePage";
        }
        if (iOrdinal == 2) {
            return "sportPage";
        }
        if (iOrdinal == 3) {
            return "searchResultPage";
        }
        if (iOrdinal == 4) {
            return "myFavoritePage";
        }
        uhc.a();
        return null;
    }

    public final void B1(hvy hvyVar) {
        Map mapA = u.a("value", A1(hvyVar));
        this.d.a(AnalyticsEvent.UP_CLICK_INSURE_CHECKBOX, mapA);
        itf0.a aVar = itf0.a;
        aVar.q(this.e);
        aVar.a("reportOneTwoUpInsureCheckboxClicked: " + mapA, new Object[0]);
    }

    public final void C1(wuy wuyVar, uuy uuyVar, hvy hvyVar) {
        String str;
        Pair pair = new Pair("from", z1(wuyVar));
        int iOrdinal = uuyVar.ordinal();
        if (iOrdinal == 0) {
            str = "live";
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return;
            }
            str = "prematch";
        }
        Map mapF = kpu.f(pair, new Pair("type", str), new Pair("value", A1(hvyVar)));
        this.d.a(AnalyticsEvent.UP_CLICK_TOGGLE_MARKET_BAR, mapF);
        itf0.a aVar = itf0.a;
        aVar.q(this.e);
        aVar.a("reportOneTwoUpMarketToggleClick: " + mapF, new Object[0]);
    }

    public final void D1(wuy wuyVar, uuy uuyVar) {
        String str;
        Pair pair = new Pair("from", z1(wuyVar));
        int iOrdinal = uuyVar.ordinal();
        if (iOrdinal == 0) {
            str = "live";
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return;
            }
            str = "prematch";
        }
        Map mapF = kpu.f(pair, new Pair("type", str));
        this.d.a(AnalyticsEvent.UP_VIEW_TOGGLE_MARKET_BAR, mapF);
        itf0.a aVar = itf0.a;
        aVar.q(this.e);
        aVar.a("reportOneTwoUpMarketToggleViewed: " + mapF, new Object[0]);
    }

    public final void E1(guy guyVar, hvy hvyVar) {
        String str;
        int iOrdinal = guyVar.ordinal();
        if (iOrdinal == 0) {
            str = "betslip";
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return;
            }
            str = "quickBet";
        }
        Map mapF = kpu.f(new Pair("from", str), new Pair("value", A1(hvyVar)));
        this.d.a(AnalyticsEvent.UP_CLICK_SINGLE_SELECTION_TOGGLE, mapF);
        itf0.a aVar = itf0.a;
        aVar.q(this.e);
        aVar.a("reportOneTwoUpSingleSelectionToggleClicked: " + mapF, new Object[0]);
    }

    public final void F1(guy guyVar) {
        String str;
        int iOrdinal = guyVar.ordinal();
        if (iOrdinal == 0) {
            str = "betslip";
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return;
            }
            str = "quickBet";
        }
        Map mapA = u.a("from", str);
        this.d.a(AnalyticsEvent.UP_VIEW_SINGLE_SELECTION_TOGGLE, mapA);
        itf0.a aVar = itf0.a;
        aVar.q(this.e);
        aVar.a("reportOneTwoUpSingleSelectionToggleViewed: " + mapA, new Object[0]);
    }

    public final void H1(int i) {
        xuy xuyVar;
        String str;
        if (i != 1) {
            xuyVar = i != 3 ? xuy.b : xuy.c;
        } else {
            xuyVar = xuy.a;
        }
        int iOrdinal = xuyVar.ordinal();
        if (iOrdinal == 0) {
            str = SimulateBetConsts.BetslipType.SINGLE;
        } else if (iOrdinal == 1) {
            str = SimulateBetConsts.BetslipType.MULTIPLE;
        } else {
            if (iOrdinal != 2) {
                uhc.a();
                return;
            }
            str = "system";
        }
        Map mapA = u.a("type", str);
        this.d.a(AnalyticsEvent.UP_PLACE_BET_ONE_UP, mapA);
        itf0.a aVar = itf0.a;
        aVar.q(this.e);
        aVar.a("reportPlaceBetOneUp: " + mapA, new Object[0]);
    }

    public final void I1(int i) {
        xuy xuyVar;
        String str;
        if (i != 1) {
            xuyVar = i != 3 ? xuy.b : xuy.c;
        } else {
            xuyVar = xuy.a;
        }
        int iOrdinal = xuyVar.ordinal();
        if (iOrdinal == 0) {
            str = SimulateBetConsts.BetslipType.SINGLE;
        } else if (iOrdinal == 1) {
            str = SimulateBetConsts.BetslipType.MULTIPLE;
        } else {
            if (iOrdinal != 2) {
                uhc.a();
                return;
            }
            str = "system";
        }
        Map mapA = u.a("type", str);
        this.d.a(AnalyticsEvent.UP_PLACE_BET_TWO_UP, mapA);
        itf0.a aVar = itf0.a;
        aVar.q(this.e);
        aVar.a("reportPlaceBetTwoUp: " + mapA, new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d5  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.g(r6.id, defpackage.slc.d) == false) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G1(com.sportybet.plugin.realsports.betslip.Selection r6, boolean r7, defpackage.e8z r8) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsy.G1(com.sportybet.plugin.realsports.betslip.Selection, boolean, e8z):void");
    }
}
