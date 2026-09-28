package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;

/* JADX INFO: loaded from: classes4.dex */
public final class yjf {
    public static final /* synthetic */ int a = 0;

    public static final String a(zjf zjfVar) {
        int iOrdinal = zjfVar.ordinal();
        if (iOrdinal == 0) {
            return "live";
        }
        if (iOrdinal == 1) {
            return "prematch";
        }
        uhc.a();
        return null;
    }

    public static final String b(lkf lkfVar) {
        int iOrdinal = lkfVar.ordinal();
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

    public static final String c(nkf nkfVar) {
        int iOrdinal = nkfVar.ordinal();
        if (iOrdinal == 0) {
            return "betslip";
        }
        if (iOrdinal == 1) {
            return "quickBet";
        }
        uhc.a();
        return null;
    }

    public static final String d(pkf pkfVar) {
        int iOrdinal = pkfVar.ordinal();
        if (iOrdinal == 0) {
            return AnalyticsParam.EVENT_STATUS_ON;
        }
        if (iOrdinal == 1) {
            return AnalyticsParam.EVENT_STATUS_OFF;
        }
        uhc.a();
        return null;
    }
}
